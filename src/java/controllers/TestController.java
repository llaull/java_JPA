package controllers;

import entities.Client;
import facades.TestFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

/**
 * pas de transactionnelle c le conteneur qui le gere
 *
 * @author MOi
 */
@Named
@RequestScoped
public class TestController implements Serializable {

    private DataModel items2 = null;
    private Client current;

    @EJB
    private TestFacade ejTestFacade;

    public String prepareListFruit() {
        List<String> l = new ArrayList<>();
        l = getEjTestFacade().lesFruits();
        System.out.println("-> " + l.size());
        return "index2";
    }

    private DataModel createPageDataModel2() {
        return new ListDataModel(getEjTestFacade().findAll2());
    }

    public DataModel getItems2() {
        if (items2 == null) {
            items2 = createPageDataModel2();
        }
        return items2;
    }

    /**
     *
     * @return
     */
    public String prepareView() {

        setCurrent((Client) getItems2().getRowData());
        System.out.println("current" + getCurrent().getNom());

        return "view";
    }
    

    public Client getSelect() {
        if (current == null) {
            current = new Client();

        }
        return current;
    }

    /**
     * @return the ejTestFacade
     */
    public TestFacade getEjTestFacade() {
        return ejTestFacade;
    }

    /**
     * @return the current
     */
    public Client getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(Client current) {
        this.current = current;
    }

}
