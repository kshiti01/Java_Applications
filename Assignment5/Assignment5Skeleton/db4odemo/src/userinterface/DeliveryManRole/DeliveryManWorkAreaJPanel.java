/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import userinterface.RestaurantAdminRole.OrderRequestDetailsJPanel;

/**
 *
 * @author kshit
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    private List<WorkRequest> workRequestList;
    
    
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        populatDeliveryRequestTable();
    }
    
      private void populatDeliveryRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblDeliveryManWorkRequest.getModel();
        model.setRowCount(0);
        workRequestList = ecosystem.getWorkQueue().getWorkRequestListDeliveryMan(userAccount);
          System.out.println("workrequest"+workRequestList);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[tblDeliveryManWorkRequest.getColumnCount()];
            row[0] = request;
            row[1] = request.getRestaurant();
            row[2] = request.getCustomer();
            row[3] = request.getStatus();
            row[4] = request.getRequestDate();
            model.addRow(row);
        }
        }

           private void initListners() {
        tblDeliveryManWorkRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblDeliveryManWorkRequest.getSelectedRow();
                if (selectedRow >= 0) {
                    WorkRequest request = (WorkRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                    if (request instanceof OrderRequest) {
                        OrderRequest orderWorkRequest = (OrderRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                        if (orderWorkRequest != null) {
                           ProcessOrderJPanel processOrderJPanel = new ProcessOrderJPanel(userProcessContainer,ecosystem,userAccount,orderWorkRequest);
                           userProcessContainer.add("ProcessOrderJPanel", processOrderJPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
                        }
                    }

                }
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryManWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 102, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryManWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Request Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDeliveryManWorkRequest);
        if (tblDeliveryManWorkRequest.getColumnModel().getColumnCount() > 0) {
            tblDeliveryManWorkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblDeliveryManWorkRequest.getColumnModel().getColumn(1).setResizable(false);
            tblDeliveryManWorkRequest.getColumnModel().getColumn(2).setResizable(false);
            tblDeliveryManWorkRequest.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 760, 410));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER TO DELIVER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 790, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeliveryManWorkRequest;
    // End of variables declaration//GEN-END:variables
}
