/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marta
 */
public class Conexiones {
    //Conexión.
    Connection conn= null;
    
    //Constructor de la clase Conexiones que nos va a permitir establecer la conexión con la base de datos en MySQL.
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
    
    //Cierre de conexión. Método que nos permite cerrar la conexión.
    public void cerrarConn(){
       try{
           conn.close();
       }catch(SQLException ex){
           System.out.println("Error al cerrar la conexión!");
           ex.printStackTrace();
       }
    
    }
    
    ////////////////////////////////////////////////////////////PERRO/////////////////////////////////////////////////////////////
    
    //Consultas SELECT sobre la tabla PERROS.
    //Select * de la tabla Perros, que nos va a mostrar por pantalla. Consulta no parametrizada.
    public DefaultTableModel consultaPerros(){
         //Creamos un objeto DefaultTableModel que nos va a permitir insertar los datos en el jTable.
         DefaultTableModel model = new DefaultTableModel(new String[]{"Chip", "Nombre", "Afijo", "Raza", "Sexo","Nacimiento", "Deporte", "Grado", "Propietario"}, 0);
         
        try{
           //Creamos el statement para poder ejecutar la consulta.
           Statement sta = conn.createStatement();
           //Ejecutamos la consulta.
           ResultSet rs = sta.executeQuery("SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI;");

           //recorremos la tabla
           
              while(rs.next()){
                String chip=String.valueOf(rs.getInt("chip"));
                String nombreP=rs.getString("p.nombre");
                String afijo=rs.getString("afijo");
                String raza=rs.getString("raza");
                String sexo=rs.getString("sexo");
                String nac=String.valueOf(rs.getObject("nacimiento"));
                String deporte=rs.getString("deporte");
                String grado=rs.getString("grado");
                String prop= rs.getString("pr.nombre") + " " + rs.getString("pr.apellidos");
                //insertamos los datos en el model que nos va a devolver, creando una tupla.
                 model.addRow(new Object[]{chip, nombreP, afijo,raza,sexo,nac,deporte,grado,prop});
              }
            //Cerramos el statement y el resultset.
            rs.close();
            sta.close();
              
        }catch(SQLException ex){
          System.out.println("ERROR:al consultar");
          ex.printStackTrace();
        }
        //Devolvemos el model.
        return model;
  
     }
    
    //Consulta con preparedStatement al que le vamos a pasar parámetros de entrada.
    
    public DefaultTableModel consultaPerroPS(String consulta, String parametro){
         //Creamos un objeto DefaultTableModel que nos va a permitir insertar los datos en el jTable.
         DefaultTableModel model = new DefaultTableModel(new String[]{"Chip", "Nombre", "Afijo", "Raza", "Sexo", "Nacimiento","Deporte", "Grado", "Propietario"}, 0);
         
        try{
           //Creamos un objeto PreparedStatement para ejecutar la consulta.
            PreparedStatement pst = conn.prepareStatement(consulta);
            //Le pasamos los parámetros a la consulta.
            pst.setString(1,parametro);
            //Ejecutamos la consulta.
            ResultSet rs = pst.executeQuery();
            //Procesamos los resultados.
              while(rs.next()){
                String chip=String.valueOf(rs.getInt("chip"));
                String nombreP=rs.getString("p.nombre");
                String afijo=rs.getString("afijo");
                String raza=rs.getString("raza");
                String sexo=rs.getString("sexo");
                String nac=String.valueOf(rs.getObject("nacimiento"));
                String deporte=rs.getString("deporte");
                String grado=rs.getString("grado");
                String prop= rs.getString("pr.nombre") + " " + rs.getString("pr.apellidos");
                //insertamos los datos en el model que nos va a devolver, creando una tupla.
                 model.addRow(new Object[]{chip, nombreP, afijo,raza,sexo,nac,deporte,grado,prop});
              }
              //Cerramos el prepares statement y el resultset.
              rs.close();
              pst.close();
              
            
        }catch(SQLException ex){
          System.out.println("ERROR:al consultar");
          ex.printStackTrace();
        }
        //Devolvemos el model.
        return model;
  
     }
    
    //Edición sobre la tabla perro. Inserción de datos.
    
         public int insertaPerro(int chip, String nombre, String afijo, String raza, String sexo, String deporte, String nacimiento, String grado, String prop){
         
             try{
                 //Creamos un statement.
                 Statement sta = conn.createStatement();
                 //Ejecutamos la inserción. LO hacemos a través de un executeUpdate.
                 sta.executeUpdate("INSERT INTO perro VALUES ("+chip+", '"+nombre+"','"+afijo+"','"+raza+"','"+sexo+"','"+nacimiento+"','"+deporte+"','"+grado+"','"+prop+"')");
                 //Cerramos el statement
                 sta.close();
                 //Si se ha ejecutado correctamente devuelve 1.
                 return 1;
             }catch(SQLException ex){               
                 return -1;
             }
         }
    
    ////////////////////////////////////////////////////////PROPIETARIO/////////////////////////////////////////////////////////
         
    //Consultas Select sobre la tabla propietario
    //Select * de la tabla propietarios. No parametrizada.
    public DefaultTableModel consultaProp(){
         //Creamos un objeto DefaultTableModel que nos va a permitir insertar los datos en el jTable.
         DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "Nombre", "Apellidos", "Dirección", "Teléfono", "Club"}, 0);
         
        try{
           //Creamos el statement para poder ejecutar la consulta.
           Statement sta = conn.createStatement();
           //Ejecutamos la consulta.
           ResultSet rs = sta.executeQuery("SELECT * FROM propietario pr, club c WHERE c.CIF=pr.club;");

           //recorremos la tabla
           
              while(rs.next()){
                String DNI=rs.getString("dni");
                String nombreP=rs.getString("pr.nombre");
                String apellidos=rs.getString("apellidos");
                String dir=rs.getString("direccion");
                String telefono=String.valueOf(rs.getInt("telefono"));
                String club=rs.getString("c.nombre");
                //insertamos los datos en el model que nos va a devolver, creando una tupla.
                 model.addRow(new Object[]{DNI, nombreP, apellidos,dir,telefono,club});
              }
            //Cerramos el statement y el resultset.  
            rs.close();
            sta.close();
            
        }catch(SQLException ex){
          System.out.println("ERROR:al consultar");
          ex.printStackTrace();
        }
        //Devolvemos el model.
        return model;
  
     }
    
    //Consulta PreparedStatement
     public DefaultTableModel consultaPropPR(String consulta, String parametro){
         //Creamos un objeto DefaultTableModel que nos va a permitir insertar los datos en el jTable.
         DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "Nombre", "Apellidos", "Dirección", "Teléfono", "Club"}, 0);
         
        try{
           //Creamos un objeto PreparedStatement para ejecutar la consulta.
            PreparedStatement pst = conn.prepareStatement(consulta);
            //Le pasamos los parámetros a la consulta.
            pst.setString(1,parametro);
            //Ejecutamos la consulta.
            ResultSet rs = pst.executeQuery();
           //Procesamos el resultado.
              while(rs.next()){
                String DNI=rs.getString("dni");
                String nombreP=rs.getString("pr.nombre");
                String apellidos=rs.getString("apellidos");
                String dir=rs.getString("direccion");
                String telefono=String.valueOf(rs.getInt("telefono"));
                String club=rs.getString("c.nombre");
                //insertamos los datos en el model que nos va a devolver, creando una tupla.
                 model.addRow(new Object[]{DNI, nombreP, apellidos,dir,telefono,club});
              }
            //Cerramos el statement y el resultset.  
            rs.close();
            pst.close();
            
        }catch(SQLException ex){
          System.out.println("ERROR:al consultar");
          ex.printStackTrace();
        }
        //Devolvemos el model.
        return model;
  
     }
     
     //INSERTA NUEVO PROPIETARIO/SOCIO EN LA TABLA PROPIETARIO.
     
      public int insertaProp(String DNI, String nombre, String apellidos, String direccion, int telefono, int club){
         
             try{
                 //Creamos un statement.
                 Statement sta = conn.createStatement();
                 //Ejecutamos la inserción. LO hacemos a través de un executeUpdate.
                 sta.executeUpdate("INSERT INTO propietario VALUES ('"+DNI+"', '"+nombre+"','"+apellidos+"','"+direccion+"',"+telefono+","+club+")");
                 //Cerramos el statement
                 sta.close();
                 //Si se ha ejecutado correctamente devuelve 1.
                 return 1;
             }catch(SQLException ex){               
                 return -1;
             }
         }
     
     ////////////////////////////////////////////////////////////////CLUB/////////////////////////////////////////////////////
    
    //Consultas sobre la tabla CLUB.
    //Select * de la tabla CLUB, consulta no parametrizada.
    public DefaultTableModel consultaClub(){
         //Creamos un objeto DefaultTableModel que nos va a permitir insertar los datos en el jTable.
         DefaultTableModel model = new DefaultTableModel(new String[]{"CIF", "Nombre", "Dirección", "Teléfono"}, 0);
         
        try{
           //Creamos el statement para poder ejecutar la consulta.
           Statement sta = conn.createStatement();
           //Ejecutamos la consulta.
           ResultSet rs = sta.executeQuery("SELECT * FROM club;");

           //recorremos la tabla
           
              while(rs.next()){
                String CIF=String.valueOf(rs.getInt("CIF"));
                String nombre=rs.getString("nombre");
                String dir=rs.getString("direccion");
                String telefono=String.valueOf(rs.getInt("telefono"));   
                //insertamos los datos en el model que nos va a devolver, creando una tupla.
                 model.addRow(new Object[]{CIF, nombre,dir,telefono});
              }
              //Cerramos el statement y el resultset.
              rs.close();
              sta.close();
            
        }catch(SQLException ex){
          System.out.println("ERROR:al consultar");
          ex.printStackTrace();
        }
        //Devolvemos el model.
        return model;
  
     }
    
    //Prepared Statement para club.
    
    public DefaultTableModel consultaClubPS(String consulta, String parametro){
         //Creamos un objeto DefaultTableModel que nos va a permitir insertar los datos en el jTable.
         DefaultTableModel model = new DefaultTableModel(new String[]{"CIF", "Nombre", "Dirección", "Teléfono"}, 0);
         
        try{
           //Creamos un objeto PreparedStatement para ejecutar la consulta.
            PreparedStatement pst = conn.prepareStatement(consulta);
            //Le pasamos los parámetros a la consulta.
            pst.setString(1,parametro);
            //Ejecutamos la consulta.
            ResultSet rs = pst.executeQuery();
            //Procesamos el resultado.
              while(rs.next()){
                String CIF=String.valueOf(rs.getInt("CIF"));
                String nombre=rs.getString("nombre");
                String dir=rs.getString("direccion");
                String telefono=String.valueOf(rs.getInt("telefono"));   
                //insertamos los datos en el model que nos va a devolver, creando una tupla.
                 model.addRow(new Object[]{CIF, nombre,dir,telefono});
              }
              //Cerramos el statement y el resultset.
              rs.close();
              pst.close();
            
        }catch(SQLException ex){
          System.out.println("ERROR:al consultar");
          ex.printStackTrace();
        }
        //Devolvemos el model.
        return model;
  
     }
    
    //INSERCIÖN DE UN NUEVO CLUB
    
     public int insertaClub(int CIF, String nombre, String direccion, int telefono){
         
             try{
                 //Creamos un statement.
                 Statement sta = conn.createStatement();
                 //Ejecutamos la inserción. LO hacemos a través de un executeUpdate.
                 sta.executeUpdate("INSERT INTO club VALUES ("+CIF+", '"+nombre+"','"+direccion+"',"+telefono+")");
                 //Cerramos el statement
                 sta.close();
                 //Si se ha ejecutado correctamente devuelve 1.
                 return 1;
             }catch(SQLException ex){               
                 return -1;
             }
         }
    
}
