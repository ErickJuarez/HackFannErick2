/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Para COnsultas
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author erick
 */
//Para Conexion

public class Conexion {
    private static Connection conn = null;
    private static String URL = "jdbc:mysql://localhost:3306/Hack";
    private static String usuario = "root";
    private static String contrasena = "n0m3l0";
    //Consultas
    static Statement stmt = null;
    static ResultSet rs = null;
    static Connection conne = null;
    //Mensaje
    static String mensaje;    
    
    public static Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, usuario, contrasena);
            System.out.println("La conexion se ha establecido");
        }catch(Exception e){
            System.out.println("No se pudo hacer la conexion a la BD");
            e.printStackTrace();
        }
    return conn;
    }
}
