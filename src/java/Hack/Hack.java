/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hack;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author erick
 */
@WebService(serviceName = "Hack")
public class Hack {

    Connection conn;
    Statement st;
    ResultSet rs;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Busqueda")
    public String Busqueda(@WebParam(name = "precio") int precio, @WebParam(name = "ciudad") String ciudad) {
        String html=null;
        try {
            conn = Conexion.getConexion();
            st = conn.createStatement();
            rs=st.executeQuery("SELECT * FROM Hotel WHERE Precio='"+precio+"' AND Ciudad='"+ciudad+"'");
            while(rs.next()){
                html+=rs.getString("nombre");
                return html;
            }
        } catch (Exception e) {
            return html;
        }
        return html;
    }
}
