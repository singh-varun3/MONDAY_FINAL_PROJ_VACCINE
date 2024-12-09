/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SatelliteClinic;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.SatelliteClinicOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.UpdateUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vaibhav
 */
public class SatelliteClinicWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SatelliteClinicWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private UserAccount userAccount;
    private HospitalEnterprise enterprise;
    private SatelliteClinicOrganization organization;
    private Business business;
    private StateNetwork state;
    
    public SatelliteClinicWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, HospitalEnterprise enterprise, SatelliteClinicOrganization organization,Business business,StateNetwork state) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.business = business;
        this.state = state;
        namejLabel.setText(userAccount.getPerson().getFirstName()+ " " + userAccount.getPerson().getLastName());
        providerjLabel.setText(enterprise.getName());
        clinicjLabel.setText(organization.getSatelliteClincName()+" Satellite Clinic");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        workContainer = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        mainMenujPanel = new javax.swing.JPanel();
        placeVaccineOrderjButton = new javax.swing.JButton();
        administerVaccinejButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        registerNewPatientjButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userProfilejPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        providerjLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        clinicjLabel = new javax.swing.JLabel();
        updateUserProfilejButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(170);

        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        jSplitPane2.setDividerLocation(450);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mainMenujPanel.setBackground(new java.awt.Color(255, 255, 255));

        placeVaccineOrderjButton.setText("Place Vaccine Order");
        placeVaccineOrderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeVaccineOrderjButtonActionPerformed(evt);
            }
        });

        administerVaccinejButton.setText("Administer Vaccine");
        administerVaccinejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administerVaccinejButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Main Menu:");

        registerNewPatientjButton.setText("Register New Patient");
        registerNewPatientjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerNewPatientjButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SatelliteClinic/clinic-256.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("SATELLITE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("CLINC");

        javax.swing.GroupLayout mainMenujPanelLayout = new javax.swing.GroupLayout(mainMenujPanel);
        mainMenujPanel.setLayout(mainMenujPanelLayout);
        mainMenujPanelLayout.setHorizontalGroup(
            mainMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenujPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(administerVaccinejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placeVaccineOrderjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(registerNewPatientjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainMenujPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(mainMenujPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainMenujPanelLayout.setVerticalGroup(
            mainMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenujPanelLayout.createSequentialGroup()
                .addGroup(mainMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(mainMenujPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(placeVaccineOrderjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(administerVaccinejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerNewPatientjButton)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jSplitPane2.setTopComponent(mainMenujPanel);

        userProfilejPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("User Profile:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Name:");

        namejLabel.setText("jLabel4");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Provider:");

        providerjLabel.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Clinic:");

        clinicjLabel.setText("jLabel6");

        updateUserProfilejButton.setText("Update User Profile");
        updateUserProfilejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserProfilejButtonActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/userAccount.gif"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout userProfilejPanelLayout = new javax.swing.GroupLayout(userProfilejPanel);
        userProfilejPanel.setLayout(userProfilejPanelLayout);
        userProfilejPanelLayout.setHorizontalGroup(
            userProfilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProfilejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProfilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateUserProfilejButton, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addGroup(userProfilejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(providerjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(userProfilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userProfilejPanelLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(namejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(userProfilejPanelLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(clinicjLabel))
                        .addGroup(userProfilejPanelLayout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))))
                .addContainerGap())
        );
        userProfilejPanelLayout.setVerticalGroup(
            userProfilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProfilejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProfilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userProfilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userProfilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(providerjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userProfilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(clinicjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateUserProfilejButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(userProfilejPanel);

        jSplitPane1.setLeftComponent(jSplitPane2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void placeVaccineOrderjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeVaccineOrderjButtonActionPerformed
        // TODO add your handling code here:
        
          PlaceVaccineOrderSatelliteClinicJPanel panel = new PlaceVaccineOrderSatelliteClinicJPanel(workContainer, enterprise, organization, userAccount, business, state);
        workContainer.add("PlaceVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_placeVaccineOrderjButtonActionPerformed

    private void administerVaccinejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administerVaccinejButtonActionPerformed
        // TODO add your handling code here:
        AdministerVaccineSatelliteClinicJPanel panel = new AdministerVaccineSatelliteClinicJPanel(workContainer, enterprise, organization, userAccount, business, state);
        workContainer.add("AdministerVaccineJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_administerVaccinejButtonActionPerformed

    private void updateUserProfilejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserProfilejButtonActionPerformed
        // TODO add your handling code here:
        UpdateUserAccountJPanel panel = new UpdateUserAccountJPanel(workContainer, userAccount, business);
        workContainer.add("UpdateUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_updateUserProfilejButtonActionPerformed

    private void registerNewPatientjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerNewPatientjButtonActionPerformed
        // TODO add your handling code here:
        RegisterNewPatientJPanel panel = new RegisterNewPatientJPanel(workContainer, enterprise, organization, userAccount, business);
        workContainer.add("RegisterNewPatientJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_registerNewPatientjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton administerVaccinejButton;
    private javax.swing.JLabel clinicjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel mainMenujPanel;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JButton placeVaccineOrderjButton;
    private javax.swing.JLabel providerjLabel;
    private javax.swing.JButton registerNewPatientjButton;
    private javax.swing.JButton updateUserProfilejButton;
    private javax.swing.JPanel userProfilejPanel;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
