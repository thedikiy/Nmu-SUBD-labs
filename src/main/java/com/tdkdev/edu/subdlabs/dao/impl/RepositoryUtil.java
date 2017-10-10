package com.tdkdev.edu.subdlabs.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

@Component
public class RepositoryUtil {

    private static String url;
    private static String username;
    private static String pwd;

    @Value("${database.url}")
    public void setUrl(String dburl) {
        url = dburl;
    }

    @Value("${database.username}")
    public void setUsername(String dbusername) {
        username = dbusername;
    }

    @Value("${database.pwd}")
    public void setPwd(String dbpwd) {
        pwd = dbpwd;
    }

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        return DriverManager.getConnection(url, username, pwd);
    }

}
