package com.example.postgresqltest.postgresqltest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.management.Query;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //creating the table
    public void createTable(){
        String query = "CREATE TABLE student(id SERIAL PRIMARY KEY,name varchar(255) NOT NULL, city varchar(255))";
        int update = jdbcTemplate.update(query);
        System.out.println(update);
    }

    public void updateTable(String name, String city){
        String query = "insert into student(name,city) values(?,?)";
        int update = jdbcTemplate.update(query, name, city);
        System.out.println(update+" rows added");
    }

}
