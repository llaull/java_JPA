package controllers;


import entities.Client;
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
        String retVal = "confirmation";
        
        try{
            
            userTransaction.begin();
            ////////////////////////
            ////////////////////////
            
            
            //insert
            Client c = new Client();
            c.setNom("toto555");
            em.persist(c);
            
            ////////////////////////
            ////////////////////////
            userTransaction.commit();
            
        } catch (NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException e){
            retVal = "error";
        }
        
        return retVal;
    }
    
    
    
}
