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
public class Device {
    private String deviceBrand;
    private String deviceImeiNo;
    private String deviceModel;

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceImeiNo() {
        return deviceImeiNo;
    }

    public void setDeviceImeiNo(String deviceImeiNo) {
        this.deviceImeiNo = deviceImeiNo;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }
    
}
