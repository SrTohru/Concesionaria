package org.itson.concesionaria.entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-16T20:35:05")
@StaticMetamodel(Auto.class)
public class Auto_ extends Vehiculo_ {

    public static volatile SingularAttribute<Auto, Licencia> idLicencia;
    public static volatile ListAttribute<Auto, Placas> Placas;
    public static volatile SingularAttribute<Auto, Placas> idPlacas;
    public static volatile SingularAttribute<Auto, Persona> idPersona;

}