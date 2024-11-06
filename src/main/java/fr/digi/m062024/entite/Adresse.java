package fr.digi.m062024.entite;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class Adresse implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    @Column(name ="NUMERO")
    private Long numero;
    @Column(name ="RUE")
    private String rue;
    @Column(name ="VILLE")
    private String ville;
    @Column(name ="CODE_POSTAL")
    private int codePostale;
    public Adresse() {
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }
}
