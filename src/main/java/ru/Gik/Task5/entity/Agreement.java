package ru.Gik.Task5.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "agreement")
public class Agreement {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "general_agreement_id")
    private String generalAgreementId;

    @Column(name = "supplementary_agreement_id")
    private String supplementaryAgreementId;

    @Column(name = "arrangement_type")
    private String arrangementType;

    @Column(name = "sheduler_job_id")
    private Long shedulerJobId;

    @Column(name = "number")
    private String number;

    @Column(name = "opening_date")
    private Date openingDate;

    @Column(name = "closing_date")
    private Date closingDate;

    @Column(name = "cancel_date")
    private Date cancelDate;

    @Column(name = "validity_duration")
    private Long validityDuration;

    @Column(name = "cancellation_reason")
    private String cancellationReason;

    @Column(name = "status")
    private String status;

    @Column(name = "interest_calculation_date")
    private Date interestCalculationDate;

    @Column(name = "interest_rate")
    private Double interestRate;

    @Column(name = "coefficient")
    private Double coefficient;

    @Column(name = "coefficient_action")
    private String coefficientAction;

    @Column(name = "minimum_interest_rate")
    private Double minimumInterestRate;

    @Column(name = "minimum_interest_rate_coefficient")
    private Double minimumInterestRateCoefficient;

    @Column(name = "minimum_interest_rate_coefficient_action")
    private String minimumInterestRateCoefficientAction;

    @Column(name = "maximal_interest_rate")
    private Double maximalInterestRate;

    @Column(name = "maximal_interest_rate_coefficient")
    private Double maximalInterestRateCoefficient;

    @Column(name = "maximal_interest_rate_coefficient_action")
    private String maximalInterestRateCoefficientAction;

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

    public String getGeneralAgreementId() {
        return this.generalAgreementId;
    }

    public void setGeneralAgreementId(String generalAgreementId) {
        this.generalAgreementId = generalAgreementId;
    }

    public String getSupplementaryAgreementId() {
        return this.supplementaryAgreementId;
    }

    public void setSupplementaryAgreementId(String supplementaryAgreementId) {
        this.supplementaryAgreementId = supplementaryAgreementId;
    }

    public String getArrangementType() {
        return this.arrangementType;
    }

    public void setArrangementType(String arrangementType) {
        this.arrangementType = arrangementType;
    }

    public Long getShedulerJobId() {
        return this.shedulerJobId;
    }

    public void setShedulerJobId(Long shedulerJobId) {
        this.shedulerJobId = shedulerJobId;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getOpeningDate() {
        return this.openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getClosingDate() {
        return this.closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public Date getCancelDate() {
        return this.cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Long getValidityDuration() {
        return this.validityDuration;
    }

    public void setValidityDuration(Long validityDuration) {
        this.validityDuration = validityDuration;
    }

    public String getCancellationReason() {
        return this.cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getInterestCalculationDate() {
        return this.interestCalculationDate;
    }

    public void setInterestCalculationDate(Date interestCalculationDate) {
        this.interestCalculationDate = interestCalculationDate;
    }

    public Double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getCoefficient() {
        return this.coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    public String getCoefficientAction() {
        return this.coefficientAction;
    }

    public void setCoefficientAction(String coefficientAction) {
        this.coefficientAction = coefficientAction;
    }

    public Double getMinimumInterestRate() {
        return this.minimumInterestRate;
    }

    public void setMinimumInterestRate(null minimumInterestRate) {
        this.minimumInterestRate = minimumInterestRate;
    }

    public Double getMinimumInterestRateCoefficient() {
        return this.minimumInterestRateCoefficient;
    }

    public void setMinimumInterestRateCoefficient(null minimumInterestRateCoefficient) {
        this.minimumInterestRateCoefficient = minimumInterestRateCoefficient;
    }

    public String getMinimumInterestRateCoefficientAction() {
        return this.minimumInterestRateCoefficientAction;
    }

    public void setMinimumInterestRateCoefficientAction(String minimumInterestRateCoefficientAction) {
        this.minimumInterestRateCoefficientAction = minimumInterestRateCoefficientAction;
    }

    public Double getMaximalInterestRate() {
        return this.maximalInterestRate;
    }

    public void setMaximalInterestRate(null maximalInterestRate) {
        this.maximalInterestRate = maximalInterestRate;
    }

    public Double getMaximalInterestRateCoefficient() {
        return this.maximalInterestRateCoefficient;
    }

    public void setMaximalInterestRateCoefficient(null maximalInterestRateCoefficient) {
        this.maximalInterestRateCoefficient = maximalInterestRateCoefficient;
    }

    public String getMaximalInterestRateCoefficientAction() {
        return this.maximalInterestRateCoefficientAction;
    }

    public void setMaximalInterestRateCoefficientAction(String maximalInterestRateCoefficientAction) {
        this.maximalInterestRateCoefficientAction = maximalInterestRateCoefficientAction;
    }
}
