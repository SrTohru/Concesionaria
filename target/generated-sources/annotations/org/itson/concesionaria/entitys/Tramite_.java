package org.itson.concesionaria.entitys;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.utilities.estadosTramite;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-01T21:26:41")
@StaticMetamodel(Tramite.class)
public class Tramite_ { 

    public static volatile SingularAttribute<Tramite, Calendar> fechaRealizacion;
    public static volatile SingularAttribute<Tramite, estadosTramite> estadoTramite;
    public static volatile SingularAttribute<Tramite, Double> costo;
    public static volatile SingularAttribute<Tramite, Calendar> fechaTramite;
    public static volatile SingularAttribute<Tramite, Long> id;
    public static volatile SingularAttribute<Tramite, Persona> idPersona;

}