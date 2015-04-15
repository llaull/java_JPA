package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Moi
 */
@Entity
@Table(name = "commandes")
public class Commande implements Serializable {

    @Id
    @Column(name = "idCommande")
    private Long idCommande;

    @Column(name = "refCommande")
    private String refCommande;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;
    
    @ManyToMany
    @JoinTable(name="articles_commandes",
    joinColumns = @JoinColumn(name="idCommande",
            referencedColumnName = "idCommande"),
    inverseJoinColumns = @JoinColumn(name="idArticle",
            referencedColumnName = "idArticle"))
    private Collection<Article> articles;

    /**
     * @return the idCommande
     */
    public Long getIdCommande() {
        return idCommande;
    }

    /**
     * @param idCommande the idCommande to set
     */
    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    /**
     * @return the refCommande
     */
    public String getRefCommande() {
        return refCommande;
    }

    /**
     * @param refCommande the refCommande to set
     */
    public void setRefCommande(String refCommande) {
        this.refCommande = refCommande;
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

    /**
     * @return the articles
     */
    public Collection<Article> getArticles() {
        return articles;
    }

    /**
     * @param articles the articles to set
     */
    public void setArticles(Collection<Article> articles) {
        this.articles = articles;
    }

}
