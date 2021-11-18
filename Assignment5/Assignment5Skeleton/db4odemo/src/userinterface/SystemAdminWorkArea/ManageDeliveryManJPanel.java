/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pranali
 */
public class ManageDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryManJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    public ManageDeliveryManJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDeliveryMan = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        deliveryManNameTextfield = new javax.swing.JTextField();
        passwordTextfield = new javax.swing.JTextField();
        userNameTextfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deliveryManPhoneTextfield = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryMan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "PHONE", "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryMan.setGridColor(new java.awt.Color(56, 90, 174));
        tblDeliveryMan.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jScrollPane1.setViewportView(tblDeliveryMan);
        if (tblDeliveryMan.getColumnModel().getColumnCount() > 0) {
            tblDeliveryMan.getColumnModel().getColumn(1).setResizable(false);
            tblDeliveryMan.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 643, 165));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Delivery Man");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 33, 529, -1));

        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel4.setText("Delivery Man Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        btnDeliveryMan.setBackground(new java.awt.Color(255, 102, 102));
        btnDeliveryMan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeliveryMan.setText("Create");
        btnDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryManActionPerformed(evt);
            }
        });
        add(btnDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        btnModify.setBackground(new java.awt.Color(255, 102, 102));
        btnModify.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModify.setText("Update");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 82, -1));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 73, -1));
        add(deliveryManNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 246, -1));
        add(passwordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 246, -1));

        userNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextfieldActionPerformed(evt);
            }
        });
        add(userNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 246, -1));

        jLabel5.setText("Delivery Man Contact");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));
        add(deliveryManPhoneTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 246, -1));

        backjButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton1.setText("< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextfieldActionPerformed

    private void btnDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryManActionPerformed
        // TODO add your handling code here:
          
          if( userNameTextfield.getText().isEmpty()||passwordTextfield.getText().isEmpty()|| deliveryManNameTextfield.getText().isEmpty() ||  deliveryManPhoneTextfield.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        
         if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(userNameTextfield.getText())){
            
            
            DeliveryMan deliveryMan = new DeliveryMan();
            deliveryMan.setDeliveryManName(deliveryManNameTextfield.getText());
            deliveryMan.setDeliveryManPhone(deliveryManPhoneTextfield.getText());
            deliveryMan.setUsername(userNameTextfield.getText());
            deliveryMan.setPassword(passwordTextfield.getText());
            deliveryMan.setRole(new DeliverManRole());
            ecosystem.getUserAccountDirectory().addUserAccount(deliveryMan);
            /*DeliveryManDirectory deliveryManDirectory = new DeliveryManDirectory();
            deliveryManDirectory.addDeliveryMan(deliveryMan);
            ecosystem.setDeliveryManDirectory(deliveryManDirectory);*/
            ecosystem.getDeliveryManDirectory().addDeliveryMan(deliveryMan);
            
            populateTable();
            userNameTextfield.setText("");
            passwordTextfield.setText("");
            deliveryManNameTextfield.setText("");
            deliveryManPhoneTextfield.setText("");
         }else{
            JOptionPane.showMessageDialog(null, "Username " + userNameTextfield.getText() + " already exists !!!, Please try a new one");
         }
    }//GEN-LAST:event_btnDeliveryManActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        

        int selectedRow = tblDeliveryMan.getSelectedRow();
        if (selectedRow >= 0) {
            
            
            DeliveryMan deliveryMan = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
            
            deliveryMan.setUsername(userNameTextfield.getText());
            deliveryMan.setPassword(passwordTextfield.getText());
            deliveryMan.setDeliveryManName(deliveryManNameTextfield.getText());
            deliveryMan.setDeliveryManPhone(deliveryManPhoneTextfield.getText());
            deliveryMan.setRole(new DeliverManRole());
         
            populateTable();
            userNameTextfield.setText("");
            passwordTextfield.setText("");
            deliveryManNameTextfield.setText("");
            deliveryManPhoneTextfield.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                  
        int selectedRow = tblDeliveryMan.getSelectedRow();

        if (selectedRow >= 0) {
            DeliveryMan deliveryMan = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
           DeliveryManDirectory deliveryManDirectory = ecosystem.getDeliveryManDirectory();
            deliveryManDirectory.removeDeliveryMan(deliveryMan);
            JOptionPane.showMessageDialog(null, "Delivert Man  "  + userNameTextfield.getText() + " deleted");
            populateTable();
            userNameTextfield.setText("");
            passwordTextfield.setText("");
            deliveryManNameTextfield.setText("");
            deliveryManPhoneTextfield.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backjButton1ActionPerformed
    private void populateTable() {
        System.out.println("customer"+ecosystem.getCustomerDirectory().getCustomerList());
        System.out.println("delivery"+ecosystem.getUserAccountDirectory().getUserAccountList());
        DeliveryManDirectory deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
       
        model.setRowCount(0);
        
        for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManList()) {
                    Object[] row = new Object[4];
                    row[0] = deliveryMan;
                    row[1] = deliveryMan.getDeliveryManPhone();       
                    row[2] = deliveryMan.getUsername();
                    row[3] = deliveryMan.getPassword();
                    model.addRow(row);
                
            }
        
        
    }
    
      private void initListners() {
       tblDeliveryMan.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblDeliveryMan.getSelectedRow();
             if (selectedRow >= 0) {
                  DeliveryMan  deliveryMan  = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
                 if(deliveryMan!=null){
                     display(deliveryMan);
                 }
             }
        }
    });
    }

    private void display(DeliveryMan deliveryMan) {
        userNameTextfield.setText(deliveryMan.getUsername());
        passwordTextfield.setText(deliveryMan.getPassword());
        deliveryManNameTextfield.setText(deliveryMan.getDeliveryManName());
        deliveryManPhoneTextfield.setText(deliveryMan.getDeliveryManPhone());
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeliveryMan;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField deliveryManNameTextfield;
    private javax.swing.JTextField deliveryManPhoneTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField passwordTextfield;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTextField userNameTextfield;
    // End of variables declaration//GEN-END:variables
}
