package ru.Gik.Task5.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tpp_product")
public class TppProduct {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "product_code_id")
    private Long productCodeId;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "type")
    private String type;

    @Column(name = "number")
    private String number;

    @Column(name = "priority")
    private Long priority;

    @Column(name = "date_of_conclusion")
    private Date dateOfConclusion;

    @Column(name = "start_date_time")
    private Date startDateTime;

    @Column(name = "end_date_time")
    private Date endDateTime;

    @Column(name = "days")
    private Long days;

    @Column(name = "penalty_rate")
    private Double penaltyRate;

    @Column(name = "nso")
    private Double nso;

    @Column(name = "threshold_amount")
    private Double thresholdAmount;

    @Column(name = "requisite_type")
    private String requisiteType;

    @Column(name = "interest_rate_type")
    private String interestRateType;

    @Column(name = "tax_rate")
    private Double taxRate;

    @Column(name = "reasone_close")
    private String reasoneClose;

    @Column(name = "state")
    private String state;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductCodeId() {
        return this.productCodeId;
    }

    public void setProductCodeId(Long productCodeId) {
        this.productCodeId = productCodeId;
    }

    public Long getClientId() {
        return this.clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getPriority() {
        return this.priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Date getDateOfConclusion() {
        return this.dateOfConclusion;
    }

    public void setDateOfConclusion(Date dateOfConclusion) {
        this.dateOfConclusion = dateOfConclusion;
    }

    public Date getStartDateTime() {
        return this.startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return this.endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Long getDays() {
        return this.days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    public Double getPenaltyRate() {
        return this.penaltyRate;
    }

    public void setPenaltyRate(Double penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    public Double getNso() {
        return this.nso;
    }

    public void setNso(Double nso) {
        this.nso = nso;
    }

    public Double getThresholdAmount() {
        return this.thresholdAmount;
    }

    public void setThresholdAmount(Double thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }

    public String getRequisiteType() {
        return this.requisiteType;
    }

    public void setRequisiteType(String requisiteType) {
        this.requisiteType = requisiteType;
    }

    public String getInterestRateType() {
        return this.interestRateType;
    }

    public void setInterestRateType(String interestRateType) {
        this.interestRateType = interestRateType;
    }

    public Double getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getReasoneClose() {
        return this.reasoneClose;
    }

    public void setReasoneClose(String reasoneClose) {
        this.reasoneClose = reasoneClose;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
