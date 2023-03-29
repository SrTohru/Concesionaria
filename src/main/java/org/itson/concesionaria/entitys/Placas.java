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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    @Column(name = "codigoPlacas", nullable = false)
    private String codigoPlacas;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaTramite", nullable = false)
    private Calendar fechaTramite;

    @Column(name = "costo", nullable = false)
    private double Costo;
    
    @ManyToOne
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona persona;
    
    
    @JoinColumn(name = "idAuto", nullable = false)
    private Auto idAuto;

    public Placas() {
    }

    public Placas(estadosPlaca estadosPlaca, String codigoPlacas, Calendar fechaTramite, double Costo, Persona persona, Auto auto) {
        this.estadosPlaca = estadosPlaca;
        this.codigoPlacas = codigoPlacas;
        this.fechaTramite = fechaTramite;
        this.persona = persona;
        this.idAuto = auto;
        this.Costo = Costo;
    }

    public Placas(Long id, estadosPlaca estadosPlaca, String codigoPlacas, Calendar fechaTramite, double Costo, Persona persona, Auto auto) {
        this.id = id;
        this.estadosPlaca = estadosPlaca;
        this.codigoPlacas = codigoPlacas;
        this.fechaTramite = fechaTramite;
        this.persona = persona;
        this.idAuto = auto;
        this.Costo = Costo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Calendar getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Calendar fechaTramite) {
        this.fechaTramite = fechaTramite;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
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
