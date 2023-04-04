/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.concesionaria.entitys;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import org.itson.concesionaria.utilities.tipoDePago;

@Entity
@Table(name = "pago")
public class Pago implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "idTramite", nullable = false)
    private Tramite tramite;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoDePago", nullable = true)
    private tipoDePago tipoDePago;

    @JoinColumn(name = "idPlacas", nullable = true)
    private Placas idPlacas;

    @JoinColumn(name = "idLicencia", nullable = true)
    private Licencia idLicencia;

    public Pago() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public tipoDePago getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(tipoDePago tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public Placas getIdPlacas() {
        return idPlacas;
    }

    public void setIdPlacas(Placas idPlacas) {
        this.idPlacas = idPlacas;
    }

    public Licencia getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Licencia idLicencia) {
        this.idLicencia = idLicencia;
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
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.concesionaria.entitys.Pago[ id=" + id + " ]";
    }

}
