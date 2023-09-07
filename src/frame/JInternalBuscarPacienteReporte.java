/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.DatosReporteSintomas;
import modelo.ProcesoReporteSintomas;

/**
 *
 * @author Holis
 */
public class JInternalBuscarPacienteReporte extends javax.swing.JInternalFrame {
    
    ProcesoReporteSintomas prs = new ProcesoReporteSintomas();
    DefaultTableModel modelo = new DefaultTableModel();
    
     TableRowSorter trs;
    public JInternalBuscarPacienteReporte() {
        initComponents();
        limpiarTabla();
        listarPacientesReportado();
    }

    private void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
            
        }
    }

    private void listarPacientesReportado() {
        List<DatosReporteSintomas> listVa = prs.listar();
        modelo = (DefaultTableModel) tbPacienteReportes.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < listVa.size(); i++) {
            ob[0] = listVa.get(i).getDrs_id();
            ob[1] = listVa.get(i).getDrs_CedulaPaciente();
            ob[2] = listVa.get(i).getDrs_NombresPacientes();
            ob[3] = listVa.get(i).getDrs_CodigoVacuna();
            ob[4] = listVa.get(i).getDrs_Sintomas();
            ob[5] = listVa.get(i).getDrs_Observacion();
            ob[6] = listVa.get(i).getDrs_FechaIngreso();
            ob[7] = listVa.get(i).getUsu_cedula();
            modelo.addRow(ob);
        }
        tbPacienteReportes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPacienteReportes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarReporte = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Buscar paciente con reportes");

        tbPacienteReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Cédula del paciente", "Nombres del paciente", "Código de vacuna", "Sintoma", "Observación", "Fecha de registro", "Cédula del médico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPacienteReportes);
        if (tbPacienteReportes.getColumnModel().getColumnCount() > 0) {
            tbPacienteReportes.getColumnModel().getColumn(0).setMinWidth(10);
            tbPacienteReportes.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbPacienteReportes.getColumnModel().getColumn(0).setMaxWidth(50);
            tbPacienteReportes.getColumnModel().getColumn(1).setMinWidth(50);
            tbPacienteReportes.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbPacienteReportes.getColumnModel().getColumn(1).setMaxWidth(150);
            tbPacienteReportes.getColumnModel().getColumn(2).setPreferredWidth(60);
            tbPacienteReportes.getColumnModel().getColumn(4).setPreferredWidth(12);
            tbPacienteReportes.getColumnModel().getColumn(5).setPreferredWidth(300);
            tbPacienteReportes.getColumnModel().getColumn(6).setPreferredWidth(10);
            tbPacienteReportes.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Ingrese la cédula del paciente");

        txtBuscarReporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBuscarReporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarReporteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarReporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarReporteKeyTyped
        txtBuscarReporte.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(txtBuscarReporte.getText(), 1));
            }
            
            
        });
        trs = new TableRowSorter(modelo);
        tbPacienteReportes.setRowSorter(trs);
    }//GEN-LAST:event_txtBuscarReporteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPacienteReportes;
    private javax.swing.JTextField txtBuscarReporte;
    // End of variables declaration//GEN-END:variables
}
