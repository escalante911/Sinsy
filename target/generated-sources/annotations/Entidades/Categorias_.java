package Entidades;

import Entidades.Servicios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-03-12T17:07:07")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile SingularAttribute<Categorias, String> descripcion;
    public static volatile ListAttribute<Categorias, Servicios> serviciosList;
    public static volatile SingularAttribute<Categorias, Integer> idCategoria;
    public static volatile SingularAttribute<Categorias, String> nombre;

}