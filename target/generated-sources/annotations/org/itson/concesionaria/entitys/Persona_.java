package org.itson.concesionaria.entitys;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Placas;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-31T18:07:51")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidoPaterno;
    public static volatile SingularAttribute<Persona, Licencia> licencia;
    public static volatile SingularAttribute<Persona, Calendar> fechaNacimiento;
    public static volatile SingularAttribute<Persona, Long> id;
    public static volatile SingularAttribute<Persona, String> telefono;
    public static volatile SingularAttribute<Persona, String> rfc;
    public static volatile ListAttribute<Persona, Placas> placas;
    public static volatile SingularAttribute<Persona, String> nombres;
    public static volatile SingularAttribute<Persona, String> apellidoMaterno;

}