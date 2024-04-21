package ru.Gik.Task5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Gik.Task5.entity.AccountPool;

public interface MyRepoAccountPool extends JpaRepository<AccountPool, Long> {
}
