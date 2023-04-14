package org.itson.concesionaria.entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.tipoDePago;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-14T15:17:38")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, tipoDePago> tipoDePago;
    public static volatile SingularAttribute<Pago, Licencia> idLicencia;
    public static volatile SingularAttribute<Pago, Tramite> tramite;
    public static volatile SingularAttribute<Pago, Placas> idPlacas;
    public static volatile SingularAttribute<Pago, Long> id;

}