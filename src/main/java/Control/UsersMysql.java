/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import Entidades.Users;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        String sql="select * from users";
		us = new ArrayList<Users>();
		
		try{
			ResultSet res=cn.query(sql);
			while(res.next()){
                            Users u = new Users();
                                u.setCedula(res.getString(1));
				u.setNombres(res.getString(2));
                                u.setApellidos(res.getString(3));
                                u.setDireccion(res.getString(4));
                                u.setTelefono(res.getString(5));
                                u.setCorreo(res.getString(6));
                                u.setClave(res.getString(7));
                                
				us.add(u);
                                System.out.println("Correcto");
			}
			res.close();
                        return us;

		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
                        System.out.println("Error");
			e.printStackTrace();       
		}
                return null;	
    }

    public Object obtener(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertar(Users u) {
        try {
	    String consulta ="INSERT INTO users (cedula, nombres, apellidos, direccion, telefono, correo, clave) VALUES ('"+
	    u.getCedula()+"','"+u.getNombres()+"','"+u.getApellidos()+"','"+u.getDireccion()+"','"+u.getTelefono()+"','"+
	    u.getCorreo()+"','"+u.getClave()+"')";
	    System.out.println(consulta);
            cn.insert(consulta);
            System.out.println("Correcto");
 		    
 		  } catch (SQLException e) {
 		            System.out.println(e.getMessage());
                            System.out.println("Error");
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
