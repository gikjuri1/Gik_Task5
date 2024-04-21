package ru.Gik.Task5.entity;

import jakarta.persistence.*;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "agreement")
@AllArgsConstructor
@NoArgsConstructor
public class Agreement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "general_agreement_id")
    private String generalAgreementId;

    @Getter
    @Setter
    @Column(name = "supplementary_agreement_id")
    private String supplementaryAgreementId;

    @Getter
    @Setter
    @Column(name = "arrangement_type")
    private String arrangementType;

    @Getter
    @Setter
    @Column(name = "sheduler_job_id")
    private Long shedulerJobId;

    @Getter
    @Setter
    @Column(name = "number")
    private String number;

    @Getter
    @Setter
    @Column(name = "opening_date")
    private Date openingDate;

    @Getter
    @Setter
    @Column(name = "closing_date")
    private Date closingDate;

    @Getter
    @Setter
    @Column(name = "cancel_date")
    private Date cancelDate;

    @Getter
    @Setter
    @Column(name = "validity_duration")
    private Long validityDuration;

    @Getter
    @Setter
    @Column(name = "cancellation_reason")
    private String cancellationReason;

    @Getter
    @Setter
    @Column(name = "status")
    private String status;

    @Getter
    @Setter
    @Column(name = "interest_calculation_date")
    private Date interestCalculationDate;

    @Getter
    @Setter
    @Column(name = "interest_rate")
    private Double interestRate;

    @Getter
    @Setter
    @Column(name = "coefficient")
    private Double coefficient;

    @Getter
    @Setter
    @Column(name = "coefficient_action")
    private String coefficientAction;

    @Getter
    @Setter
    @Column(name = "minimum_interest_rate")
    private Double minimumInterestRate;

    @Getter
    @Setter
    @Column(name = "minimum_interest_rate_coefficient")
    private Double minimumInterestRateCoefficient;

    @Getter
    @Setter
    @Column(name = "minimum_interest_rate_coefficient_action")
    private String minimumInterestRateCoefficientAction;

    @Getter
    @Setter
    @Column(name = "maximal_interest_rate")
    private Double maximalInterestRate;

    @Getter
    @Setter
    @Column(name = "maximal_interest_rate_coefficient")
    private Double maximalInterestRateCoefficient;

    @Getter
    @Setter
    @Column(name = "maximal_interest_rate_coefficient_action")
    private String maximalInterestRateCoefficientAction;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "product_id")
    @Getter
    @Setter
    private TppProduct tppProduct;

    public Agreement(String generalAgreementId, String supplementaryAgreementId, String arrangementType, Long shedulerJobId, String number, Date openingDate, Date closingDate, Date cancelDate, Long validityDuration, String cancellationReason, String status, Date interestCalculationDate, Double interestRate, Double coefficient, String coefficientAction, Double minimumInterestRate, Double minimumInterestRateCoefficient, String minimumInterestRateCoefficientAction, Double maximalInterestRate, Double maximalInterestRateCoefficient, String maximalInterestRateCoefficientAction, TppProduct tppProduct) {
        this.generalAgreementId = generalAgreementId;
        this.supplementaryAgreementId = supplementaryAgreementId;
        this.arrangementType = arrangementType;
        this.shedulerJobId = shedulerJobId;
        this.number = number;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.cancelDate = cancelDate;
        this.validityDuration = validityDuration;
        this.cancellationReason = cancellationReason;
        this.status = status;
        this.interestCalculationDate = interestCalculationDate;
        this.interestRate = interestRate;
        this.coefficient = coefficient;
        this.coefficientAction = coefficientAction;
        this.minimumInterestRate = minimumInterestRate;
        this.minimumInterestRateCoefficient = minimumInterestRateCoefficient;
        this.minimumInterestRateCoefficientAction = minimumInterestRateCoefficientAction;
        this.maximalInterestRate = maximalInterestRate;
        this.maximalInterestRateCoefficient = maximalInterestRateCoefficient;
        this.maximalInterestRateCoefficientAction = maximalInterestRateCoefficientAction;
        this.tppProduct = tppProduct;
    }

    @Override
    public String toString()
    {
        return number+ " "+status;
    }

}
