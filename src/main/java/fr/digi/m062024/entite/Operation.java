package fr.digi.m062024.entite;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import java.util.Locale;

@Entity
@Table(name = "OPERATION")
public class Operation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="DATE")
    private LocalDateTime date;
    @Column(name ="MONTANT")
    private double montant;
    @Column(name ="MOTIF")
    private String motif;
//    @ManyToOne
//    @JoinColumn(name = "compte_id")
//    private Compte compte;


//    @ManyToOne
//    @JoinColumn(name = "virement_id")
//    private Virement virement;

    public Operation() {
    }

    public Operation(LocalDateTime date, double montant, String motif) {
        this.date = date;
        this.montant = montant;
        this.motif = motif;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}

