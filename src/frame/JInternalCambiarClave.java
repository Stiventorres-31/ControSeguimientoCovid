package frame;

import javax.swing.JOptionPane;
import modelo.DatosUsuarios;
import modelo.ProcesoLoginUsuario;

/**
 *
 * @author Holis
 */
public class JInternalCambiarClave extends javax.swing.JInternalFrame {

    DatosUsuarios ds = new DatosUsuarios();
    ProcesoLoginUsuario plu = new ProcesoLoginUsuario();

    public JInternalCambiarClave() {
        initComponents();
    }

    public void actualizar() {
        if ("".equals(txtClaveNuevaClaveCambiarClave.getPassword()) || "".equals(txtConfirmarClaveCambiarClave.getPassword())
                || "".equals(txtClaveAntiguaClaveCambiarClave.getPassword())) {

            JOptionPane.showMessageDialog(null, "Hay campos en vacíos", "Actualizar contraseña", JOptionPane.WARNING_MESSAGE);

        } else {
            if (txtClaveAntiguaClaveCambiarClave.getPassword().length == 3) {
                if (txtClaveNuevaClaveCambiarClave.getPassword().length >= 4 && txtConfirmarClaveCambiarClave.getPassword().length >= 4) {

                    ds = plu.validarClave(Integer.parseInt(JFrameMenu.LbCedulaUsuarioIngresado.getText()));
                    System.out.println(ds.getLogin_Usuario_clave());
                    System.out.println(txtClaveAntiguaClaveCambiarClave.getPassword());
                    if (txtClaveAntiguaClaveCambiarClave.getText().equals(ds.getLogin_Usuario_clave())){
                        
                        if(txtClaveNuevaClaveCambiarClave.getText().equals(txtConfirmarClaveCambiarClave.getText())){
                            ds.setLogin_Usuario_clave(String.valueOf(txtClaveNuevaClaveCambiarClave.getPassword()).trim());
                            ds.setLogin_Usuario_cedula(Integer.parseInt(JFrameMenu.LbCedulaUsuarioIngresado.getText()));
                            plu.actualizarClave(ds);
                            JOptionPane.showMessageDialog(null, "Contraseña actualizado exitosamente", "Actualizar contraseña", JOptionPane.INFORMATION_MESSAGE);
                            limpiarCampos();
                        }else{
                            JOptionPane.showMessageDialog(null, "Contraseñas nuevas no coinciden", "Actualizar contraseña", JOptionPane.WARNING_MESSAGE);
                        }
                       
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña antigua no coinciden", "Actualizar contraseña", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Los campos deben tener 4 o más caracteres", "Actualizar contraseña", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "La clave antigua debe tener 3 caracteres", "Actualizar contraseña", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void limpiarCampos() {
        txtClaveNuevaClaveCambiarClave.setText("");
        txtConfirmarClaveCambiarClave.setText("");
        txtClaveAntiguaClaveCambiarClave.setText("");
        txtClaveAntiguaClaveCambiarClave.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCambiarClave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtConfirmarClaveCambiarClave = new javax.swing.JPasswordField();
        txtClaveAntiguaClaveCambiarClave = new javax.swing.JPasswordField();
        txtClaveNuevaClaveCambiarClave = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Contraseña nueva");

        btnCambiarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca-de-verificacion.png"))); // NOI18N
        btnCambiarClave.setText("Actualizar contraseña");
        btnCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarClaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Confirmar contraseña");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Escriba los 3 ultimos caracteres de la contraseña antigua");

        txtConfirmarClaveCambiarClave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtClaveAntiguaClaveCambiarClave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtClaveNuevaClaveCambiarClave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 103, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnCambiarClave)
                    .addComponent(txtConfirmarClaveCambiarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClaveAntiguaClaveCambiarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClaveNuevaClaveCambiarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtClaveAntiguaClaveCambiarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClaveNuevaClaveCambiarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmarClaveCambiarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnCambiarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarClaveActionPerformed
        actualizar();
    }//GEN-LAST:event_btnCambiarClaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtClaveAntiguaClaveCambiarClave;
    private javax.swing.JPasswordField txtClaveNuevaClaveCambiarClave;
    private javax.swing.JPasswordField txtConfirmarClaveCambiarClave;
    // End of variables declaration//GEN-END:variables
}
