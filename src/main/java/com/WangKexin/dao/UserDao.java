package com.WangKexin.dao;

import com.WangKexin.model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao {
    public boolean saveUser(Connection con, Users users) throws SQLException {
        PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");
        ps.setString(1, users.getUsername());
        ps.setString(2, users.getPassword());
        ps.setString(3, users.getEmail());
        ps.setString(4, users.getGender());
        ps.setString(5, users.getBirth().toString());
        ps.executeUpdate();
        return true;
    }

    public int deleteUser(Connection con, Users users) throws SQLException {
        PreparedStatement ps = con.prepareStatement("delete from user where id = ?");
        ps.setInt(1, users.getId());
        ps.executeUpdate();
        return 0;
    }

    public int updateUser(Connection con, Users users) throws SQLException {
        PreparedStatement ps = con.prepareStatement("update table user set username = ?,password = ?,email = ?,gender = ?,birth = ? where id = ?");
        ps.setString(1, users.getUsername());
        ps.setString(2, users.getPassword());
        ps.setString(3, users.getEmail());
        ps.setString(4, users.getGender());
        ps.setString(5, users.getBirth().toString());
        ps.setInt(6, users.getId());
        ps.executeUpdate();
        return 0;
    }

    public Users findById(Connection con, Integer id) throws SQLException {
        String sql = "select * from user where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        Users users = null;
        if (rs.next()) {
            users = new Users();
            users.setId(rs.getInt("id"));
            users.setUsername(rs.getString("username"));
            users.setPassword(rs.getString("password"));
            users.setEmail(rs.getString("email"));
            users.setGender(rs.getString("gender"));
            users.setBirth(rs.getDate("birth"));
        }
        return users;
    }

    public Users findByUsernamePassword(Connection con, String username, String password) throws SQLException {
        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs = ps.executeQuery();
        Users users = null;
        if (rs.next()) {
            users = new Users();
            users.setId(rs.getInt("id"));
            users.setUsername(rs.getString("username"));
            users.setPassword(rs.getString("password"));
            users.setEmail(rs.getString("email"));
            users.setGender(rs.getString("gender"));
            users.setBirth(rs.getDate("birth"));
        }
        return users;
    }

    public List<Users> findByUsername(Connection con, String username) throws SQLException {
        String sql = "select * from user where username = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,username);
        ResultSet rs = ps.executeQuery();
        Users users = null;
        if (rs.next()) {
            users = new Users();
            users.setId(rs.getInt("id"));
            users.setUsername(rs.getString("username"));
            users.setPassword(rs.getString("password"));
            users.setEmail(rs.getString("email"));
            users.setGender(rs.getString("gender"));
            users.setBirth(rs.getDate("birth"));
        }
        return (List<Users>) users;
    }

    public List<Users> findByPassword(Connection con, String password) throws SQLException {
        String sql = "select * from user where password = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,password);
        ResultSet rs = ps.executeQuery();
        Users users = null;
        if (rs.next()) {
            users = new Users();
            users.setId(rs.getInt("id"));
            users.setUsername(rs.getString("username"));
            users.setPassword(rs.getString("password"));
            users.setEmail(rs.getString("email"));
            users.setGender(rs.getString("gender"));
            users.setBirth(rs.getDate("birth"));
        }
        return (List<Users>) users;
    }

    public List<Users> findByEmail(Connection con, String email) throws SQLException {
        String sql = "select * from user where email = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,email);
        ResultSet rs = ps.executeQuery();
        Users users = null;
        if (rs.next()) {
            users = new Users();
            users.setId(rs.getInt("id"));
            users.setUsername(rs.getString("username"));
            users.setPassword(rs.getString("password"));
            users.setEmail(rs.getString("email"));
            users.setGender(rs.getString("gender"));
            users.setBirth(rs.getDate("birth"));
        }
        return (List<Users>) users;
    }

    public List<Users> findByGender(Connection con, String gender) throws SQLException {
        String sql = "select * from user where gender = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,gender);
        ResultSet rs = ps.executeQuery();
        Users users = null;
        if (rs.next()) {
            users = new Users();
            users.setId(rs.getInt("id"));
            users.setUsername(rs.getString("username"));
            users.setPassword(rs.getString("password"));
            users.setEmail(rs.getString("email"));
            users.setGender(rs.getString("gender"));
            users.setBirth(rs.getDate("birth"));
        }
        return (List<Users>) users;
    }

    public List<Users> findByBirthdate(Connection con, Date birth) throws SQLException {
        String sql = "select * from user where birth = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,birth.toString());
        ResultSet rs = ps.executeQuery();
        Users users = null;
        if (rs.next()) {
            users = new Users();
            users.setId(rs.getInt("id"));
            users.setUsername(rs.getString("username"));
            users.setPassword(rs.getString("password"));
            users.setEmail(rs.getString("email"));
            users.setGender(rs.getString("gender"));
            users.setBirth(rs.getDate("birth"));
        }
        return (List<Users>) users;
    }

    public List<Users> findAllUser(Connection con) throws SQLException {
        String sql = "select * from user";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Users users = null;
        while (rs.next()) {
            users = new Users();
            users.setId(rs.getInt("id"));
            users.setUsername(rs.getString("username"));
            users.setPassword(rs.getString("password"));
            users.setEmail(rs.getString("email"));
            users.setGender(rs.getString("gender"));
            users.setBirth(rs.getDate("birth"));
        }
        return (List<Users>) users;
    }
}
