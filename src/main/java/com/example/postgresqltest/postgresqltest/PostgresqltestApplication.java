package com.example.postgresqltest.postgresqltest;

import com.example.postgresqltest.postgresqltest.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostgresqltestApplication implements CommandLineRunner {

    @Autowired
    StudentDao studentDao;

    public static void main(String[] args) {
        SpringApplication.run(PostgresqltestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Creating table...");
//        this.studentDao.createTable();

        this.studentDao.updateTable("Ramshek","Hazaribagh");


    }


}
