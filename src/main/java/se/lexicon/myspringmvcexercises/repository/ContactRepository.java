package se.lexicon.myspringmvcexercises.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.myspringmvcexercises.model.Contacts;

public interface ContactRepository extends CrudRepository <Contacts, Integer> {

}
