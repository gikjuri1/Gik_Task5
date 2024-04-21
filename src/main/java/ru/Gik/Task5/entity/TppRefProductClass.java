package ru.Gik.Task5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tpp_ref_product_class")
@AllArgsConstructor
@NoArgsConstructor

public class TppRefProductClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "internal_id")
    private Long internalId;

    /*@Getter
    @Setter
    @Column(name = "value")
    private String value;*/

    @Getter
    @Setter
    @Column(name = "gbi_code")
    private String gbiCode;

    @Getter
    @Setter
    @Column(name = "gbi_name")
    private String gbiName;

    @Getter
    @Setter
    @Column(name = "product_row_code")
    private String productRowCode;

    @Getter
    @Setter
    @Column(name = "product_row_name")
    private String productRowName;

    @Getter
    @Setter
    @Column(name = "subclass_code")
    private String subclassCode;

    @Getter
    @Setter
    @Column(name = "subclass_name")
    private String subclassName;

    /*@Getter //!!!!
    @Setter //!!!!
    @OneToMany(mappedBy = "tppRefProductRegisterType", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "value")
    Set<TppRefProductRegisterType> tppRefProductRegisterTypeSet = new HashSet<TppRefProductRegisterType>();*/

    public TppRefProductClass(String value, String gbiCode, String gbiName, String productRowCode, String productRowName, String subclassCode, String subclassName, Set<TppRefProductRegisterType> tppRefProductRegisterTypeSet) {
        //this.value = value;
        this.gbiCode = gbiCode;
        this.gbiName = gbiName;
        this.productRowCode = productRowCode;
        this.productRowName = productRowName;
        this.subclassCode = subclassCode;
        this.subclassName = subclassName;
        //this.tppRefProductRegisterTypeSet = tppRefProductRegisterTypeSet;
    }

    @Override
    public String toString()
    {
        return productRowName+ " "+gbiName;
    }

}
