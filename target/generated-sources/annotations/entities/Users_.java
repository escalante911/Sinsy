package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-03-08T18:39:52")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> apellidos;
    public static volatile SingularAttribute<Users, String> clave;
    public static volatile SingularAttribute<Users, String> cedula;
    public static volatile SingularAttribute<Users, String> correo;
    public static volatile SingularAttribute<Users, String> direccion;
    public static volatile SingularAttribute<Users, String> telefono;
    public static volatile SingularAttribute<Users, String> nombres;
    public static volatile SingularAttribute<Users, Date> nacimiento;

}