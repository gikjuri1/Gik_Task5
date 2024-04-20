package ru.Gik.Task5.dto;

public class AccountDTO {
    private Long id;
    private Long accountPoolId;
    private String accountNumber;
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
