package ru.Gik.Task5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

@Entity(name = "Artefact")
public class Artefact {
    public Artefact() {
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    Integer id;
    @Column(name = "name")
    String name;

    public Artefact(String name) {
        this.name = name;
    }
}
