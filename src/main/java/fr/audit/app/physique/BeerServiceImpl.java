package fr.audit.app.physique;

import fr.audit.app.client.service.BeerService;
import fr.audit.app.metier.entity.Beer;
import fr.audit.app.physique.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("beerService")
public class BeerServiceImpl extends BeerService {

    @Autowired
    BeerRepository beerRepository;

    public List<Beer> searchByPrice(float min, float max) {
        return beerRepository.searchByPrice(min, max);
    }

    public String test() {
        return beerRepository.testOk();
    }

    public Iterable<Beer> getAll() {
        return beerRepository.findAll();
    }
}
