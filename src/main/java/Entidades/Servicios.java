/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joescalante
 */
@MappedSuperclass
@Table(catalog = "sinsy", schema = "")
@XmlRootElement
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_servicio", nullable = false)
    private Integer idServicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(nullable = false, length = 200)
    private String descripcion;
    @JoinColumn(name = "categoria", referencedColumnName = "id_categoria", nullable = false)
    @ManyToOne(optional = false)
    private Categorias categoria;

    public Servicios() {
    }

    public Servicios(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public Servicios(Integer idServicio, String nombre, String descripcion) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServicio != null ? idServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.idServicio == null && other.idServicio != null) || (this.idServicio != null && !this.idServicio.equals(other.idServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Servicios[ idServicio=" + idServicio + " ]";
    }
    
}
