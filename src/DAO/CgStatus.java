/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author AN
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CgStatus {
    public static boolean renouvelerAbonnement(String numeroTelephone) {
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String query = "UPDATE abonne SET statut_souscription = ? WHERE numero_telephone = ?";
                PreparedStatement ps = connex.prepareStatement(query);
                ps.setInt(1, 1);
                ps.setString(2, numeroTelephone);
                int rowsUpdated = ps.executeUpdate();
                return rowsUpdated > 0;
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

    public static boolean resilierAbonnement(String numeroTelephone) {
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String query = "UPDATE abonnes SET statut_souscription = ? WHERE numero_telephone = ?";
                PreparedStatement ps = connex.prepareStatement(query);
                ps.setInt(1, 0);
                ps.setString(2, numeroTelephone);
                int rowsUpdated = ps.executeUpdate();
                return rowsUpdated > 0;
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

