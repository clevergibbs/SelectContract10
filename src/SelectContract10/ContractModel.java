package SelectContract10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.lang.*;
import java.lang.*;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;


/**
 *
 * @author Cat Panetta
 */
class ContractModel {
    private ArrayList<Contract> theContracts; 
    private int contractCounter; 
    private SortedSet<String> originCityList; 
    private ArrayList<Contract> theContractsAll; 
    public static ArrayList<String> contractIDList; 
    private DataSource ds = null;
    private Connection con = null;
    private CallableStatement cstmt = null;
    private ResultSet rs = null;
    
    
    ContractModel() throws Exception{ 
        contractCounter = 0; 
        theContracts = new ArrayList<>();
        theContractsAll = new ArrayList<>(); 
        originCityList = new TreeSet<>(); 
        contractIDList = new ArrayList<>(); 
        
        try{
        ds = MyDataSourceFactory.getOracleDataSource();
        
        con = ds.getConnection(); 
         cstmt = con.prepareCall("BEGIN PanettaC_W21.PKGREC.CONTRACT_LIST(?); END;");
        cstmt.registerOutParameter(1, OracleTypes.CURSOR); 
        cstmt.execute(); 
         rs = ((OracleCallableStatement) cstmt).getCursor(1); 
        while (rs.next()){
            String contractID = rs.getString("CONTRACTID");
            String originCity = rs.getString("ORIGCITY");
            String destCity = rs.getString("DESTCITY");
            String orderItem = rs.getString("ORDERITEM");
            
            Contract dataContract = new Contract(   contractID, 
                                                    originCity, 
                                                    destCity,
                                                    orderItem);
            
                    theContracts.add(dataContract); 
                    theContractsAll.add(dataContract);
                    originCityList.add(originCity); 
                    contractIDList.add(contractID);
            
        }
        }catch (SQLException s){ 
    System.out.println(s.getMessage()); 
}finally{
    try{
        if (rs != null){ 
            rs.close();
        }
        if (cstmt != null){ 
            cstmt.close();
        }
        if (con != null){
            con.close();
        }
    }catch (SQLException e){
        e.printStackTrace();
    }
}
       
        String filename = "C:\\Users\\Cat Panetta\\Documents\\CAMOSUN\\2021\\Software_Engineering\\SelectContract08\\src\\selectcontract08\\contracts.txt";
        try { 
                FileReader fileReader = new FileReader(filename); 
                BufferedReader bufferedReader = new BufferedReader(fileReader); 
                String line; 

                while((line = bufferedReader.readLine()) != null){ 
                    try{
                    String[] tokens = line.split(",",Contract.NUMBER_OF_CONTRACT_ATTRIBUTES); 

                    String contractID = tokens[Contract.INDEX_OF_CONTACT_ID];
                    String originCity = tokens[Contract.INDEX_OF_ORIGIN_CITY];
                    String destCity   = tokens[Contract.INDEX_OF_DEST_CITY]; 
                    String orderItem  = tokens[Contract.INDEX_OF_ORDER_ITEM]; 

                    Contract dataContract = new Contract(contractID
                                                        , originCity
                                                        , destCity
                                                        , orderItem); 
                    theContracts.add(dataContract); 
                    theContractsAll.add(dataContract);
                    originCityList.add(originCity); 
                    contractIDList.add(contractID); 
                    
                    }
                    
                    catch (ArrayIndexOutOfBoundsException ex){
                            System.out.println(ex.getMessage()); 
                    }
                }
                fileReader.close(); 
            } 
        catch (IOException ex){
                System.out.println(ex.getMessage());
        }
        originCityList.add("All"); 
        theContractsAll = theContracts;    
    }


    
    public String[] getOriginCityList(){ 
        String[] a; 
        a = originCityList.toArray(new String[originCityList.size()]); 
        return a;
    }
    
    public boolean foundContracts(){

        return !theContracts.isEmpty();
    }
    
    public void updateContractList(String city){ 
        theContracts = new ArrayList<>(theContractsAll); 
        if (city != "All"){
            theContracts.removeIf(s -> !s.contains(city));
        }
        contractCounter = 0; 
    }
    
    public Contract getTheContract(){
        return theContracts.get(contractCounter); 
    }
    
    public int getContractCount(){ 
        return theContracts.size(); 
    } 
    
    public int getCurrentContractNum(){ 
        return contractCounter; 
    }
    
    public static ArrayList getContractIDList(){
        return contractIDList; 
    }
    public void nextContract(){ 
        int end = theContracts.size()-1; 
        if (contractCounter != end){ 
            contractCounter++; 
        } 
    }
    
    public void prevContract(){ 
        if (contractCounter > 0){
            contractCounter--; 
        }
    }
    
    public void bidContract(){ 
        return;
    }
    
    
    
}
