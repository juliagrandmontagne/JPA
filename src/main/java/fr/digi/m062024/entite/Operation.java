package fr.digi.m062024.entite;

import java.util.Date;

public class Operation {
    private Long id;

    private Date date;
    private double montant;
    private String motif;
    //  @ManyToOne
    //  @JoinColumn(name = "compte_id")
    // private Compte compte;

    // @ManyToOne
    //  @JoinColumn(name = "virement_id")
    // private Virement virement;

    // Constructeurs, getters et setters
    public Operation() {
    }

    public Operation(Date date, double montant, String motif) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

