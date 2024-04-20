package ru.Gik.Task5.dto;

import java.util.Date;

public class AgreementDTO {
    private Long id;
    private Long productId;
    private String generalAgreementId;
    private String supplementaryAgreementId;
    private String arrangementType;
    private Long shedulerJobId;
    private String number;
    private Date openingDate;
    private Date closingDate;
    private Date cancelDate;
    private Long validityDuration;
    private String cancellationReason;
    private String status;
    private Date interestCalculationDate;
    private Double interestRate;
    private Double coefficient;
    private String coefficientAction;
    private Double minimumInterestRate;
    private Double minimumInterestRateCoefficient;
    private String minimumInterestRateCoefficientAction;
    private Double maximalInterestRate;
    private Double maximalInterestRateCoefficient;
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

    public void setMinimumInterestRate(Double minimumInterestRate) {
        this.minimumInterestRate = minimumInterestRate;
    }

    public Double getMinimumInterestRateCoefficient() {
        return this.minimumInterestRateCoefficient;
    }

    public void setMinimumInterestRateCoefficient(Double minimumInterestRateCoefficient) {
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

    public void setMaximalInterestRate(Double maximalInterestRate) {
        this.maximalInterestRate = maximalInterestRate;
    }

    public Double getMaximalInterestRateCoefficient() {
        return this.maximalInterestRateCoefficient;
    }

    public void setMaximalInterestRateCoefficient(Double maximalInterestRateCoefficient) {
        this.maximalInterestRateCoefficient = maximalInterestRateCoefficient;
    }

    public String getMaximalInterestRateCoefficientAction() {
        return this.maximalInterestRateCoefficientAction;
    }

    public void setMaximalInterestRateCoefficientAction(String maximalInterestRateCoefficientAction) {
        this.maximalInterestRateCoefficientAction = maximalInterestRateCoefficientAction;
    }
}
