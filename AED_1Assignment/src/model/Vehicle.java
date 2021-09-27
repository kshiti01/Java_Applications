/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kshit
 */
public class Vehicle {
    private String vehicleLicensePlateNo;
    private String drivingLicenseNo;
    private String issueDate;
    private String expireDate;

    public String getVehicleLicensePlateNo() {
        return vehicleLicensePlateNo;
    }

    public void setVehicleLicensePlateNo(String vehicleLicensePlateNo) {
        this.vehicleLicensePlateNo = vehicleLicensePlateNo;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    
}
