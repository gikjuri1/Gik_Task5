package ru.Gik.Task5.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "tpp_ref_product_register_type")
@AllArgsConstructor
@NoArgsConstructor

public class TppRefProductRegisterType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "internal_id")
    private Long internalId;

    @Getter
    @Setter
    @Column(name = "value")
    private String value;

    @Getter
    @Setter
    @Column(name = "register_type_name")
    private String registerTypeName;

    /*@Getter
    @Setter
    @Column(name = "product_class_code")
    private String productClassCode;*/

    @Getter
    @Setter
    @Column(name = "register_type_start_date")
    private Date registerTypeStartDate;

    @Getter
    @Setter
    @Column(name = "register_type_end_date")
    private Date registerTypeEndDate;

    /*@Getter
    @Setter
    @Column(name = "account_type")
    private String accountType;*/

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "product_class_code")
    @Getter
    @Setter
    private TppRefProductClass tppRefProductClass;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "account_type")
    @Getter
    @Setter
    private TppRefAccountType tppRefAccountType;

    @Getter //!!!!
    @Setter //!!!!
    @OneToMany(mappedBy = "tppRefProductRegisterType", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<TppProductRegister> tppProductRegisterSet = new HashSet<TppProductRegister>();


    public TppRefProductRegisterType(String value, String registerTypeName, String productClassCode, Date registerTypeStartDate, Date registerTypeEndDate, String accountType, TppRefProductClass tppRefProductRegisterType) {
        //this.value = value;
        this.registerTypeName = registerTypeName;
        //this.productClassCode = productClassCode;
        this.registerTypeStartDate = registerTypeStartDate;
        this.registerTypeEndDate = registerTypeEndDate;
        //this.accountType = accountType;
        //this.tppRefProductRegisterType = tppRefProductRegisterType;
    }

    @Override
    public String toString()
    {
        return registerTypeName;
    }

}
