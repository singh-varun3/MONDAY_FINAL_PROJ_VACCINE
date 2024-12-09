/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PublicHealthDepartment;

import Business.Business;
import Business.Network.StateNetwork;
import Business.Vaccine.Vaccine;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vaibhav
 */


public class ManageStateFundedVaccinesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStateFundedVaccinesJPanel
     */
    
    private JPanel workContainer;
    private StateNetwork state;
    private Business business;
    
    
    public ManageStateFundedVaccinesJPanel(JPanel workContainer,StateNetwork state,Business business) {
        initComponents();
        this.workContainer = workContainer;
        this.state = state;
        this.business = business;
        populateTable();
        
    }
    
      private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) vaccineJTable.getModel();
        model.setRowCount(0);
        
        for(Vaccine vaccine : business.getVaccineCatalog().getVaccineCatalog())
        {
            Object[] row = new Object[6];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineName();
            row[2] = vaccine.getDateOnVIS();
            row[3] = vaccine.getLastUpdatedVIS();
            row[4] = vaccine.isFederalFunded() == false ? (vaccine.isVaccineFundedByMentionedState(state)== false ? "No": "Yes"): "Yes";
            row[5] = vaccine.isFederalFunded()? "Federal" :(vaccine.isVaccineFundedByMentionedState(state)? state.getStateName(): "Not Funded");
            model.addRow(row);
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
        vaccineJTable = new javax.swing.JTable();
        addToStateFundedjButton = new javax.swing.JButton();
        removeFundingjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage State Funded Vaccine");

        vaccineJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vaccineJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Date on VIS", "Last updated", "Funded", "Funded By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vaccineJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(vaccineJTable);

        addToStateFundedjButton.setText("Add to State Funded Vaccine");
        addToStateFundedjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToStateFundedjButtonActionPerformed(evt);
            }
        });

        removeFundingjButton.setText("Remove Funding");
        removeFundingjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFundingjButtonActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(removeFundingjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addToStateFundedjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToStateFundedjButton)
                    .addComponent(removeFundingjButton))
                .addContainerGap(253, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToStateFundedjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToStateFundedjButtonActionPerformed
        // TODO add your handling code here:

        int row = vaccineJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a Vaccine from table");
            return;
        }

        Vaccine vaccine = (Vaccine)vaccineJTable.getValueAt(row, 0);
        if(vaccine.isFederalFunded())
        {
            JOptionPane.showMessageDialog(null, "Vaccine Funded by Federal Government!");
            return;
        }
        
        vaccine.setStateFunded(true);
        //vaccine.setState(state);
       // StateNetwork thisState = vaccine.addNewFundedState();
        
        vaccine.addState(state);
        //thisState = state;
        vaccine.setStateFunded(true);
        populateTable();
    }//GEN-LAST:event_addToStateFundedjButtonActionPerformed

    private void removeFundingjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFundingjButtonActionPerformed
        // TODO add your handling code here:
        int row = vaccineJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a Vaccine from table");
            return;
        }
         Vaccine vaccine = (Vaccine)vaccineJTable.getValueAt(row, 0);
        vaccine.setStateFunded(false);
        vaccine.removeFundedState(state);
        populateTable();
        
        
    }//GEN-LAST:event_removeFundingjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToStateFundedjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeFundingjButton;
    private javax.swing.JTable vaccineJTable;
    // End of variables declaration//GEN-END:variables
}
