package org.itson.concesionaria.entitys;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Pago;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tiposTramite;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-16T20:35:05")
@StaticMetamodel(Tramite.class)
public class Tramite_ { 

    public static volatile SingularAttribute<Tramite, Calendar> fechaCambioPlacas;
    public static volatile SingularAttribute<Tramite, estadosTramite> estadoTramite;
    public static volatile SingularAttribute<Tramite, Integer> costo;
    public static volatile SingularAttribute<Tramite, Calendar> fechaTramite;
    public static volatile SingularAttribute<Tramite, Pago> idPago;
    public static volatile SingularAttribute<Tramite, Long> id;
    public static volatile SingularAttribute<Tramite, tiposTramite> tipoTramite;
    public static volatile SingularAttribute<Tramite, Persona> idPersona;

}