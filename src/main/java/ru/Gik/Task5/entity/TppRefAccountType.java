package ru.Gik.Task5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "tpp_ref_account_type")
@AllArgsConstructor
@NoArgsConstructor

public class TppRefAccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "internal_id")
    private Long internalId;

    @Getter
    @Setter
    @Column(name = "value")
    private String value;

    /*@Getter //!!!!
    @Setter //!!!!
    @OneToMany(mappedBy = "tppRefAccountType", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<TppRefProductRegisterType> tppRefProductRegisterTypeSet = new HashSet<TppRefProductRegisterType>();*/

    public TppRefAccountType(String value) {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }

}
