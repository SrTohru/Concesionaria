package org.itson.concesionaria.entitys;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nombresCompletos")
public class NombresPersona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombres", nullable = false, length = 75)
    private String nombres;

    @Column(name = "apellido_Paterno", nullable = false, length = 75)
    private String apellido_Paterno;

    @Column(name = "apellido_Materno", nullable = false, length = 75)
    private String apellido_Materno;

    public NombresPersona() {
    }

    public NombresPersona(String nombres, String apellido_Paterno, String apellido_Materno) {
        this.nombres = nombres;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
    }

    public NombresPersona(Long id, String nombres, String apellido_Paterno, String apellido_Materno) {
        this.id = id;
        this.nombres = nombres;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
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
        if (!(object instanceof NombresPersona)) {
            return false;
        }
        NombresPersona other = (NombresPersona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.concesionaria.entitys.NombresPersona[ id=" + id + " ]";
    }

}
