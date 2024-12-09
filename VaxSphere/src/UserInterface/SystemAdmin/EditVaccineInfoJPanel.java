/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdmin;

import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vaibhav
 */
public class EditVaccineInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditVaccineInfoJPanel
     */
    private JPanel workContainer;
    private Vaccine vaccine;
    
    public EditVaccineInfoJPanel(JPanel workContainer, Vaccine vaccine) {
        initComponents();
        this.workContainer = workContainer;
        this.vaccine = vaccine;
        vaccineCodejTextField.setText(vaccine.getVaccineCode());
               vaccineNamejTextField.setText(vaccine.getVaccineName());
               dateOnVisjDateChooser.setDate(vaccine.getDateOnVIS());
               lastUpdatedOnjDateChooser.setDate(vaccine.getLastUpdatedVIS());
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateOnVisjDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lastUpdatedOnjDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        vaccineCodejTextField = new javax.swing.JTextField();
        vaccineNamejTextField = new javax.swing.JTextField();
        editVaccineJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 249, 255));

        dateOnVisjDateChooser.setDateFormatString(" MMM, d yyyy");

        jLabel3.setText("Vaccine Name:");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Date on VIS:");

        lastUpdatedOnjDateChooser.setDateFormatString(" MMM, d yyyy");

        jLabel5.setText("Last Updated on:");

        editVaccineJButton.setText("Edit Vaccine Info");
        editVaccineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVaccineJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Vaccine Information");

        jLabel2.setText("Vaccine Code:");

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
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vaccineNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(27, 27, 27)
                                    .addComponent(vaccineCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editVaccineJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(lastUpdatedOnjDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(backJButton))
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                .addComponent(editVaccineJButton)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void editVaccineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVaccineJButtonActionPerformed
        // TODO add your handling code here:
        String vaccineCode = vaccineCodejTextField.getText();
        if(vaccineCode.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Vaccine Code!");
            return;
        }
        String vaccineName = vaccineNamejTextField.getText();
        if(vaccineCode.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Vaccine Name!");
            return;
        }
        Date dateOnVis = dateOnVisjDateChooser.getDate();
        Date lastUpdatedDate = lastUpdatedOnjDateChooser.getDate();

        
        vaccine.setVaccineCode(vaccineCode);
        vaccine.setVaccineName(vaccineName);
        vaccine.setLastUpdatedVIS(lastUpdatedDate);
        vaccine.setDateOnVIS(dateOnVis);

    }//GEN-LAST:event_editVaccineJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private com.toedter.calendar.JDateChooser dateOnVisjDateChooser;
    private javax.swing.JButton editVaccineJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JDateChooser lastUpdatedOnjDateChooser;
    private javax.swing.JTextField vaccineCodejTextField;
    private javax.swing.JTextField vaccineNamejTextField;
    // End of variables declaration//GEN-END:variables
}
