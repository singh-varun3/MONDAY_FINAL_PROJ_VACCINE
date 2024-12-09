/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CDC;

import Business.Business;
import Business.NationalEnterprise.CDC;
import Business.Organization.CDCOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vaibhav
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersJPanel
     */
    private JPanel workContainer;
    private UserAccount userAccount;
    private Business business;
    private CDC cdcEnterprise;
    private CDCOrganization cdcOrg;
    
    
    public ManageOrdersJPanel(JPanel workContainer, UserAccount userAccount,Business business,CDC cdcEnterprise,CDCOrganization cdcOrg  ) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.cdcOrg = cdcOrg;
        populateTable();
        
        
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) orderjTable.getModel();
        model.setRowCount(0);

        CDCOrganization cOrg = null;

        try {
            // Logging: Begin populateTable execution
            System.out.println("populateTable: Start populating the table.");

            for (Organization org : cdcEnterprise.getOrganizationDirectory().getOrganizationList()) {
                System.out.println("Checking organization: " + org.getName());

                if (org instanceof CDCOrganization) {
                    System.out.println("Found CDCOrganization: " + org.getName());
                    cOrg = (CDCOrganization) org;

                    for (WorkRequest workRequest : cOrg.getWorkQueue().getWorkRequestList()) {
                        System.out.println("Processing work request: " + workRequest.toString());

                        if (workRequest instanceof ProviderVaccineOrderWorkRequest) {
                            System.out.println("Work request is of type ProviderVaccineOrderWorkRequest.");
                            ProviderVaccineOrderWorkRequest vaccineOrderWR = (ProviderVaccineOrderWorkRequest) workRequest;

                            // Prepare the row data
                            Object[] row = new Object[6];
                            row[0] = vaccineOrderWR; // Assuming toString() provides meaningful information
                            row[1] = vaccineOrderWR.getEnterprise();
                            row[2] = vaccineOrderWR.getRequestState();
                            row[3] = vaccineOrderWR.getSender();
                            row[4] = vaccineOrderWR.getStatus();
                            row[5] = vaccineOrderWR.getCdcApprovedBy();

                            // Log the row data
                            System.out.println("Row data: " +
                                    "Order = " + row[0] +
                                    ", Enterprise = " + row[1] +
                                    ", RequestState = " + row[2] +
                                    ", Sender = " + row[3] +
                                    ", Status = " + row[4] +
                                    ", ApprovedBy = " + row[5]);

                            // Add the row to the table model
                            model.addRow(row);
                            System.out.println("Row added to table.");
                        } else {
                            System.out.println("Skipping non-ProviderVaccineOrderWorkRequest work request.");
                        }
                    }
                } else {
                    System.out.println("Skipping organization (not CDCOrganization): " + org.getName());
                }
            }

            // Logging: Successfully populated the table
            System.out.println("populateTable: Finished populating the table.");
        } catch (Exception e) {
            // Logging: Exception details
            System.out.println("ERROR in populateTable: " + e.getMessage());
            e.printStackTrace();
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
        refreshjButton = new javax.swing.JButton();
        viewDetailsjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderjTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Vaccine Orders");

        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        viewDetailsjButton.setText("View Details and Approve >>");
        viewDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsjButtonActionPerformed(evt);
            }
        });

        orderjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Provider", "State", "Sender", "Status", "Approved By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(orderjTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 464, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(refreshjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewDetailsjButton)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshjButtonActionPerformed

    private void viewDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsjButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = orderjTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }

        ProviderVaccineOrderWorkRequest request = (ProviderVaccineOrderWorkRequest)orderjTable.getValueAt(selectedRow, 0);

        ApproveOrdersJPanel panel = new ApproveOrdersJPanel(workContainer, userAccount, cdcEnterprise,cdcOrg, business, request);
        workContainer.add("ApproveOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_viewDetailsjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderjTable;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JButton viewDetailsjButton;
    // End of variables declaration//GEN-END:variables
}
