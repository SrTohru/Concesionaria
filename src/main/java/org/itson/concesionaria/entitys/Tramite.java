package org.itson.concesionaria.entitys;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tiposTramite;

@Entity
@Table(name = "tramite")
public class Tramite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona idPersona;

    @Column(name = "estado", nullable = false)
    private estadosTramite estadoTramite;
   
      @Column(name = "tipoTramite", nullable = false)
    private tiposTramite tipoTramite;
    
    @Column(name = "costo", nullable = true)
    private double costo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaTramite", nullable = false)
    private Calendar fechaTramite;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaRealizacionTramite", nullable = true)
    private Calendar fechaRealizacion;
    
    
    public Tramite() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public tiposTramite getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(tiposTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public estadosTramite getEstadoTramite() {
        return estadoTramite;
    }

    public void setEstadoTramite(estadosTramite estadoTramite) {
        this.estadoTramite = estadoTramite;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Calendar getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Calendar fechaTramite) {
        this.fechaTramite = fechaTramite;
    }

    public Calendar getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Calendar fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
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
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.concesionaria.entitys.Tramite[ id=" + id + " ]";
    }

}
