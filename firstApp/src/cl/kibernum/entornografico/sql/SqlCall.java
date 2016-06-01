package cl.kibernum.entornografico.sql;

import cl.kibernum.collections.dbConn.MysqlConnection;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class SqlCall {
    
    Connection conn;
    
    public void openConn() throws SQLException{
        conn = new MysqlConnection().getDataSource().getConnection();
        
    }
    public void closeConn() throws SQLException{
        conn.close();
    }
    public abstract void operation(Object obj) throws SQLException;
    
    public void operation() throws SQLException{
        this.operation(null);
    }
}
