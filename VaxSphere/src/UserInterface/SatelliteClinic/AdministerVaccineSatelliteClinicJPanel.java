/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SatelliteClinic;

import Business.Business;
import Business.Enterprise.HospitalEnterprise;
import Business.FinancialAccount.Insurance;
import Business.Network.StateNetwork;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.SatelliteClinicOrganization;
import Business.Person.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import UserInterface.Provider.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Varun
 */
public class AdministerVaccineSatelliteClinicJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdministerVaccineJPanel
     */
    
    private JPanel workContainer;

    private HospitalEnterprise hospital;
    private UserAccount userAccount;
    private SatelliteClinicOrganization satelliteOrg;
    private Business business;
    private StateNetwork state;
    
    public AdministerVaccineSatelliteClinicJPanel(JPanel workContainer, HospitalEnterprise hospital,SatelliteClinicOrganization satelliteOrg,UserAccount userAccount , Business business, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.hospital = hospital;
        this.business = business;
        this.satelliteOrg = satelliteOrg;
        this.state = state;
        populatepatientJComboBox();
        insurerjComboBox.setVisible(false);
        insurerjLabel.setVisible(false);
        coveredAmountjLabel.setVisible(false);
        coveredAmountjTextField.setVisible(false);
        
        
        
    }
    
    private void populateInsurerJCombo(){
        
        insurerjComboBox.removeAllItems();
        
        for(Insurance company: business.getInsuranceCompanyList())
        {
            insurerjComboBox.addItem(company);
        }
        
    }
    
    
    private void populatepatientJComboBox(){
        
        patientjComboBox.removeAllItems();
      
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof PatientOrganization)
            {
                PatientOrganization patientOrg = (PatientOrganization)org;
                for(Person p : patientOrg.getPersonDirectory().getPeopleList())
                {
                    if(p instanceof Patient)
                    {
                        Patient patient = (Patient) p;
                        patientjComboBox.addItem(patient);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientjComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNamejTextField = new javax.swing.JTextField();
        lastNamejTextField = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        phonejTextField = new javax.swing.JTextField();
        dateOfBirthjTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        yesjRadioButton = new javax.swing.JRadioButton();
        nojRadioButton = new javax.swing.JRadioButton();
        insurerjLabel = new javax.swing.JLabel();
        coveredAmountjLabel = new javax.swing.JLabel();
        coveredAmountjTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        accountBalancejTextField = new javax.swing.JTextField();
        nextPagejButton = new javax.swing.JButton();
        insurerjComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administer Vaccine: Page 1");

        jLabel2.setText("Patient : ");

        patientjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patientjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientjComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name:");

        jLabel5.setText("email:");

        jLabel6.setText("Phone:");

        jLabel7.setText("Date of Birth:");

        firstNamejTextField.setEnabled(false);

        lastNamejTextField.setEnabled(false);

        emailjTextField.setEnabled(false);

        phonejTextField.setEnabled(false);

        dateOfBirthjTextField.setEnabled(false);

        jLabel8.setText("Capture Additional Info:");

        jLabel9.setText("Insured: ");

        buttonGroup1.add(yesjRadioButton);
        yesjRadioButton.setText("Yes");
        yesjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesjRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(nojRadioButton);
        nojRadioButton.setText("No");
        nojRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nojRadioButtonActionPerformed(evt);
            }
        });

        insurerjLabel.setText("Insurer:");

        coveredAmountjLabel.setText("Covered Amount:");

        jLabel12.setText("Account Balance:");

        nextPagejButton.setText("Add Info And Go to Next Page>>");
        nextPagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPagejButtonActionPerformed(evt);
            }
        });

        insurerjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateOfBirthjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(emailjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(firstNamejTextField))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lastNamejTextField)
                                    .addComponent(phonejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yesjRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nojRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coveredAmountjLabel)
                                    .addComponent(insurerjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(coveredAmountjTextField)
                                    .addComponent(insurerjComboBox, 0, 122, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountBalancejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nextPagejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(patientjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dateOfBirthjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(yesjRadioButton)
                    .addComponent(nojRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insurerjLabel)
                    .addComponent(insurerjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coveredAmountjLabel)
                    .addComponent(coveredAmountjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(accountBalancejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nextPagejButton)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nojRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nojRadioButtonActionPerformed
        // TODO add your handling code here:
        insurerjComboBox.setVisible(false);
        insurerjLabel.setVisible(false);
        coveredAmountjLabel.setVisible(false);
        coveredAmountjTextField.setVisible(false);
        
        
    }//GEN-LAST:event_nojRadioButtonActionPerformed

    private void patientjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientjComboBoxActionPerformed
        // TODO add your handling code here:
        Patient patient = (Patient)patientjComboBox.getSelectedItem();
        if(patient == null)
        {
            return;
        }
        
        firstNamejTextField.setText(patient.getFirstName());
        lastNamejTextField.setText(patient.getLastName());
        emailjTextField.setText(patient.getEmail());
        phonejTextField.setText(String.valueOf(patient.getPhone()));
        dateOfBirthjTextField.setText(String.valueOf(patient.getDateOfBirth()));
        
        
    }//GEN-LAST:event_patientjComboBoxActionPerformed

    private void nextPagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPagejButtonActionPerformed
        // TODO add your handling code here:
        
        try{
        Patient patient = (Patient)patientjComboBox.getSelectedItem();
        if(patient == null)
        {
            return;
        }
        
        
        double coveredAmount = 0.0;
        if(patient.getPatientFinancialAccount().getTotalBalance()==0.0)
        {double amount = Double.parseDouble(accountBalancejTextField.getText());
        patient.getPatientFinancialAccount().setTotalBalance(amount);
        
        }
        else
            accountBalancejTextField.setText(String.valueOf(patient.getPatientFinancialAccount().getTotalBalance()));
        if(yesjRadioButton.isSelected())
        {
            Insurance company = (Insurance)insurerjComboBox.getSelectedItem();
        if(company == null)
        {
            return;
        }
            coveredAmount = Double.parseDouble(coveredAmountjTextField.getText());
            patient.getPatientFinancialAccount().setIsInsured(true);
            patient.getPatientFinancialAccount().setCoveredAmount(coveredAmount);
            patient.getPatientFinancialAccount().setInsurance(company);
        }
        else
            patient.getPatientFinancialAccount().setIsInsured(false);
        
        AdministerVaccineToPatientSatelliteClinicJPanel panel = new AdministerVaccineToPatientSatelliteClinicJPanel(workContainer, hospital, satelliteOrg, userAccount, business, patient, state);
        workContainer.add("AdministerVaccineToPatientSatelliteClinicJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
        
        
        
        }
        
        
        
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter numeric value for Amount");
            return;
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_nextPagejButtonActionPerformed

    private void yesjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesjRadioButtonActionPerformed
        // TODO add your handling code here:
        insurerjComboBox.setVisible(true);
        insurerjLabel.setVisible(true);
        coveredAmountjLabel.setVisible(true);
        coveredAmountjTextField.setVisible(true);
        
        populateInsurerJCombo();
        
        
    }//GEN-LAST:event_yesjRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountBalancejTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel coveredAmountjLabel;
    private javax.swing.JTextField coveredAmountjTextField;
    private javax.swing.JTextField dateOfBirthjTextField;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTextField firstNamejTextField;
    private javax.swing.JComboBox insurerjComboBox;
    private javax.swing.JLabel insurerjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNamejTextField;
    private javax.swing.JButton nextPagejButton;
    private javax.swing.JRadioButton nojRadioButton;
    private javax.swing.JComboBox patientjComboBox;
    private javax.swing.JTextField phonejTextField;
    private javax.swing.JRadioButton yesjRadioButton;
    // End of variables declaration//GEN-END:variables
}
