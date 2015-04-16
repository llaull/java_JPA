package controllers;

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
     * @return the ejTestFacade
     */
    public TestFacade getEjTestFacade() {
        return ejTestFacade;
    }

}
