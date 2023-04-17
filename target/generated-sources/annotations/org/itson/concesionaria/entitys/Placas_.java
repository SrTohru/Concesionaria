package org.itson.concesionaria.entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.estadosPlaca;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-16T20:35:05")
@StaticMetamodel(Placas.class)
public class Placas_ { 

    public static volatile SingularAttribute<Placas, Persona> persona;
    public static volatile SingularAttribute<Placas, Tramite> tramite;
    public static volatile SingularAttribute<Placas, String> codigoPlacas;
    public static volatile SingularAttribute<Placas, Auto> idAuto;
    public static volatile SingularAttribute<Placas, Long> id;
    public static volatile SingularAttribute<Placas, estadosPlaca> estadosPlaca;

}