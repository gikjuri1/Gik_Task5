package ru.Gik.Task5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import ru.Gik.Task5.entity.Artefact;
import ru.Gik.Task5.repo.ArtefactRepo;

@Service
public class ArtefactService {
    @Autowired
    ArtefactRepo repo;
    Artefact newArtefact(String name)
    {
        Artefact a = new Artefact(name);
        repo.save(a);
        return a;
    }

    public Artefact saveArtefact(Artefact a)
    {
        repo.save(a);
        return  a;
    }

    public Optional<Artefact> getArtefactbyId(BigInteger id)
    {
        return repo.findById(id);

    }

    List<Artefact> getAllArtefact()
    {
        return (List<Artefact>) repo.findAll();
    }
}
