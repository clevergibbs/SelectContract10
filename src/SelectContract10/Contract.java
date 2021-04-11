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
public class Contract {
    
    String contractID;
    String originCity;
    String destCity;
    String orderItem;
    
    public static final int NUMBER_OF_CONTRACT_ATTRIBUTES = 4; 
    public static final int INDEX_OF_CONTACT_ID = 0; 
    public static final int INDEX_OF_ORIGIN_CITY = 1;
    public static final int INDEX_OF_DEST_CITY = 2; 
    public static final int INDEX_OF_ORDER_ITEM = 3; 
    
    Contract(String contractID, String originCity, String destCity, String orderItem){
        this.contractID = contractID; 
        this.originCity = originCity; 
        this.destCity = destCity; 
        this.orderItem = orderItem; 
    }
    
    public String getContractID(){
        return this.contractID;
    }
    
    public String getOriginCity(){
        return this.originCity;
    }
    
    public String getDestCity(){
        return this.destCity; 
    }
    
    public String getOrderItem(){ 
        return this.orderItem;
    }

    boolean contains(String city) {
        if (city.equals(originCity)){
            return true;
        }
        else{
            return false; 
        }
    }
    
}
