/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdv_dall.Logica;

/**
 *
 * @author Toshiba
 */
public class Proveedor {
    private int id;
    private String nombre;
    private String direccion;
    private String correo;
    private String cedJuridica;
    private String nombreContacto;
    private String primerApContacto;
    private String segundoApContacto;
    private String telContacto;

    public Proveedor() {
    }

    public Proveedor(String nombre, String direccion, String correo, String nombreContacto, String primerApContacto, String segundoApContacto, String telContacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.nombreContacto = nombreContacto;
        this.primerApContacto = primerApContacto;
        this.segundoApContacto = segundoApContacto;
        this.telContacto = telContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getPrimerApContacto() {
        return primerApContacto;
    }

    public void setPrimerApContacto(String primerApContacto) {
        this.primerApContacto = primerApContacto;
    }

    public String getSegundoApContacto() {
        return segundoApContacto;
    }

    public void setSegundoApContacto(String segundoApContacto) {
        this.segundoApContacto = segundoApContacto;
    }

    public String getTelContacto() {
        return telContacto;
    }

    public void setTelContacto(String telContacto) {
        this.telContacto = telContacto;
    }
    
    public void guardarProveedor(Proveedor p) {
        
    }
    
    
    
}
