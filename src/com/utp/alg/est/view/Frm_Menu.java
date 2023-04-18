package com.utp.alg.est.view;

import com.utp.alg.est.controller.ArticuloController;
import com.utp.alg.est.controller.CategoriaController;
import com.utp.alg.est.controller.ClienteController;
import com.utp.alg.est.controller.ListaEntregaController;
import com.utp.alg.est.controller.LoginController;
import com.utp.alg.est.controller.MenuController;
import com.utp.alg.est.controller.RolController;
import com.utp.alg.est.controller.UsuarioController;
import com.utp.alg.est.controller.VentaController;

/**
 *
 * @author
 */
public class Frm_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Menu
     */
    public Frm_Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_Titulo = new javax.swing.JLabel();
        lbl_Fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_idUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_nomUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        men_sistema = new javax.swing.JMenu();
        men_logout = new javax.swing.JMenuItem();
        men_exit = new javax.swing.JMenuItem();
        men_registrar = new javax.swing.JMenu();
        men_venta = new javax.swing.JMenuItem();
        men_entrega = new javax.swing.JMenuItem();
        men_mantenimiento = new javax.swing.JMenu();
        men_articulo = new javax.swing.JMenuItem();
        men_categoria = new javax.swing.JMenuItem();
        men_cliente = new javax.swing.JMenuItem();
        menu_administar = new javax.swing.JMenu();
        men_usuario = new javax.swing.JMenuItem();
        men_rol = new javax.swing.JMenuItem();
        men_acerca = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenidos al Sistema Ventas");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_Titulo.setBackground(new java.awt.Color(255, 0, 51));
        lbl_Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Titulo.setText("SISTEMA DE VENTAS");

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tienda el pollo.png"))); // NOI18N
        lbl_Fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("USER NAME:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("USER ID :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(lbl_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_nomUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(lbl_idUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(lbl_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_Titulo)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_idUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_nomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)))
                .addComponent(lbl_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
        );

        men_sistema.setText("Sistema |");

        men_logout.setText("Logout");
        men_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_logoutActionPerformed(evt);
            }
        });
        men_sistema.add(men_logout);

        men_exit.setText("Exit");
        men_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_exitActionPerformed(evt);
            }
        });
        men_sistema.add(men_exit);

        jMenuBar1.add(men_sistema);

        men_registrar.setText("Registrar |");

        men_venta.setText("Venta");
        men_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_ventaActionPerformed(evt);
            }
        });
        men_registrar.add(men_venta);

        men_entrega.setText("Entrega");
        men_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_entregaActionPerformed(evt);
            }
        });
        men_registrar.add(men_entrega);

        jMenuBar1.add(men_registrar);

        men_mantenimiento.setText("Mantenimiento  |");

        men_articulo.setText("Articulo");
        men_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_articuloActionPerformed(evt);
            }
        });
        men_mantenimiento.add(men_articulo);

        men_categoria.setText("Categoria");
        men_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_categoriaActionPerformed(evt);
            }
        });
        men_mantenimiento.add(men_categoria);

        men_cliente.setText("Cliente");
        men_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_clienteActionPerformed(evt);
            }
        });
        men_mantenimiento.add(men_cliente);

        jMenuBar1.add(men_mantenimiento);

        menu_administar.setText("Administrar |");

        men_usuario.setText("Usuario");
        men_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_usuarioActionPerformed(evt);
            }
        });
        menu_administar.add(men_usuario);

        men_rol.setText("Rol del usuario");
        men_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_rolActionPerformed(evt);
            }
        });
        menu_administar.add(men_rol);

        jMenuBar1.add(menu_administar);

        men_acerca.setText("Acerca del Sistema");
        men_acerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                men_acercaMouseClicked(evt);
            }
        });
        jMenuBar1.add(men_acerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void men_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_articuloActionPerformed
        ArticuloController.callFrmArticulo();
    }//GEN-LAST:event_men_articuloActionPerformed

    private void men_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_usuarioActionPerformed
        UsuarioController.callFrmUsuario();
    }//GEN-LAST:event_men_usuarioActionPerformed

    private void men_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_rolActionPerformed
        RolController.callFrmRol();
    }//GEN-LAST:event_men_rolActionPerformed

    private void men_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_categoriaActionPerformed
        CategoriaController.callFrmCategoria();
    }//GEN-LAST:event_men_categoriaActionPerformed

    private void men_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_clienteActionPerformed
        ClienteController.callFrmCliente();
    }//GEN-LAST:event_men_clienteActionPerformed

    private void men_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_logoutActionPerformed

        this.dispose();
        LoginController.callFrmLogin();
    }//GEN-LAST:event_men_logoutActionPerformed

    private void men_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_exitActionPerformed
        dispose();
    }//GEN-LAST:event_men_exitActionPerformed

    private void men_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_ventaActionPerformed
        VentaController.callFrmVenta(lbl_idUsuario.getText(), lbl_nomUsuario.getText());
    }//GEN-LAST:event_men_ventaActionPerformed

    private void men_acercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_men_acercaMouseClicked
        MenuController.callFrmAbout();
    }//GEN-LAST:event_men_acercaMouseClicked

    private void men_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_entregaActionPerformed
        ListaEntregaController.callJDEntrega();
    }//GEN-LAST:event_men_entregaActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_Titulo;
    public javax.swing.JLabel lbl_idUsuario;
    public javax.swing.JLabel lbl_nomUsuario;
    private javax.swing.JMenu men_acerca;
    private javax.swing.JMenuItem men_articulo;
    private javax.swing.JMenuItem men_categoria;
    private javax.swing.JMenuItem men_cliente;
    private javax.swing.JMenuItem men_entrega;
    private javax.swing.JMenuItem men_exit;
    private javax.swing.JMenuItem men_logout;
    private javax.swing.JMenu men_mantenimiento;
    private javax.swing.JMenu men_registrar;
    private javax.swing.JMenuItem men_rol;
    private javax.swing.JMenu men_sistema;
    private javax.swing.JMenuItem men_usuario;
    private javax.swing.JMenuItem men_venta;
    public javax.swing.JMenu menu_administar;
    // End of variables declaration//GEN-END:variables
}
