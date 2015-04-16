package controllers;

import facades.TestFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author MOi
 */
@Named
@RequestScoped
public class TestController implements Serializable {

    @EJB
    private TestFacade ejTestFacade;

    public String prepareListFruit() {
        List<String> l = new ArrayList<>();
        l = getEjTestFacade().findAll();
        System.out.println("-> " + l.size());
        return "index2";
    }

    /**
     * @return the ejTestFacade
     */
    public TestFacade getEjTestFacade() {
        return ejTestFacade;
    }

}
