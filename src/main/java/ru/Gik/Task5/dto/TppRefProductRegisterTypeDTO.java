package ru.Gik.Task5.dto;

import java.util.Date;

public class TppRefProductRegisterTypeDTO {
    private Long internalId;
    private String value;
    private String registerTypeName;
    private String productClassCode;
    private Date registerTypeStartDate;
    private Date registerTypeEndDate;
    private String accountType;

    public Long getInternalId() {
        return this.internalId;
    }

    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRegisterTypeName() {
        return this.registerTypeName;
    }

    public void setRegisterTypeName(String registerTypeName) {
        this.registerTypeName = registerTypeName;
    }

    public String getProductClassCode() {
        return this.productClassCode;
    }

    public void setProductClassCode(String productClassCode) {
        this.productClassCode = productClassCode;
    }

    public Date getRegisterTypeStartDate() {
        return this.registerTypeStartDate;
    }

    public void setRegisterTypeStartDate(Date registerTypeStartDate) {
        this.registerTypeStartDate = registerTypeStartDate;
    }

    public Date getRegisterTypeEndDate() {
        return this.registerTypeEndDate;
    }

    public void setRegisterTypeEndDate(Date registerTypeEndDate) {
        this.registerTypeEndDate = registerTypeEndDate;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
