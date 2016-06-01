package cl.kibernum.entornografico.sql;

import cl.kibernum.entornografico.objects.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlSelectAllCall extends SqlCall{

    @Override
    public void operation(Object obj) throws SQLException {
         
            Persona per = (Persona)obj;
            openConn();
            String query = "select * from Persona";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("id :"+rs.getString("id"));
            }
            stmt.close();
            closeConn();
            
            closeConn();
    }
    
}
