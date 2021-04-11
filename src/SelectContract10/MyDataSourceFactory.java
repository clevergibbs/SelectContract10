package SelectContract10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cat Panetta
 */
import java.io.FileInputStream; 
import java.io.IOException; 
import java.sql.SQLException; 
import java.util.Properties; 
import javax.sql.DataSource; 
import oracle.jdbc.pool.OracleDataSource;

public class MyDataSourceFactory {

    /**
     * @param args the command line arguments
     */
    
    public static DataSource getOracleDataSource() throws SQLException{ 
        
        Properties props = new Properties(); 
        FileInputStream fis= null;
        OracleDataSource oracleDS = null; 
        try { 
            fis = new FileInputStream ("C:\\Users\\Cat Panetta\\Documents\\CAMOSUN\\2021\\Software_Engineering\\SelectContract10\\src\\SelectContract10\\db.properties");
            props.load(fis); 
            oracleDS = new OracleDataSource(); 
            oracleDS.setURL(props.getProperty("ORACLE_DB_URL")); 
            oracleDS.setUser(props.getProperty("ORACLE_DB_USERNAME")); 
            oracleDS.setPassword(props.getProperty("ORACLE_DB_PASSWORD")); 
        }catch (IOException e){ 
            e.printStackTrace(); 
        }
        return oracleDS;
    }// end getOracleDataSource  
}//end class 
