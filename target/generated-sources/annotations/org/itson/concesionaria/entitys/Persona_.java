package org.itson.concesionaria.entitys;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-16T22:59:08")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidoPaterno;
    public static volatile SingularAttribute<Persona, Licencia> licencia;
    public static volatile ListAttribute<Persona, Tramite> tramite;
    public static volatile SingularAttribute<Persona, Calendar> fechaNacimiento;
    public static volatile SingularAttribute<Persona, Long> id;
    public static volatile SingularAttribute<Persona, String> telefono;
    public static volatile ListAttribute<Persona, Licencia> Licencias;
    public static volatile SingularAttribute<Persona, String> rfc;
    public static volatile ListAttribute<Persona, Placas> placas;
    public static volatile SingularAttribute<Persona, String> nombres;
    public static volatile SingularAttribute<Persona, String> apellidoMaterno;

}