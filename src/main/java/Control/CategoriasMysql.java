/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Categorias;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author joescalante
 */
public class CategoriasMysql {
    
    private Conexion cn;
    
    public CategoriasMysql() {
        this.cn = Conexion.getConexion();
    }

    public List Listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object obtener(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertar(Categorias c) {
        try {
	    String consulta ="INSERT INTO categorias (nombre, descripcion) VALUES ('"+c.getNombre()+"','"+c.getDescripcion()+"')";
	    System.out.println(consulta);
            cn.insert(consulta);
            System.out.println("Correcto");
 		    
 		  } catch (SQLException e) {
 		            System.out.println(e.getMessage());
                            System.out.println("Correcto");
 		   //JOptionPane.showMessageDialog(null, "No se Registro la persona");
           }
    }

    public String actualizar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
