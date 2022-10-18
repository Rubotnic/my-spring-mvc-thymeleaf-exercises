package se.lexicon.myspringmvcexercises.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import se.lexicon.myspringmvcexercises.model.FeverReg;

public interface FeverRepository extends JpaRepository<FeverReg, Integer> {


}
