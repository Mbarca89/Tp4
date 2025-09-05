package tp4.views;

import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

import tp4.entity.Materia;

public class ListadoMaterias extends javax.swing.JFrame {

    private final HashSet<Materia> materias;

    public ListadoMaterias(HashSet<Materia> materias) {
        this.materias = materias;
        initComponents();
        configurarTabla();
        cargarTabla();
    }

    private void configurarTabla() {
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"CodigoDeMateria", "NombreDeMateria", "AnioDeMateria"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        jtmaterias.setModel(model);
        jtmaterias.setAutoCreateRowSorter(true);
    }

    private void cargarTabla() {
        DefaultTableModel model = (DefaultTableModel) jtmaterias.getModel();

        java.util.List<Materia> lista = new java.util.ArrayList<>(materias);

        lista.sort(java.util.Comparator.comparing(
                Materia::getNombre,
                String.CASE_INSENSITIVE_ORDER
        ));

        model.setRowCount(0);

        for (Materia a : lista) {
            model.addRow(new Object[]{
                a.getIdMateria(),
                a.getNombre(),
                a.getAnio(),});
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtmaterias = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setRequestFocusEnabled(false);

        jtmaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo de Materia", "Nombre de Materia", "Año al que pertenece"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtmaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtmaterias;
    // End of variables declaration//GEN-END:variables
}
