/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_checkResult;

import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import medicalsystem.Community;
import medicalsystem.Encounter;
import medicalsystem.MedicalSystem;
import medicalsystem.Patient;

/**
 *
 * @author TT
 */
public class CheckResultJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckResultJPanel
     */
    private JPanel userProcessContainer;
    private MedicalSystem admin;
    
    
    public CheckResultJPanel(JPanel userProcessContainer, MedicalSystem admin) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.admin = admin;
        
        cmbCommunity.removeAllItems();
        for (Community ct : admin.city.getCommunityMap().values()) {
            cmbCommunity.addItem(ct);   // show the community's name in combo box
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

        cmbCommunity = new javax.swing.JComboBox();
        btnCheck = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCheckResult = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        txtShowNumber = new javax.swing.JTextField();

        cmbCommunity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        tblCheckResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "First Name", "Last Name", "Age", "House"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCheckResult);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtShowNumber.setEditable(false);
        txtShowNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnCheck))
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtShowNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnBack)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck))
                .addGap(42, 42, 42)
                .addComponent(txtShowNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        Community community = (Community)cmbCommunity.getSelectedItem();
        // JOptionPane.showMessageDialog(this, community.getId());
        
        showResult(admin, community.getId());
        JOptionPane.showMessageDialog(this, "Search result successfully!");
        
    }//GEN-LAST:event_btnCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JComboBox cmbCommunity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCheckResult;
    private javax.swing.JTextField txtShowNumber;
    // End of variables declaration//GEN-END:variables

    private void showResult(MedicalSystem admin, int id) {
        int sum = 0;
        HashMap<Integer, Patient> result = new HashMap<Integer, Patient>();
        
        for(Patient p : admin.patientDirectory.getPatientMap().values()){
            if(p.getCommunityId() == id){
                for(Encounter e : p.getEncounterHistory().getEncounterMap().values()){
                int hp = e.getVitalSign().getHighPressure();
                int lp = e.getVitalSign().getLowPressure();
                    if((hp >= 140 && lp >= 90) || (hp < 90 && lp < 60)){      // abnormal blood pressure
                        result.put(p.getId(), p);
                        sum++;
                        break;
                    }
                }
            }
            
        }
        
        txtShowNumber.setText("The number of people with abnoral blood pressure in this community is:  " + Integer.toString(sum) + " .");
        
        DefaultTableModel model = (DefaultTableModel) tblCheckResult.getModel();
        model.setRowCount(0);
        
        for(Patient p: result.values()){
            Object[] row = new Object[5];
            row[0] = p;  // override the method to show id
            row[1] = p.getFirstName();
            row[2] = p.getLastName();
            row[3] = p.getAge();
            row[4] = p.getResidenceId();

            model.addRow(row);
        }
        
    }
}
