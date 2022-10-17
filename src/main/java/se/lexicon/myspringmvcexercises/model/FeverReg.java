package se.lexicon.myspringmvcexercises.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "feverregi")
public class FeverReg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feverId;
    @Column
    private String bodyTemp; //Normal, fever, hyperthermia
    @Column
    private boolean treatment;

    public FeverReg(Integer feverId, String bodyTemp, boolean treatment) {
        this.feverId = feverId;
        this.bodyTemp = bodyTemp;
        this.treatment = treatment;
    }

    public FeverReg() {
    }

    public FeverReg(String s) {
    }

    public Integer getFeverId() {
        return feverId;
    }

    public void setFeverId(Integer feverId) {
        this.feverId = feverId;
    }

    public String getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(String bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public boolean isTreatment() {
        return treatment;
    }

    public void setTreatment(boolean treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "FeverReg{" +
                "feverId=" + feverId +
                ", bodyTemp='" + bodyTemp + '\'' +
                ", treatment=" + treatment +
                '}';
    }
}

