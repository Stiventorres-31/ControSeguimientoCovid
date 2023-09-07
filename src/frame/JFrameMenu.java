/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Dimension;

public class JFrameMenu extends javax.swing.JFrame {

    JFrameLogin jfl = new JFrameLogin();

    public JFrameMenu() {
        initComponents();
        this.setExtendedState(JFrameMenu.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktopPrincipal = new javax.swing.JDesktopPane();
        Fondo = new javax.swing.JLabel();
        LbCedulaUsuarioIngresado = new javax.swing.JLabel();
        lbRolMenuPrincipal = new javax.swing.JLabel();
        JMenuBarPrincipal = new javax.swing.JMenuBar();
        JMenuRegistrar = new javax.swing.JMenu();
        JMenuPacientes = new javax.swing.JMenuItem();
        JMenuVacunas = new javax.swing.JMenuItem();
        JMenuRegistrarUsuarios = new javax.swing.JMenuItem();
        JMenuProcesoVacunacion = new javax.swing.JMenuItem();
        JMenuReportarSintomas = new javax.swing.JMenuItem();
        JMenuAnalizar = new javax.swing.JMenu();
        JMenuAnalizarUnPaciente = new javax.swing.JMenuItem();
        JMenuAnalizarPorFechas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMBuscarReportesPaciente = new javax.swing.JMenuItem();
        JMenuExportar = new javax.swing.JMenu();
        JMenuExportarAExcel = new javax.swing.JMenuItem();
        JMenuCerrarSesion = new javax.swing.JMenu();
        MenuItemCambiarClave = new javax.swing.JMenuItem();
        MenuItemCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setModalExclusionType(null);
        setName("JFrameMenuPrincipal"); // NOI18N
        setResizable(false);

        JDesktopPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MenuPrincipal.png"))); // NOI18N

        LbCedulaUsuarioIngresado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbCedulaUsuarioIngresado.setForeground(new java.awt.Color(255, 255, 255));

        JDesktopPrincipal.setLayer(Fondo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktopPrincipal.setLayer(LbCedulaUsuarioIngresado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktopPrincipal.setLayer(lbRolMenuPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDesktopPrincipalLayout = new javax.swing.GroupLayout(JDesktopPrincipal);
        JDesktopPrincipal.setLayout(JDesktopPrincipalLayout);
        JDesktopPrincipalLayout.setHorizontalGroup(
            JDesktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPrincipalLayout.createSequentialGroup()
                .addGroup(JDesktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDesktopPrincipalLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LbCedulaUsuarioIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JDesktopPrincipalLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(lbRolMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JDesktopPrincipalLayout.setVerticalGroup(
            JDesktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPrincipalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(LbCedulaUsuarioIngresado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRolMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JMenuRegistrar.setText("Registrar");
        JMenuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuRegistrarActionPerformed(evt);
            }
        });

        JMenuPacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        JMenuPacientes.setText("Registrar Pacientes");
        JMenuPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuPacientesActionPerformed(evt);
            }
        });
        JMenuRegistrar.add(JMenuPacientes);

        JMenuVacunas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        JMenuVacunas.setText("Registrar Vacunas");
        JMenuVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuVacunasActionPerformed(evt);
            }
        });
        JMenuRegistrar.add(JMenuVacunas);

        JMenuRegistrarUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        JMenuRegistrarUsuarios.setText("Registrar Usuarios");
        JMenuRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuRegistrarUsuariosActionPerformed(evt);
            }
        });
        JMenuRegistrar.add(JMenuRegistrarUsuarios);

        JMenuProcesoVacunacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        JMenuProcesoVacunacion.setText("Proceso de Vacunación");
        JMenuProcesoVacunacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuProcesoVacunacionActionPerformed(evt);
            }
        });
        JMenuRegistrar.add(JMenuProcesoVacunacion);

        JMenuReportarSintomas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        JMenuReportarSintomas.setText("Reportar Síntomas");
        JMenuReportarSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuReportarSintomasActionPerformed(evt);
            }
        });
        JMenuRegistrar.add(JMenuReportarSintomas);

        JMenuBarPrincipal.add(JMenuRegistrar);

        JMenuAnalizar.setText("Analizar");

        JMenuAnalizarUnPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        JMenuAnalizarUnPaciente.setText("Buscar el proceso de un paciente");
        JMenuAnalizarUnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuAnalizarUnPacienteActionPerformed(evt);
            }
        });
        JMenuAnalizar.add(JMenuAnalizarUnPaciente);

        JMenuAnalizarPorFechas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        JMenuAnalizarPorFechas.setText("Analizar por fechas");
        JMenuAnalizarPorFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuAnalizarPorFechasActionPerformed(evt);
            }
        });
        JMenuAnalizar.add(JMenuAnalizarPorFechas);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Analizar sintomas comunes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMenuAnalizar.add(jMenuItem1);

        JMBuscarReportesPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        JMBuscarReportesPaciente.setText("Buscar reportes de un paciente");
        JMBuscarReportesPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMBuscarReportesPacienteActionPerformed(evt);
            }
        });
        JMenuAnalizar.add(JMBuscarReportesPaciente);

        JMenuBarPrincipal.add(JMenuAnalizar);

        JMenuExportar.setText("Exportar");

        JMenuExportarAExcel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        JMenuExportarAExcel.setText("Exportar a Excel");
        JMenuExportarAExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuExportarAExcelActionPerformed(evt);
            }
        });
        JMenuExportar.add(JMenuExportarAExcel);

        JMenuBarPrincipal.add(JMenuExportar);

        JMenuCerrarSesion.setText("Perfil usuario");
        JMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCerrarSesionActionPerformed(evt);
            }
        });

        MenuItemCambiarClave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        MenuItemCambiarClave.setText("Cambiar contraseña");
        MenuItemCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCambiarClaveActionPerformed(evt);
            }
        });
        JMenuCerrarSesion.add(MenuItemCambiarClave);

        MenuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenuItemCerrarSesion.setText("Cerrar sesión");
        MenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCerrarSesionActionPerformed(evt);
            }
        });
        JMenuCerrarSesion.add(MenuItemCerrarSesion);

        JMenuBarPrincipal.add(JMenuCerrarSesion);

        setJMenuBar(JMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuPacientesActionPerformed
        /*JPanelFromRegistrarPacientes JPFRPaciente = new JPanelFromRegistrarPacientes();
       JPFRPaciente.setSize(1133, 630);
       JPanelPrincipal.removeAll();
       JPanelPrincipal.add(JPFRPaciente,BorderLayout.CENTER);
       JPanelPrincipal.revalidate();
       JPanelPrincipal.repaint();*/
        JInternalRegistrarPacientes JIRPaciente = new JInternalRegistrarPacientes();
        JDesktopPrincipal.add(JIRPaciente);
        JIRPaciente.setSize(1120, 520);
        //Centramos
        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIRPaciente.getSize();
        JIRPaciente.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        JIRPaciente.show();

    }//GEN-LAST:event_JMenuPacientesActionPerformed

    private void JMenuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuRegistrarActionPerformed

    }//GEN-LAST:event_JMenuRegistrarActionPerformed

    private void JMenuRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuRegistrarUsuariosActionPerformed
        JInternalRegistrarUsuarios JIRUsuarios = new JInternalRegistrarUsuarios();
        JDesktopPrincipal.add(JIRUsuarios);
        JIRUsuarios.setSize(1120, 520);
        //Centramos
        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIRUsuarios.getSize();
        JIRUsuarios.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        JIRUsuarios.show();
    }//GEN-LAST:event_JMenuRegistrarUsuariosActionPerformed

    private void JMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCerrarSesionActionPerformed

    }//GEN-LAST:event_JMenuCerrarSesionActionPerformed

    private void MenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCerrarSesionActionPerformed
        JFrameLogin login = new JFrameLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuItemCerrarSesionActionPerformed

    private void JMenuVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuVacunasActionPerformed
        JInternalRegistrarVacunas JIRVacunas = new JInternalRegistrarVacunas();
        JDesktopPrincipal.add(JIRVacunas);
        JIRVacunas.setSize(1120, 520);
        //Centramos
        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIRVacunas.getSize();
        JIRVacunas.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        JIRVacunas.show();
    }//GEN-LAST:event_JMenuVacunasActionPerformed

    private void MenuItemCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCambiarClaveActionPerformed
        JInternalCambiarClave JICClave = new JInternalCambiarClave();
        JDesktopPrincipal.add(JICClave);
        //JICClave.setSize(1120, 520);
        //Centramos
        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JICClave.getSize();
        JICClave.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        JICClave.show();
    }//GEN-LAST:event_MenuItemCambiarClaveActionPerformed

    private void JMenuProcesoVacunacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuProcesoVacunacionActionPerformed
        JInternalProcesoVacunacion JIPVacunacion = new JInternalProcesoVacunacion();
        JDesktopPrincipal.add(JIPVacunacion);
        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIPVacunacion.getSize();
        JIPVacunacion.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        JIPVacunacion.show();

    }//GEN-LAST:event_JMenuProcesoVacunacionActionPerformed

    private void JMenuAnalizarUnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuAnalizarUnPacienteActionPerformed
        JInternalBuscarPacienteVacunacion JIFBusqueda = new JInternalBuscarPacienteVacunacion();
        JDesktopPrincipal.add(JIFBusqueda);

        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIFBusqueda.getSize();
        JIFBusqueda.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        JIFBusqueda.show();
    }//GEN-LAST:event_JMenuAnalizarUnPacienteActionPerformed

    private void JMenuReportarSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuReportarSintomasActionPerformed
        JInternalReportarSintomas JIRSintomas = new JInternalReportarSintomas();
        JDesktopPrincipal.add(JIRSintomas);

        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIRSintomas.getSize();
        JIRSintomas.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        JIRSintomas.show();

    }//GEN-LAST:event_JMenuReportarSintomasActionPerformed

    private void JMenuAnalizarPorFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuAnalizarPorFechasActionPerformed
        JInternalBuscarFecha JIBFecha = new JInternalBuscarFecha();
        JDesktopPrincipal.add(JIBFecha);

        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIBFecha.getSize();
        JIBFecha.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        JIBFecha.show();
    }//GEN-LAST:event_JMenuAnalizarPorFechasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JInternalGraficaSintomasComunes JIGSComunes = new JInternalGraficaSintomasComunes();
        JDesktopPrincipal.add(JIGSComunes);
        
        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIGSComunes.getSize();
        JIGSComunes.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
        JIGSComunes.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void JMenuExportarAExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuExportarAExcelActionPerformed
       modelo.ExportarExcel.reporte();
    }//GEN-LAST:event_JMenuExportarAExcelActionPerformed

    private void JMBuscarReportesPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMBuscarReportesPacienteActionPerformed
        JInternalBuscarPacienteReporte JIBPReporte= new JInternalBuscarPacienteReporte();
        JDesktopPrincipal.add(JIBPReporte);
        Dimension desktopSize = JDesktopPrincipal.getSize();
        Dimension FrameSize = JIBPReporte.getSize();
        JIBPReporte.setLocation((desktopSize.width-FrameSize.width)/2, (desktopSize.height-FrameSize.height)/2);
        JIBPReporte.show();
    }//GEN-LAST:event_JMBuscarReportesPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public static javax.swing.JDesktopPane JDesktopPrincipal;
    private javax.swing.JMenuItem JMBuscarReportesPaciente;
    private javax.swing.JMenu JMenuAnalizar;
    private javax.swing.JMenuItem JMenuAnalizarPorFechas;
    private javax.swing.JMenuItem JMenuAnalizarUnPaciente;
    private javax.swing.JMenuBar JMenuBarPrincipal;
    private javax.swing.JMenu JMenuCerrarSesion;
    public static javax.swing.JMenu JMenuExportar;
    private javax.swing.JMenuItem JMenuExportarAExcel;
    private javax.swing.JMenuItem JMenuPacientes;
    private javax.swing.JMenuItem JMenuProcesoVacunacion;
    private javax.swing.JMenu JMenuRegistrar;
    public static javax.swing.JMenuItem JMenuRegistrarUsuarios;
    private javax.swing.JMenuItem JMenuReportarSintomas;
    public static javax.swing.JMenuItem JMenuVacunas;
    public static javax.swing.JLabel LbCedulaUsuarioIngresado;
    private javax.swing.JMenuItem MenuItemCambiarClave;
    private javax.swing.JMenuItem MenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JLabel lbRolMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
