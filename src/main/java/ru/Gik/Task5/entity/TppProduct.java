package ru.Gik.Task5.entity;

import jakarta.persistence.*;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tpp_product")
@AllArgsConstructor
@NoArgsConstructor

public class TppProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "product_code_id")
    private Long productCodeId;

    @Getter
    @Setter
    @Column(name = "client_id")
    private Long clientId;

    @Getter
    @Setter
    @Column(name = "type")
    private String type;

    @Getter
    @Setter
    @Column(name = "number")
    private String number;

    @Getter
    @Setter
    @Column(name = "priority")
    private Long priority;

    @Getter
    @Setter
    @Column(name = "date_of_conclusion")
    private Date dateOfConclusion;

    @Getter
    @Setter
    @Column(name = "start_date_time")
    private Date startDateTime;

    @Getter
    @Setter
    @Column(name = "end_date_time")
    private Date endDateTime;

    @Getter
    @Setter
    @Column(name = "days")
    private Long days;

    @Getter
    @Setter
    @Column(name = "penalty_rate")
    private Double penaltyRate;

    @Getter
    @Setter
    @Column(name = "nso")
    private Double nso;

    @Getter
    @Setter
    @Column(name = "threshold_amount")
    private Double thresholdAmount;

    @Getter
    @Setter
    @Column(name = "requisite_type")
    private String requisiteType;

    @Getter
    @Setter
    @Column(name = "interest_rate_type")
    private String interestRateType;

    @Getter
    @Setter
    @Column(name = "tax_rate")
    private Double taxRate;

    @Getter
    @Setter
    @Column(name = "reasone_close")
    private String reasoneClose;

    @Getter
    @Setter
    @Column(name = "state")
    private String state;

    @Getter //!!!!
    @Setter //!!!!
    @OneToMany(mappedBy = "tppProduct", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<Agreement> agreementSet = new HashSet<Agreement>();

    public TppProduct(Long productCodeId, Long clientId, String type, String number, Long priority, Date dateOfConclusion, Date startDateTime, Date endDateTime, Long days, Double penaltyRate, Double nso, Double thresholdAmount, String requisiteType, String interestRateType, Double taxRate, String reasoneClose, String state) {
        this.productCodeId = productCodeId;
        this.clientId = clientId;
        this.type = type;
        this.number = number;
        this.priority = priority;
        this.dateOfConclusion = dateOfConclusion;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.days = days;
        this.penaltyRate = penaltyRate;
        this.nso = nso;
        this.thresholdAmount = thresholdAmount;
        this.requisiteType = requisiteType;
        this.interestRateType = interestRateType;
        this.taxRate = taxRate;
        this.reasoneClose = reasoneClose;
        this.state = state;
    }

    @Override
    public String toString()
    {
        return number+ " "+priority;
    }

}
