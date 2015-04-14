package controllers;


import entities.Client;
import entities.InfosLogin;
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
           Client c = new Client();
            
            ////////////////// insert
            /*
            c.setNom("toto552");
            em.persist(c);*/
            
            ////////////////// delete
            /*
            c = em.find(Client.class, 2L);
            em.remove(c);
            */
            //em.remove(em.merge(c)); //si détached
            
            
            ////////////////// update
            /*
            c = em.find(Client.class, 2L); //L pour long typage de 1
            c.setNom("zozo le blairo");
            em.merge(c);//merge = update (pas obligatoire le comit le fait)*/
            
            
            ////////////////// 1to1
           /* InfosLogin il = new InfosLogin();
            il = em.find(InfosLogin.class, 1l); //info login ID
            System.out.println("-> " + il.getPass()+ " <-> " + il.getClient().getNom());*/
            
            c = em.find(Client.class, 2l);
            System.out.println(c.getNom());
            System.out.println(c.getInfosLogin().getPass());
            
            
            ////////////////////////
            ////////////////////////
            //userTransaction.commit();
            
        } catch (Exception e){
            retVal = "error";
        }
        
        return retVal;
    }
    
    
    
}
