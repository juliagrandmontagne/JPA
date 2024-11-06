package fr.digi.m062024.entite;
import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

import java.util.Set;
@Entity
@Table(name = "BANQUE")
public class Banque implements Serializable {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="NOM")
    private String nom;
    @OneToMany(mappedBy = "banque")
    private Set<Client> clients;

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
