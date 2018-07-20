package com.zpark.pojo;

import java.util.Date;

public class CustomerCare {
    private Integer careId;

    private Integer customerId;
    
    private CustomerInfo ci;

    private String careTheme;

    private String careWay;

    private Date careTime;

    private String careRemark;

    private Date careNexttime;

    private String carePeople;

    private String isUsed;

    
    
    public CustomerInfo getCi() {
		return ci;
	}

	public void setCi(CustomerInfo ci) {
		this.ci = ci;
	}

	public Integer getCareId() {
        return careId;
    }

    public void setCareId(Integer careId) {
        this.careId = careId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCareTheme() {
        return careTheme;
    }

    public void setCareTheme(String careTheme) {
        this.careTheme = careTheme == null ? null : careTheme.trim();
    }

    public String getCareWay() {
        return careWay;
    }

    public void setCareWay(String careWay) {
        this.careWay = careWay == null ? null : careWay.trim();
    }

    public Date getCareTime() {
        return careTime;
    }

    public void setCareTime(Date careTime) {
        this.careTime = careTime;
    }

    public String getCareRemark() {
        return careRemark;
    }

    public void setCareRemark(String careRemark) {
        this.careRemark = careRemark == null ? null : careRemark.trim();
    }

    public Date getCareNexttime() {
        return careNexttime;
    }

    public void setCareNexttime(Date careNexttime) {
        this.careNexttime = careNexttime;
    }

    public String getCarePeople() {
        return carePeople;
    }

    public void setCarePeople(String carePeople) {
        this.carePeople = carePeople == null ? null : carePeople.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}