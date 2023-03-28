package org.itson.concesionaria.entitys;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "telefono", nullable = false, length = 14)
    private String telefono;

    @Column(name = "rfc", nullable = false, length = 13, unique = true)
    private String rfc;
    @OneToOne
    @JoinColumn(name = "idLicencia", nullable = false)
    private Licencia licencia;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaNacimiento", nullable = false)
    private Calendar fechaNacimiento;

    @JoinColumn(name = "idNombre", nullable = false)
    private NombresPersona idNombre;

    public Persona() {
    }

    public Persona(String telefono, String rfc, Calendar fechaNacimiento, Licencia licencia, NombresPersona nombresPersona) {
        this.telefono = telefono;
        this.rfc = rfc;
        this.licencia = licencia;
        this.idNombre = nombresPersona;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(Long id, String telefono, String rfc, Calendar fechaNacimiento, Licencia licencia, NombresPersona nombresPersona) {
        this.id = id;
        this.telefono = telefono;
        this.rfc = rfc;
        this.licencia = licencia;
        this.idNombre = nombresPersona;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NombresPersona getIdNombre() {
        return idNombre;
    }

    public void setIdNombre(NombresPersona idNombre) {
        this.idNombre = idNombre;
    }

    
    
    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
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
