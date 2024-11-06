package fr.digi.m062024.entite;

import java.util.Date;
import java.util.List;

public class Client {
    // @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private Date dateDeNaissance;

    //@Embedded
    // private Adresse adresse;

    // @OneToMany(mappedBy = "client")
    // private List<Compte> comptes;

    // Constructeurs, getters et setters
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
