package com.springapp.mvc.daoimpl;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class BaseDaoImpl {

    private DataSource dataSource;

    public DataSource getInstance() {
        return this.dataSource;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
