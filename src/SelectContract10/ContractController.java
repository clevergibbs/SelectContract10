package SelectContract10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JDialog;

/**
 *
 * @author Cat Panetta
 */
class ContractController {
    
    private ContractView theView; 
    private ContractModel theModel; 

    
     ContractController(ContractView theView, ContractModel theModel) {
        this.theView = theView; 
        this.theModel = theModel; 
        this.theView.addPrevListener(new PrevButtonListener()); 
        this.theView.addBidListener(new BidButtonListener()); 
        this.theView.addNextListener(new NextButtonListener()); 
        this.theView.addcomboBoxListener((ItemListener) new ComboListener()); 
        this.theView.setOriginCityList(theModel.getOriginCityList()); 
        
        //needs to make a call to setUpDisplay
        setUpDisplay(); 
    
    }
    
    void setUpDisplay(){ 
        try { 
            if(theModel.foundContracts()){
                Contract c = theModel.getTheContract();
                theView.setContractID(c.getContractID()); 
                theView.setDestCity(c.getDestCity()); 
                theView.setOriginCity(c.getOriginCity()); 
                theView.setOrderItem(c.getOrderItem()); 
            }else{            
                theView.setContractID("N/A"); 
                theView.setDestCity("N/A"); 
                theView.setOriginCity("N/A"); 
                theView.setOrderItem("N/A"); 
            }
        }
            catch (Error ex){ 
            //Provide an error message to the console output. 
            System.out.println(ex); 
            theView.displayErrorMessage(
                "Error: There was a problem setting the contract. \n");
        }
        if ((theModel.getCurrentContractNum()) == (theModel.getContractCount()-1)){
                theView.noNextButton(); 
        }else{
                theView.yesNextButton();
        }
        if (theModel.getCurrentContractNum()== 0){
            theView.noPrevButton();
        }else{
            theView.yesPrevButton();
        }
        
        theView.updateContractViewPanel(theModel.getCurrentContractNum(), theModel.getContractCount());
    }
    
    class PrevButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){ 
            //if the currently displayed contract is the first in the 
            //list of contracts, then you cannot view a non0existent
            //contract behind it. 
           
            
            try {
                //Retreieve the contract behind the currently display contract. 
                theModel.prevContract();
            }catch(Exception ex){
                System.out.println(ex); 
                theView.displayErrorMessage(
                "Error: There is a problem setting a previous contract."); 
            }
            setUpDisplay(); 
             
        }
    }
    
    class NextButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){ 
            //if the currently displayed contract is the first in the 
            //list of contracts, then you cannot view a non0existent
            //contract behind it.            
            try {
                //Retreieve the contract behind the currently display contract. 
                theModel.nextContract();
            }catch(Exception ex){
                System.out.println(ex); 
                theView.displayErrorMessage(
                "Error: There is a problem setting a next contract."); 
            }
            setUpDisplay(); 
        }
    }
    
    class ComboListener implements ItemListener{ 
        @Override
        public void itemStateChanged(ItemEvent e){ 
            System.out.println(e.getItem().toString()); 
            if (e.getStateChange() == ItemEvent.SELECTED){
                String selectedCity = e.getItem().toString(); 
                System.out.println(selectedCity); 
                theModel.updateContractList(selectedCity); 
                setUpDisplay(); 
            } //end if
        }//end itemStateChanged
    }//end CombListener
    
    class BidButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){ 
            //if the currently displayed contract is the first in the 
            //list of contracts, then you cannot view a non0existent
            //contract behind it. 
         try {
              Contract contract = theModel.getTheContract(); 
              ConfirmBid cb;
              cb = new ConfirmBid(theView, true, contract);
              cb.setLocationRelativeTo(null); 
              cb.setVisible(true); 
         }
         catch(Exception ex){ 
             System.out.println(ex);
             theView.displayErrorMessage(
             "Error: The numbers entered must be integers."); 
                } //end catch       
        }//end actionPerformed
    }//ends setUpDisplay 

    
}



