package BienesInmuebles.Datos.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    private static final String Usuario = "sa";
    private static final String CLAVE = "Alejandra22axcel";

    public static Connection obtenerConexion() {
        try {
            String URL = "jdbc:sqlserver://192.168.0.16:1433;databaseName=BienesInmuebles;";
            Connection cn = DriverManager.getConnection(URL,Usuario,CLAVE);
            return cn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
