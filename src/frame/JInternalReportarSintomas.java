/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import com.sun.glass.events.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.DatosReporteSintomas;
import modelo.DatosVacunacion;
import modelo.ProcesoReporteSintomas;

/**
 *
 * @author Asus
 */
public class JInternalReportarSintomas extends javax.swing.JInternalFrame {

    DatosVacunacion dv = new DatosVacunacion();
    DatosReporteSintomas drs = new DatosReporteSintomas();
    ProcesoReporteSintomas prs = new ProcesoReporteSintomas();

    public JInternalReportarSintomas() {
        initComponents();
    }

    public void limpiarCamposReportarSintomas() {
        txtCedulaPacienteSintomas.setText("");
        txtCodigoVacunaReporte.setText("");
        txtNombresPacienteSintomas.setText("");
        txtObservacionSintomas.setText("");
        txtCedulaPacienteSintomas.setEnabled(true);
        txtNombresPacienteSintomas.setEnabled(true);
        txtCodigoVacunaReporte.setEnabled(true);
    }

    private void registrar() {
        if ("".equals(txtCedulaPacienteSintomas.getText()) || "".equals(txtNombresPacienteSintomas.getText())
                || "".equals(txtObservacionSintomas.getText())) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos", "Registrar reportes de sintomas", JOptionPane.ERROR_MESSAGE);
        } else {
            drs.setDrs_CedulaPaciente(Integer.parseInt(txtCedulaPacienteSintomas.getText()));
            drs.setDrs_NombresPacientes(txtNombresPacienteSintomas.getText());
            drs.setDrs_CodigoVacuna(Integer.parseInt(txtCodigoVacunaReporte.getText()));
            drs.setDrs_Sintomas(cbSintomas.getSelectedItem().toString());
            drs.setDrs_Observacion(txtObservacionSintomas.getText());

            /**
             * *************************************
             * OBTENER FECHA ACTUAL **************************************
             */
            DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            String fecha_ahora_actual = dtf3.format(LocalDateTime.now());

            drs.setDrs_FechaIngreso(fecha_ahora_actual);

            drs.setUsu_cedula(Integer.parseInt(JFrameMenu.LbCedulaUsuarioIngresado.getText()));
            prs.registrarReporteSintomas(drs);
            JOptionPane.showMessageDialog(null, "Registrado exitosamente", "Registrar reportes de sintomas", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposReportarSintomas();
        }
    }

    private void buscarVacunacion() {
        if (!"".equals(txtCedulaPacienteSintomas.getText())) {

            dv = prs.buscarProcesoVacunaion(Integer.parseInt(txtCedulaPacienteSintomas.getText()));
            txtNombresPacienteSintomas.setText(dv.getPvc_nombres_paciente());
            txtCodigoVacunaReporte.setText(dv.getPvc_codigo_vacuna() + "");
            txtCedulaPacienteSintomas.setEnabled(false);
            txtNombresPacienteSintomas.setEnabled(false);
            txtCodigoVacunaReporte.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedulaPacienteSintomas = new javax.swing.JTextField();
        txtNombresPacienteSintomas = new javax.swing.JTextField();
        txtCodigoVacunaReporte = new javax.swing.JTextField();
        cbSintomas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacionSintomas = new javax.swing.JTextArea();
        btnRegistrarSintomas = new javax.swing.JButton();
        btnLimpiarCamposSintomas = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Reportar síntomas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cedula del paciente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del paciente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Codigo de vacuna");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Sintomas");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Observacion");

        txtCedulaPacienteSintomas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCedulaPacienteSintomas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaPacienteSintomasKeyPressed(evt);
            }
        });

        txtNombresPacienteSintomas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoVacunaReporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbSintomas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbSintomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiebre", "Vomito", "Diarrea", "Dolor de barriga" }));
        cbSintomas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtObservacionSintomas.setColumns(20);
        txtObservacionSintomas.setRows(5);
        jScrollPane1.setViewportView(txtObservacionSintomas);

        btnRegistrarSintomas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca-de-verificacion.png"))); // NOI18N
        btnRegistrarSintomas.setText("Registrar");
        btnRegistrarSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSintomasActionPerformed(evt);
            }
        });

        btnLimpiarCamposSintomas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpieza-de-datos.png"))); // NOI18N
        btnLimpiarCamposSintomas.setText("Limpiar");
        btnLimpiarCamposSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposSintomasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(btnRegistrarSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnLimpiarCamposSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtCedulaPacienteSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombresPacienteSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(txtCodigoVacunaReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(cbSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedulaPacienteSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombresPacienteSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoVacunaReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarCamposSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarCamposSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposSintomasActionPerformed
        // TODO add your handling code here:
        limpiarCamposReportarSintomas();

    }//GEN-LAST:event_btnLimpiarCamposSintomasActionPerformed

    private void btnRegistrarSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSintomasActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarSintomasActionPerformed

    private void txtCedulaPacienteSintomasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaPacienteSintomasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarVacunacion();
        }
    }//GEN-LAST:event_txtCedulaPacienteSintomasKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarCamposSintomas;
    private javax.swing.JButton btnRegistrarSintomas;
    private javax.swing.JComboBox<String> cbSintomas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCedulaPacienteSintomas;
    private javax.swing.JTextField txtCodigoVacunaReporte;
    private javax.swing.JTextField txtNombresPacienteSintomas;
    private javax.swing.JTextArea txtObservacionSintomas;
    // End of variables declaration//GEN-END:variables
}
