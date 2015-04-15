package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Moi
 */
@Entity
@Table(name = "articles")
public class Article implements Serializable {

    @Id
    @Column(name = "idArticle")
    private Long idArticle;

    @Column(name = "label")
    private String label;

    @Column(name = "prix")
    private Double prix;
    
    @ManyToMany(mappedBy = "articles")
    private Collection<Commande> commandes;
    
    
    /**
     * @return the idArticle
     */
    public Long getIdArticle() {
        return idArticle;
    }

    /**
     * @param idArticle the idArticle to set
     */
    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the prix
     */
    public Double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(Double prix) {
        this.prix = prix;
    }

    /**
     * @return the commandes
     */
    public Collection<Commande> getCommandes() {
        return commandes;
    }

    /**
     * @param commandes the commandes to set
     */
    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

}
