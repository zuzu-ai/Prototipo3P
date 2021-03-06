package Final;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class infrm_Ventana4 extends javax.swing.JInternalFrame {


    public void tablas() {
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pstt4 = cn.prepareStatement("select * from asignacioncursosmastros");
            ResultSet rss4 = pstt4.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Maestro");
            modelo.addColumn("Curso");
            modelo.addColumn("Aula");
            modelo.addColumn("Sección");
            modelo.addColumn("Jornada");
            modelo.addColumn("Sede");
            modelo.addColumn("Carrera");
            tblTabla1.setModel(modelo);
            String[] dato = new String[7];
            while (rss4.next()) {
                dato[0] = rss4.getString(7);
                dato[1] = rss4.getString(6);
                dato[2] = rss4.getString(5);
                dato[3] = rss4.getString(4);
                dato[4] = rss4.getString(3);
                dato[5] = rss4.getString(2);
                dato[6] = rss4.getString(1);

                modelo.addRow(dato);
            }

        } catch (Exception e) {

        }
    }

    /**
     * Creates new form infrm_Ventana4
     */
    public infrm_Ventana4() {
        initComponents();
        tablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla1 = new javax.swing.JTable();

        lblNombre1.setText("jLabel13");

        lblNombre2.setText("jLabel13");

        lblNombre3.setText("jLabel14");

        setClosable(true);
        setIconifiable(true);
        setTitle("Reporte de Maestros Asignados");
        setVisible(true);

        tblTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Maestro", "Curso", "Aula", "Sección", "Jornada", "Sede", "Carrera"
            }
        ));
        jScrollPane1.setViewportView(tblTabla1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JTable tblTabla1;
    // End of variables declaration//GEN-END:variables
}
