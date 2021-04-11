package SelectContract10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cat Panetta
 */
public class ContractView extends javax.swing.JFrame {
    

    /**
     * Creates new form ContractView
     */
    public ContractView() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboOriginCity = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelContractID = new javax.swing.JLabel();
        jLabelContactCount = new javax.swing.JLabel();
        jLabelContractCount = new javax.swing.JLabel();
        jLabelOrderItem = new javax.swing.JLabel();
        jLabelDestCity = new javax.swing.JLabel();
        jLabelOriginCity = new javax.swing.JLabel();
        jBidButton = new javax.swing.JButton();
        jPrevButton = new javax.swing.JButton();
        jNextButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemQuit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuNewContract = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bid on Contracts");

        jComboOriginCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Filter by Origin: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jComboOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Contract ID: ");

        jLabel2.setText("Origin");

        jLabel3.setText("Destination: ");

        jLabel4.setText("Order");

        jLabelContactCount.setText("n out of x Contracts");

        jLabelContractCount.setName(""); // NOI18N

        jLabelOrderItem.setText("jLabel7");
        jLabelOrderItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelDestCity.setText("jLabel8");

        jLabelOriginCity.setText("jLabel9");

        jBidButton.setText("Bid");
        jBidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBidButtonActionPerformed(evt);
            }
        });

        jPrevButton.setText("Previous");
        jPrevButton.setMaximumSize(new java.awt.Dimension(75, 23));
        jPrevButton.setMinimumSize(new java.awt.Dimension(75, 23));

        jNextButton.setText("Next");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelContractCount)
                                .addGap(90, 90, 90)
                                .addComponent(jLabelContractID))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(391, 391, 391)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelOriginCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(jLabelDestCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelOrderItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelContactCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPrevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBidButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(105, 105, 105))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelContractID))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelContractCount)
                                .addGap(80, 80, 80)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelOriginCity)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelDestCity)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelOrderItem)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelContactCount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBidButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPrevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );

        jMenu1.setText("File");

        jMenuItemQuit.setText("Quit");
        jMenuItemQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemQuit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuNewContract.setText("New Contract");
        jMenuNewContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewContractActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuNewContract);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNewContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewContractActionPerformed
                // TODO add your handling code here:
        NewContract nc = new NewContract (null, true); 
        nc.setVisible(true); 
    }//GEN-LAST:event_jMenuNewContractActionPerformed

    private void jBidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBidButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBidButtonActionPerformed

    private void jMenuItemQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuitActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_jMenuItemQuitActionPerformed

   void addPrevListener(ActionListener listenForPrevButton){
        jPrevButton.addActionListener(listenForPrevButton); 
    }
    
    void addNextListener(ActionListener listenForNextButton){
        jNextButton.addActionListener(listenForNextButton); 
    }
    
    void addBidListener(ActionListener listenForBidButton){
        jBidButton.addActionListener(listenForBidButton); 
    }
    
    void addcomboBoxListener(ItemListener listenForComboBox){ 
        jComboOriginCity.addItemListener(listenForComboBox);
    }
    
    void displayErrorMessage(String errorMessage){ 
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    void noNextButton(){
        this.jNextButton.setEnabled(false); 
    }
    void yesNextButton(){
        this.jNextButton.setEnabled(true); 
    }
    
    void noPrevButton(){
        this.jPrevButton.setEnabled(false);
    }
    void yesPrevButton(){
        this.jPrevButton.setEnabled(true);
    }
    
    void setOriginCityList(String[] cityList){ 
        final DefaultComboBoxModel model = new DefaultComboBoxModel(cityList); 
    
    this.jComboOriginCity.setModel(model); 
    }
    
    
    void setContractID(String contractID){
        jLabelContractID.setText(contractID); 
    }
    void setOriginCity(String originCity){
        jLabelOriginCity.setText(originCity);  
    }
    void setDestCity(String destCity){ 
        jLabelDestCity.setText(destCity); 
    }
    void setOrderItem(String orderItem){ 
        jLabelOrderItem.setText(orderItem); 
    }
    void setContractCount(String contractCount){
        jLabelContactCount.setText(contractCount); 
    }
    void updateContractViewPanel (int currentContractNum, int contractCount){
        setContractCount((1+currentContractNum) + " of " + contractCount + " contracts"); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBidButton;
    private javax.swing.JComboBox<String> jComboOriginCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelContactCount;
    private javax.swing.JLabel jLabelContractCount;
    private javax.swing.JLabel jLabelContractID;
    private javax.swing.JLabel jLabelDestCity;
    private javax.swing.JLabel jLabelOrderItem;
    private javax.swing.JLabel jLabelOriginCity;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemQuit;
    private javax.swing.JMenuItem jMenuNewContract;
    private javax.swing.JButton jNextButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jPrevButton;
    // End of variables declaration//GEN-END:variables
}
