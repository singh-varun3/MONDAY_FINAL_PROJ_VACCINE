/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.EnterpriseAdmin;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PublicHealthDepartment;
import Business.NationalEnterprise.CDC;
import Business.NationalEnterprise.Distributor;
import Business.NationalEnterprise.Manufacturer;
import Business.Organization.CDCOrganization;
import Business.Organization.DistributorOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.Organization.PHDImmunizationOrganization;
import Business.Organization.PatientOrganization;
import Business.Organization.SatelliteClinicOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akshit verma
 */
public class ManageDepartmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    private JPanel workContainer;
    private Enterprise enterprise;
            
    public ManageDepartmentJPanel(JPanel workContainer, Enterprise enterprise ) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        populateTable();
        populateCombo();
        satelliteClinicNamejTextField.setVisible(false);
            satelliteClinicjLabel.setVisible(false);
        if(enterprise instanceof HospitalEnterprise)
        {
            satelliteClinicNamejTextField.setVisible(true);
            satelliteClinicjLabel.setVisible(true);
                
        }
        
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        if(enterprise instanceof CDC)
        {   
            organizationJComboBox.addItem(Organization.OrganizationType.CDCOrg);
        }
        if(enterprise instanceof Manufacturer)
        {
            organizationJComboBox.addItem(Organization.OrganizationType.ManufactureOrg);
        }
        if(enterprise instanceof Distributor)
        {
            organizationJComboBox.addItem(Organization.OrganizationType.DistributorOrg);
            
        }
        if( enterprise instanceof PublicHealthDepartment)
        {
            organizationJComboBox.addItem(Organization.OrganizationType.PublicHealthDepartmentOrg);
        }
        
        if( enterprise instanceof HospitalEnterprise)
        {
            organizationJComboBox.addItem(Organization.OrganizationType.HospitalOrg);
            organizationJComboBox.addItem(Organization.OrganizationType.PatientOrganization);
            organizationJComboBox.addItem(Organization.OrganizationType.SatelliteClinicOrganization);
        }
        
       
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
        {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            if(organization instanceof SatelliteClinicOrganization)
            {
                SatelliteClinicOrganization satOrg =(SatelliteClinicOrganization)organization;
                row[1] = satOrg.getSatelliteClincName()+" Satellite Clinic";
            }
            else
            row[1] = organization.getName();
            
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
        organizationJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        addJButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        satelliteClinicjLabel = new javax.swing.JLabel();
        satelliteClinicNamejTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Organization");

        organizationJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(organizationJTable);

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Organization Type ");

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Add Organization:");

        satelliteClinicjLabel.setText("Satellite Clinic Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(backJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addJButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(satelliteClinicjLabel)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(organizationJComboBox, 0, 144, Short.MAX_VALUE)
                                            .addComponent(satelliteClinicNamejTextField))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(satelliteClinicjLabel)
                    .addComponent(satelliteClinicNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addJButton)
                .addGap(3, 3, 3)
                .addComponent(backJButton)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        
        
        Organization.OrganizationType type = (Organization.OrganizationType) organizationJComboBox.getSelectedItem();
        //check if organization exists
         if(enterprise instanceof CDC)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof CDCOrganization)
                {
                    JOptionPane.showMessageDialog(null, "Department Exists!");
                    return;
                }
            }
        }
        if(enterprise instanceof Manufacturer)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof ManufactureOrganization)
                {
                     JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
                }
            }
        }
        if(enterprise instanceof Distributor)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof DistributorOrganization)
                {
                     JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
                }
            }
            
        }
        if( enterprise instanceof PublicHealthDepartment)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof PHDImmunizationOrganization)
                {
                     JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
                }
            }
        }
         boolean hospOrg=false;
            boolean patientOrg=false;
        if( enterprise instanceof HospitalEnterprise)
        {
            String satClinicName = satelliteClinicNamejTextField.getText();
           
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof HospitalOrganization)
                {
                     hospOrg=true;
                }
                 if(org instanceof PatientOrganization)
                {
                     patientOrg=true;
                }
               
            }
            if(hospOrg==true && type.equals(Organization.OrganizationType.HospitalOrg))
            {
                  JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
            }
            else if(patientOrg==true && type.equals(Organization.OrganizationType.PatientOrganization)){
                JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
            }
            else if(type.equals(Organization.OrganizationType.SatelliteClinicOrganization))
            {
                SatelliteClinicOrganization satOrg = (SatelliteClinicOrganization)enterprise.getOrganizationDirectory().createOrganization(type);
                satOrg.setSatelliteClincName(satClinicName);
                populateTable();
                return;
            }
            
            
        }
        System.out.println("TYPE : " + type.toString());
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();
        
       
        
        
        
        
        
        
    }//GEN-LAST:event_addJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField satelliteClinicNamejTextField;
    private javax.swing.JLabel satelliteClinicjLabel;
    // End of variables declaration//GEN-END:variables
}
