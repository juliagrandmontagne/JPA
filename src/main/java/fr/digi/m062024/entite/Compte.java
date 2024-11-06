package fr.digi.m062024.entite;

import java.util.List;

public class Compte {
    private Long id;

    private String nom;

    //@OneToMany(mappedBy = "banque")
    // private List<Client> clients;


    public Compte() {
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
