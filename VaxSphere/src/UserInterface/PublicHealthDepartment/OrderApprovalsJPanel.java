/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PublicHealthDepartment;

import Business.Business;
import Business.Enterprise.PublicHealthDepartment;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.PHDImmunizationOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import Business.WorkQueue.VaccineOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vaibhav
 */
public class OrderApprovalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderApprovalsJPanel
     */
    private JPanel workContainer;
    private UserAccount userAccount;
    private PublicHealthDepartment enterprise;
    private PHDImmunizationOrganization phdOrg;
    private Business business;
    private StateNetwork state;
    
    public OrderApprovalsJPanel(JPanel workContainer, UserAccount userAccount, PublicHealthDepartment enterprise,PHDImmunizationOrganization phdOrg, StateNetwork state,Business business) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.phdOrg = phdOrg;
        this.business = business;
        this.state = state;
        populateTable();
    }
    
    
    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) orderjTable.getModel();
        model.setRowCount(0);
        
         PHDImmunizationOrganization pOrg = null;
         
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof PHDImmunizationOrganization)
        {   pOrg = (PHDImmunizationOrganization)org;
            for(WorkRequest workRequest : pOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof ProviderVaccineOrderWorkRequest)
            {ProviderVaccineOrderWorkRequest vaccineOrderWR = (ProviderVaccineOrderWorkRequest)workRequest;
                
                Object[] row = new Object[5];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getEnterprise();
                row[2] = vaccineOrderWR.getSender();
                row[3] = vaccineOrderWR.getStatus();
                row[4] = vaccineOrderWR.getPhdApprovedBy();
                
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
        orderjTable = new javax.swing.JTable();
        viewDetailsjButton = new javax.swing.JButton();
        refreshjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Approve Orders from Providers");

        orderjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Provider", "Sender", "Status", "Approved By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(orderjTable);

        viewDetailsjButton.setText("View Details and Approve >>");
        viewDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsjButtonActionPerformed(evt);
            }
        });

        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewDetailsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshjButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(refreshjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewDetailsjButton)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsjButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = orderjTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        
         ProviderVaccineOrderWorkRequest request = (ProviderVaccineOrderWorkRequest)orderjTable.getValueAt(selectedRow, 0);
        
        
        
         ViewDetailsOfOrderJPanel panel = new ViewDetailsOfOrderJPanel(workContainer, userAccount, enterprise,phdOrg, state, business, request);
        workContainer.add("OrderApprovalsJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_viewDetailsjButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderjTable;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JButton viewDetailsjButton;
    // End of variables declaration//GEN-END:variables
}
