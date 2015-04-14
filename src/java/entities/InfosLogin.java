package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Moi
 */
@Entity
@Table(name="infoslogin")
public class InfosLogin implements Serializable {
    
    @Id
    @Column(name="idInfosLogin")
    private Long idInfosLogin;
    
    @Column(name="pass")
    private String pass;
    
    @OneToOne
    @JoinColumn(name="idClient")
    private Client client;

    /**
     * @return the idInfosLogin
     */
    public Long getIdInfosLogin() {
        return idInfosLogin;
    }

    /**
     * @param idInfosLogin the idInfosLogin to set
     */
    public void setIdInfosLogin(Long idInfosLogin) {
        this.idInfosLogin = idInfosLogin;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    public InfosLogin() {
    }
    
    
}
