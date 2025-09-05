package tp4.views;

import java.util.HashSet;
import tp4.entity.Alumno;
import tp4.entity.Materia;

/**
 *
 * @author Manuel Zuñiga
 */
public class FormularioInscripcionMateria extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alumnos;
    private HashSet<Materia> materias;

    public FormularioInscripcionMateria(HashSet<Alumno> alumnos, HashSet<Materia> materias) {
        initComponents();
        this.alumnos = alumnos;
        this.materias = materias;

        cargarMateriasEnCombo();
        cargarAlumnosEnCombo();

    }

    private void cargarMateriasEnCombo() {
        CboxMateria.removeAllItems();

        CboxMateria.addItem("Seleccionar materia");

        if (materias == null || materias.isEmpty()) {
            return;
        }

        java.util.List<Materia> lista = new java.util.ArrayList<>(materias);
        lista.sort(java.util.Comparator
                .comparingInt(Materia::getIdMateria));

        for (Materia m : lista) {
            CboxMateria.addItem(m.toString());
        }

        if (CboxMateria.getItemCount() > 0) {
            CboxMateria.setSelectedIndex(0);
        }
    }

    private void cargarAlumnosEnCombo() {
        CBoxAlumnos.removeAllItems();

        CBoxAlumnos.addItem("Seleccionar alumno");

        if (alumnos == null || alumnos.isEmpty()) {
            return;
        }

        java.util.List<Alumno> lista = new java.util.ArrayList<>(alumnos);
        lista.sort(java.util.Comparator
                .comparing(Alumno::getApellido, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Alumno::getNombre, String.CASE_INSENSITIVE_ORDER)
                .thenComparingInt(Alumno::getLegajo));

        for (Alumno a : lista) {
            CBoxAlumnos.addItem(a.toString());
        }
        if (CBoxAlumnos.getItemCount() > 0) {
            CBoxAlumnos.setSelectedIndex(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CboxMateria = new javax.swing.JComboBox<>();
        CBoxAlumnos = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setText("Elija una materia");

        jLabel3.setText("Elija un alumno");

        CboxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxMateriaActionPerformed(evt);
            }
        });

        CBoxAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBoxAlumnosActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInscribir)
                        .addGap(40, 40, 40)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CboxMateria, 0, 129, Short.MAX_VALUE)
                                .addComponent(CBoxAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CboxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(CBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnInscribir))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CboxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxMateriaActionPerformed
        if (CboxMateria.getItemCount() == 0) {
            CboxMateria.addItem("Seleccionar materia");
            if (materias != null && !materias.isEmpty()) {
                java.util.List<tp4.entity.Materia> lista = new java.util.ArrayList<>(materias);
                lista.sort(java.util.Comparator
                        .comparingInt(tp4.entity.Materia::getAnio)
                        .thenComparingInt(tp4.entity.Materia::getIdMateria));
                for (tp4.entity.Materia m : lista) {
                    CboxMateria.addItem(m.toString());
                }
            }
            CboxMateria.setSelectedIndex(0);
        }

    }//GEN-LAST:event_CboxMateriaActionPerformed

    private void CBoxAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBoxAlumnosActionPerformed
        // Si el combo está vacío, lo llenamos acá (por si no lo hiciste en el constructor)
        if (CBoxAlumnos.getItemCount() == 0) {
            CBoxAlumnos.addItem("Seleccionar alumno");
            if (alumnos != null && !alumnos.isEmpty()) {
                java.util.List<tp4.entity.Alumno> lista = new java.util.ArrayList<>(alumnos);
                lista.sort(java.util.Comparator
                        .comparing(tp4.entity.Alumno::getApellido, String.CASE_INSENSITIVE_ORDER)
                        .thenComparing(tp4.entity.Alumno::getNombre, String.CASE_INSENSITIVE_ORDER)
                        .thenComparingInt(tp4.entity.Alumno::getLegajo));
                for (tp4.entity.Alumno a : lista) {
                    CBoxAlumnos.addItem(a.toString());
                }
            }
            CBoxAlumnos.setSelectedIndex(0);
        }

    }//GEN-LAST:event_CBoxAlumnosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        if (CboxMateria.getItemCount() == 0) {
            CboxMateriaActionPerformed(null);
        }
        if (CBoxAlumnos.getItemCount() == 0) {
            CBoxAlumnosActionPerformed(null);
        }

        if (CboxMateria.getSelectedIndex() <= 0 || CBoxAlumnos.getSelectedIndex() <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Seleccione un alumno y una materia.",
                    "Datos incompletos",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String alumnoStr = String.valueOf(CBoxAlumnos.getSelectedItem());
        String materiaStr = String.valueOf(CboxMateria.getSelectedItem());

        tp4.entity.Alumno alumnoSel = null;
        for (tp4.entity.Alumno a : alumnos) {
            if (a.toString().equals(alumnoStr)) {
                alumnoSel = a;
                break;
            }
        }

        tp4.entity.Materia materiaSel = null;
        for (tp4.entity.Materia m : materias) {
            if (m.toString().equals(materiaStr)) {
                materiaSel = m;
                break;
            }
        }

        if (alumnoSel == null || materiaSel == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No se pudo recuperar alumno o materia seleccionados.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        int antes = alumnoSel.cantidadMaterias();
        alumnoSel.agregarMateria(materiaSel);
        int despues = alumnoSel.cantidadMaterias();

        if (despues > antes) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Inscripción exitosa:\n" + alumnoSel + "\n→ " + materiaSel,
                    "OK",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El alumno ya estaba inscripto en esa materia.",
                    "Aviso",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBoxAlumnos;
    private javax.swing.JComboBox<String> CboxMateria;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
