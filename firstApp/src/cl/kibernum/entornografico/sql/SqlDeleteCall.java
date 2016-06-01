
package cl.kibernum.entornografico.sql;

import cl.kibernum.entornografico.objects.exception.DatabaseException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlDeleteCall extends SqlCall{

    @Override
    public void operation(Object obj) throws SQLException{
        if(obj instanceof Integer){
            Integer id = (Integer)obj;
            openConn();
            String query = "delete from Persona where id=?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.execute();
            closeConn();
        }

    }
    
}
