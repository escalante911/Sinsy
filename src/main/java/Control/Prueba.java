/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Categorias;
import Entidades.Users;

/**
 *
 * @author joescalante
 */
public class Prueba {
    
    public static void main(String args[]){
		 System.out.println(Conexion.getConexion());
                 UsersMysql us = new UsersMysql();
                 Users u = new Users();
                u.setCedula("1090518420");
                u.setNombres("Jose Luis");
                u.setApellidos("Escalante Peñaranda");
                u.setDireccion("Calle 01");
                u.setTelefono("3022990472");
                u.setCorreo("escalantep98@gmail.com");
                u.setClave("jose98");
             System.out.println(u.toString());
                us.insertar(u);
                 
                
		
	}
    
}
