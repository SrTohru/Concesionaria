/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.concesionaria.entitys;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
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
import org.itson.concesionaria.utilities.discapacidadPersona;
import org.itson.concesionaria.utilities.estadosLicencia;

@Entity
@Table(name = "licencia")
public class Licencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaVigencia", nullable = false)
    private Calendar fechaVigencia;

    @OneToOne
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona idPersona;

    @Enumerated(EnumType.STRING)
    @Column(name = "discapacidad", nullable = false)
    private discapacidadPersona discapacidad;

    @Enumerated(EnumType.STRING)
    @Column(name = "estadoLicencia", nullable = false)
    private estadosLicencia estadosLicencia;

    @OneToOne
    @JoinColumn(name = "idTramite")
    private Tramite tramite;

    @ManyToOne
    @JoinColumn(name = "persona", nullable = false)
    private Persona persona;

    public Licencia() {
    }

    public Licencia(Calendar fechaVigencia, Persona idPersona, discapacidadPersona discapacidad, estadosLicencia estadosLicencia, Tramite tramite) {
        this.fechaVigencia = fechaVigencia;
        this.idPersona = idPersona;
        this.discapacidad = discapacidad;
        this.estadosLicencia = estadosLicencia;
        this.tramite = tramite;
    }

    public Licencia(Long id, Calendar fechaVigencia, Persona idPersona, discapacidadPersona discapacidad, estadosLicencia estadosLicencia, Tramite tramite) {
        this.id = id;
        this.fechaVigencia = fechaVigencia;
        this.idPersona = idPersona;
        this.discapacidad = discapacidad;
        this.estadosLicencia = estadosLicencia;
        this.tramite = tramite;
    }

    public estadosLicencia getEstadosLicencia() {
        return estadosLicencia;
    }

    public void setEstadosLicencia(estadosLicencia estadosLicencia) {
        this.estadosLicencia = estadosLicencia;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    
    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public discapacidadPersona getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(discapacidadPersona discapacidad) {
        this.discapacidad = discapacidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Calendar getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Calendar fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
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
        if (!(object instanceof Licencia)) {
            return false;
        }
        Licencia other = (Licencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.concesionaria.entitys.Licencia[ id=" + id + " ]";
    }

}
