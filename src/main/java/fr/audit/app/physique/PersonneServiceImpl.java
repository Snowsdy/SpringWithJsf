package fr.audit.app.physique;

import fr.audit.app.metier.entity.Personne;
import fr.audit.app.physique.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service("persServiceImpl")
public class PersonneServiceImpl {

    @Autowired
    PersonneRepository personneRepository;

    public Iterable<Personne> getAll(){ return personneRepository.findAll();}

    public Optional<Personne> getById(long id){ return personneRepository.findById(id);}

    public Optional<Personne> getByLogin(String login){ return personneRepository.getByLogin(login);}

    public String test(){ return personneRepository.test();}
}
