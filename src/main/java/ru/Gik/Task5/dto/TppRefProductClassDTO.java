package ru.Gik.Task5.dto;

public class TppRefProductClassDTO {
    private Long internalId;
    private String value;
    private String gbiCode;
    private String gbiName;
    private String productRowCode;
    private String productRowName;
    private String subclassCode;
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
