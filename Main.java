import java.sql.SQLException;

import singleton.ConexionSingleton;

public class Main {
    
    public static void main(String[] args){
        try {
        //Creacion de objeto singleton
        ConexionSingleton conexionSingleton = ConexionSingleton.getInstance(
            "jdbc:mysql://localhost:3306/tarea",
            "tarea_user",
            "12341234");
            //Select
            conexionSingleton.getConexion().query("select * from tabla1");
            //Insert
            conexionSingleton.getConexion().query("Insert into tabla1 values ('Crono Fox')");
            //Update
            conexionSingleton.getConexion().query("Update tabla1 SET  [nombre] = 'Manute Juega', WHERE nombre= 'Danna Bletran'");
            //Delete
            conexionSingleton.getConexion().query("Delete from tabla1 where nombre = 'Oscar Ibarra'");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }       
        
    }
}
