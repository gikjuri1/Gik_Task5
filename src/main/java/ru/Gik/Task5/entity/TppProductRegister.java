package ru.Gik.Task5.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tpp_product_register")
public class TppProductRegister {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "type")
    private String type;

    @Column(name = "account")
    private Long account;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "state")
    private String state;

    @Column(name = "account_number")
    private String accountNumber;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getAccount() {
        return this.account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
