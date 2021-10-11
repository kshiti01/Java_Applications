/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import car_service.Car;
import car_service.CarHistory;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshit
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    CarHistory history;
    public boolean avl=false;
    public boolean cert=false;
    
    public ViewJPanel(CarHistory history) {
        initComponents();
        
        this.history = history;
        
        populateTable();
        
        
        
    }

    ViewJPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCar = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCertificateNumber = new javax.swing.JLabel();
        lblCertificateExpDate = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        txtManufacturingYear = new javax.swing.JTextField();
        lblManufacturer = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        lblManufacturingYear = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        lblModelNumber = new javax.swing.JLabel();
        txtSeatCount = new javax.swing.JTextField();
        lblSerialNumber = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblSeatCount = new javax.swing.JLabel();
        txtCertificateNumber = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblVehicleAvailable = new javax.swing.JLabel();
        txtMainCertificate = new javax.swing.JTextField();
        txtCarAvailable = new javax.swing.JTextField();
        lblLastUpdatedTitle = new javax.swing.JLabel();
        lblLastUpdatedOn = new javax.swing.JLabel();
        lblCountTitle = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Car Catalog");

        tblCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Manufacturer", "Manufacturing year", "Model Number", "Serial Number", "Seat Count", "City", "Certificate Number", "Vehicle available", "Vertificate Expiration Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCar);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCertificateNumber.setText("Certificate Number");

        lblCertificateExpDate.setText("Maintainance Certificate");

        lblManufacturer.setText("Manufacturer");

        lblManufacturingYear.setText("Manufacturing Year");

        lblModelNumber.setText("Model Number");

        lblSerialNumber.setText("Serial Number");

        lblSeatCount.setText("Seat Count");

        lblCity.setText("City");

        lblVehicleAvailable.setText("Car Available");

        lblLastUpdatedTitle.setText("Last Updated on");

        lblCountTitle.setText("Count:");

        lblCount.setText("0");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCertificateExpDate)
                                    .addComponent(lblCertificateNumber)
                                    .addComponent(lblCity)
                                    .addComponent(lblSeatCount)
                                    .addComponent(lblSerialNumber)
                                    .addComponent(lblModelNumber)
                                    .addComponent(lblManufacturingYear)
                                    .addComponent(lblManufacturer)
                                    .addComponent(lblVehicleAvailable))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCarAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtMainCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtManufacturer)
                                        .addComponent(txtManufacturingYear)
                                        .addComponent(txtModelNumber)
                                        .addComponent(txtSerialNumber)
                                        .addComponent(txtSeatCount)
                                        .addComponent(txtCity)
                                        .addComponent(txtCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCountTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLastUpdatedTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLastUpdatedOn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLastUpdatedTitle)
                        .addComponent(lblCountTitle)
                        .addComponent(lblCount))
                    .addComponent(lblLastUpdatedOn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManufacturer)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManufacturingYear)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeatCount)
                    .addComponent(txtSeatCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCertificateNumber)
                    .addComponent(txtCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCertificateExpDate)
                    .addComponent(txtMainCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVehicleAvailable)
                    .addComponent(txtCarAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addContainerGap(397, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblCar.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        Car selectedCar = (Car)model.getValueAt(selectedRowIndex,0);
        
        history.deleteCar(selectedCar);
        
        JOptionPane.showMessageDialog(this, "Entry Deleted.");
        
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblCar.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a model to view details.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        Car selectedCar = (Car)model.getValueAt(selectedRowIndex,0);
        
        txtManufacturer.setText(selectedCar.getManufacturer());
        txtManufacturingYear.setText(String.valueOf(selectedCar.getManufacturingYear()));
        txtModelNumber.setText(selectedCar.getModelNumber());
        txtSerialNumber.setText(selectedCar.getSerialNumber());
        txtSeatCount.setText(String.valueOf(selectedCar.getSeatCount()));
        txtCity.setText(selectedCar.getLocation());
        txtCertificateNumber.setText(selectedCar.getCertificateNumber());
        
        if(selectedCar.isCertificateValid() == true){
            txtMainCertificate.setText("Valid");
            
        } else{
            txtMainCertificate.setText("Expired");
        }
        
        if (selectedCar.isVehicleAvailable() == true){
            
            txtCarAvailable.setText("Yes");
        } else {
            txtCarAvailable.setText("No");
        }
        
        //txtCarAvailable.setText((selectedCar.isVehicleAvailable()));
        //txtMainCertificate.setText((selectedCar.isCertificateValid()));
        //txtCertificateExpDate. (selectedCar.isCertificateExpired());
        
        /*
        txtManufacturer.setEditable(false);
        txtManufacturingYear.setEditable(false);
        txtModelNumber.setEditable(false);
        txtSerialNumber.setEditable(false);
        txtSeatCount.setEditable(false);
        txtCity.setEditable(false);
        txtCertificateNumber.setEditable(false);
        */
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        int selectedRowIndex = tblCar.getSelectedRow();
        
        Car selectedCar = (Car)model.getValueAt(selectedRowIndex,0);
        
        history.deleteCar(selectedCar);
        System.out.println( selectedCar);

        
        if(tblCar.getSelectedRowCount() == 1) {
          
        String manufacturer = txtManufacturer.getText();
        int manufacturingYear = Integer.parseInt(txtManufacturingYear.getText());
        String modelNumber = txtModelNumber.getText();
        String serialNumber = txtSerialNumber.getText();
        int seatCount = Integer.parseInt(txtSeatCount.getText());
        String location = txtCity.getText();
        String certificateNumber = txtCertificateNumber.getText();
       if(txtCarAvailable.getText().equals("Yes")){
           avl=true;
       }
       else{
           avl=false;
       }
       if(txtMainCertificate.getText().equals("Valid")){
           cert=true;
       }
      else{
          cert=false;
       }
        
      /*  model.setValueAt(manufacturer, tblCar.getSelectedRow(), 0);
        model.setValueAt(manufacturingYear, tblCar.getSelectedRow(), 1);
        model.setValueAt(modelNumber, tblCar.getSelectedRow(), 2);
        model.setValueAt(serialNumber, tblCar.getSelectedRow(), 3);
        model.setValueAt(seatCount, tblCar.getSelectedRow(), 4);
        model.setValueAt(location, tblCar.getSelectedRow(), 5);
        model.setValueAt(certificateNumber, tblCar.getSelectedRow(), 6);*/
        
                
      
        Car cr = history.addNewCar();
        cr.setManufacturer(manufacturer);
        cr.setManufacturingYear(manufacturingYear);
        cr.setModelNumber(modelNumber);
        cr.setSerialNumber(serialNumber);
        cr.setSeatCount(seatCount);
        cr.setLocation(location);
        cr.setCertificateNumber(certificateNumber);
       cr.setCertificateValid(cert);
        cr.setCertificateExpired(cert);
        cr.setVehicleAvailable(avl);
        cr.setVehicleNotAvailable(avl);  
         
        
        populateTable();
   
       // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime ldt = LocalDateTime.now(); 
        lblLastUpdatedOn.setText(String.valueOf(ldt));

        
         
        
        
        
            
        }
        

       
        

        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCertificateExpDate;
    private javax.swing.JLabel lblCertificateNumber;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblCountTitle;
    public javax.swing.JLabel lblLastUpdatedOn;
    private javax.swing.JLabel lblLastUpdatedTitle;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblManufacturingYear;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblSeatCount;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVehicleAvailable;
    private javax.swing.JTable tblCar;
    private javax.swing.JTextField txtCarAvailable;
    private javax.swing.JTextField txtCertificateNumber;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMainCertificate;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSeatCount;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
        
        for (Car cr : history.getHistory()){
            
            Object[] row = new Object[9];
            row[0] = cr;
            row[1] = cr.getManufacturingYear();
            row[2] = cr.getModelNumber();
            row[3] = cr.getSerialNumber();
            row[4] = cr.getSeatCount();
            row[5] = cr.getLocation();
            row[6] = cr.getCertificateNumber();
            
            if (cr.isVehicleAvailable() == true){
                
                cr.setVehicleAvailable(true);
                row[7] = "Yes";
            } else {
                row[7] = "No";
            }
            
            if (cr.isCertificateValid()== true){
                cr.setCertificateValid(true);
                row[8] = "Valid";
            } else {
                row[8] = "Expired";
            }
            
            
            
           
            model.addRow(row);
            
                      
           lblCount.setText(String.valueOf(tblCar.getRowCount()));
            
        }
         LocalDateTime ldt = LocalDateTime.now(); 
        lblLastUpdatedOn.setText(String.valueOf(ldt));
        
    }
}
