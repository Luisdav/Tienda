/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import pdv_dall.Logica.Usuario;

/**
 *
 * @author Toshiba
 */
public class BDUsuario {

    private static final String servidor = "jdbc:mysql://sql5.freesqldatabase.com/sql594788";
    private static final String usuario = "sql594788";
    private static final String password = "mW2*jU8!";
    private Connection conexion;

    public BDUsuario() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(servidor, usuario, password);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un problema durante la conexion \n" + ex);
        }

    }
    
    public void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public Usuario obtenerUsuario(String cedula) {
        Usuario usu = new Usuario();
        try {
            Statement comando = conexion.createStatement();
            ResultSet resultado = null;
            boolean consulta = comando.execute("Select * from Usuario where cedula='" + cedula + "';");
            if (consulta) {
                resultado = comando.getResultSet();
                while (resultado.next()) {
                    usu.setId(resultado.getInt("id"));
                    usu.setNombre(resultado.getString("nombre"));
                    usu.setCedula(cedula);
                    usu.setContrasena(resultado.getString("login"));
                    usu.setPrimerApellido(resultado.getString("apellido1"));
                    usu.setSegundoApellido(resultado.getString("apellido2"));
                    usu.setIdRol(resultado.getInt("idRol"));
                    usu.setTelefono(resultado.getString("telefono"));
                    int idDireccion = resultado.getInt("idDireccion");
                    obtenerDistrito(idDireccion, usu);
                }
            } else {
                usu = null;
            }

            
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener usuario");
        }
        return usu;
    }
    
    private void obtenerDistrito(int id,Usuario usu){     
        try {
            Statement comando = conexion.createStatement();
            ResultSet resultado = null;
            boolean consulta = comando.execute("Select * from Distrito where id='" + id + "';");
            if (consulta) {
                resultado = comando.getResultSet();
                while (resultado.next()) {
                   int idCanton = resultado.getInt("idCanton");
                   String distrito= resultado.getString("nombre");
                   usu.setDistrito(distrito);
                    obtenerCanton(idCanton, usu);
                }
            } else {
           
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener provincia del usuario");
        }
    }
    
     private void obtenerCanton(int id,Usuario usu){
        
        try {
            Statement comando = conexion.createStatement();
            ResultSet resultado = null;
            boolean consulta = comando.execute("Select * from Canton where id='" + id + "';");
            if (consulta) {
                resultado = comando.getResultSet();
                while (resultado.next()) {
                   int idProvincia = resultado.getInt("idProvincia");
                   String canton = resultado.getString("nombre");
                   usu.setCanton(canton);
                    obtenerProvincia(idProvincia, usu);
                }
            } else {
           
            }
           
        } catch (SQLException ex) {
            System.out.println("Error al obtener canton del usuario");
        }
    }

     private void obtenerProvincia(int id,Usuario usu){
        
        try {
            Statement comando = conexion.createStatement();
            ResultSet resultado = null;
            boolean consulta = comando.execute("Select * from Provincia where id='" + id + "';");
            if (consulta) {
                resultado = comando.getResultSet();
                while (resultado.next()) {
                   String provincia = resultado.getString("nombre");
                   usu.setProvincia(provincia);
                }
            } else {
           
            }
           
        } catch (SQLException ex) {
            System.out.println("Error al obtener provincia del usuario");
        }
    }
     
     public void llenarTabla( JTable tabla) {
        String sql = "Select * from Usuario";
         try {
            //Para manejar los datos en un JTable se utiliza un modelo,
            //que por dejecto es "DefaultTableModel". Sin embargo queremos
            //utilizar uno personalizado para esta aplicaciÃ³n, por eso se creÃ³
            //DBTableModel. Si no estÃ¡ asignado (ni creado) hay que
            //hacerlo, de lo contrario solo hace falta actualizarlo.
            if( (tabla.getModel().getClass().toString()).equalsIgnoreCase("class conexion.DBTableModel") ) {
                //Se actualiza porque ya existe y lo tiene asignado
                ((DBTableModel) tabla.getModel()).actualizar(sql, servidor, usuario, password);
            } else {
                //Se crea uno nuevo y se asigna
                DBTableModel modelo = new DBTableModel(sql, servidor, usuario, password);
                tabla.setModel(modelo);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
     public Usuario obtenerUsuarioID(int id) {
        Usuario usu = new Usuario();
        try {
            Statement comando = conexion.createStatement();
            ResultSet resultado = null;
            boolean consulta = comando.execute("Select * from Usuario where id='" + id + "';");
            if (consulta) {
                resultado = comando.getResultSet();
                while (resultado.next()) {
                    usu.setId(resultado.getInt("id"));
                    usu.setNombre(resultado.getString("nombre"));
                    usu.setCedula(resultado.getString("cedula"));
                    usu.setContrasena(resultado.getString("login"));
                    usu.setPrimerApellido(resultado.getString("apellido1"));
                    usu.setSegundoApellido(resultado.getString("apellido2"));
                    usu.setIdRol(resultado.getInt("idRol"));
                    usu.setTelefono(resultado.getString("telefono"));
                    int idDireccion = resultado.getInt("idDireccion");
                    obtenerDistrito(idDireccion, usu);
                }
            } else {
                usu = null;
            }

            
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener usuario");
        }
        return usu;
    }
     
     public void agregarUsuario(Usuario usuario){
        try {
            Statement comando = conexion.createStatement();
            
            boolean consulta = comando.execute("INSERT INTO Usuario VALUES('" + usuario.getCedula() +"', '"+ usuario.getNombre() + "', '" + usuario.getPrimerApellido() +  "', '" + usuario.getSegundoApellido()+ "', '" + usuario.getTelefono()+ "', "+ usuario.getIdRol() + ", "+ "1" + ", '" + usuario.getContrasena() + "', '" + usuario.getFechaNacimiento() + "');");
            conexion.close();
            System.out.println("El usuario " + usuario.getNombre() + " " + usuario.getPrimerApellido() + ", cedula:" + usuario.getCedula() + " a sido agregado");
        } catch (SQLException ex) {
            System.out.println("Error al ingresar usuario");
        }
        
     }
}
