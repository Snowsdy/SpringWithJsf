package fr.audit.app.physique.repository;

import fr.audit.app.metier.entity.Personne;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository("personneRepository")
public interface PersonneRepository extends CrudRepository<Personne, Long> {
    default String test(){ return "Test Personne";}

    @Query("from Personne where login = :log")
    Optional<Personne> getByLogin(@Param("log") String log);
}
