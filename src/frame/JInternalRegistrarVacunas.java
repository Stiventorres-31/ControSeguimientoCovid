/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.DatosVacunas;
import modelo.ProcesosVacunas;

/**
 *
 * @author Holis
 */
public class JInternalRegistrarVacunas extends javax.swing.JInternalFrame {

    DatosVacunas dv = new DatosVacunas();
    ProcesosVacunas pv = new ProcesosVacunas();

    public JInternalRegistrarVacunas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoRegistrarVacuna = new javax.swing.JTextField();
        txtNombreRegistrarVacunas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLaboratorioRegistrarVacuna = new javax.swing.JTextField();
        btnLimpiarCampoVacunas = new javax.swing.JButton();
        btnRegistrarVacuna = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar vacuna");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Código de vacuna");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        txtCodigoRegistrarVacuna.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigoRegistrarVacuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoRegistrarVacunaKeyPressed(evt);
            }
        });
        jPanel1.add(txtCodigoRegistrarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 200, 30));

        txtNombreRegistrarVacunas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNombreRegistrarVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de la vacuna");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Laboratorio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        txtLaboratorioRegistrarVacuna.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtLaboratorioRegistrarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 200, 30));

        btnLimpiarCampoVacunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnLimpiarCampoVacunas.setText("Limpiar");
        btnLimpiarCampoVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCampoVacunasActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarCampoVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 100, 30));

        btnRegistrarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca-de-verificacion.png"))); // NOI18N
        btnRegistrarVacuna.setText("Registrar");
        btnRegistrarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVacunaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void registrarVacunas() {
        if ("".equals(txtCodigoRegistrarVacuna.getText()) || "".equals(txtLaboratorioRegistrarVacuna.getText())
                || "".equals(txtNombreRegistrarVacunas.getText())) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos", "Registrar vacuna", JOptionPane.ERROR_MESSAGE);
        } else {
            dv = pv.buscarVacuna(Integer.parseInt(txtCodigoRegistrarVacuna.getText()));
            if (txtCodigoRegistrarVacuna.getText().equals(dv.getVcCodigo() + "")) {
                JOptionPane.showMessageDialog(null, "Este código ya esta registrado", "Registrar vacuna", JOptionPane.ERROR_MESSAGE);
            } else {
                dv.setVcCodigo(Integer.parseInt(txtCodigoRegistrarVacuna.getText().trim()));
                dv.setVcNombre(txtNombreRegistrarVacunas.getText().trim());
                dv.setVcLaboratorio(txtLaboratorioRegistrarVacuna.getText().trim());

                DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                String fecha_ahora_actual = dtf3.format(LocalDateTime.now());
                dv.setVcFechaIngreso(fecha_ahora_actual);

                dv.setVcUsado("No");
                pv.RegistrarVacunas(dv);
                JOptionPane.showMessageDialog(null, "Vacuna registrado exitosamente", "Registrar vacuna", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            }

        }
    }

    public void limpiarCampos() {
        txtCodigoRegistrarVacuna.setText("");
        txtLaboratorioRegistrarVacuna.setText("");
        txtNombreRegistrarVacunas.setText("");
        txtCodigoRegistrarVacuna.requestFocus();

        txtCodigoRegistrarVacuna.setEnabled(true);
        txtNombreRegistrarVacunas.setEnabled(true);
        txtLaboratorioRegistrarVacuna.setEnabled(true);
        btnRegistrarVacuna.setEnabled(true);
    }

    public void buscarVacuna() {
        /* if ("".equals(txtCodigoRegistrarVacuna.getText()) || "".equals(txtLaboratorioRegistrarVacuna.getText())
                || "".equals(txtNombreRegistrarVacunas.getText())) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos", "Registrar vacuna", JOptionPane.ERROR_MESSAGE);
        } else {
            
        }*/
        dv = pv.buscarVacuna(Integer.parseInt(txtCodigoRegistrarVacuna.getText()));
        if (!"".equals(dv.getVcNombre())) {
            txtNombreRegistrarVacunas.setText(dv.getVcNombre());
            txtLaboratorioRegistrarVacuna.setText(dv.getVcLaboratorio());
            txtCodigoRegistrarVacuna.setEnabled(false);
            txtNombreRegistrarVacunas.setEnabled(false);
            txtLaboratorioRegistrarVacuna.setEnabled(false);
            btnRegistrarVacuna.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Estos datos no podrán ser modificados", "Buscar vacunas", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void btnRegistrarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVacunaActionPerformed
        registrarVacunas();
    }//GEN-LAST:event_btnRegistrarVacunaActionPerformed

    private void btnLimpiarCampoVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCampoVacunasActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarCampoVacunasActionPerformed

    private void txtCodigoRegistrarVacunaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoRegistrarVacunaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dv = pv.buscarVacuna(Integer.parseInt(txtCodigoRegistrarVacuna.getText()));
            if (dv.getVcNombre() != null) {
                txtNombreRegistrarVacunas.setText(dv.getVcNombre());
                txtLaboratorioRegistrarVacuna.setText(dv.getVcLaboratorio());
                txtCodigoRegistrarVacuna.setEnabled(false);
                txtNombreRegistrarVacunas.setEnabled(false);
                txtLaboratorioRegistrarVacuna.setEnabled(false);
                btnRegistrarVacuna.setEnabled(false);

                JOptionPane.showMessageDialog(null, "Estos datos no podrán ser modificados", "Buscar vacunas", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCodigoRegistrarVacunaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarCampoVacunas;
    private javax.swing.JButton btnRegistrarVacuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigoRegistrarVacuna;
    private javax.swing.JTextField txtLaboratorioRegistrarVacuna;
    private javax.swing.JTextField txtNombreRegistrarVacunas;
    // End of variables declaration//GEN-END:variables
}
