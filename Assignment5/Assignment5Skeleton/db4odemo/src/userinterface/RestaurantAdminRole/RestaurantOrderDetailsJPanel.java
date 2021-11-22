/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import userinterface.CustomerRole.OrderDetailsJPanel;

/**
 *
 * @author Pranali
 */
public class RestaurantOrderDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    private List<WorkRequest> workRequestList;
    UserAccount account;
    public RestaurantOrderDetailsJPanel(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account) {
        initComponents();
        initListners();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account = account;
        populatRestaurantRequestTable();
    }
     private void populatRestaurantRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblRestaurantWorkRequest.getModel();
        model.setRowCount(0);
        workRequestList = ecosystem.getWorkQueue().getWorkRequestListRestaurant(account);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[tblRestaurantWorkRequest.getColumnCount()];
            row[0] = request;
            row[1] = request.getCustomer();
            row[2] = request.getStatus();
            row[3] = request.getRequestDate();
            model.addRow(row);
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
        tblRestaurantWorkRequest = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE ORDER");

        tblRestaurantWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Customer Name", "Status", "Request Date"
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
        jScrollPane1.setViewportView(tblRestaurantWorkRequest);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
        private void initListners() {
        tblRestaurantWorkRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblRestaurantWorkRequest.getSelectedRow();
                if (selectedRow >= 0) {
                    WorkRequest request = (WorkRequest) tblRestaurantWorkRequest.getValueAt(selectedRow, 0);
                    if (request instanceof OrderRequest) {
                        OrderRequest orderWorkRequest = (OrderRequest) tblRestaurantWorkRequest.getValueAt(selectedRow, 0);
                        if (orderWorkRequest != null) {
                           OrderRequestDetailsJPanel manageOrderDetailsJPanel = new OrderRequestDetailsJPanel(userProcessContainer,ecosystem,account,orderWorkRequest);
                           userProcessContainer.add("ManageOrderDetailsJPanel", manageOrderDetailsJPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
                        }
                    }

                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurantWorkRequest;
    // End of variables declaration//GEN-END:variables
}
