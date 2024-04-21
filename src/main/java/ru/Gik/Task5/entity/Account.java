package ru.Gik.Task5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "account_number")
    private String accountNumber;

    @Getter
    @Setter
    @Column(name = "bussy")
    private boolean bussy;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "account_pool_id")
    @Getter
    @Setter
    private AccountPool accountPool;

    public Account (String accountNumber, boolean bussy)
    {
        this.accountNumber = accountNumber;
        this.bussy = bussy;
    }

    @Override
    public String toString()
    {
        return accountNumber+ " "+bussy;
    }
}
