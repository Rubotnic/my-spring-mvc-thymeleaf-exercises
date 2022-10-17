package se.lexicon.myspringmvcexercises.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FeverView {

    private Integer feverId;
    private String bodyTemp;
    private boolean treatment;

}
