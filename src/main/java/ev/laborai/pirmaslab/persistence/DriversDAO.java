package ev.laborai.pirmaslab.persistence;

import ev.laborai.pirmaslab.entities.Driver;
import ev.laborai.pirmaslab.entities.Rider;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import java.util.List;

@ApplicationScoped
public class DriversDAO {

    @Inject
    private EntityManager em;

    public List<Driver> loadAll() {
        return em.createNamedQuery("Driver.findAll", Driver.class).getResultList();
    }

    public void persist(Driver driver){
        this.em.persist(driver);
    }

    public Driver update(Driver driver){
        return em.merge(driver);
    }

    public Driver findOne(Long id) {
        return em.find(Driver.class, id);
    }

    public void flush() {
        em.flush();
    }

}
