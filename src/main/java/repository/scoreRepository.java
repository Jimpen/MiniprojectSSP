package repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class scoreRepository {
/*
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private DataSource dataSource;


    public List<user> listScore() {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, title FROM blogs")) {
            List<user> blogs = new ArrayList<>();
            while (rs.next()) blogs.add(rsBlog(rs));
            return blogs;
        } catch (SQLException e) {
            throw new BlogRepositoryException(e);
        }
    }*/

}