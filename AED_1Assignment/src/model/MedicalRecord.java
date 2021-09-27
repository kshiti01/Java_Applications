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
public class MedicalRecord {
    private String medRecordNo;
    private String illness1;
    private String illness2;
    private String healthPlanBenNo;
    private String uniquePatientCode;

    public String getMedRecordNo() {
        return medRecordNo;
    }

    public void setMedRecordNo(String medRecordNo) {
        this.medRecordNo = medRecordNo;
    }

    public String getIllness1() {
        return illness1;
    }

    public void setIllness1(String illness1) {
        this.illness1 = illness1;
    }

    public String getIllness2() {
        return illness2;
    }

    public void setIllness2(String illness2) {
        this.illness2 = illness2;
    }

    public String getHealthPlanBenNo() {
        return healthPlanBenNo;
    }

    public void setHealthPlanBenNo(String healthPlanBenNo) {
        this.healthPlanBenNo = healthPlanBenNo;
    }
    
     public String getUniquePatientCode() {
        return uniquePatientCode;
    }

    public void setUniquePatientCode(String uniquePatientCode) {
        this.uniquePatientCode = uniquePatientCode;
    }
    
}
