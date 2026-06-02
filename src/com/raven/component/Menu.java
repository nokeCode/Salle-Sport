package com.raven.component;

//import com.raven.form.AjtAbonne;
import com.raven.form.AjtAbonne;
import com.raven.form.AjtAbonnement;
import com.raven.form.Logout;
import com.raven.form.Parametre1;
import com.raven.form.TAbonne;
import com.raven.form.TAbonnement;
import com.raven.main.Ma;
import com.raven.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel {

    public Ma ma; // Référence à la classe Ma

    /*public Menu() {
        
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }*/
    public Menu(Ma ma) {
        this.ma = ma;
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
        //initCompnents();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void init() {
        listMenu1.addItem(new Model_Menu("1", "Home", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "Abonnement", Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("2", "Liste des Abonnement", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("3", "Ajouter un offre", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "Abonné", Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        //listMenu1.addItem(new Model_Menu("4", "Forms Stuff", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("5", "Table des abonnés", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("11", "Ajouter un Abonné", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));

        listMenu1.addItem(new Model_Menu("", "Compte", Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        //listMenu1.addItem(new Model_Menu("6", "Icons", Model_Menu.MenuType.MENU));
        //listMenu1.addItem(new Model_Menu("7", "Sample Page", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("8", "Profile", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("9", "Paramètre", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("20", "Logout", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));

        // Ajouter un écouteur d'événements à chaque élément du menu
        listMenu1.addEventSelectedMenu(new EventMenuSelected() {
            @Override
            public void onMenuSelected(int index) {
                //System.out.println("Menu selectionne : " + index); //permet d'afficher index de chaque panel
                changeForm(index); // Appeler la méthode pour changer le formulaire
            }

            private void changeForm(int index) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                //tAbonne1 = new com.raven.form.TAbonne();
                switch (index) {
                    case 0 -> ma.showForm((new TAbonnement()));
                    case 4 -> ma.showForm(new TAbonnement());
                    case 9 -> ma.showForm(new TAbonne());
                    case 10 -> ma.showForm(new AjtAbonne());
                    case 5 -> ma.showForm(new AjtAbonnement());
                    case 15 -> ma.showForm(new Parametre1());
                    case 16 -> ma.showForm(new Logout());
                    default -> {
                    }
                }
            }
        });
     
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new com.raven.swing.ListMenu<>();

        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/hallter.png"))); // NOI18N
        jLabel1.setText("Gestion Gym ");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#6BFF69"), 0, getHeight(), Color.decode("#0B3D02"));
        //GradientPaint g = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.raven.swing.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
