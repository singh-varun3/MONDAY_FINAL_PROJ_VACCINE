/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdmin;

import Business.Business;
import Business.Disease.Disease;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Varun
 */
public class ManageDiseaseCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDiseaseCatalogJPanel
     */
    private JPanel workContainer;
    private Business business;
    
    public ManageDiseaseCatalogJPanel(JPanel workContainer, Business business) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        populateTable();
    }
    
     private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) diseaseJTable.getModel();
        model.setRowCount(0);
        
        for(Disease disease : business.getDiseaseCatalog().getDiseaseCatalog())
        {
            Object[] row = new Object[3];
            row[0] = disease;
            row[1] = disease.getDiseaseName();
            row[2] = disease.getLastUpdated();
            
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
        diseaseJTable = new javax.swing.JTable();
        editDiseaseJButton = new javax.swing.JButton();
        addDiseaseJButton = new javax.swing.JButton();
        removeDiseaseJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        refreshjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Disease Catalog");

        diseaseJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        diseaseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ICD 10 code", "Disease Name", "Last Updated on"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        diseaseJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(diseaseJTable);
        if (diseaseJTable.getColumnModel().getColumnCount() > 0) {
            diseaseJTable.getColumnModel().getColumn(0).setResizable(false);
            diseaseJTable.getColumnModel().getColumn(1).setResizable(false);
            diseaseJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        editDiseaseJButton.setText("Edit Disease Info");
        editDiseaseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDiseaseJButtonActionPerformed(evt);
            }
        });

        addDiseaseJButton.setText("Add Disease Info >>");
        addDiseaseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiseaseJButtonActionPerformed(evt);
            }
        });

        removeDiseaseJButton.setText("Remove Disease Info");
        removeDiseaseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDiseaseJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeDiseaseJButton)
                        .addGap(47, 47, 47)
                        .addComponent(editDiseaseJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addDiseaseJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refreshjButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(refreshjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editDiseaseJButton)
                    .addComponent(addDiseaseJButton)
                    .addComponent(removeDiseaseJButton))
                .addGap(26, 26, 26)
                .addComponent(backJButton)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editDiseaseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDiseaseJButtonActionPerformed
        // TODO add your handling code here:
        int row = diseaseJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a Disease from table");
            return;
        }
        Disease disease = (Disease)diseaseJTable.getValueAt(row, 0);

        EditDiseaseInfoJPanel panel = new EditDiseaseInfoJPanel(workContainer, disease);
        workContainer.add("EditVaccineInfoJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);

    }//GEN-LAST:event_editDiseaseJButtonActionPerformed

    private void addDiseaseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiseaseJButtonActionPerformed
        // TODO add your handling code here:

        AddNewDiseaseInfoJPanel panel = new AddNewDiseaseInfoJPanel(workContainer, business);
        workContainer.add("AddNewDiseaseInfoJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_addDiseaseJButtonActionPerformed

    private void removeDiseaseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDiseaseJButtonActionPerformed
        // TODO add your handling code here:

        int row = diseaseJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a Disease from table");
            return;
        }

        Disease disease = (Disease)diseaseJTable.getValueAt(row, 0);
        business.getDiseaseCatalog().removeDiseaseDefinition(disease);
        populateTable();

    }//GEN-LAST:event_removeDiseaseJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDiseaseJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable diseaseJTable;
    private javax.swing.JButton editDiseaseJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JButton removeDiseaseJButton;
    // End of variables declaration//GEN-END:variables
}
