package ru.Gik.Task5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Gik.Task5.entity.Account;

public interface MyRepoAccount extends JpaRepository<Account, Long> {
}
