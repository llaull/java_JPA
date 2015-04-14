package controllers;


import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author Moi
 */
@Named
@RequestScoped
public class DemoJpa {
    
    @PersistenceContext
    private EntityManager em;
    
    
    @Resource
    private UserTransaction userTransaction;
    
    public String testDatabase(){
        String retVal = "Confirmation";
        
        try{
            
            userTransaction.begin();
            
            userTransaction.commit();
            
        } catch (NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException e){
            retVal = "error";
        }
        
        return retVal;
    }
    
    
    
}
