package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Moi
 */
@Entity
@Table(name="clients")
@NamedQueries({
    @NamedQuery(name = "Clients.findAll3", query = "SELECT c FROM Clients c"),
    @NamedQuery(name = "Clients.findByIdClient", query = "SELECT c FROM Clients c WHERE c.idClient = :idClient"),
    @NamedQuery(name = "Clients.findByNom", query = "SELECT c FROM Clients c WHERE c.nom = :nom")})
public class Client implements Serializable {
    
    @Id
    @Column(name="idClient")
    private Long idClient;
    
    @Column(name="nom")
    private String nom;
    
    @OneToOne(mappedBy = "client")
    private InfosLogin infosLogin;
    

    /**
     * @return the idClient
     */
    public Long getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the infosLogin
     */
    public InfosLogin getInfosLogin() {
        return infosLogin;
    }

    /**
     * @param infosLogin the infosLogin to set
     */
    public void setInfosLogin(InfosLogin infosLogin) {
        this.infosLogin = infosLogin;
    }
    
    
}
