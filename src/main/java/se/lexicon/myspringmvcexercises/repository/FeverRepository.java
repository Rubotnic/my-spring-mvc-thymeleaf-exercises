package se.lexicon.myspringmvcexercises.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.myspringmvcexercises.model.FeverReg;

public interface FeverRepository extends CrudRepository <FeverReg, Integer> {


}
