/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.kibernum.entornografico.sql;

import cl.kibernum.entornografico.objects.Persona;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kibernum
 */
public class SqlAddCall extends SqlCall{

    @Override
    public void operation(Object obj) throws SQLException {
         
        if(obj instanceof Persona){
            Persona per = (Persona)obj;
            openConn();
            String query = "insert into Persona (id, name, gender, age, password) values (?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, per.getRut());
            pstmt.setString(2, per.getNombre());
            pstmt.setString(3, per.getGender());
            pstmt.setInt(4, per.getEdad());
            pstmt.setString(5, per.getPassword());
            pstmt.execute();
            closeConn();
        }
    }
    
}
