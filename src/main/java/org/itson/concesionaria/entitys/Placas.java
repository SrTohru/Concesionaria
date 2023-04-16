package org.itson.concesionaria.entitys;

import java.io.Serializable;
import java.util.Calendar;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.itson.concesionaria.utilities.estadosPlaca;

@Entity
@Table(name = "placas")
public class Placas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "estadoPlaca", nullable = false)
    private estadosPlaca estadosPlaca;

    @Column(name = "codigoPlacas", nullable = false, unique = true)
    private String codigoPlacas;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idTramite")
    private Tramite tramite;
    
    
    @ManyToOne
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona persona;

    @ManyToOne()
    @JoinColumn(name = "idAuto")
    private Auto idAuto;

    public Placas() {
    }

    public Placas(estadosPlaca estadosPlaca, String codigoPlacas, Tramite tramite, Persona persona, Auto auto) {
        this.estadosPlaca = estadosPlaca;
        this.codigoPlacas = codigoPlacas;
        this.tramite = tramite;
        this.persona = persona;
        this.idAuto = auto;
    }

    public Placas(Long id, estadosPlaca estadosPlaca, String codigoPlacas, Tramite tramite, Calendar fechaTramite, Persona persona, Auto auto) {
        this.id = id;
        this.estadosPlaca = estadosPlaca;
        this.codigoPlacas = codigoPlacas;
        this.tramite = tramite;
        this.persona = persona;
        this.idAuto = auto;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Auto getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(Auto idAuto) {
        this.idAuto = idAuto;
    }

    public estadosPlaca getEstadosPlaca() {
        return estadosPlaca;
    }

    public void setEstadosPlaca(estadosPlaca estadosPlaca) {
        this.estadosPlaca = estadosPlaca;
    }

    public String getCodigoPlacas() {
        return codigoPlacas;
    }

    public void setCodigoPlacas(String codigoPlacas) {
        this.codigoPlacas = codigoPlacas;
    }

    public Tramite getFechaTramite() {
        return tramite;
    }

    public void setFechaTramite(Tramite tramite) {
        this.tramite = tramite;
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
