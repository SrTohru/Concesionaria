package org.itson.concesionaria.entitys;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "auto")
public class Auto implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serie", nullable = false, length = 7)
    private String serie;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "color", nullable = false, length = 25)
    private String color;
    
    @OneToOne
    @JoinColumn(name = "idLicencia", nullable = false)
    private Licencia idLicencia;

    @Column(name = "modelo", nullable = false, length = 50)
    private String modelo;
    @OneToMany
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona idPersona;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "idPlacas", nullable = false)
    private Placas idPlacas;

    public Auto() {
    }

    public Auto(String serie, String marca, String color, Licencia idLicencia, String modelo, Placas idPlacas, Persona idPersona) {
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.idLicencia = idLicencia;
        this.modelo = modelo;
        this.idPersona = idPersona;
        this.idPlacas = idPlacas;
    }

    public Auto(Long id, String serie, String marca, String color, Licencia idLicencia, String modelo, Placas idPlacas, Persona idPersona) {
        this.id = id;
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.idLicencia = idLicencia;
        this.modelo = modelo;
        this.idPersona = idPersona;
        this.idPlacas = idPlacas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Licencia getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Licencia idLicencia) {
        this.idLicencia = idLicencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Placas getIdPlacas() {
        return idPlacas;
    }

    public void setIdPlacas(Placas idPlacas) {
        this.idPlacas = idPlacas;
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

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", serie=" + serie + ", marca=" + marca + ", color=" + color + ", idLicencia=" + idLicencia + ", modelo=" + modelo + ", idPlacas=" + idPlacas + '}';
    }

}
