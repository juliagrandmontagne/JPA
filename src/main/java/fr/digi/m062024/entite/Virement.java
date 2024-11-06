package fr.digi.m062024.entite;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
//@Table(name = "VIREMENT")
public class Virement extends Operation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String beneficiaire;

    public Virement() {

    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
