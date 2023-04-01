package org.itson.concesionaria.entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-31T18:07:51")
@StaticMetamodel(Auto.class)
public class Auto_ { 

    public static volatile SingularAttribute<Auto, Licencia> idLicencia;
    public static volatile SingularAttribute<Auto, Placas> idPlacas;
    public static volatile SingularAttribute<Auto, Long> id;
    public static volatile SingularAttribute<Auto, Persona> idPersona;

}