package ru.Gik.Task5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;


@Entity
@Table(name = "tpp_product_register")
@AllArgsConstructor
@NoArgsConstructor
public class TppProductRegister {
    @Getter
    @Setter
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "product_id")
    private Long productId;

    @Getter
    @Setter
    @Column(name = "type")
    private String type;

    @Getter
    @Setter
    @Column(name = "account")
    private Long account;

    @Getter
    @Setter
    @Column(name = "currency_code")
    private String currencyCode;

    @Getter
    @Setter
    @Column(name = "state")
    private String state;

    @Getter
    @Setter
    @Column(name = "account_number")
    private String accountNumber;

    /*@ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "type")
    @Getter
    @Setter
    private TppRefProductRegisterType tppRefProductRegisterType;*/

    public TppProductRegister(Long productId, String type, Long account, String currencyCode, String state, String accountNumber) {
        this.productId = productId;
        this.type = type;
        this.account = account;
        this.currencyCode = currencyCode;
        this.state = state;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString()
    {
        return account+ " "+state;
    }

}
