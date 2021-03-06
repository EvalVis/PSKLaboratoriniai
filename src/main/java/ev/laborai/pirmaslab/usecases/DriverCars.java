package ev.laborai.pirmaslab.usecases;

import ev.laborai.pirmaslab.entities.Car;
import ev.laborai.pirmaslab.entities.Driver;
import ev.laborai.pirmaslab.persistence.CarsDAO;
import ev.laborai.pirmaslab.persistence.DriversDAO;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

@Model
public class DriverCars implements Serializable {

    @Inject
    private DriversDAO driversDAO;
    @Inject
    private CarsDAO carsDAO;

    @Getter
    @Setter
    private Driver driver;

    @Getter
    @Setter
    private Car carToCreate = new Car();

    @PostConstruct
    public void init(){
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Long driverId = Long.parseLong(requestParameters.get("driverId"));
        driver = driversDAO.findOne(driverId);
    }

    @Transactional
    public void createCar() {
        carToCreate.setDriver(driver);
        carsDAO.persist(carToCreate);
    }

}
