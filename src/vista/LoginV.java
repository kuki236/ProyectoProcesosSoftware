/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import Modelo.*;
import java.awt.Color;
import vista.*;


/**
 *
 * @author Luis Bizarro
 */
public class LoginV extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public LoginV() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelRound1 = new vista.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelUsuario = new vista.PanelRound();
        txtFieldNombreUsuario = new javax.swing.JTextField();
        panelPassword = new vista.PanelRound();
        txtFieldPassword = new javax.swing.JPasswordField();
        panelIngresar = new vista.PanelRound();
        lblIngresar = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        imgHamburguesa = new javax.swing.JLabel();
        barraMovedora = new javax.swing.JPanel();
        panelExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        lblRegistrarse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(160, 3, 23));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(179, 53, 69));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        jLabel1.setFont(new java.awt.Font("Burbank Big Cd Bd", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USUARIO");

        panelUsuario.setBackground(new java.awt.Color(216, 152, 160));
        panelUsuario.setRoundBottomLeft(20);
        panelUsuario.setRoundBottomRight(20);
        panelUsuario.setRoundTopLeft(20);
        panelUsuario.setRoundTopRight(20);

        txtFieldNombreUsuario.setBackground(new java.awt.Color(216, 152, 160));
        txtFieldNombreUsuario.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtFieldNombreUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtFieldNombreUsuario.setText("Ingrese su nombre de usuario");
        txtFieldNombreUsuario.setBorder(null);
        txtFieldNombreUsuario.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        txtFieldNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFieldNombreUsuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFieldNombreUsuarioMousePressed(evt);
            }
        });
        txtFieldNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNombreUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFieldNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFieldNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPassword.setBackground(new java.awt.Color(216, 152, 160));
        panelPassword.setRoundBottomLeft(20);
        panelPassword.setRoundBottomRight(20);
        panelPassword.setRoundTopLeft(20);
        panelPassword.setRoundTopRight(20);

        txtFieldPassword.setBackground(new java.awt.Color(216, 152, 160));
        txtFieldPassword.setText("********");
        txtFieldPassword.setBorder(null);
        txtFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFieldPasswordMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFieldPasswordMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelPasswordLayout = new javax.swing.GroupLayout(panelPassword);
        panelPassword.setLayout(panelPasswordLayout);
        panelPasswordLayout.setHorizontalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPasswordLayout.setVerticalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelIngresar.setBackground(new java.awt.Color(226, 200, 204));
        panelIngresar.setRoundBottomLeft(20);
        panelIngresar.setRoundBottomRight(20);
        panelIngresar.setRoundTopLeft(20);
        panelIngresar.setRoundTopRight(20);

        lblIngresar.setFont(new java.awt.Font("Burbank Big Cd Bd", 0, 24)); // NOI18N
        lblIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresar.setText("INGRESAR");
        lblIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelIngresarLayout = new javax.swing.GroupLayout(panelIngresar);
        panelIngresar.setLayout(panelIngresarLayout);
        panelIngresarLayout.setHorizontalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        panelIngresarLayout.setVerticalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        lblPassword.setFont(new java.awt.Font("Burbank Big Cd Bd", 0, 30)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("PASSWORD");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(panelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        bg.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 460, 340));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("COCO'S BURGUER");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 460, -1));

        imgHamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/hamburguesa.png"))); // NOI18N
        bg.add(imgHamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        barraMovedora.setBackground(new java.awt.Color(160, 3, 23));
        barraMovedora.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMovedoraMouseDragged(evt);
            }
        });
        barraMovedora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMovedoraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraMovedoraLayout = new javax.swing.GroupLayout(barraMovedora);
        barraMovedora.setLayout(barraMovedoraLayout);
        barraMovedoraLayout.setHorizontalGroup(
            barraMovedoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        barraMovedoraLayout.setVerticalGroup(
            barraMovedoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(barraMovedora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        panelExit.setBackground(new java.awt.Color(160, 3, 23));

        lblExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("x");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelExitLayout = new javax.swing.GroupLayout(panelExit);
        panelExit.setLayout(panelExitLayout);
        panelExitLayout.setHorizontalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelExitLayout.setVerticalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 40));

        lblRegistrarse.setFont(new java.awt.Font("Burbank Big Cd Bd", 0, 24)); // NOI18N
        lblRegistrarse.setForeground(new java.awt.Color(255, 205, 204));
        lblRegistrarse.setText("Registrarse");
        lblRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseExited(evt);
            }
        });
        bg.add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseEntered
        panelIngresar.setBackground(new Color(180,112,122));
        lblIngresar.setForeground(new Color(251,188,172));

    }//GEN-LAST:event_lblIngresarMouseEntered

    private void barraMovedoraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMovedoraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
           
    }//GEN-LAST:event_barraMovedoraMousePressed

    private void barraMovedoraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMovedoraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_barraMovedoraMouseDragged

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        // TODO add your handling code here:
        panelExit.setBackground(new Color(251,40,67));
        lblExit.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        panelExit.setBackground(new Color(160,3,23));
        lblExit.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_lblExitMouseExited

    private void lblIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseClicked
    ArchivoPersonal ap = new ArchivoPersonal();
    // Buscar personal por las credenciales
    Personal p = ap.buscarPersonalPorCredenciales(txtFieldNombreUsuario.getText(), String.valueOf(txtFieldPassword.getPassword()));
    
    // Verificar si el usuario fue encontrado
    if (p == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        return; // Salir del método si no se encontró el usuario
    }
    
    // Continuar con la lógica solo si se encontró un usuario
    if ("Cajero".equals(p.getRol()) && ap.verificarCredenciales(txtFieldNombreUsuario.getText(), String.valueOf(txtFieldPassword.getPassword()))) {
        javax.swing.JOptionPane.showMessageDialog(this, "Bienvenido, " + txtFieldNombreUsuario.getText());
        this.setVisible(false);
        Inicio menuInicio = new Inicio();
        menuInicio.setVisible(true);
    } else if ("Administrador".equals(p.getRol()) && ap.verificarCredenciales(txtFieldNombreUsuario.getText(), String.valueOf(txtFieldPassword.getPassword()))) {
        javax.swing.JOptionPane.showMessageDialog(this, "Bienvenido, " + txtFieldNombreUsuario.getText());
        this.setVisible(false);
        PanelDeControlAdministrador pdca = new PanelDeControlAdministrador();
        pdca.setVisible(true);
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
    }
    
    }//GEN-LAST:event_lblIngresarMouseClicked

    private void txtFieldPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldPasswordMousePressed
        
        if(txtFieldNombreUsuario.getText().equals("")){
             txtFieldNombreUsuario.setText("Ingrese su nombre de usuario");
             txtFieldNombreUsuario.setForeground(Color.gray);
        }
         
        if(String.valueOf(txtFieldPassword.getPassword()).equals("********")){
            txtFieldPassword.setText("");
            txtFieldPassword.setForeground(Color.black); 
        }

    }//GEN-LAST:event_txtFieldPasswordMousePressed

    private void lblIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseExited
        panelIngresar.setBackground(new Color(226,200,204));
        lblIngresar.setForeground(Color.black);
    }//GEN-LAST:event_lblIngresarMouseExited

    private void txtFieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPasswordMouseClicked

    private void txtFieldNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNombreUsuarioActionPerformed

    private void txtFieldNombreUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldNombreUsuarioMousePressed
        // Verificar si el campo de nombre de usuario tiene el texto predeterminado
        if (txtFieldNombreUsuario.getText().equals("Ingrese su nombre de usuario")) {
            txtFieldNombreUsuario.setForeground(Color.black); 
            txtFieldNombreUsuario.setText("");  // Limpiar el texto
        }

        // Verificar si el campo de contraseña está vacío
        if (txtFieldPassword.getPassword().length == 0) {
            txtFieldPassword.setText("********");  // Mostrar placeholder
            txtFieldPassword.setForeground(Color.gray);  // Cambiar color a gris
        }

    }//GEN-LAST:event_txtFieldNombreUsuarioMousePressed

    private void txtFieldNombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldNombreUsuarioMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFieldNombreUsuarioMouseClicked

    private void lblRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseEntered
        lblRegistrarse.setForeground(new Color(255,205,109));
    }//GEN-LAST:event_lblRegistrarseMouseEntered

    private void lblRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseExited
        lblRegistrarse.setForeground(new Color(255,205,204));
    }//GEN-LAST:event_lblRegistrarseMouseExited

    private void lblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseClicked
        this.setVisible(false);
        RegistroCajeros objetoRegistroCajeros = new RegistroCajeros();
        objetoRegistroCajeros.setVisible(true);
        
        
    }//GEN-LAST:event_lblRegistrarseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraMovedora;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel imgHamburguesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JPanel panelExit;
    private vista.PanelRound panelIngresar;
    private vista.PanelRound panelPassword;
    private vista.PanelRound panelRound1;
    private vista.PanelRound panelUsuario;
    private javax.swing.JTextField txtFieldNombreUsuario;
    private javax.swing.JPasswordField txtFieldPassword;
    // End of variables declaration//GEN-END:variables
}
