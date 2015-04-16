package facades;

import entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Moi
 */
@Stateless
public class TestFacade {

    @PersistenceContext
    private EntityManager em;

    public List<Client> findAll3() {
        Query q = em.createNamedQuery("Client.findAll3");
        return q.getResultList();
    }

    public List<Client> findAll2() {
        Query q = em.createQuery("SELECT yo FROM Client yo");
        return q.getResultList();
    }

    public List<String> lesFruits() {
        List<String> l = new ArrayList<>();
        l.add("Banane");
        l.add("Fruit du dragon");
        l.add("Noix de coco");

        return l;
    }

}
