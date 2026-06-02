package DAO;

import DAO.Bd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SouscriptionDAO { 

    public static boolean souscrireAbonnement(int idAbonne, int idAbonnement) {
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String query = "INSERT INTO souscription (id_abonne, id_abonnement) VALUES (?, ?)";
                PreparedStatement ps = connex.prepareStatement(query);
                ps.setInt(1, idAbonne);
                ps.setInt(2, idAbonnement);
                int rowsInserted = ps.executeUpdate();
                return rowsInserted > 0;
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

    // Méthode pour récupérer l'ID de l'abonné par le nom
    public static int getIdAbonneByNom(String nomAbonne) {
        int idAbonne = -1;
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String query = "SELECT id_abonne FROM abonnes WHERE nom_abonne = ?";
                PreparedStatement ps = connex.prepareStatement(query);
                ps.setString(1, nomAbonne);
                ResultSet rs = ps.executeQuery(); // N'oublie pas d'importer java.sql.ResultSet
                if (rs.next()) {
                    idAbonne = rs.getInt("id_abonne");
                }
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
        return idAbonne;
    }

    // Méthode pour récupérer l'ID de l'abonnement par le libellé
    public static int getIdAbonnementByLibelle(String libelleAbonnement) {
        int idAbonnement = -1;
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String query = "SELECT id_abonnement FROM abonnement WHERE libelle_abonnement = ?";
                PreparedStatement ps = connex.prepareStatement(query);
                ps.setString(1, libelleAbonnement);
                ResultSet rs = ps.executeQuery(); // N'oublie pas d'importer java.sql.ResultSet
                if (rs.next()) {
                    idAbonnement = rs.getInt("id_abonnement");
                }
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
        return idAbonnement;
    }
}
