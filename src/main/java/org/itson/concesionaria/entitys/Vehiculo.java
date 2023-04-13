/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.concesionaria.entitys;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.itson.concesionaria.utilities.tipoVehiculo;

@Entity
@Table(name = "vehiculo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_Vehiculo", discriminatorType = DiscriminatorType.STRING)
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serie", nullable = false, length = 7, unique = true)
    private String serie;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "color", nullable = false, length = 25)
    private String color;

    @Column(name = "modelo", nullable = false, length = 50)
    private String modelo;

    @OneToOne
    @JoinColumn(name = "tramiteLicencia")
    private Tramite tramite;

    public Vehiculo() {
    }

    public Vehiculo(String serie, String marca, String color, String modelo, Tramite tramite) {
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tramite = tramite;
    }

    public Vehiculo(Long id,String serie, String marca, String color, String modelo, Tramite tramite) {
        this.id = id;
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tramite = tramite;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.concesionaria.entitys.Vehiculo[ id=" + id + " ]";
    }

}
