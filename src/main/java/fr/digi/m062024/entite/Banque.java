package fr.digi.m062024.entite;
import java.util.List;
import jakarta.persistence.*;

import java.util.Set;

public class Banque {
    //@Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
   // @OneToMany(mappedBy = "banque")
   // private List<Client> clients;

    public Banque() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
