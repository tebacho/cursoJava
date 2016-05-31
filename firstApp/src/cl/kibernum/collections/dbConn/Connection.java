package cl.kibernum.collections.dbConn;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public interface Connection {
    
    public MysqlDataSource getDataSource();
}
