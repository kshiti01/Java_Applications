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
public class BankAcc {
    private String savingAccNo;
    private String checkingAccNo;
    private String routingNo;
    private String accHolderName;

    public String getSavingAccNo() {
        return savingAccNo;
    }

    public void setSavingAccNo(String savingAccNo) {
        this.savingAccNo = savingAccNo;
    }

    public String getCheckingAccNo() {
        return checkingAccNo;
    }

    public void setCheckingAccNo(String checkingAccNo) {
        this.checkingAccNo = checkingAccNo;
    }

    public String getRoutingNo() {
        return routingNo;
    }

    public void setRoutingNo(String routingNo) {
        this.routingNo = routingNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    
    
}
