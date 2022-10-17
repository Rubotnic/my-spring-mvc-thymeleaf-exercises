package se.lexicon.myspringmvcexercises.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FeverForm {

    private Integer feverId;
    private String bodyTemp;
    private boolean treatment;
}
