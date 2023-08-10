package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbconn.Conn;
import model.Client;

public class ClientDAO {
    
    public void save(Client client) {
        String sql = "INSERT INTO clients(name, age) value (?,?)";

        //PreparedStatement ps = null;

        try {
            PreparedStatement ps = Conn.getConnection().prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setInt(2, client.getAge());
            
            ps.execute();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
