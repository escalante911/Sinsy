/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;

/**
 *
 * @author joescalante
 */
public interface Function<T> {
    
        public List<T> Listar();
	public T obtener(T t);
	public String insertar(T t);
	public String actualizar(T t);
	public void eliminar(T t);
    
}
