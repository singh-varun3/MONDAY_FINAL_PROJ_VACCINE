/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CDC;

import Business.Business;
import Business.NationalEnterprise.CDC;
import Business.Network.StateNetwork;
import Business.Organization.CDCOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author akshit verma
 */
public class VaccineStateDistributionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VARESReportingJPanel
     */
    private JPanel workContainer;
    private UserAccount userAccount;
    private Business business;
    private CDC cdcEnterprise;
    private CDCOrganization cdcOrg;
    
    public VaccineStateDistributionJPanel(JPanel workContainer, UserAccount userAccount,Business business,CDC cdcEnterprise,CDCOrganization cdcOrg) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.cdcOrg = cdcOrg;
        populateTable();
        
        
        
    }
    
    
    private void populateTable(){
         DefaultTableModel model = (DefaultTableModel) summaryjTable.getModel();
        model.setRowCount(0);
        if(business.getStateList() != null)
        {
            for(StateNetwork state: business.getStateList())
            {
                Object[] row = new Object[2];
               row[0] = state;
               row[1] = state.getTotalVaccinesDistributedInState();
               
               model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        summaryjTable = new javax.swing.JTable();
        viewDetailsjButton = new javax.swing.JButton();
        viewChartjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 249, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vaccine State Distribution");

        summaryjTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        summaryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State", "Total Vaccines Distributed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        summaryjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(summaryjTable);

        viewDetailsjButton.setText("View Details >>");
        viewDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsjButtonActionPerformed(evt);
            }
        });

        viewChartjButton.setText("View Chart");
        viewChartjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewChartjButtonActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewChartjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewDetailsjButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsjButton)
                    .addComponent(viewChartjButton))
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = summaryjTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a State");
            return;
        }
        StateNetwork state = (StateNetwork)summaryjTable.getValueAt(selectedRow, 0);
        VaccineCityDistributionJPanel panel = new VaccineCityDistributionJPanel(workContainer,userAccount, business, cdcEnterprise, cdcOrg, state);
        workContainer.add("VaccineCityDistributionJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_viewDetailsjButtonActionPerformed

    private void viewChartjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewChartjButtonActionPerformed
        // TODO add your handling code here:
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        for(StateNetwork state: business.getStateList())
        {
            pieDataset.setValue(state.getStateName(), state.getTotalVaccinesDistributedInState());
            
        }
        JFreeChart chart = ChartFactory.createPieChart("Total Vaccines Distributed", pieDataset,true, true, true);
        PiePlot p = (PiePlot)chart.getPlot();
        ChartFrame frame = new ChartFrame("Total Vaccines Distributed",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
        
    }//GEN-LAST:event_viewChartjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable summaryjTable;
    private javax.swing.JButton viewChartjButton;
    private javax.swing.JButton viewDetailsjButton;
    // End of variables declaration//GEN-END:variables
}
