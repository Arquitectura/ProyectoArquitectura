/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author familiacetina
 */
@Entity
public class Factura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Long nit;
    private Oferta oferta;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fe;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fr;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fv;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fp;
    private String titulo;
    private int term;
    private String forma_pago;
    private String observacion;    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Factura[ id=" + id + " ]";
    }
    
}
