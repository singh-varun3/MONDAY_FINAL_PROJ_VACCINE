/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Provider;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.StateNetwork;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.UpdateUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akshit verma
 */

     


public class ProviderWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProviderWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private HospitalEnterprise enterprise;
    private HospitalOrganization organization;
    private Business business;
    private StateNetwork state;
    
    public ProviderWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, HospitalEnterprise enterprise, HospitalOrganization organization, Business business, StateNetwork state) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.business = business;
        this.state = state;
        namejLabel.setText(userAccount.getPerson().getFirstName()+ " "+userAccount.getPerson().getLastName());
        enterpriseJLabel.setText(enterprise.getName());
        
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
        jSplitPane2 = new javax.swing.JSplitPane();
        mainMenu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        placeOrderjButton = new javax.swing.JButton();
        manageOrdersjButton = new javax.swing.JButton();
        ViewInventoryjButton = new javax.swing.JButton();
        managePaymentsjButton = new javax.swing.JButton();
        administerVaccinejButton = new javax.swing.JButton();
        viewAdministeredVaccinesjButton = new javax.swing.JButton();
        manageSatelliteClinicOrdersjButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userProfile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJLabel = new javax.swing.JLabel();
        updateUserProfilejButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        workContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(190);

        jSplitPane2.setDividerLocation(450);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mainMenu.setBackground(new java.awt.Color(179, 236, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Main Menu:");

        placeOrderjButton.setText("Place Vaccine Order");
        placeOrderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderjButtonActionPerformed(evt);
            }
        });

        manageOrdersjButton.setText("Manage Orders");
        manageOrdersjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersjButtonActionPerformed(evt);
            }
        });

        ViewInventoryjButton.setText("View Inventory");
        ViewInventoryjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewInventoryjButtonActionPerformed(evt);
            }
        });

        managePaymentsjButton.setText("Manage Payments");
        managePaymentsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePaymentsjButtonActionPerformed(evt);
            }
        });

        administerVaccinejButton.setText("Administer Vaccine");
        administerVaccinejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administerVaccinejButtonActionPerformed(evt);
            }
        });

        viewAdministeredVaccinesjButton.setText("View Administered Vaccines");
        viewAdministeredVaccinesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdministeredVaccinesjButtonActionPerformed(evt);
            }
        });

        manageSatelliteClinicOrdersjButton.setText("Manage Satellite Clinic Orders");
        manageSatelliteClinicOrdersjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSatelliteClinicOrdersjButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PROVIDER");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Akshit Verma\\Desktop\\FINALL\\dummy-repo\\FinalProject_vaccine\\images\\Medical_provider_logo_150x85.jpg")); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placeOrderjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageOrdersjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewInventoryjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(managePaymentsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(administerVaccinejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAdministeredVaccinesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(manageSatelliteClinicOrdersjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(placeOrderjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageOrdersjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewInventoryjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(managePaymentsjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(administerVaccinejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewAdministeredVaccinesjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageSatelliteClinicOrdersjButton)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jSplitPane2.setTopComponent(mainMenu);

        userProfile.setBackground(new java.awt.Color(179, 236, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User profile:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name:");

        namejLabel.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Enterprise:");

        enterpriseJLabel.setText("jLabel4");

        updateUserProfilejButton.setText("Update User Profile");
        updateUserProfilejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserProfilejButtonActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/userAccount.gif"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout userProfileLayout = new javax.swing.GroupLayout(userProfile);
        userProfile.setLayout(userProfileLayout);
        userProfileLayout.setHorizontalGroup(
            userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterpriseJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addComponent(updateUserProfilejButton, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userProfileLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(userProfileLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addGap(40, 40, 40))))
        );
        userProfileLayout.setVerticalGroup(
            userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseJLabel))
                .addGap(18, 18, 18)
                .addComponent(updateUserProfilejButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(userProfile);

        jSplitPane1.setLeftComponent(jSplitPane2);

        workContainer.setBackground(new java.awt.Color(230, 249, 255));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderjButtonActionPerformed
        // TODO add your handling code here:
        PlaceVaccineOrderJPanel panel = new PlaceVaccineOrderJPanel(workContainer, enterprise, organization, userAccount, business, state);
        workContainer.add("PlaceVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_placeOrderjButtonActionPerformed

    private void manageOrdersjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersjButtonActionPerformed
        // TODO add your handling code here:
         ManageOrdersJPanel panel = new ManageOrdersJPanel(workContainer, enterprise, organization, userAccount, business, state);
        workContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_manageOrdersjButtonActionPerformed

    private void ViewInventoryjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewInventoryjButtonActionPerformed
        // TODO add your handling code here:
         ViewInventoryJPanel panel = new ViewInventoryJPanel(workContainer, business, enterprise, organization);
        workContainer.add("ViewInventoryJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
        
        
    }//GEN-LAST:event_ViewInventoryjButtonActionPerformed

    private void managePaymentsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePaymentsjButtonActionPerformed
        // TODO add your handling code here:
        ManageProviderPaymentsJPanel panel = new ManageProviderPaymentsJPanel(workContainer, enterprise, organization, userAccount, business);
        workContainer.add("ManageProviderPaymentsJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_managePaymentsjButtonActionPerformed

    private void administerVaccinejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administerVaccinejButtonActionPerformed
        // TODO add your handling code here:
        AdministerVaccineJPanel panel = new AdministerVaccineJPanel(workContainer, enterprise, organization, userAccount, business, state);
        workContainer.add("AdministerVaccineJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_administerVaccinejButtonActionPerformed

    private void viewAdministeredVaccinesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdministeredVaccinesjButtonActionPerformed
        // TODO add your handling code here:
        AdministeredVaccineListJPanel panel = new AdministeredVaccineListJPanel(workContainer, enterprise);
        workContainer.add("AdministeredVaccineListJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_viewAdministeredVaccinesjButtonActionPerformed

    private void manageSatelliteClinicOrdersjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSatelliteClinicOrdersjButtonActionPerformed
        // TODO add your handling code here:
        ManageSatelliteOrdersJPanel panel = new ManageSatelliteOrdersJPanel(workContainer, enterprise, organization, userAccount, business, state);
        workContainer.add("ManageSatelliteOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_manageSatelliteClinicOrdersjButtonActionPerformed

    private void updateUserProfilejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserProfilejButtonActionPerformed
        // TODO add your handling code here:
          UpdateUserAccountJPanel panel = new UpdateUserAccountJPanel(workContainer,  userAccount, business);
        workContainer.add("UpdateUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_updateUserProfilejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewInventoryjButton;
    private javax.swing.JButton administerVaccinejButton;
    private javax.swing.JLabel enterpriseJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton manageOrdersjButton;
    private javax.swing.JButton managePaymentsjButton;
    private javax.swing.JButton manageSatelliteClinicOrdersjButton;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JButton placeOrderjButton;
    private javax.swing.JButton updateUserProfilejButton;
    private javax.swing.JPanel userProfile;
    private javax.swing.JButton viewAdministeredVaccinesjButton;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
