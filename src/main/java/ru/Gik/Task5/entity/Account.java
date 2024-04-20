package ru.Gik.Task5.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "account_pool_id")
    private Long accountPoolId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "bussy")
    private Boolean bussy;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountPoolId() {
        return this.accountPoolId;
    }

    public void setAccountPoolId(Long accountPoolId) {
        this.accountPoolId = accountPoolId;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getBussy() {
        return this.bussy;
    }

    public void setBussy(Boolean bussy) {
        this.bussy = bussy;
    }
}
