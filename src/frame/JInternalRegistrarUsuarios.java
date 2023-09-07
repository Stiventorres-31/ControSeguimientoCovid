/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import static frame.JFrameMenu.JDesktopPrincipal;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.DatosUsuarios;
import modelo.ProcesoLoginUsuario;

/**
 *
 * @author Holis
 */
public class JInternalRegistrarUsuarios extends javax.swing.JInternalFrame {

    DatosUsuarios ds = new DatosUsuarios();
    ProcesoLoginUsuario plu = new ProcesoLoginUsuario();

    public JInternalRegistrarUsuarios() {
        initComponents();
        btnActualizarCamposRegistrarUsuarios.setEnabled(false);
    }

    public void limpiarCamposRegistrarUsuario() {
        txtCedulaRegistrarUsuario.setText("");
        txtNombreRegistrarUsuario.setText("");
        txtCorreoRegistrarUsuario.setText("");
        txtTelefonoRegistrarUsuario.setText("");
        txtUsuarioRegistrarUsuario.setText("");
        txtClaveRegistrarUsuario.setText("");
        txtCedulaRegistrarUsuario.requestFocus();

        txtCedulaRegistrarUsuario.setEnabled(true);
        btnRegistrarUsuario.setEnabled(true);
        btnActualizarCamposRegistrarUsuarios.setEnabled(false);
    }

    public void actualizarDatos() {
        if ("".equals(txtCedulaRegistrarUsuario.getText()) || "".equals(txtNombreRegistrarUsuario.getText()) || "".equals(txtCorreoRegistrarUsuario.getText())
                || "".equals(txtTelefonoRegistrarUsuario.getText()) || "".equals(txtUsuarioRegistrarUsuario.getText()) || "".equals(txtClaveRegistrarUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Los campos están vacíos", "Registrar Usuarios", JOptionPane.ERROR_MESSAGE);
        } else {
            ds.setLogin_Usuario_nombre(txtNombreRegistrarUsuario.getText());
            ds.setLogin_Usuario_correo(txtCorreoRegistrarUsuario.getText());
            ds.setLogin_Usuario_telefono(txtTelefonoRegistrarUsuario.getText());
            ds.setLogin_Usuario_usuario(txtUsuarioRegistrarUsuario.getText());
            ds.setLogin_Usuario_clave(txtClaveRegistrarUsuario.getText());
            ds.setLogin_Usuario_rol(cbRolesRegistrarUsuario.getSelectedItem().toString());
            ds.setLogin_Usuario_cedula(Integer.parseInt(txtCedulaRegistrarUsuario.getText()));
            plu.actualizarClave(ds);
            JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente", "Registrar Usuarios", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposRegistrarUsuario();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedulaRegistrarUsuario = new javax.swing.JTextField();
        txtNombreRegistrarUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCorreoRegistrarUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefonoRegistrarUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtClaveRegistrarUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnActualizarCamposRegistrarUsuarios = new javax.swing.JButton();
        btnRegistrarUsuario = new javax.swing.JButton();
        cbRolesRegistrarUsuario = new javax.swing.JComboBox<>();
        txtUsuarioRegistrarUsuario = new javax.swing.JTextField();
        btnBloquearUsuario = new javax.swing.JButton();
        btnLimpiarCamposRegistrarUsuarios = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Registrar Usuario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cédula");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtCedulaRegistrarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCedulaRegistrarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaRegistrarUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtCedulaRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 30));

        txtNombreRegistrarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNombreRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombres");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Correo electronico");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        txtCorreoRegistrarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCorreoRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, -1));

        txtTelefonoRegistrarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtTelefonoRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Rol");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        txtClaveRegistrarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtClaveRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        btnActualizarCamposRegistrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpieza-de-datos.png"))); // NOI18N
        btnActualizarCamposRegistrarUsuarios.setText("Actualizar");
        btnActualizarCamposRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCamposRegistrarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizarCamposRegistrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 110, 30));

        btnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca-de-verificacion.png"))); // NOI18N
        btnRegistrarUsuario.setText("Registrar");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 110, 30));

        cbRolesRegistrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbRolesRegistrarUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal medico", "Administrador" }));
        cbRolesRegistrarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbRolesRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbRolesRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 200, 30));

        txtUsuarioRegistrarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtUsuarioRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, 30));

        btnBloquearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bloquear.png"))); // NOI18N
        btnBloquearUsuario.setText("Bloquear");
        btnBloquearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloquearUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnBloquearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 100, 30));

        btnLimpiarCamposRegistrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpieza-de-datos.png"))); // NOI18N
        btnLimpiarCamposRegistrarUsuarios.setText("Limpiar");
        btnLimpiarCamposRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposRegistrarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarCamposRegistrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        if ("".equals(txtCedulaRegistrarUsuario.getText()) || "".equals(txtNombreRegistrarUsuario.getText())
                || "".equals(txtCorreoRegistrarUsuario.getText()) || "".equals(txtTelefonoRegistrarUsuario.getText())
                || "".equals(txtUsuarioRegistrarUsuario.getText()) || "".equals(txtClaveRegistrarUsuario.getText())) {

            JOptionPane.showMessageDialog(null, "Los campos están vacíos", "Registrar Usuarios", JOptionPane.ERROR_MESSAGE);
        } else {
            ds = plu.buscarUsuario(Integer.parseInt(txtCedulaRegistrarUsuario.getText()));
            System.out.println(ds.getLogin_Usuario_cedula());
            System.out.println(ds.getLogin_Usuario_usuario());
            if (txtCedulaRegistrarUsuario.getText().equals(ds.getLogin_Usuario_cedula())) {
                JOptionPane.showMessageDialog(null, "Esta cédua ya esta registrada", "Registrar Usuarios", JOptionPane.ERROR_MESSAGE);
            } else {
                if (txtUsuarioRegistrarUsuario.getText().equals(ds.getLogin_Usuario_usuario())) {
                    JOptionPane.showMessageDialog(null, "Esta usuario ya esta registrado", "Registrar Usuarios", JOptionPane.ERROR_MESSAGE);
                } else {
                    ds.setLogin_Usuario_cedula(Integer.parseInt(txtCedulaRegistrarUsuario.getText().trim()));
                    ds.setLogin_Usuario_nombre(txtNombreRegistrarUsuario.getText().trim());
                    ds.setLogin_Usuario_correo(txtCorreoRegistrarUsuario.getText().trim());
                    ds.setLogin_Usuario_telefono(txtTelefonoRegistrarUsuario.getText().trim());
                    ds.setLogin_Usuario_usuario(txtUsuarioRegistrarUsuario.getText().trim());
                    ds.setLogin_Usuario_clave(txtClaveRegistrarUsuario.getText().trim());
                    ds.setLogin_Usuario_rol(cbRolesRegistrarUsuario.getSelectedItem().toString());
                    ds.setLogin_Usuario_estado_cuenta("Activo");
                    plu.RegistrarUsuario(ds);
                    JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registrar Usuario", JOptionPane.INFORMATION_MESSAGE);
                    limpiarCamposRegistrarUsuario();
                }
            }

        }
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnActualizarCamposRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCamposRegistrarUsuariosActionPerformed
        actualizarDatos();
    }//GEN-LAST:event_btnActualizarCamposRegistrarUsuariosActionPerformed

    private void btnBloquearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearUsuarioActionPerformed
        /*JFrameBloqueoUsuario JFBUsuario = new JFrameBloqueoUsuario();
        JFBUsuario.setVisible(true);*/

        JInternalBloquearUsuario JIBUsuario = new JInternalBloquearUsuario();
        JDesktopPrincipal.add(JIBUsuario);
        //JIBUsuario.setSize(1120, 520);
        //Centramos
        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIBUsuario.getSize();
        JIBUsuario.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        JIBUsuario.show();
    }//GEN-LAST:event_btnBloquearUsuarioActionPerformed

    private void txtCedulaRegistrarUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaRegistrarUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ds = plu.buscarUsuario(Integer.parseInt(txtCedulaRegistrarUsuario.getText()));
            txtNombreRegistrarUsuario.setText(ds.getLogin_Usuario_nombre());
            txtCorreoRegistrarUsuario.setText(ds.getLogin_Usuario_correo());
            txtTelefonoRegistrarUsuario.setText(ds.getLogin_Usuario_telefono());
            txtUsuarioRegistrarUsuario.setText(ds.getLogin_Usuario_usuario());
            txtClaveRegistrarUsuario.setText(ds.getLogin_Usuario_clave());
            cbRolesRegistrarUsuario.setSelectedItem(ds.getLogin_Usuario_rol());

            btnActualizarCamposRegistrarUsuarios.setEnabled(true);
            txtCedulaRegistrarUsuario.setEnabled(false);
            btnRegistrarUsuario.setEnabled(false);

        }
    }//GEN-LAST:event_txtCedulaRegistrarUsuarioKeyPressed

    private void btnLimpiarCamposRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposRegistrarUsuariosActionPerformed
        limpiarCamposRegistrarUsuario();
    }//GEN-LAST:event_btnLimpiarCamposRegistrarUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCamposRegistrarUsuarios;
    private javax.swing.JButton btnBloquearUsuario;
    private javax.swing.JButton btnLimpiarCamposRegistrarUsuarios;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JComboBox<String> cbRolesRegistrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedulaRegistrarUsuario;
    private javax.swing.JTextField txtClaveRegistrarUsuario;
    private javax.swing.JTextField txtCorreoRegistrarUsuario;
    private javax.swing.JTextField txtNombreRegistrarUsuario;
    private javax.swing.JTextField txtTelefonoRegistrarUsuario;
    private javax.swing.JTextField txtUsuarioRegistrarUsuario;
    // End of variables declaration//GEN-END:variables
}
