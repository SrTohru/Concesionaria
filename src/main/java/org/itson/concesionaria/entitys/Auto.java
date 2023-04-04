package org.itson.concesionaria.entitys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.itson.concesionaria.utilities.tipoVehiculo;

@Entity
@Table(name = "auto")
@DiscriminatorValue("tipoAuto")
public class Auto implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "idLicencia", nullable = false)
    private Licencia idLicencia;

    @ManyToOne()
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona idPersona;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "idPlacas", nullable = false)
    private Placas idPlacas;

    @OneToMany(mappedBy = "idAuto")
    private List<Placas> Placas;
    

    public Auto() {
    }

    public Auto(Licencia idLicencia, Persona idPersona, Placas idPlacas) {
        this.idLicencia = idLicencia;
        this.idPersona = idPersona;
        this.idPlacas = idPlacas;
    }

    public Auto(Long id, Licencia idLicencia, Persona idPersona, Placas idPlacas) {
        this.id = id;
        this.idLicencia = idLicencia;
        this.idPersona = idPersona;
        this.idPlacas = idPlacas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addPlacas(Placas placas) {
        Placas.add(placas);
    }

    public List<Placas> getPlacas() {
        return Placas;
    }

    public void setPlacas(List<Placas> Placas) {
        this.Placas = Placas;
    }

    public Licencia getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Licencia idLicencia) {
        this.idLicencia = idLicencia;
    }

    public Placas getIdPlacas() {
        return idPlacas;
    }

    public void setIdPlacas(Placas idPlacas) {
        this.idPlacas = idPlacas;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
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
        if (!(object instanceof Auto)) {
            return false;
        }
        Auto other = (Auto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
