package fr.digi.m062024.entite;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="NOM")
    private String nom;
    @Column(name ="PRENOM")
    private String prenom;
    @Column(name ="DATEDENAISSANCE")
    private Date dateDeNaissance;


//    @ManyToOne
//    @JoinColumn(name = "banque_id")
//    private Banque banque;

    @Embedded
    private Adresse adresse;

    public Client() {
    }

    public Client(String nom, String prenom, Date dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

}
