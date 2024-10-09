package main.java.conexion;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class Conexion {
    private static BasicDataSource dataSource = null;

    private static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUsername("root");
            dataSource.setPassword("root");
            dataSource.setUrl("jdbc:mysql://localhost:3306/crudjava?useTimezone=true&serverTimezone=UTC");
            dataSource.setInitialSize(20);
            dataSource.setMaxIdle(15);
            dataSource.setMaxTotal(20);
            dataSource.setMaxWaitMillis(5000);
        }
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }
}