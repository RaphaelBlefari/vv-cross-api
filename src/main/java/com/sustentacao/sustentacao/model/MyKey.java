package com.sustentacao.sustentacao.model;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MyKey implements Serializable {

    @Column(name = "Cp_Nome", nullable = false)
    private String cpNome;

    @Column(name = "Cr_Nome")
    private String crNome;

    public String getCpNome() {
        return cpNome;
    }

    public void setCpNome(String cpNome) {
        this.cpNome = cpNome;
    }

    public String getCrNome() {
        return crNome;
    }

    public void setCrNome(String crNome) {
        this.crNome = crNome;
    }
    /** getters and setters **/
}