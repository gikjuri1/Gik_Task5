package ru.Gik.Task5.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tpp_ref_product_class")
public class TppRefProductClass {
    @Id
    @Column(name = "internal_id")
    private Long internalId;

    @Column(name = "value")
    private String value;

    @Column(name = "gbi_code")
    private String gbiCode;

    @Column(name = "gbi_name")
    private String gbiName;

    @Column(name = "product_row_code")
    private String productRowCode;

    @Column(name = "product_row_name")
    private String productRowName;

    @Column(name = "subclass_code")
    private String subclassCode;

    @Column(name = "subclass_name")
    private String subclassName;

    public Long getInternalId() {
        return this.internalId;
    }

    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGbiCode() {
        return this.gbiCode;
    }

    public void setGbiCode(String gbiCode) {
        this.gbiCode = gbiCode;
    }

    public String getGbiName() {
        return this.gbiName;
    }

    public void setGbiName(String gbiName) {
        this.gbiName = gbiName;
    }

    public String getProductRowCode() {
        return this.productRowCode;
    }

    public void setProductRowCode(String productRowCode) {
        this.productRowCode = productRowCode;
    }

    public String getProductRowName() {
        return this.productRowName;
    }

    public void setProductRowName(String productRowName) {
        this.productRowName = productRowName;
    }

    public String getSubclassCode() {
        return this.subclassCode;
    }

    public void setSubclassCode(String subclassCode) {
        this.subclassCode = subclassCode;
    }

    public String getSubclassName() {
        return this.subclassName;
    }

    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName;
    }
}
