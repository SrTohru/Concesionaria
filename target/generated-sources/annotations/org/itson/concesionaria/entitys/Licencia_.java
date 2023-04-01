package org.itson.concesionaria.entitys;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Persona;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-31T18:07:51")
@StaticMetamodel(Licencia.class)
public class Licencia_ { 

    public static volatile SingularAttribute<Licencia, Calendar> fechaVigencia;
    public static volatile SingularAttribute<Licencia, Double> costo;
    public static volatile SingularAttribute<Licencia, Long> id;
    public static volatile SingularAttribute<Licencia, Persona> idPersona;

}