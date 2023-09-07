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
import modelo.DatosPacientes;
import modelo.DatosVacunacion;
import modelo.DatosVacunas;
import modelo.ProcesosPacientes;
import modelo.ProcesosVacunacion;
import modelo.ProcesosVacunas;

/**
 *
 * @author Holis
 */
public class JInternalProcesoVacunacion extends javax.swing.JInternalFrame {

    ProcesosPacientes pp = new ProcesosPacientes();
    DatosPacientes dp = new DatosPacientes();

    DatosVacunas dv = new DatosVacunas();
    ProcesosVacunas pv = new ProcesosVacunas();

    DatosVacunacion dvc = new DatosVacunacion();
    ProcesosVacunacion pvc = new ProcesosVacunacion();

    public JInternalProcesoVacunacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCedulaPacienteProcesoVacunacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombresPacienteProcesoVacunacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProcesoVacunacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombresVacunaProcesoVacunacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLaboratorioVacunaProcesoVacunacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDosisProcesoVacunacion = new javax.swing.JTextField();
        btnRegistrarProcesoVacunacion = new javax.swing.JButton();
        btnLimpiarCampoVacunacion = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Proceso de vacunación");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1120, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtCedulaPacienteProcesoVacunacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCedulaPacienteProcesoVacunacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaPacienteProcesoVacunacionKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cédula del paciente");

        txtNombresPacienteProcesoVacunacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombresPacienteProcesoVacunacion.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombres del paciente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Código de vacuna");

        txtCodigoProcesoVacunacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigoProcesoVacunacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProcesoVacunacionKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre de la vacuna");

        txtNombresVacunaProcesoVacunacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombresVacunaProcesoVacunacion.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Laboratorio");

        txtLaboratorioVacunaProcesoVacunacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLaboratorioVacunaProcesoVacunacion.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Dosis");

        txtDosisProcesoVacunacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRegistrarProcesoVacunacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca-de-verificacion.png"))); // NOI18N
        btnRegistrarProcesoVacunacion.setText("Registrar");
        btnRegistrarProcesoVacunacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProcesoVacunacionActionPerformed(evt);
            }
        });

        btnLimpiarCampoVacunacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnLimpiarCampoVacunacion.setText("Limpiar");
        btnLimpiarCampoVacunacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCampoVacunacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCedulaPacienteProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNombresPacienteProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtNombresVacunaProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtLaboratorioVacunaProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtDosisProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnRegistrarProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(btnLimpiarCampoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(txtNombresVacunaProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(txtCodigoProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(txtNombresPacienteProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(txtCedulaPacienteProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(txtLaboratorioVacunaProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(txtDosisProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRegistrarProcesoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiarCampoVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void registrarProcesoVacuna() {
        if ("".equals(txtNombresPacienteProcesoVacunacion.getText().trim()) || "".equals(txtCedulaPacienteProcesoVacunacion.getText().trim()) || "".equals(txtCodigoProcesoVacunacion.getText().trim())
                || "".equals(txtNombresVacunaProcesoVacunacion.getText().trim()) || "".equals(txtLaboratorioVacunaProcesoVacunacion.getText().trim()) || "".equals(txtDosisProcesoVacunacion.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos", "Registrar Proceso de vacuna", JOptionPane.WARNING_MESSAGE);
        } else {
            dvc.setPvc_cedula_paciente(Integer.parseInt(txtCedulaPacienteProcesoVacunacion.getText()));
            dvc.setPvc_nombres_paciente(txtNombresPacienteProcesoVacunacion.getText());
            dvc.setPvc_codigo_vacuna(Integer.parseInt(txtCodigoProcesoVacunacion.getText()));
            dvc.setPvc_nombre_vacuna(txtNombresVacunaProcesoVacunacion.getText());
            dvc.setPvc_laboratorio_vacuna(txtLaboratorioVacunaProcesoVacunacion.getText());
            dvc.setPvc_dosis(Integer.parseInt(txtDosisProcesoVacunacion.getText()));

            /**
             * *************************************
             * OBTENER FECHA ACTUAL **************************************
             */
            /*Calendar fecha = new GregorianCalendar();
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            // int hora = fecha.get(Calendar.HOUR);
            //int min = fecha.get(Calendar.MINUTE);
            //int seg = fecha.get(Calendar.SECOND);
            //String fecha_ahora_actual = (año + "/" + mes + "/" + dia + " " + hora + ":" + min + ":" + seg);
            String fecha_ahora_actual = (año + "-" + mes + "-" + dia);*/
            DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            //System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));
            String fecha_ahora_actual = dtf3.format(LocalDateTime.now());
            // java.util.Date fecha = new Date();
            //String fecha_ahora_actual = (fecha.format(getYear()+"-"+fecha.getDay()+"-"+fecha.getMonth());
            dvc.setPvc_fecha_registro(fecha_ahora_actual);
            System.out.println(JFrameMenu.LbCedulaUsuarioIngresado.getText());
            dvc.setPvc_cedula_usuario(Integer.parseInt(JFrameMenu.LbCedulaUsuarioIngresado.getText()));
            dv = pv.buscarVacuna(Integer.parseInt(txtCodigoProcesoVacunacion.getText()));
            if ("No".equals(dv.getVcUsado())) {
                dv.setVcCodigo(Integer.parseInt(txtCodigoProcesoVacunacion.getText()));
                dv.setVcUsado("Si");
                pvc.actualizarEstadoVacuna(dv);
                pvc.regisrarProcesoVacunacion(dvc);

                JOptionPane.showMessageDialog(null, "Registrado exitosamente", "Registrar Proceso de vacuna", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Esta vacuna ya ha sido usada", "Registrar Proceso de vacuna", JOptionPane.ERROR_MESSAGE);
                txtCodigoProcesoVacunacion.requestFocus();
            }
        }
    }

    public void limpiarCampos() {
        txtCedulaPacienteProcesoVacunacion.setText("");
        txtNombresPacienteProcesoVacunacion.setText("");
        txtCodigoProcesoVacunacion.setText("");
        txtNombresVacunaProcesoVacunacion.setText("");
        txtLaboratorioVacunaProcesoVacunacion.setText("");
        txtDosisProcesoVacunacion.setText("");
        txtCedulaPacienteProcesoVacunacion.requestFocus();
    }
    private void txtCedulaPacienteProcesoVacunacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaPacienteProcesoVacunacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dp = pp.BuscarDatos(Integer.parseInt(txtCedulaPacienteProcesoVacunacion.getText()));
            txtNombresPacienteProcesoVacunacion.setText(dp.getPcnombre());
            txtCodigoProcesoVacunacion.requestFocus();

        }
    }//GEN-LAST:event_txtCedulaPacienteProcesoVacunacionKeyPressed

    private void txtCodigoProcesoVacunacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProcesoVacunacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dv = pv.buscarVacuna(Integer.parseInt(txtCodigoProcesoVacunacion.getText()));
            txtNombresVacunaProcesoVacunacion.setText(dv.getVcNombre());
            txtLaboratorioVacunaProcesoVacunacion.setText(dv.getVcLaboratorio());
            txtDosisProcesoVacunacion.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoProcesoVacunacionKeyPressed

    private void btnLimpiarCampoVacunacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCampoVacunacionActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarCampoVacunacionActionPerformed

    private void btnRegistrarProcesoVacunacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProcesoVacunacionActionPerformed
        registrarProcesoVacuna();
    }//GEN-LAST:event_btnRegistrarProcesoVacunacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarCampoVacunacion;
    private javax.swing.JButton btnRegistrarProcesoVacunacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedulaPacienteProcesoVacunacion;
    private javax.swing.JTextField txtCodigoProcesoVacunacion;
    private javax.swing.JTextField txtDosisProcesoVacunacion;
    private javax.swing.JTextField txtLaboratorioVacunaProcesoVacunacion;
    private javax.swing.JTextField txtNombresPacienteProcesoVacunacion;
    private javax.swing.JTextField txtNombresVacunaProcesoVacunacion;
    // End of variables declaration//GEN-END:variables
}
