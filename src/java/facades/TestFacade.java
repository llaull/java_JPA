package facades;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Moi
 */
@Stateless
public class TestFacade {
    
    
    public List<String> findAll(){
        List<String> l = new ArrayList<>();
        l.add("Banane");
        l.add("Fruit du dragon");
        l.add("Noix de coco");
        
        return l;
        
    }
    
}
