/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marta
 */
public class Conexiones {
    //Conexión.
    Connection conn= null;
    
    public Conexiones(){
        
        conn=null;
        
        try {
           String url1 = "jdbc:mysql://localhost:3306/deportes?serverTimezone=UTC";
           String user = "root";
           String password = "";
           //La clase DiverManager tiene un método getConnection que nos va a establecer la conexión
           //cuando le pasamos los parámetros de entrada url, user y password.
           conn = (Connection) DriverManager.getConnection(url1, user, password);
             if (conn != null) {
               System.out.println("Conectado a deportes.");
             }
        } catch (SQLException ex) {
            System.out.println("ERROR: dirección o usuario/clave no válida");
            ex.printStackTrace();
        }
    
    }
}
