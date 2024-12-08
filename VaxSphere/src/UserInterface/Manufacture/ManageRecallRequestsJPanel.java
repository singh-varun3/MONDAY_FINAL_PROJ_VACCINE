/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Manufacture;

import Business.Business;
import Business.NationalEnterprise.Manufacturer;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineProduct;
import Business.WorkQueue.RecallRequest;
import Business.WorkQueue.VaccineOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vaibhav
 */
public class ManageRecallRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRecallRequestsJPanel
     */
    private JPanel workContainer;
    private Manufacturer manufacturer;
    private UserAccount userAccount;
    private Business business;
    
    public ManageRecallRequestsJPanel(JPanel workContainer, Manufacturer manufacturer, UserAccount userAccount, Business business) {
        initComponents();
        this.workContainer = workContainer;
        this.manufacturer = manufacturer;
        this.userAccount = userAccount;
        this.business = business;
        populateOrderTable();
    }
    
    private void populateOrderTable(){
        
         DefaultTableModel model = (DefaultTableModel) workRequestjTable.getModel();
        model.setRowCount(0);
         ManufactureOrganization manufacureOrg = null;
         
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(WorkRequest workRequest : manufacureOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof RecallRequest)
            {RecallRequest recallRequest = (RecallRequest)workRequest;
                
                Object[] row = new Object[8];
            
                row[0] = recallRequest;
                row[1] = recallRequest.getAdVaccine();
                row[2] = recallRequest.getAdVaccine().getVaccineProduct().getBatchId();
                row[3] = recallRequest.getRequestDate();
                row[4] = recallRequest.getSender();
                row[5] = recallRequest.getStatus();
                row[6] = recallRequest.getReceiver();
                row[7] = recallRequest.getResolveDate();
                
                model.addRow(row);
                
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
        workRequestjTable = new javax.swing.JTable();
        refreshjButton = new javax.swing.JButton();
        RemoveVaccineBatchjButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Recall Requests");

        workRequestjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Batch ID", "Request Date", "Sender", "Status", "Removed By", "Removed On"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(workRequestjTable);

        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        RemoveVaccineBatchjButton.setText("Remove Vaccine Batch");
        RemoveVaccineBatchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveVaccineBatchjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshjButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RemoveVaccineBatchjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshjButton)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveVaccineBatchjButton)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveVaccineBatchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveVaccineBatchjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestjTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a Recall Request");
            return;
        }
        RecallRequest request = (RecallRequest)workRequestjTable.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equalsIgnoreCase("Recalled"))
        {
            JOptionPane.showMessageDialog(null, "Vaccine already recalled!");
            return;
            
        }
        
        String batchId = request.getAdVaccine().getVaccineProduct().getBatchId();
        String vaccineName = request.getAdVaccine().getVaccineProduct().getVaccineDefinition().getVaccineName();
        
        //get the manufacturer product catalog
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof ManufactureOrganization)
            {
                ManufactureOrganization manufOrg = (ManufactureOrganization)org;
                
                for(VaccineProduct product : manufOrg.getVaccineProductCatalog().getVaccineProductList())
                {
                    if(product.getVaccineDefinition().getVaccineName().equalsIgnoreCase(vaccineName) && product.getBatchId().equalsIgnoreCase(batchId))
                    {
                        manufOrg.getVaccineProductCatalog().removeVaccineProduct(product);
                        break;
                    }
                    
                }
            }
        }
        
        
        
        
        
        
        //change the request status
        request.setReceiver(userAccount);
        request.setStatus("Recalled");
        request.setResolveDate(new Date());
        populateOrderTable();
        
        JOptionPane.showMessageDialog(null, "Vaccine Recalled!");
        
        
        
        
    }//GEN-LAST:event_RemoveVaccineBatchjButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_refreshjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveVaccineBatchjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JTable workRequestjTable;
    // End of variables declaration//GEN-END:variables
}
