package fr.audit.app.primefaces.bean;

import fr.audit.app.client.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 * @author Snowsdy
 */
@Named(value = "beerBean")
@ViewScoped
public class BeerBean implements Serializable {

    @Autowired
    private BeerService beerService;

    public BeerService getBeerService() {
        return beerService;
    }

    public void setBeerService(BeerService beerService) {
        this.beerService = beerService;
    }

    public String helloSpring(){
        return beerService.sayHello();
    }
}
