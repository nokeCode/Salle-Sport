package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AN
 */
import DAO.Bd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Auth {
    // Méthode pour vérifier les informations de l'utilisateur
    public static boolean verifyUser(String username, String password) {
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String query = "SELECT * FROM utilisateur WHERE nom_user = ? AND mot_de_passe_user = ?";
                PreparedStatement ps = connex.prepareStatement(query);
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                return rs.next(); // Retourne true si l'utilisateur existe
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    connex.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return false;
    }
}
