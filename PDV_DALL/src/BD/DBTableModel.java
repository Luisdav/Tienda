package BD;

import java.sql.*;
import javax.swing.table.AbstractTableModel;

public class DBTableModel extends AbstractTableModel   {
    private Statement instruccion;
    private ResultSet datos;
    private Connection conexion;
    private ResultSetMetaData metaDatos;
    private int cantidadFilas;
    
    public DBTableModel(String sql, String servidor, String usuario, String password) {
        try {
            //Se abre la conexion utilizando el driver de postgres
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(servidor, usuario, password);
            instruccion = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            datos = instruccion.executeQuery(sql);
            metaDatos = datos.getMetaData();

            datos.last();
            cantidadFilas = datos.getRow();

            fireTableStructureChanged();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public Class getColumnClass(int columna) throws IllegalStateException {
        try {
            String nombreClase = metaDatos.getColumnClassName(columna + 1);
            return Class.forName(nombreClase);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return Object.class;
    }

    public int getColumnCount() throws IllegalStateException {

        try {
            return metaDatos.getColumnCount();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public String getColumnName(int columna) throws IllegalStateException {

        try {
            return metaDatos.getColumnName(columna + 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return "";
    }

    public int getRowCount() throws IllegalStateException {
        return cantidadFilas;
    }

    public Object getValueAt(int fila, int columna) throws IllegalStateException {

        try {
            datos.absolute(fila + 1);
            return datos.getObject(columna + 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public void actualizar(String sql, String servidor, String usuario, String password)throws SQLException, IllegalStateException {
        this.desconectar();
        
        try {
            //Se abre la conexion utilizando el driver de postgres
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(servidor, usuario, password);
            instruccion = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            datos = instruccion.executeQuery(sql);
            metaDatos = datos.getMetaData();

            datos.last();
            cantidadFilas = datos.getRow();

            fireTableStructureChanged();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void desconectar() {       
        try {
            datos.close();
            instruccion.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
