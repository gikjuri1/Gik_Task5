package ru.Gik.Task5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Gik.Task5.entity.Agreement;
import ru.Gik.Task5.entity.TppRefProductClass;

public interface MyRepoTppRefProductClass extends JpaRepository<TppRefProductClass, Long> {
}
