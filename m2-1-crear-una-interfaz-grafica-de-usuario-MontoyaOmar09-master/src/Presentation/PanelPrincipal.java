package Presentation;

import Bussines.Planets.Estrella;
import Bussines.Planets.PlanetaJoviano;
import Bussines.Planets.PlanetaRocoso;
import Bussines.SistemaSolar;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class PanelPrincipal extends javax.swing.JFrame {

    public PanelPrincipal() {
        try {
            bg = ImageIO.read(new File(".\\src\\Data\\Resources\\Background.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelControl = new javax.swing.JPanel();
        addEstrella = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Solar");
        setName("JFramePrincipal"); // NOI18N
        setResizable(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        addEstrella.setText("Agregar Estrella");
        addEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEstrellaActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar Planeta Gaseoso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar Planeta Rocoso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addComponent(addEstrella)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 309, Short.MAX_VALUE))
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEstrella, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEstrellaActionPerformed

        int x, y;
        do {
            x = (int) (Math.random() * WIDTH);
            y = (int) (Math.random() * HEIGHT);

        } while (x > WIDTH - 200 || y > HEIGHT - 200);

        sistemaSolar.addEstrella(new Estrella(".\\src\\Data\\Resources\\SUN.png", x, y));

        rePinta();


    }//GEN-LAST:event_addEstrellaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int x, y;
        do {
            x = (int) (Math.random() * WIDTH);
            y = (int) (Math.random() * HEIGHT);

        } while (x > WIDTH - 100 || y > HEIGHT - 100);

        sistemaSolar.addJoviano(new PlanetaJoviano(".\\src\\Data\\Resources\\Joviano.png", x, y));

        rePinta();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int x, y;
        do {
            x = (int) (Math.random() * WIDTH);
            y = (int) (Math.random() * HEIGHT);

        } while (x > WIDTH - 100 || y > HEIGHT - 100);

        sistemaSolar.addRocoso(new PlanetaRocoso(".\\src\\Data\\Resources\\planet.png", x, y));

        rePinta();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void rePinta() {

        panelPrincipal.getGraphics().clearRect(0, 0, WIDTH, HEIGHT);
        panelPrincipal.getGraphics().drawImage(bg, 0, 0, WIDTH + 100, HEIGHT, null);

        for (int i = 0; i < sistemaSolar.getPlanetasRocosos().size(); i++) {
            panelPrincipal.getGraphics().drawImage(sistemaSolar.getPlanetasRocosos().get(i).getTexture(), sistemaSolar.getPlanetasRocosos().get(i).getPosx(), sistemaSolar.getPlanetasRocosos().get(i).getPosy(), 50, 50, null);

        }
        for (int i = 0; i < sistemaSolar.getEstrellas().size(); i++) {
            panelPrincipal.getGraphics().drawImage(sistemaSolar.getEstrellas().get(i).getTexture(), sistemaSolar.getEstrellas().get(i).getPosx(), sistemaSolar.getEstrellas().get(i).getPosy(), 200, 200, null);
        }
        for (int i = 0; i < sistemaSolar.getPlanetasJovianos().size(); i++) {
            panelPrincipal.getGraphics().drawImage(sistemaSolar.getPlanetasJovianos().get(i).getTexture(), sistemaSolar.getPlanetasJovianos().get(i).getPosx(), sistemaSolar.getPlanetasJovianos().get(i).getPosy(), 100, 80, null);
        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    private Image bg;
    private final int WIDTH = 734;
    private final int HEIGHT = 517;
    private SistemaSolar sistemaSolar = sistemaSolar = new SistemaSolar();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEstrella;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
