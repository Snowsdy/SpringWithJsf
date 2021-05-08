package fr.audit.app.physique.repository;

import fr.audit.app.metier.entity.Personne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("personneRepository")
public interface PersonneRepository extends CrudRepository<Personne, Long> {
    default String test(){ return "Test Personne";}
}