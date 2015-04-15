package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Moi
 */
@Entity
@Table(name = "articles_commandes")
@IdClass(value = CommandeArticlePK.class)
public class ArticleCommande implements Serializable {
    
    @Id
    @Column(name = "idCommande")
    private Long idCommande;

    @Id
    @Column(name = "idArticle")
    private Long idArticle;
    
    //@Column(name = "quantiteArticle")
    private Long quantiteArticle;
    
    @JoinColumn(name="idCommande", referencedColumnName = "idCommande", insertable = false, updatable = false)
    @ManyToOne
    private Commande commande;
    
    @JoinColumn(name = "idArticle", referencedColumnName = "idArticle", insertable = false, updatable = false)
    @ManyToOne
    private Article article;

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
     * @return the quantiteArticle
     */
    public Long getQuantiteArticle() {
        return quantiteArticle;
    }

    /**
     * @param quantiteArticle the quantiteArticle to set
     */
    public void setQuantiteArticle(Long quantiteArticle) {
        this.quantiteArticle = quantiteArticle;
    }

    /**
     * @return the commande
     */
    public Commande getCommande() {
        return commande;
    }

    /**
     * @param commande the commande to set
     */
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    /**
     * @return the article
     */
    public Article getArticle() {
        return article;
    }

    /**
     * @param article the article to set
     */
    public void setArticle(Article article) {
        this.article = article;
    }
    
}
