/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CDC;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.NationalEnterprise.CDC;
import Business.Organization.CDCOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.UpdateUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akshit verma
 */
public class CDCEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CDCEmployeeWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    
    private CDC cdc;
    private UserAccount userAccount;
    private CDCOrganization cdcOrg;
    private Business business;
    public CDCEmployeeWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, CDC cdc,CDCOrganization cdcOrg,Business business ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.cdc = cdc;
        this.business = business;
        namejLabel.setText(userAccount.getPerson().getFirstName()+ " "+ userAccount.getPerson().getLastName());
        enterprisejLabel.setText(cdc.getName());
        
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
        createVaccineOrderjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        manageFedFundedVaccinejButton = new javax.swing.JButton();
        manageOrdersjButton = new javax.swing.JButton();
        managePaymentsjButton = new javax.swing.JButton();
        varesjButton = new javax.swing.JButton();
        viewVaccineDistributionjButton = new javax.swing.JButton();
        manageRecallRequestsjButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        profileView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enterprisejLabel = new javax.swing.JLabel();
        updateUserprofilejButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(170);

        workContainer.setBackground(new java.awt.Color(230, 249, 255));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        jSplitPane2.setDividerLocation(450);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mainMenu.setBackground(new java.awt.Color(179, 236, 255));

        createVaccineOrderjButton.setText("Create Vaccine Order");
        createVaccineOrderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVaccineOrderjButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Main Menu");

        manageFedFundedVaccinejButton.setText("Manage Federally Funded Vaccines");
        manageFedFundedVaccinejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFedFundedVaccinejButtonActionPerformed(evt);
            }
        });

        manageOrdersjButton.setText("Manage Orders");
        manageOrdersjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersjButtonActionPerformed(evt);
            }
        });

        managePaymentsjButton.setText("Manage Payments");
        managePaymentsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePaymentsjButtonActionPerformed(evt);
            }
        });

        varesjButton.setText("VARES Reports");
        varesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varesjButtonActionPerformed(evt);
            }
        });

        viewVaccineDistributionjButton.setText("View Vaccine Distribution");
        viewVaccineDistributionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccineDistributionjButtonActionPerformed(evt);
            }
        });

        manageRecallRequestsjButton.setText("Manage Recall Requests");
        manageRecallRequestsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRecallRequestsjButtonActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\NEU Syllabus\\Fall 24\\AED\\Final_UI\\CDC_logo_150x85.png")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageOrdersjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createVaccineOrderjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(managePaymentsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(varesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageRecallRequestsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewVaccineDistributionjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(manageFedFundedVaccinejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        mainMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {createVaccineOrderjButton, manageFedFundedVaccinejButton, manageOrdersjButton, managePaymentsjButton});

        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createVaccineOrderjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageFedFundedVaccinejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageOrdersjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(managePaymentsjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewVaccineDistributionjButton)
                .addGap(18, 18, 18)
                .addComponent(varesjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageRecallRequestsjButton)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jSplitPane2.setTopComponent(mainMenu);

        profileView.setBackground(new java.awt.Color(179, 236, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User Profile:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name:");

        namejLabel.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Enterprise:");

        enterprisejLabel.setText("jLabel5");

        updateUserprofilejButton.setText("Update User Profile");
        updateUserprofilejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserprofilejButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/userAccount.gif"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout profileViewLayout = new javax.swing.GroupLayout(profileView);
        profileView.setLayout(profileViewLayout);
        profileViewLayout.setHorizontalGroup(
            profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateUserprofilejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(profileViewLayout.createSequentialGroup()
                        .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profileViewLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namejLabel))
                            .addGroup(profileViewLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterprisejLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(53, 53, 53))
        );
        profileViewLayout.setVerticalGroup(
            profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(enterprisejLabel))
                .addGap(18, 18, 18)
                .addComponent(updateUserprofilejButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(profileView);

        jSplitPane1.setLeftComponent(jSplitPane2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void createVaccineOrderjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVaccineOrderjButtonActionPerformed
        // TODO add your handling code here:
        CreateVaccineOrderJPanel panel = new CreateVaccineOrderJPanel(workContainer, cdc, business, cdcOrg,userAccount);
        workContainer.add("CreateVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
        
        
        
        
    }//GEN-LAST:event_createVaccineOrderjButtonActionPerformed

    private void manageFedFundedVaccinejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFedFundedVaccinejButtonActionPerformed
        // TODO add your handling code here:
        ManageFedFundedVaccineJPanel panel = new ManageFedFundedVaccineJPanel(workContainer, business);
        workContainer.add("ManageFedFundedVaccineJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_manageFedFundedVaccinejButtonActionPerformed

    private void manageOrdersjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersjButtonActionPerformed
        // TODO add your handling code here:
        ManageOrdersJPanel panel = new ManageOrdersJPanel(workContainer,userAccount, business, cdc, cdcOrg);
        workContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_manageOrdersjButtonActionPerformed

    private void managePaymentsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePaymentsjButtonActionPerformed
        // TODO add your handling code here:
        ManageCDCPaymentsJPanel panel = new ManageCDCPaymentsJPanel(workContainer,userAccount, business, cdc, cdcOrg);
        workContainer.add("ManageCDCPaymentsJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_managePaymentsjButtonActionPerformed

    private void updateUserprofilejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserprofilejButtonActionPerformed
        // TODO add your handling code here:
         UpdateUserAccountJPanel panel = new UpdateUserAccountJPanel(workContainer,userAccount, business);
        workContainer.add("UpdateUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_updateUserprofilejButtonActionPerformed

    private void varesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varesjButtonActionPerformed
        // TODO add your handling code here:
        VARESReportingJPanel panel = new VARESReportingJPanel(workContainer,userAccount, business, cdc, cdcOrg);
        workContainer.add("VARESReportingJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_varesjButtonActionPerformed

    private void viewVaccineDistributionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccineDistributionjButtonActionPerformed
        // TODO add your handling code here:
        VaccineStateDistributionJPanel panel = new VaccineStateDistributionJPanel(workContainer,userAccount, business, cdc, cdcOrg);
        workContainer.add("VaccineStateDistributionJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_viewVaccineDistributionjButtonActionPerformed

    private void manageRecallRequestsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRecallRequestsjButtonActionPerformed
        // TODO add your handling code here:
        ManageRecallRequestsCDCJPanel panel = new ManageRecallRequestsCDCJPanel(workContainer,cdc, userAccount, business);
        workContainer.add("ManageRecallRequestsCDCJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_manageRecallRequestsjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createVaccineOrderjButton;
    private javax.swing.JLabel enterprisejLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton manageFedFundedVaccinejButton;
    private javax.swing.JButton manageOrdersjButton;
    private javax.swing.JButton managePaymentsjButton;
    private javax.swing.JButton manageRecallRequestsjButton;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JPanel profileView;
    private javax.swing.JButton updateUserprofilejButton;
    private javax.swing.JButton varesjButton;
    private javax.swing.JButton viewVaccineDistributionjButton;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
