package fr.digi.m062024.entite;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
    @Column(name ="DATE_NAISSANCE")
    private Date dateDeNaissance;


    @ManyToOne
    @JoinColumn(name = "ID-BANQUE")
    private Banque banque;
    @ManyToMany
    @JoinTable(name = "CLIENT_BANQUE",
    joinColumns =@JoinColumn(name = "ID-Client", referencedColumnName = "ID"),
    inverseJoinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID"))
    private Set<Compte> comptes;
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

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
