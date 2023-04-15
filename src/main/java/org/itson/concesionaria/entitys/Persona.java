package org.itson.concesionaria.entitys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;

    @Column(name = "apellidoPaterno", nullable = false, length = 50)
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno", nullable = false, length = 50)
    private String apellidoMaterno;

    @Column(name = "telefono", nullable = false, length = 14)
    private String telefono;

    @Column(name = "rfc", nullable = false, length = 13, unique = true)
    private String rfc;

    
    
    @OneToMany(mappedBy = "persona")
    private List<Placas> placas = new ArrayList<>();

    @OneToMany(mappedBy = "idPersona")
    private List<Tramite> tramite = new ArrayList<>();

    @OneToMany(mappedBy = "persona")
    private List<Licencia> Licencias = new ArrayList<>();

    
    @OneToOne
    @JoinColumn(name = "idLicencia", nullable = true)
    private Licencia licencia;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaNacimiento", nullable = false)
    private Calendar fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String rfc, Calendar fechaNacimiento) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.rfc = rfc;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String rfc, List<Placas> placas, List<Tramite> tramite, Calendar fechaNacimiento) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.rfc = rfc;
        this.placas = placas;
        this.tramite = tramite;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Persona(String telefono, String rfc, String nombres, String apellidoPaterno, String apellidoMaterno, List<Placas> placas, Licencia licencia, Calendar fechaNacimiento) {
        this.telefono = telefono;
        this.rfc = rfc;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.placas = placas;
        this.licencia = licencia;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(Long id, String telefono, String rfc, String nombres, String apellidoPaterno, String apellidoMaterno, List<Placas> placas, Licencia licencia, Calendar fechaNacimiento) {
        this.id = id;
        this.telefono = telefono;
        this.rfc = rfc;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.placas = placas;
        this.licencia = licencia;
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Licencia> getLicencias() {
        return Licencias;
    }

    public void setLicencias(List<Licencia> Licencias) {
        this.Licencias = Licencias;
    }
    
    public void addLicencias(Licencia licencia){
        this.Licencias.add(licencia);
    }

    

    
    public List<Tramite> getTramite() {
        return tramite;
    }

    public void setTramite(List<Tramite> tramite) {
        this.tramite = tramite;
    }

    public void addTramite(Tramite tramite){
        this.tramite.add(tramite);
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public List<Placas> getPlacas() {
        return placas;
    }

    public void setPlacas(List<Placas> placas) {
        this.placas = placas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
