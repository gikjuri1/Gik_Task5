package ru.Gik.Task5.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tpp_ref_product_register_type")
public class TppRefProductRegisterType {
    @Id
    @Column(name = "internal_id")
    private Long internalId;

    @Column(name = "value")
    private String value;

    @Column(name = "register_type_name")
    private String registerTypeName;

    @Column(name = "product_class_code")
    private String productClassCode;

    @Column(name = "register_type_start_date")
    private Date registerTypeStartDate;

    @Column(name = "register_type_end_date")
    private Date registerTypeEndDate;

    @Column(name = "account_type")
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
