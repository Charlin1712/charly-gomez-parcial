/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.examenbimestral;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "usuario")
public class Apoyo2 {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "LOGIN")
    private String login;
    
    @Column(name = "PASSWORD")
    private String password;
    
     @Column(name = "CALIFICACION")
    private Float calificacion;
    
     
//CONSTRUCTOR DEL USUARIO
    public Apoyo2() {
    }
//CONSTRUCTOR PARA BUSCAR POR ID
    public Apoyo2(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public Float getCalificacion() {
        return calificacion;
    }

     public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apoyo2)) {
            return false;
        }
        Apoyo2 other = (Apoyo2) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unitec.weba.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
    
}