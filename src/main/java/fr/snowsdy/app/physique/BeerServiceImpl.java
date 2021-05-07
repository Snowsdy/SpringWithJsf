package fr.snowsdy.app.physique;

import fr.snowsdy.app.metier.entity.Beer;
import fr.snowsdy.app.physique.repository.BeerRepository;
import fr.snowsdy.app.client.service.BeerService;
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
