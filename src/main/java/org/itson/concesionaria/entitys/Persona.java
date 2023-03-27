package org.itson.concesionaria.entitys;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombres", nullable = false, length = 75)
    private String nombres;

    @Column(name = "apellido_Paterno", nullable = false, length = 75)
    private String apellido_Paterno;

    @Column(name = "apellido_Materno", nullable = false, length = 75)
    private String apellido_Materno;

    @Column(name = "telefono", nullable = false, length = 14)
    private String telefono;

    @Column(name = "rfc", nullable = false, length = 13)
    private String rfc;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaNacimiento", nullable = false)
    private Calendar fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombres, String apellido_Paterno, String apellido_Materno, String telefono, String rfc, Calendar fechaNacimiento) {
        this.nombres = nombres;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.telefono = telefono;
        this.rfc = rfc;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(Long id, String nombres, String apellido_Paterno, String apellido_Materno, String telefono, String rfc, Calendar fechaNacimiento) {
        this.id = id;
        this.nombres = nombres;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.telefono = telefono;
        this.rfc = rfc;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.concesionaria.entitys.Persona[ id=" + id + " ]";
    }

}
