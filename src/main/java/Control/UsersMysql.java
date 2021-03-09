/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import entities.Users;
import java.sql.SQLException;

/**
 *
 * @author joescalante
 */
public class UsersMysql {
    
    private Conexion cn;
    List<Users> us;
    

    public UsersMysql() {
        this.cn = Conexion.getConexion();
    }
    
    public List Listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object obtener(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String insertar(Users u) {
        try {
	    String consulta ="INSERT INTO users (cedula, nombres, apellidos, nacimimiento, direccion, telefono, correo, clave) VALUES ('"+
	    u.getCedula()+"','"+u.getNombres()+"','"+u.getApellidos()+"','"+u.getNacimiento()+"','"+u.getDireccion()+"','"+u.getTelefono()+"','"+
	    u.getCorreo()+"','"+u.getClave()+"')";
	    System.out.println(consulta);
            cn.insert(consulta);
            return "..";
 		    
 		  } catch (SQLException e) {
 		            System.out.println(e.getMessage());
                            return "er";
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
