/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_service;



/**
 *
 * @author kshit
 */
public class Car {

    private String manufacturer;
    private int manufacturingYear;
    private String modelNumber;
    private String serialNumber;
    private int seatCount;
    private String location;
    private String certificateNumber;
    private boolean certificateValid;
    private boolean certificateExpired;
    private boolean vehicleAvailable;
    private boolean vehicleNotAvailable;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public boolean isCertificateExpired() {
        return certificateExpired;
    }

    public void setCertificateExpired(boolean certificateExpired) {
        this.certificateExpired = certificateExpired;
    }

    public boolean isCertificateValid() {
        return certificateValid;
    }

    public void setCertificateValid(boolean certificateValid) {
        this.certificateValid = certificateValid;
    }



    public boolean isVehicleAvailable() {
        return vehicleAvailable;
    }

    public void setVehicleAvailable(boolean vehicleAvailable) {
        this.vehicleAvailable = vehicleAvailable;
    }

    public boolean isVehicleNotAvailable() {
        return vehicleNotAvailable;
    }

    public void setVehicleNotAvailable(boolean vehicleNotAvailable) {
        this.vehicleNotAvailable = vehicleNotAvailable;
    }
    
    
    @Override
    public String toString(){ 
    return manufacturer;
    }

    public void setCertificateExpDate(String certificateExpired) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
