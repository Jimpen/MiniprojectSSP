package com.example.controller;

import com.example.controller.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;

@Component
public class ScoreRepository implements Repo{

    @Autowired
    private DataSource dataSource;

    public void addMember(String username, String password){
        if(dataSource != null){
            try (Connection conn = dataSource.getConnection();
                 PreparedStatement statement = conn.prepareStatement("INSERT INTO people(username,password) VALUES(?,?)"))
            {
                //TODO tester av användarnamn etc
                statement.setString(1,username);
                statement.setString(2,password);
                statement.executeUpdate();

            }
            catch (SQLException e){
                System.err.println("Fatal error in addMember");
            }
        }
        else{
            System.out.println("Data is null!!!! :'(");
        }

    }

}
