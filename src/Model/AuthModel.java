/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import GeneralClass.User;
import java.sql.*;

/**
 *
 * @author pongp
 */
public class AuthModel {

    public void getUser() {
        String sql = "select * from tbl_employee";
        ResultSet rec;
        try {
            rec = Database.getStatement().executeQuery(sql);
            while ((rec != null) && (rec.next())) {
                System.out.print(rec.getString("emp_id"));
                System.out.print(rec.getString("emp_user"));
                System.out.println(rec.getString("emp_salary"));
            }
        } catch (SQLException ex) {
            System.out.println("err getUser");
            ex.printStackTrace();
        }
    }

    public void addUser(String username, String displayName, String password) {
        try {
            String sql = "INSERT INTO users (username,displayName,password) values (?, ?, ?)";
            PreparedStatement pre = Database.getConnection().prepareStatement(sql);
            pre.setString(1, username.toLowerCase());
            pre.setString(2, displayName);
            pre.setString(3, password);
            pre.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("err addUser");
            ex.printStackTrace();
        }
    }

    public boolean checkExistUsername(String username) {
        try {
            String sql = "SELECT username FROM users WHERE username = ?";
            PreparedStatement pre = Database.getConnection().prepareStatement(sql);
            pre.setString(1, username.toLowerCase());
            ResultSet rec = pre.executeQuery();
            if ((rec != null) && (rec.next())) {
                return rec.getString("username").equals(username.toLowerCase());
            }
        } catch (SQLException ex) {
            System.out.println("err checkExistUsername");
            ex.printStackTrace();
        }
        return false;
    }

    public User checkUsernameAndPassword(String username, String password) {
        try {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement pre = Database.getConnection().prepareStatement(sql);
            pre.setString(1, username.toLowerCase());
            pre.setString(2, password);
            ResultSet rec = pre.executeQuery();
            if ((rec != null) && (rec.next())) {
                return new User(rec.getInt("id"), rec.getString("displayName"), rec.getString("username"), rec.getString("password"));
            }
        } catch (SQLException ex) {
            System.out.println("err checkUsernameAndPassword");
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet getUserByName(String username) {
        ResultSet rec = null;
        try {
            String sql = "SELECT * FROM users WHERE username = ?";
            PreparedStatement pre = Database.getConnection().prepareStatement(sql);
            pre.setString(1, username.toLowerCase());
            rec = pre.executeQuery();
        } catch (SQLException ex) {
            System.out.println("err getUserByName");
            ex.printStackTrace();
        }
        return rec;
    }
}
