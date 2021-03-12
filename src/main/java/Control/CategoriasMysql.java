/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Categorias;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joescalante
 */
public class CategoriasMysql {
    
    private Conexion cn;
    List<Categorias> cat;
    
    
    public CategoriasMysql() {
        this.cn = Conexion.getConexion();
    }

    public List Listar() {
        String sql="select * from categorias";
		cat = new ArrayList<Categorias>();
		
		try{
			ResultSet res=cn.query(sql);
			while(res.next()){
                            Categorias ca = new Categorias();
				ca.setIdCategoria(res.getInt(1));
                                ca.setNombre(res.getString(2));
                                ca.setDescripcion(res.getString(3));
                                
				cat.add(ca);
                                System.out.println("Correcto");
			}
			res.close();
                        return cat;

		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
                        System.out.println("Error");
			e.printStackTrace();       
		}
			
		return null;
    }

    public Categorias obtener(int id) {
        try{
			ResultSet res=cn.query("SELECT * FROM categorias where id_categoria= "+id);
			while(res.next()){
				Categorias ca = new Categorias();
                                ca.setIdCategoria(res.getInt("id_categoria"));
                                ca.setNombre(res.getString("nombre"));
                                ca.setDescripcion(res.getString("descripcion"));
				return ca;
			}
			 res.close();

	     	  
   	  } catch (Exception e) {
   		  System.out.println(e.getMessage());
   	   //JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
   	  }
		return null;
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
