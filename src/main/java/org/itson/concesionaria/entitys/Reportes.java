package org.itson.concesionaria.entitys;

public class Reportes {
    private String tipoTramite;
    private String nombreCompleto;
    private String costo;
    private String fechaExpedicion;

    public Reportes() {
    }

    public Reportes(String tipoTramite, String nombreCompleto, String costo, String fechaExpedicion) {
        this.tipoTramite = tipoTramite;
        this.nombreCompleto = nombreCompleto;
        this.costo = costo;
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    @Override
    public String toString() {
        return "Reportes{" + "serie=" + tipoTramite + ", marca=" + nombreCompleto + ", color=" + costo + ", modelo=" + fechaExpedicion + '}';
    }
    
}
