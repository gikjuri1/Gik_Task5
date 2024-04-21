package ru.Gik.Task5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Gik.Task5.entity.Agreement;

public interface MyRepoAgreement extends JpaRepository<Agreement, Long> {
}
