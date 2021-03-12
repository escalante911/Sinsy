package Entidades;

import Entidades.Categorias;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-03-12T17:07:07")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile SingularAttribute<Servicios, String> descripcion;
    public static volatile SingularAttribute<Servicios, Categorias> categoria;
    public static volatile SingularAttribute<Servicios, Integer> idServicio;
    public static volatile SingularAttribute<Servicios, String> nombre;

}