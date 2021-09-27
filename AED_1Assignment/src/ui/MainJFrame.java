/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.BankAcc;
import model.Device;
import model.Image;
import model.MedicalRecord;
import model.Person;
import model.Vehicle;

/**
 *
 * @author kshit
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Person person;
    BankAcc bankAcc;
    Device device;
    MedicalRecord medrec;
    Vehicle vehicle;
    Image img;
    
    public MainJFrame() {
        initComponents();
        person = new Person();
        bankAcc = new BankAcc();
        device = new Device();
        medrec = new MedicalRecord();
        vehicle = new Vehicle();
        img = new Image();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        CreatePerson = new javax.swing.JButton();
        ViewPerson = new javax.swing.JButton();
        CreateBankAcc = new javax.swing.JButton();
        ViewBankAcc = new javax.swing.JButton();
        CreateDevice = new javax.swing.JButton();
        ViewDevice = new javax.swing.JButton();
        CreateVehicle = new javax.swing.JButton();
        ViewVehicle = new javax.swing.JButton();
        CreateImage = new javax.swing.JButton();
        ViewImage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CreateMedical = new javax.swing.JButton();
        ViewMedical = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        DisplayPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPanel.setDividerLocation(230);

        controlPanel.setMinimumSize(new java.awt.Dimension(150, 150));

        CreatePerson.setText("Create Person");
        CreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePersonActionPerformed(evt);
            }
        });

        ViewPerson.setText("View Person");
        ViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPersonActionPerformed(evt);
            }
        });

        CreateBankAcc.setText("Create Account");
        CreateBankAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBankAccActionPerformed(evt);
            }
        });

        ViewBankAcc.setText("View Account");
        ViewBankAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBankAccActionPerformed(evt);
            }
        });

        CreateDevice.setText("Create Device");
        CreateDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDeviceActionPerformed(evt);
            }
        });

        ViewDevice.setText("View Device");
        ViewDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDeviceActionPerformed(evt);
            }
        });

        CreateVehicle.setText("Create Vehicle");
        CreateVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateVehicleActionPerformed(evt);
            }
        });

        ViewVehicle.setText("View Vehicle");
        ViewVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewVehicleActionPerformed(evt);
            }
        });

        CreateImage.setText("Create Image");
        CreateImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateImageActionPerformed(evt);
            }
        });

        ViewImage.setText("View Image");
        ViewImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewImageActionPerformed(evt);
            }
        });

        jLabel2.setText("Personal details");

        jLabel3.setText("Image Details");

        jLabel4.setText("Vehicle Details");

        jLabel5.setText("Device Details");

        jLabel6.setText("Bank Details");

        CreateMedical.setText("Create Record");
        CreateMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateMedicalActionPerformed(evt);
            }
        });

        ViewMedical.setText("View Record");
        ViewMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMedicalActionPerformed(evt);
            }
        });

        jLabel7.setText("Medical Records");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(CreatePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewPerson))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreateVehicle)
                            .addComponent(CreateImage, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ViewVehicle))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addComponent(ViewImage)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(CreateMedical)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewMedical))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateBankAcc)
                        .addGap(18, 18, 18)
                        .addComponent(ViewBankAcc))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(CreateDevice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewDevice))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewPerson)
                    .addComponent(CreatePerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateMedical)
                    .addComponent(ViewMedical))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateBankAcc)
                    .addComponent(ViewBankAcc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateDevice)
                    .addComponent(ViewDevice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewVehicle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CreateVehicle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateImage)
                    .addComponent(ViewImage))
                .addGap(69, 69, 69))
        );

        splitPanel.setLeftComponent(controlPanel);

        javax.swing.GroupLayout DisplayPanelLayout = new javax.swing.GroupLayout(DisplayPanel);
        DisplayPanel.setLayout(DisplayPanelLayout);
        DisplayPanelLayout.setHorizontalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        DisplayPanelLayout.setVerticalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        splitPanel.setRightComponent(DisplayPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPersonActionPerformed
        // TODO add your handling code here:
        ViewPerson viewPerson = new ViewPerson(person);
        splitPanel.setRightComponent(viewPerson);
    }//GEN-LAST:event_ViewPersonActionPerformed

    private void ViewMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMedicalActionPerformed
        // TODO add your handling code here:
        ViewMedical viewMedical = new ViewMedical(medrec);
        splitPanel.setRightComponent(viewMedical);
    }//GEN-LAST:event_ViewMedicalActionPerformed

    private void CreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePersonActionPerformed
        
        CreatePerson createPerson = new CreatePerson(person);
        splitPanel.setRightComponent(createPerson);
    }//GEN-LAST:event_CreatePersonActionPerformed

    private void CreateMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateMedicalActionPerformed
        // TODO add your handling code here:
        CreateMedical createMedical = new CreateMedical(medrec);
        splitPanel.setRightComponent(createMedical);
    }//GEN-LAST:event_CreateMedicalActionPerformed

    private void CreateBankAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBankAccActionPerformed
        // TODO add your handling code here:
        CreateBankAcc createBankAcc = new CreateBankAcc(bankAcc);
         splitPanel.setRightComponent(createBankAcc);
    }//GEN-LAST:event_CreateBankAccActionPerformed

    private void ViewBankAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBankAccActionPerformed
        // TODO add your handling code here:
        ViewBankAcc viewBankAcc = new ViewBankAcc(bankAcc);
         splitPanel.setRightComponent(viewBankAcc);
    }//GEN-LAST:event_ViewBankAccActionPerformed

    private void CreateDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateDeviceActionPerformed
        // TODO add your handling code here:
        CreateDevice createDevice = new CreateDevice(device);
        splitPanel.setRightComponent(createDevice);
    }//GEN-LAST:event_CreateDeviceActionPerformed

    private void ViewDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDeviceActionPerformed
        // TODO add your handling code here:
        ViewDevice viewDevice = new ViewDevice(device);
        splitPanel.setRightComponent(viewDevice);

    }//GEN-LAST:event_ViewDeviceActionPerformed

    private void CreateVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateVehicleActionPerformed
        // TODO add your handling code here:
         CreateVehicle  createVehicle = new  CreateVehicle(vehicle);
         splitPanel.setRightComponent(createVehicle);
    }//GEN-LAST:event_CreateVehicleActionPerformed

    private void ViewVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewVehicleActionPerformed
        // TODO add your handling code here:
        ViewVehicle viewVehicle = new ViewVehicle(vehicle);
        splitPanel.setRightComponent(viewVehicle);
    }//GEN-LAST:event_ViewVehicleActionPerformed

    private void CreateImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateImageActionPerformed
        // TODO add your handling code here:
        CreateImage createImage = new CreateImage(img);
        splitPanel.setRightComponent(createImage);
    }//GEN-LAST:event_CreateImageActionPerformed

    private void ViewImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewImageActionPerformed
        // TODO add your handling code here:
        ViewImage viewImage = new ViewImage(img);
        splitPanel.setRightComponent(viewImage);
    }//GEN-LAST:event_ViewImageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateBankAcc;
    private javax.swing.JButton CreateDevice;
    private javax.swing.JButton CreateImage;
    private javax.swing.JButton CreateMedical;
    private javax.swing.JButton CreatePerson;
    private javax.swing.JButton CreateVehicle;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JButton ViewBankAcc;
    private javax.swing.JButton ViewDevice;
    private javax.swing.JButton ViewImage;
    private javax.swing.JButton ViewMedical;
    private javax.swing.JButton ViewPerson;
    private javax.swing.JButton ViewVehicle;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSplitPane splitPanel;
    // End of variables declaration//GEN-END:variables
}
