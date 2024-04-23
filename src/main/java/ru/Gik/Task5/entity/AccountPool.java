package ru.Gik.Task5.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "account_pool")
@AllArgsConstructor
@NoArgsConstructor
public class AccountPool {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "branch_code")
    private String branchCode;

    @Getter
    @Setter
    @Column(name = "currency_code")
    private String currencyCode;

    @Getter
    @Setter
    @Column(name = "mdm_code")
    private String mdmCode;

    @Getter
    @Setter
    @Column(name = "priority_code")
    private String priorityCode;

    @Getter
    @Setter
    @Column(name = "registry_type_code")
    private String registryTypeCode;

    @Getter //!!!!
    @Setter //!!!!
    @OneToMany(mappedBy = "accountPool", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<Account> accountSet = new HashSet<Account>();

    public AccountPool (String branchCode, String currencyCode, String mdmCode, String priorityCode, String registryTypeCode)
    {
        this.branchCode = branchCode;
        this.currencyCode = currencyCode;
        this.mdmCode = mdmCode;
        this.priorityCode = priorityCode;
        this.registryTypeCode = registryTypeCode;
    }


    @Override
    public String toString()
    {
        return branchCode+ " "+registryTypeCode;
    }

}
