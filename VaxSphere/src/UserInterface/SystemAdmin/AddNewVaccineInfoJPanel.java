/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdmin;

import Business.Business;
import Business.Disease.Disease;
import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vaibhav
 */
public class AddNewVaccineInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNewVaccineInfoJPanel
     */
    private JPanel workContainer;
    private Business business;
    
    public AddNewVaccineInfoJPanel(JPanel workContainer, Business business) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        populateDiseaseCombo();
        
    }
    
    private void populateDiseaseCombo(){
        diseasejComboBox.removeAllItems();
        
        for(Disease disease : business.getDiseaseCatalog().getDiseaseCatalog())
        {
            diseasejComboBox.addItem(disease);
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

        jLabel4 = new javax.swing.JLabel();
        lastUpdatedOnjDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        vaccineCodejTextField = new javax.swing.JTextField();
        vaccineNamejTextField = new javax.swing.JTextField();
        addVaccineJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateOnVisjDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        diseasejComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel4.setText("Date on VIS:");

        lastUpdatedOnjDateChooser.setDateFormatString(" MMM, d yyyy");

        jLabel5.setText("Last Updated on:");

        addVaccineJButton.setText("Add Vaccine Info");
        addVaccineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVaccineJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Vaccine Information");

        jLabel2.setText("Vaccine Code:");

        dateOnVisjDateChooser.setDateFormatString(" MMM, d yyyy");

        jLabel3.setText("Vaccine Name:");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Disease:");

        diseasejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(32, 32, 32)
                                    .addComponent(dateOnVisjDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(2, 2, 2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                    .addComponent(vaccineNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(vaccineCodejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addComponent(diseasejComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addVaccineJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(lastUpdatedOnjDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(backJButton))
                        .addGap(0, 182, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vaccineCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vaccineNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(dateOnVisjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lastUpdatedOnjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addVaccineJButton)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void addVaccineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVaccineJButtonActionPerformed
        // TODO add your handling code here:
        String vaccineCode = vaccineCodejTextField.getText();
        if(vaccineCode.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter vaccine Code!");
            return;
        }
        String vaccineName = vaccineNamejTextField.getText();
        if(vaccineName.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter vaccine Name!");
            return;
        }
        Date dateOnVis = dateOnVisjDateChooser.getDate();
        Date lastUpdatedDate = lastUpdatedOnjDateChooser.getDate();
        Disease disease = (Disease)diseasejComboBox.getSelectedItem();
        
        for(Vaccine v : business.getVaccineCatalog().getVaccineCatalog())
        {
            if(v.getVaccineName().equalsIgnoreCase(vaccineName) && v.getVaccineCode().equalsIgnoreCase(vaccineCode))
            {
                JOptionPane.showMessageDialog(null, "Vaccine exists!");
            return;
            }
        }
        
        
        Vaccine vaccine = business.getVaccineCatalog().addNewVaccineDefinition();
        vaccine.setVaccineCode(vaccineCode);
        vaccine.setVaccineName(vaccineName);
        vaccine.setLastUpdatedVIS(lastUpdatedDate);
        vaccine.setDateOnVIS(dateOnVis);
        vaccine.setDisease(disease);
        
        
    }//GEN-LAST:event_addVaccineJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVaccineJButton;
    private javax.swing.JButton backJButton;
    private com.toedter.calendar.JDateChooser dateOnVisjDateChooser;
    private javax.swing.JComboBox diseasejComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JDateChooser lastUpdatedOnjDateChooser;
    private javax.swing.JTextField vaccineCodejTextField;
    private javax.swing.JTextField vaccineNamejTextField;
    // End of variables declaration//GEN-END:variables
}
