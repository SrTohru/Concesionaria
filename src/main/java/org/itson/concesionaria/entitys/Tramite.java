package org.itson.concesionaria.entitys;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private estadosTramite estadoTramite;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoTramite", nullable = false)
    private tiposTramite tipoTramite;

    @Column(name = "costo", nullable = true)
    private int costo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaTramite", nullable = false)
    private Calendar fechaTramite;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaCambioPlacas", nullable = true)
    private Calendar fechaCambioPlacas;

    @OneToOne()
    @JoinColumn(name = "idPago", nullable = true)
    private Pago idPago;

    public Tramite() {
    }

    public Tramite(Persona idPersona, estadosTramite estadoTramite, tiposTramite tipoTramite, Calendar fechaTramite) {
        this.idPersona = idPersona;
        this.estadoTramite = estadoTramite;
        this.tipoTramite = tipoTramite;
        this.fechaTramite = fechaTramite;
    }
    
    public Tramite(Persona idPersona, estadosTramite estadoTramite, tiposTramite tipoTramite, Calendar fechaTramite, Pago idPago) {
        this.idPersona = idPersona;
        this.estadoTramite = estadoTramite;
        this.tipoTramite = tipoTramite;
        this.fechaTramite = fechaTramite;
        this.idPago = idPago;
    }
    
    public Tramite(Persona idPersona, estadosTramite estadoTramite, tiposTramite tipoTramite, int costo, Calendar fechaTramite, Calendar fechaRealizacion, Pago idPago) {
        this.idPersona = idPersona;
        this.estadoTramite = estadoTramite;
        this.tipoTramite = tipoTramite;
        this.costo = costo;
        this.fechaTramite = fechaTramite;
        this.fechaCambioPlacas = fechaRealizacion;
        this.idPago = idPago;
    }

    public Tramite(Long id, Persona idPersona, estadosTramite estadoTramite, tiposTramite tipoTramite, int costo, Calendar fechaTramite, Calendar fechaRealizacion, Pago idPago) {
        this.id = id;
        this.idPersona = idPersona;
        this.estadoTramite = estadoTramite;
        this.tipoTramite = tipoTramite;
        this.costo = costo;
        this.fechaTramite = fechaTramite;
        this.fechaCambioPlacas = fechaRealizacion;
        this.idPago = idPago;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pago getIdPago() {
        return idPago;
    }

    public void setIdPago(Pago idPago) {
        this.idPago = idPago;
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Calendar getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Calendar fechaTramite) {
        this.fechaTramite = fechaTramite;
    }

    public Calendar getFechaCambioPlacas() {
        return fechaCambioPlacas;
    }

    public void setFechaCambioPlacas(Calendar fechaCambioPlacas) {
        this.fechaCambioPlacas = fechaCambioPlacas;
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
