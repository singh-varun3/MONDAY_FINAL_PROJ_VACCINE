/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PublicHealthDepartment;

import Business.Business;
import Business.Network.StateNetwork;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author akshit verma
 */
public class EnterStatePopulationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterStatePopulationJPanel
     */
    private JPanel workContainer;
    private StateNetwork state;
    //private Business business;
    
    public EnterStatePopulationJPanel(JPanel workContainer, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.state = state;
        //this.business = business;
        
        
        try{
        currentPopulationjTextField.setText(String.valueOf(state.getStatePopulation()));
        }
        catch(Exception e){
            currentPopulationjTextField.setText(String.valueOf(1));
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
        jLabel2 = new javax.swing.JLabel();
        currentPopulationjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        updatePopulationjTextField = new javax.swing.JTextField();
        updatejButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("State Population");

        jLabel2.setText("Current Population :");

        currentPopulationjTextField.setEnabled(false);
        currentPopulationjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPopulationjTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Update Population:");

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentPopulationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updatePopulationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatejButton)))
                        .addGap(0, 22, Short.MAX_VALUE)))
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
                    .addComponent(currentPopulationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePopulationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatejButton))
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void currentPopulationjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPopulationjTextFieldActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_currentPopulationjTextFieldActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        try{
            int oldPopulation = state.getStatePopulation();
            int oldVaccineLeft = state.getVaccinesLeftForState();
           
        int population = Integer.parseInt(updatePopulationjTextField.getText());
        state.setStatePopulation(population);
        
        int populationChange = oldPopulation - population;
        if(populationChange>=0)
        {
            state.setVaccinesLeftForState(oldVaccineLeft+populationChange);
        }
        else
        {
            state.setVaccinesLeftForState(population-oldPopulation+oldVaccineLeft);
        }
        
        
        currentPopulationjTextField.setText(String.valueOf(state.getStatePopulation()));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter numeric Value");
            return;
        }
    }//GEN-LAST:event_updatejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField currentPopulationjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField updatePopulationjTextField;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}
