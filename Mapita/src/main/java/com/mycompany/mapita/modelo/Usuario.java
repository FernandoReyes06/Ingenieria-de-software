package com.mycompany.mapita.modelo;
// Generated 8/02/2019 06:34:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idusuario;
     private String nombre;
     private String correo;
     private String contrasena;
     private String fechaNacimiento;
     private Set marcadors = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idusuario, String nombre) {
        this.idusuario = idusuario;
        this.nombre = nombre;
    }
    public Usuario(int idusuario, String nombre, String correo, String contrasena, String fechaNacimiento, Set marcadors) {
       this.idusuario = idusuario;
       this.nombre = nombre;
       this.correo = correo;
       this.contrasena = contrasena;
       this.fechaNacimiento = fechaNacimiento;
       this.marcadors = marcadors;
    }
   
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Set getMarcadors() {
        return this.marcadors;
    }
    
    public void setMarcadors(Set marcadors) {
        this.marcadors = marcadors;
    }




}

