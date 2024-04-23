package ru.Gik.Task5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.Gik.Task5.entity.Artefact;

import java.math.BigInteger;
@Repository
public interface ArtefactRepo extends JpaRepository<Artefact, BigInteger> {
}
