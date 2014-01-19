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
public class Oferta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Actor actor;
    private Solicitud solicitud;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private String titulo;
    private String observ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fdentr;
    private String validez;
    private String forma_pago;
    private boolean acept;
    private boolean entreg;

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
        if (!(object instanceof Oferta)) {
            return false;
        }
        Oferta other = (Oferta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Oferta[ id=" + id + " ]";
    }
    
}
