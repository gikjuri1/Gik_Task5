package ru.Gik.Task5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Gik.Task5.entity.TppProduct;

public interface MyRepoTppProduct extends JpaRepository<TppProduct, Long> {
}
