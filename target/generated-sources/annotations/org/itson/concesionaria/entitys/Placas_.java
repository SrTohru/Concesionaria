package org.itson.concesionaria.entitys;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.utilities.estadosPlaca;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-01T21:26:41")
@StaticMetamodel(Placas.class)
public class Placas_ { 

    public static volatile SingularAttribute<Placas, Persona> persona;
    public static volatile SingularAttribute<Placas, Calendar> fechaTramite;
    public static volatile SingularAttribute<Placas, Double> Costo;
    public static volatile SingularAttribute<Placas, String> codigoPlacas;
    public static volatile SingularAttribute<Placas, Auto> idAuto;
    public static volatile SingularAttribute<Placas, Long> id;
    public static volatile SingularAttribute<Placas, estadosPlaca> estadosPlaca;

}