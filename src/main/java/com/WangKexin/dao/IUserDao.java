package com.WangKexin.dao;

import com.WangKexin.model.Users;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface IUserDao {
    public boolean saveUser(Connection con, Users users) throws SQLException;
    public int deleteUser(Connection con, Users users) throws SQLException;
    public int updateUser(Connection con, Users users) throws SQLException;

    public Users findById(Connection con, Integer id) throws SQLException;
    public Users findByUsernamePassword(Connection con, String username, String password) throws SQLException;
    public List<Users> findByUsername(Connection con, String username) throws SQLException;
    public List<Users> findByPassword(Connection con, String password) throws SQLException;
    public List<Users> findByEmail(Connection con, String email) throws SQLException;
    public List<Users> findByGender(Connection con, String gender) throws SQLException;
    public List<Users> findByBirthdate(Connection con, Date birth) throws SQLException;
    public List<Users> findAllUser(Connection con) throws SQLException;


}
