/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Patient;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.UpdateUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akshit verma
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private Business business;
    
    public PatientWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, Enterprise enterprise, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.business = business;
        namejLabel.setText(userAccount.getPerson().getFirstName()+" "+userAccount.getPerson().getLastName());
        providerjLabel.setText(enterprise.getName());
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
        mainMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        viewAdministeredVaccinesjButton = new javax.swing.JButton();
        manageAccountjButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userProfile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        providerjLabel = new javax.swing.JLabel();
        updateUserProfilejButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        workContainer.setBackground(new java.awt.Color(230, 249, 255));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        jSplitPane2.setDividerLocation(450);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mainMenu.setBackground(new java.awt.Color(179, 236, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Main Menu:");

        viewAdministeredVaccinesjButton.setText("View Administered Vaccines");
        viewAdministeredVaccinesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdministeredVaccinesjButtonActionPerformed(evt);
            }
        });

        manageAccountjButton.setText("Manage Account");
        manageAccountjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccountjButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PATIENT");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Akshit Verma\\Desktop\\FINALL\\dummy-repo\\FinalProject_vaccine\\images\\Patient_logo_150x85.png")); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewAdministeredVaccinesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(manageAccountjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(viewAdministeredVaccinesjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageAccountjButton)
                .addGap(122, 122, 122))
        );

        jSplitPane2.setTopComponent(mainMenu);

        userProfile.setBackground(new java.awt.Color(179, 236, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User Profile:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name:");

        namejLabel.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Associated Provider:");

        providerjLabel.setText("jLabel5");

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
                    .addComponent(providerjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateUserProfilejButton, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(userProfileLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(providerjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateUserProfilejButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(userProfile);

        jSplitPane1.setLeftComponent(jSplitPane2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void viewAdministeredVaccinesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdministeredVaccinesjButtonActionPerformed
        // TODO add your handling code here:
        PatientAdministeredVaccineListJPanel panel = new PatientAdministeredVaccineListJPanel(workContainer, (HospitalEnterprise)enterprise, userAccount);
        workContainer.add("AdministeredVaccineListJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_viewAdministeredVaccinesjButtonActionPerformed

    private void manageAccountjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccountjButtonActionPerformed
        // TODO add your handling code here:
        ManageAccountJPanel panel = new ManageAccountJPanel(workContainer, userAccount, business);
        workContainer.add("ManageAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_manageAccountjButtonActionPerformed

    private void updateUserProfilejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserProfilejButtonActionPerformed
        // TODO add your handling code here:
         UpdateUserAccountJPanel panel = new UpdateUserAccountJPanel(workContainer, userAccount, business);
        workContainer.add("UpdateUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_updateUserProfilejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton manageAccountjButton;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JLabel providerjLabel;
    private javax.swing.JButton updateUserProfilejButton;
    private javax.swing.JPanel userProfile;
    private javax.swing.JButton viewAdministeredVaccinesjButton;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
