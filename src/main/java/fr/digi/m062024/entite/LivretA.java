package fr.digi.m062024.entite;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
//@Table(name = "LIVRETA")
public class LivretA extends Compte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double taux;

    public LivretA() {
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
