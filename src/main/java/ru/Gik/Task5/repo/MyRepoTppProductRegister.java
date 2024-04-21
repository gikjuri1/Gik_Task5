package ru.Gik.Task5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Gik.Task5.entity.TppProductRegister;

public interface MyRepoTppProductRegister extends JpaRepository<TppProductRegister, Long> {
}
