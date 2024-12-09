/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Manufacture;

import UserInterface.Distributor.ViewContractDetailsAndShipJPanel;
import Business.Business;
import Business.Enterprise.Enterprise;
import Business.NationalEnterprise.Distributor;
import Business.NationalEnterprise.Manufacturer;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import UserInterface.UpdateUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akshit verma
 */
public class ManufactureEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufactureEmployeeWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Manufacturer manufacturer;
    private Business business;
    private Distributor distributorEnterprise;
    private ProviderVaccineOrderWorkRequest request;
  
    
    public ManufactureEmployeeWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,Manufacturer manufacturer,Business business  ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.manufacturer = manufacturer;
        this.business = business;
        //this.distributorEnterprise = distributorEnterprise;
        namejLabel.setText(userAccount.getPerson().getFirstName()+" "+userAccount.getPerson().getLastName());
        manufacturerNamejLabel.setText(String.valueOf(manufacturer));
        
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
        manageVaccineProdjButton = new javax.swing.JButton();
        manageOrdersjButton = new javax.swing.JButton();
        viewBalancejButton = new javax.swing.JButton();
        manageRecallRequestsjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userProfile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateUserAccountjButton = new javax.swing.JButton();
        namejLabel = new javax.swing.JLabel();
        manufacturerNamejLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(175);

        workContainer.setBackground(new java.awt.Color(230, 249, 255));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        jSplitPane2.setDividerLocation(450);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mainMenu.setBackground(new java.awt.Color(179, 236, 255));

        manageVaccineProdjButton.setText("Manage Vaccine Products");
        manageVaccineProdjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccineProdjButtonActionPerformed(evt);
            }
        });

        manageOrdersjButton.setText("Manage Orders");
        manageOrdersjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersjButtonActionPerformed(evt);
            }
        });

        viewBalancejButton.setText("View Balance");
        viewBalancejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBalancejButtonActionPerformed(evt);
            }
        });

        manageRecallRequestsjButton.setText("Manage Recall Requests");
        manageRecallRequestsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRecallRequestsjButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("MANUFACTURER");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Main Menu:");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Akshit Verma\\Desktop\\FINALL\\dummy-repo\\FinalProject_vaccine\\images\\Manufacturer_150x85.jpg")); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageVaccineProdjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(manageOrdersjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewBalancejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageRecallRequestsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(manageVaccineProdjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageOrdersjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewBalancejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageRecallRequestsjButton)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jSplitPane2.setTopComponent(mainMenu);

        userProfile.setBackground(new java.awt.Color(179, 236, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User Profile:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Manufacturer:");

        updateUserAccountjButton.setText("Update User Account");
        updateUserAccountjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserAccountjButtonActionPerformed(evt);
            }
        });

        namejLabel.setText("jLabel4");

        manufacturerNamejLabel.setText("jLabel5");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/userAccount.gif"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout userProfileLayout = new javax.swing.GroupLayout(userProfile);
        userProfile.setLayout(userProfileLayout);
        userProfileLayout.setHorizontalGroup(
            userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateUserAccountjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manufacturerNamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(manufacturerNamejLabel))
                .addGap(18, 18, 18)
                .addComponent(updateUserAccountjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(userProfile);

        jSplitPane1.setLeftComponent(jSplitPane2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageVaccineProdjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVaccineProdjButtonActionPerformed
        // TODO add your handling code here:
        ManageVaccinesJPanel panel = new ManageVaccinesJPanel(workContainer, manufacturer, business);
        workContainer.add("ManageVaccinesJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_manageVaccineProdjButtonActionPerformed

    private void manageOrdersjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersjButtonActionPerformed
        // TODO add your handling code here:
         ManageOrdersJPanel panel = new ManageOrdersJPanel(workContainer, manufacturer, userAccount, business);
        workContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_manageOrdersjButtonActionPerformed

    private void updateUserAccountjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserAccountjButtonActionPerformed
        // TODO add your handling code here:
        UpdateUserAccountJPanel panel = new UpdateUserAccountJPanel(workContainer, userAccount, business);
        workContainer.add("UpdateUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
        
    }//GEN-LAST:event_updateUserAccountjButtonActionPerformed

    private void viewBalancejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBalancejButtonActionPerformed
        // TODO add your handling code here:
        ViewBalanceJPanel panel = new ViewBalanceJPanel(workContainer, manufacturer);
        workContainer.add("ViewBalanceJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_viewBalancejButtonActionPerformed

    private void manageRecallRequestsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRecallRequestsjButtonActionPerformed
        // TODO add your handling code here:
        ManageRecallRequestsJPanel panel = new ManageRecallRequestsJPanel(workContainer, manufacturer, userAccount, business);
        workContainer.add("ManageRecallRequestsJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_manageRecallRequestsjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton manageOrdersjButton;
    private javax.swing.JButton manageRecallRequestsjButton;
    private javax.swing.JButton manageVaccineProdjButton;
    private javax.swing.JLabel manufacturerNamejLabel;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JButton updateUserAccountjButton;
    private javax.swing.JPanel userProfile;
    private javax.swing.JButton viewBalancejButton;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
