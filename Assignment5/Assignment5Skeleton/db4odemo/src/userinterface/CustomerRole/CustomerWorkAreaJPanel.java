package userinterface.CustomerRole;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author MyPC1
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        //this.set

        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        placeOrder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        placeOrderButtonPanel = new javax.swing.JPanel();
        placeOrderLabel = new javax.swing.JLabel();
        orderStatusButtonPanel = new javax.swing.JPanel();
        orderStatusLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(31, 50, 97));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placeOrderButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeOrderButtonPanelMousePressed(evt);
            }
        });

        placeOrderLabel.setBackground(new java.awt.Color(102, 153, 255));
        placeOrderLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        placeOrderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeOrderLabel.setText("Create Order");
        placeOrderLabel.setBorder(new javax.swing.border.MatteBorder(null));
        placeOrderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeOrderLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout placeOrderButtonPanelLayout = new javax.swing.GroupLayout(placeOrderButtonPanel);
        placeOrderButtonPanel.setLayout(placeOrderButtonPanelLayout);
        placeOrderButtonPanelLayout.setHorizontalGroup(
            placeOrderButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeOrderButtonPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(placeOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        placeOrderButtonPanelLayout.setVerticalGroup(
            placeOrderButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeOrderButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeOrderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(placeOrderButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        orderStatusButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        orderStatusButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderStatusButtonPanelMousePressed(evt);
            }
        });

        orderStatusLabel.setBackground(new java.awt.Color(102, 153, 255));
        orderStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        orderStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderStatusLabel.setText("Order Status");
        orderStatusLabel.setBorder(new javax.swing.border.MatteBorder(null));
        orderStatusLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderStatusLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout orderStatusButtonPanelLayout = new javax.swing.GroupLayout(orderStatusButtonPanel);
        orderStatusButtonPanel.setLayout(orderStatusButtonPanelLayout);
        orderStatusButtonPanelLayout.setHorizontalGroup(
            orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderStatusButtonPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(orderStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        orderStatusButtonPanelLayout.setVerticalGroup(
            orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderStatusButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        jPanel1.add(orderStatusButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 280, 50));

        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(940, 808));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderLabelMousePressed
        placeOrder();
    }//GEN-LAST:event_placeOrderLabelMousePressed

    private void placeOrder() {
        // TODO add your handling code here:
        

        PlaceOrderJPanel placeOrderJPanel = new PlaceOrderJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("PlaceOrderJPanel", placeOrderJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);

    }

    private void placeOrderButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderButtonPanelMousePressed
        placeOrder();
    }//GEN-LAST:event_placeOrderButtonPanelMousePressed

    private void orderStatusLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderStatusLabelMousePressed
        orderStatus();
    }//GEN-LAST:event_orderStatusLabelMousePressed

    private void orderStatusButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderStatusButtonPanelMousePressed
        // TODO add your handling code here:
        orderStatus();
    }//GEN-LAST:event_orderStatusButtonPanelMousePressed

    private void orderStatus() {
        // TODO add your handling code here:
       
        
        OrderStatusJPanel orderStatusJPanel = new OrderStatusJPanel(rightSystemAdminPanel, ecosystem, userAccount);
        rightSystemAdminPanel.add("OrderStatusJPanel", orderStatusJPanel);
        CardLayout layout = (CardLayout)rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel orderStatusButtonPanel;
    private javax.swing.JLabel orderStatusLabel;
    private javax.swing.JPanel placeOrderButtonPanel;
    private javax.swing.JLabel placeOrderLabel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
