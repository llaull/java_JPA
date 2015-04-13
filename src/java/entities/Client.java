package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Moi
 */
@Entity
@Table(name="clients")
public class Client implements Serializable {
    
    @Id
    @Column(name="idClient")
    private Long idClient;
    
    @Column(name="nom")
    private String nom;
    
    
}
