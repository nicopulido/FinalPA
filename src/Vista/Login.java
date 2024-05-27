/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;

/**
 *
 * @author luisf
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cajaUser = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botonIngresoLogin = new javax.swing.JButton();
        cajaContraPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        labelNomEmp = new javax.swing.JLabel();
        labelFondoLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("USUARIO");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, -1));

        cajaUser.setBackground(new java.awt.Color(255, 255, 255));
        cajaUser.setForeground(new java.awt.Color(204, 204, 204));
        cajaUser.setText("Ingrese su nombre de usuario");
        cajaUser.setBorder(null);
        cajaUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cajaUserMousePressed(evt);
            }
        });
        cajaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUserActionPerformed(evt);
            }
        });
        background.add(cajaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 360, 30));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 340, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CONTRASEÑA");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, -1));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 340, 10));

        botonIngresoLogin.setText("INGRESAR");
        botonIngresoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresoLoginActionPerformed(evt);
            }
        });
        background.add(botonIngresoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 110, 40));

        cajaContraPass.setBackground(new java.awt.Color(255, 255, 255));
        cajaContraPass.setForeground(new java.awt.Color(204, 204, 204));
        cajaContraPass.setText("********");
        cajaContraPass.setBorder(null);
        cajaContraPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cajaContraPassMousePressed(evt);
            }
        });
        background.add(cajaContraPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 330, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\luisf\\Downloads\\favicon.png")); // NOI18N
        jLabel4.setText("ADMIN LOGIN");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 220, 40));

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\luisf\\OneDrive\\Documentos\\UD\\AVANZADA\\Logotipo.png")); // NOI18N
        labelLogo.setText("jLabel1");
        background.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 157, 106));

        labelNomEmp.setBackground(new java.awt.Color(0, 0, 0));
        labelNomEmp.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        labelNomEmp.setForeground(new java.awt.Color(255, 255, 255));
        labelNomEmp.setText("LS SU PROOVEDOR S.A.S.");
        background.add(labelNomEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 229, 46));

        labelFondoLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\luisf\\Downloads\\city.png")); // NOI18N
        labelFondoLogo.setText("jLabel2");
        background.add(labelFondoLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUserActionPerformed

    private void botonIngresoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIngresoLoginActionPerformed

    private void cajaUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaUserMousePressed
        if (cajaUser.getText().equals("Ingrese su nombre de usuario")) {
            cajaUser.setText("");
            cajaUser.setForeground(Color.BLACK);
        }
        if (String.valueOf(cajaContraPass.getPassword()).isEmpty()) {
            cajaContraPass.setText("********");
            cajaContraPass.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_cajaUserMousePressed

    private void cajaContraPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaContraPassMousePressed
        if (String.valueOf(cajaContraPass.getPassword()).equals("********")) {
            cajaContraPass.setText("");
            cajaContraPass.setForeground(Color.BLACK);
        }
        if (cajaUser.getText().isEmpty()) {
            cajaUser.setText("Ingrese su nombre de usuario");
            cajaUser.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_cajaContraPassMousePressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton botonIngresoLogin;
    private javax.swing.JPasswordField cajaContraPass;
    private javax.swing.JTextField cajaUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelFondoLogo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNomEmp;
    // End of variables declaration//GEN-END:variables
}
