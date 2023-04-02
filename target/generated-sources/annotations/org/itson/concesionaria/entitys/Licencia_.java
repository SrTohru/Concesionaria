package org.itson.concesionaria.entitys;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-01T21:26:41")
@StaticMetamodel(Licencia.class)
public class Licencia_ { 

    public static volatile SingularAttribute<Licencia, Calendar> fechaVigencia;
    public static volatile SingularAttribute<Licencia, Double> costo;
    public static volatile SingularAttribute<Licencia, Tramite> tramite;
    public static volatile SingularAttribute<Licencia, String> discapacidad;
    public static volatile SingularAttribute<Licencia, Long> id;
    public static volatile SingularAttribute<Licencia, Persona> idPersona;

}