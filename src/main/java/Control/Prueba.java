/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import entities.Categorias;

/**
 *
 * @author joescalante
 */
public class Prueba {
    
    public static void main(String args[]){
		 System.out.println(Conexion.getConexion());
                 Categorias c = new Categorias();
                 
                 c.setIdCategoria(1);
                 c.setNombre("Sporte");
                 c.setDescripcion("Mantenimiento preventivo y correctivo de equipos de computo");
                 
                 CategoriasMysql cat = new CategoriasMysql();
                 
                 cat.insertar(c);
                 
                
		
	}
    
}
