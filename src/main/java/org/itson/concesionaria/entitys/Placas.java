package org.itson.concesionaria.entitys;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.itson.concesionaria.utilities.EstadosPlaca;

@Entity
@Table(name = "placas")
public class Placas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "estadoPlaca", nullable = false)
    private EstadosPlaca estadosPlaca;
    
    @Column(name = "codigoPlacas", nullable = false)
    private String codigoPlacas;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaTramite", nullable = false)
    private Calendar fechaTramite;
    
    @Column(name = "costo", nullable = false)
    private double Costo;
    
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
        if (!(object instanceof Placas)) {
            return false;
        }
        Placas other = (Placas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.concesionaria.entitys.Placas[ id=" + id + " ]";
    }

}
