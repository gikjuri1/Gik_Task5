package ru.Gik.Task5.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tpp_ref_account_type")
public class TppRefAccountType {
    @Id
    @Column(name = "internal_id")
    private Long internalId;

    @Column(name = "value")
    private String value;

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
}
