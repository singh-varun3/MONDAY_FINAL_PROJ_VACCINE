/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Manufacture;

import Business.Business;
import Business.NationalEnterprise.Manufacturer;
import Business.Order.Order;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akshit verma
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersJPanel
     */
    
    private JPanel workContainer;
    private Manufacturer manufacturer;
    private UserAccount userAccount;
    private Business business;
    
    public ManageOrdersJPanel(JPanel workContainer, Manufacturer manufacturer, UserAccount userAccount, Business business) {
        initComponents();
        this.workContainer = workContainer;
        this.manufacturer = manufacturer;
        this.userAccount = userAccount;
        this.business = business;
        populateOrderTable();
        populateProcessedOrderTable();
    }
    
    private void populateOrderTable(){
        
         DefaultTableModel model = (DefaultTableModel) ordersjTable.getModel();
        model.setRowCount(0);
         ManufactureOrganization manufacureOrg = null;
         
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(WorkRequest workRequest : manufacureOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof VaccineOrderWorkRequest)
            {VaccineOrderWorkRequest vaccineOrderWR = (VaccineOrderWorkRequest)workRequest;
                
                Object[] row = new Object[4];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getSender();
                row[2] = vaccineOrderWR.getReceiver();
                row[3] = vaccineOrderWR.getStatus();
                
                model.addRow(row);
            }
            }
        }
        
        
        
        
    }
        
    }
    
    
    private void populateProcessedOrderTable(){
        
        DefaultTableModel model = (DefaultTableModel) processedOrdersjTable.getModel();
        model.setRowCount(0);
         ManufactureOrganization manufacureOrg = null;
         
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(WorkRequest workRequest : manufacureOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof VaccineOrderWorkRequest)
            {VaccineOrderWorkRequest vaccineOrderWR = (VaccineOrderWorkRequest)workRequest;
                if(vaccineOrderWR.getStatus().equals("Shipped"))
                {Object[] row = new Object[5];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getSender();
                row[2] = vaccineOrderWR.getReceiver();
                row[3] = vaccineOrderWR.getStatus();
                row[4] = vaccineOrderWR.getShipdate();
                
                model.addRow(row);
                }
            }
            }
        }
        
        
        
        
    }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersjTable = new javax.swing.JTable();
        assignjButton = new javax.swing.JButton();
        processOrderjButton = new javax.swing.JButton();
        refreshjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        processedOrdersjTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        refreshProcessedOrderTablejButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Orders");

        ordersjTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ordersjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ordersjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ordersjTable);

        assignjButton.setText("Assign to Me");
        assignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButtonActionPerformed(evt);
            }
        });

        processOrderjButton.setText("Process Order >>");
        processOrderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processOrderjButtonActionPerformed(evt);
            }
        });

        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Orders From Distributor:");

        processedOrdersjTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        processedOrdersjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Sender", "Receiver", "Status", "Ship Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        processedOrdersjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(processedOrdersjTable);

        jLabel3.setText("Processed Orders:");

        refreshProcessedOrderTablejButton.setText("Refresh");
        refreshProcessedOrderTablejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshProcessedOrderTablejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processOrderjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshjButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshProcessedOrderTablejButton)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshjButton)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignjButton)
                    .addComponent(processOrderjButton))
                .addGap(42, 42, 42)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(refreshProcessedOrderTablejButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_refreshjButtonActionPerformed

    private void assignjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordersjTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        WorkRequest request = (WorkRequest)ordersjTable.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equalsIgnoreCase("Shipped") || request.getStatus().equalsIgnoreCase("Stored"))
         {
             JOptionPane.showMessageDialog(null, "Order already shipped!");
             return;
         }
        request.setReceiver(userAccount);
        request.setStatus("Assigned");
        populateOrderTable();
        
        
    }//GEN-LAST:event_assignjButtonActionPerformed

    private void processOrderjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processOrderjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordersjTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        
         VaccineOrderWorkRequest request = (VaccineOrderWorkRequest)ordersjTable.getValueAt(selectedRow, 0);
         
         if(request.getStatus().equalsIgnoreCase("Shipped") || request.getStatus().equalsIgnoreCase("Stored"))
         {
             JOptionPane.showMessageDialog(null, "Order already shipped!");
             return;
         }
         
         if(request.getReceiver() == null)
         {
             JOptionPane.showMessageDialog(null, "Please assign the work request first");
            return;
             
         }
        
         ProcessOrdersJPanel panel = new ProcessOrdersJPanel(workContainer, request,manufacturer, business );
        workContainer.add("ProcessOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
        
    }//GEN-LAST:event_processOrderjButtonActionPerformed

    private void refreshProcessedOrderTablejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshProcessedOrderTablejButtonActionPerformed
        // TODO add your handling code here:
        populateProcessedOrderTable();
    }//GEN-LAST:event_refreshProcessedOrderTablejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable ordersjTable;
    private javax.swing.JButton processOrderjButton;
    private javax.swing.JTable processedOrdersjTable;
    private javax.swing.JButton refreshProcessedOrderTablejButton;
    private javax.swing.JButton refreshjButton;
    // End of variables declaration//GEN-END:variables
}
