package se.lexicon.myspringmvcexercises.model;

import javax.persistence.*;

@Entity
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer modelId;
    private String text1;

    public Contacts(Integer modelId, String text1) {
        this.modelId = modelId;
        this.text1 = text1;
    }

    public Contacts() {
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }


    @Override
    public String toString() {
        return "Contacts{" +
                "modelId=" + modelId +
                ", text1='" + text1 + '\'' +
                '}';
    }
}


