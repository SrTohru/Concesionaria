package org.itson.concesionaria.entitys;

public class Reportes {
    private String serie;
    private String marca;
    private String color;
    private String modelo;

    public Reportes() {
    }

    public Reportes(String serie, String marca, String color, String modelo) {
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
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
    public String toString() {
        return "Reportes{" + "serie=" + serie + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + '}';
    }
    
}
