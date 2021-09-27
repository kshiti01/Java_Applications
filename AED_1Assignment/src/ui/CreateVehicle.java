/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.Vehicle;

/**
 *
 * @author kshit
 */
public class CreateVehicle extends javax.swing.JPanel {

    /**
     * Creates new form CreateVehicle
     */
    Vehicle vehicle;
    public CreateVehicle(Vehicle vehicle) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vTitle = new javax.swing.JLabel();
        lDrivingLicenseNo = new javax.swing.JLabel();
        lLicensePlate = new javax.swing.JLabel();
        lIssue = new javax.swing.JLabel();
        lExpiry = new javax.swing.JLabel();
        tlDrivingLicenseNo = new javax.swing.JTextField();
        tlLicensePlate = new javax.swing.JTextField();
        tIssue = new javax.swing.JTextField();
        tExpiry = new javax.swing.JTextField();
        bSave = new javax.swing.JButton();

        vTitle.setText("Create Vehicle Details");

        lDrivingLicenseNo.setText("Driving Licence No:");

        lLicensePlate.setText("Vehicle Licence Plate No:");

        lIssue.setText("License Issue Date:");

        lExpiry.setText("License Expiry Date:");

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(vTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lIssue)
                            .addComponent(lDrivingLicenseNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lExpiry)
                            .addComponent(lLicensePlate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tlLicensePlate)
                            .addComponent(tlDrivingLicenseNo)
                            .addComponent(tIssue)
                            .addComponent(tExpiry)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(bSave)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDrivingLicenseNo)
                    .addComponent(tlDrivingLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lLicensePlate)
                    .addComponent(tlLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lIssue)
                    .addComponent(tIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lExpiry)
                    .addComponent(tExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bSave)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        // TODO add your handling code here:
        vehicle.setDrivingLicenseNo(tlDrivingLicenseNo.getText());
        vehicle.setVehicleLicensePlateNo(tlLicensePlate.getText());
        vehicle.setExpireDate(tExpiry.getText());
        vehicle.setIssueDate(tIssue.getText());
         JOptionPane.showMessageDialog(this,"Information Saved");
    }//GEN-LAST:event_bSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSave;
    private javax.swing.JLabel lDrivingLicenseNo;
    private javax.swing.JLabel lExpiry;
    private javax.swing.JLabel lIssue;
    private javax.swing.JLabel lLicensePlate;
    private javax.swing.JTextField tExpiry;
    private javax.swing.JTextField tIssue;
    private javax.swing.JTextField tlDrivingLicenseNo;
    private javax.swing.JTextField tlLicensePlate;
    private javax.swing.JLabel vTitle;
    // End of variables declaration//GEN-END:variables
}
