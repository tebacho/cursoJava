package cl.kibernum.collections.dbConn;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MysqlConnection implements Connection{
    private final String server = "52.1.139.148";
    private final String database = "test_kb";
    private final String user = "admin";
    private final String password  = "admin2016*";

    @Override
    public MysqlDataSource getDataSource() {
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setUser(user);
        datasource.setDatabaseName(database);
        datasource.setPassword(password);
        datasource.setServerName(server);
        return datasource;
    }
    
}
