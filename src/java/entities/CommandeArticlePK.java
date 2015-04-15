/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author naxos
 */
public class CommandeArticlePK implements Serializable {
    
 public Long idCommande;
  public Long idArticle;

  public CommandeArticlePK()
  {

  }

  public CommandeArticlePK(Long idCommande, Long idArticle)
  {
    this.idCommande = idCommande;
    this.idArticle = idArticle;
  }

  @Override
  public boolean equals(Object obj)
  {
    boolean returnVal = false;

    if (obj == null)
    {
      returnVal = false;
    }
    else if (!obj.getClass().equals(this.getClass()))
    {
      returnVal = false;
    }
    else
    {
      CommandeArticlePK other = (CommandeArticlePK) obj;

      if (this == other)
      {
        returnVal = true;
      }
      else if (idCommande != null && other.idCommande != null
          && this.idCommande.equals(other.idCommande))
      {
        if (idArticle != null && other.idArticle != null
            && idArticle.equals(other.idArticle))
        {
          returnVal = true;
        }
      }
      else
      {
        returnVal = false;
      }
    }

    return returnVal;
  }

  @Override
  public int hashCode()
  {
    if (idCommande == null || idArticle == null)
    {
      return 0;
    }
    else
    {
      return idCommande.hashCode() ^ idArticle.hashCode();
    }
  }

    
}
