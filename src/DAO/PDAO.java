/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author AN
 */
public class PDAO {
     public static boolean updateUser(String oldUsername, String newUsername, String newPassword) {
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String query = "UPDATE utilisateur SET nom_user = ?, mot_de_passe_user = ? WHERE nom_user = ?";
                PreparedStatement ps = connex.prepareStatement(query);
                ps.setString(1, newUsername);
                ps.setString(2, newPassword);
                ps.setString(3, oldUsername);
                int rowsUpdated = ps.executeUpdate();
                return rowsUpdated > 0; // Retourne true si la mise à jour a réussi
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
