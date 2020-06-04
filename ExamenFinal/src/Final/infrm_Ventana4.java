package Final;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class infrm_Ventana4 extends javax.swing.JInternalFrame {

    public void comboDB() {

        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select Nombre_Puesto from Puestos");
            ResultSet rs2 = pst2.executeQuery();

            cmbCombo1.addItem("Seleccione una opción");
            while (rs2.next()) {
                cmbCombo1.addItem(rs2.getString("Nombre_Puesto"));
            }

        } catch (Exception e) {

        }
    }

    public void comboDB1() {

        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select NombreExcpecion from Excepcion");
            ResultSet rs2 = pst2.executeQuery();

            cmbCombo2.addItem("Seleccione una opción");
            while (rs2.next()) {
                cmbCombo2.addItem(rs2.getString("NombreExcpecion"));
            }

        } catch (Exception e) {

        }
    }

    public void comboDB3() {

        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select NombreExcpecion from Excepcion");
            ResultSet rs2 = pst2.executeQuery();

            cmbCombo3.addItem("Seleccione una opción");
            while (rs2.next()) {
                cmbCombo3.addItem(rs2.getString("NombreExcpecion"));
            }

        } catch (Exception e) {

        }
    }

    public void comboDBT() {

        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);

            PreparedStatement pst = cn.prepareStatement("select NombreExcpecion from Excepcion");
            ResultSet rs = pst.executeQuery();

            cmbCombo1.addItem("Seleccione una opción");
            while (rs.next()) {
                cmbCombo1.addItem(rs.getString("NombreExcpecion"));
            }
            cmbCombo2.addItem("Seleccione una opción");
            while (rs.next()) {
                cmbCombo2.addItem(rs.getString("NombreExcpecion"));
            }
            cmbCombo3.addItem("Seleccione una opción");
            while (rs.next()) {
                cmbCombo3.addItem(rs.getString("NombreExcpecion"));
            }

        } catch (Exception e) {

        }
    }

    public void tablas() {
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pstt4 = cn.prepareStatement("select * from Aplicacion");
            ResultSet rss4 = pstt4.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Aplicacion");
            tblTabla1.setModel(modelo);
            String[] dato = new String[5];
            while (rss4.next()) {
                dato[0] = rss4.getString(1);
                dato[1] = rss4.getString(2);

                modelo.addRow(dato);
            }

        } catch (Exception e) {

        }

        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pstt4 = cn.prepareStatement("select * from Puestos");
            ResultSet rss4 = pstt4.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Puesto");
            tblTabla2.setModel(modelo);
            String[] dato = new String[5];
            while (rss4.next()) {
                dato[0] = rss4.getString(1);
                dato[1] = rss4.getString(2);

                modelo.addRow(dato);
            }

        } catch (Exception e) {

        }
    }

    public void buscar_nombrecombo1() {
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from Puestos where Codigo_Puesto = ?");

            pst.setString(1, lblCodigo1.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                lblNombre1.setText(rs.getString("Nombre_Puesto"));
                String pc = lblNombre1.getText();
                cmbCombo1.setSelectedItem(pc);

            } else {

            }

        } catch (Exception e) {

        }
    }

    public void buscar_nombrecombo2() {
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from Puestos where Codigo_Puesto = ?");

            pst.setString(1, lblCodigo2.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                lblNombre2.setText(rs.getString("Nombre_Puesto"));
                String pc = lblNombre2.getText();
                cmbCombo2.setSelectedItem(pc);

            } else {

            }

        } catch (Exception e) {

        }
    }

    public void buscar_nombrecombo3() {
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from Puestos where Codigo_Puesto = ?");

            pst.setString(1, lblCodigo3.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                lblNombre3.setText(rs.getString("Nombre_Puesto"));
                String pc = lblNombre3.getText();
                cmbCombo3.setSelectedItem(pc);

            } else {

            }

        } catch (Exception e) {

        }
    }

    /**
     * Creates new form infrm_Ventana4
     */
    public infrm_Ventana4() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDato9 = new javax.swing.JTextField();
        txtDato10 = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDato6 = new javax.swing.JTextField();
        txtDato1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDato8 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtbuscado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDato2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDato4 = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        txtDato5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDato3 = new javax.swing.JTextField();
        txtDato7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla2 = new javax.swing.JTable();
        cmbCombo1 = new javax.swing.JComboBox<>();
        cmbCombo2 = new javax.swing.JComboBox<>();
        cmbCombo3 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        lblCodigo1 = new javax.swing.JLabel();
        lblCodigo2 = new javax.swing.JLabel();
        lblCodigo3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        lblNombre1.setText("jLabel13");

        lblNombre2.setText("jLabel13");

        lblNombre3.setText("jLabel14");

        setClosable(true);
        setIconifiable(true);
        setVisible(true);

        jLabel2.setText("Carnet:");

        jLabel5.setText("Email:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel9.setText("Dato 7:");

        jLabel4.setText("Dirección:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel6.setText("Texto");

        jLabel3.setText("Teléfono:");

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtDato5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDato5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Dato 8:");

        jLabel7.setText("Status");

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel10.setText("Dato 10:");

        jLabel11.setText("Dato 9:");

        txtDato3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDato3ActionPerformed(evt);
            }
        });

        tblTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabla1);

        tblTabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblTabla2);

        cmbCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCombo1ActionPerformed(evt);
            }
        });

        cmbCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCombo2ActionPerformed(evt);
            }
        });

        cmbCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCombo3ActionPerformed(evt);
            }
        });

        jLabel12.setText("jLabel12");

        lblCodigo1.setText("Código");

        lblCodigo2.setText("Código");

        lblCodigo3.setText("Código");

        jLabel16.setText("jLabel16");

        jLabel17.setText("jLabel17");

        jLabel18.setText("Tabla 1");

        jLabel19.setText("Tabla 2");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel11))
                                                    .addGap(20, 20, 20))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(29, 29, 29))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDato7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDato8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDato9)
                                                .addComponent(txtDato10, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(cmbCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lblCodigo1)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cmbCombo3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cmbCombo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblCodigo2)
                                                    .addComponent(lblCodigo3)))))
                                    .addComponent(txtDato5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDato6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDato4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDato3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDato2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(txtDato1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)))
                        .addGap(27, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel6)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtDato3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtDato4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDato5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDato6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDato7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDato8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDato9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDato10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(lblCodigo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo2)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo3)
                            .addComponent(jLabel17))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpiar)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Alumnos values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, txtDato1.getText().trim());
            pst.setString(2, txtDato2.getText().trim());
            pst.setString(3, txtDato3.getText().trim());
            pst.setString(4, txtDato4.getText().trim());
            pst.setString(5, txtDato5.getText().trim());
            pst.setString(6, txtDato6.getText().trim());
            pst.setString(7, txtDato7.getText().trim());
            pst.setString(8, txtDato8.getText().trim());
            pst.setString(9, txtDato9.getText().trim());
            pst.setString(10, txtDato10.getText().trim());
            pst.setString(11, lblCodigo1.getText().trim());
            pst.setString(12, lblCodigo2.getText().trim());
            pst.setString(13, lblCodigo3.getText().trim());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            tablas();
            txtDato1.setText("");
            txtDato2.setText("");
            txtDato3.setText("");
            txtDato4.setText("");
            txtDato5.setText("");
            txtDato6.setText("");
            txtDato7.setText("");
            txtDato8.setText("");
            txtDato9.setText("");
            txtDato10.setText("");
            lblCodigo1.setText("Código");
            lblCodigo2.setText("Código");
            lblCodigo3.setText("Código");

            cmbCombo1.setSelectedIndex(0);
            cmbCombo2.setSelectedIndex(0);
            cmbCombo3.setSelectedIndex(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en registro", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from Alumnos where carnet_Alumnos =?");
            pst.setString(1, txtbuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtDato2.setText(rs.getString("nombre_Alumnos"));
                txtDato3.setText(rs.getString("direccion_Alumnos"));
                txtDato4.setText(rs.getString("telefono_Alumnos"));
                txtDato5.setText(rs.getString("email_Alumnos"));
                txtDato6.setText(rs.getString("status_Alumnos"));
                txtDato7.setText(rs.getString("dato1"));
                txtDato8.setText(rs.getString("dato2"));
                txtDato9.setText(rs.getString("dato3"));
                txtDato10.setText(rs.getString("dato4"));
                lblCodigo1.setText(rs.getString("cmb1"));
                lblCodigo2.setText(rs.getString("cmb2"));
                lblCodigo3.setText(rs.getString("cmb3"));

                buscar_nombrecombo1();
                buscar_nombrecombo2();
                buscar_nombrecombo3();

                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);
                btnRegistrar.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(this, "Cliente no registrado.", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Seleccion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Modificar
        try {
            String ID = txtbuscado.getText().trim();

            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("update Alumnos set  nombre_Alumnos = ?, direccion_Alumnos = ?, telefono_Alumnos = ?, email_Alumnos = ? , status_Alumnos= ?, dato1=?, dato2=?, dato3=?, dato4=?, combo1=?, combo2=?, combo3=? where carnet_Alumnos =" + ID);

            pst.setString(1, txtDato2.getText().trim());
            pst.setString(2, txtDato3.getText().trim());
            pst.setString(3, txtDato4.getText().trim());
            pst.setString(4, txtDato5.getText().trim());
            pst.setString(5, txtDato6.getText().trim());
            pst.setString(6, txtDato7.getText().trim());
            pst.setString(7, txtDato8.getText().trim());
            pst.setString(8, txtDato9.getText().trim());
            pst.setString(9, txtDato10.getText().trim());
            pst.setString(10, lblCodigo1.getText().trim());
            pst.setString(11, lblCodigo2.getText().trim());
            pst.setString(12, lblCodigo3.getText().trim());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtDato1.setText("");
            txtDato2.setText("");
            txtDato3.setText("");
            txtDato4.setText("");
            txtDato5.setText("");
            txtDato6.setText("");
            txtDato7.setText("");
            txtDato8.setText("");
            txtDato9.setText("");
            txtDato10.setText("");
            lblCodigo1.setText("Código");
            lblCodigo2.setText("Código");
            lblCodigo3.setText("Código");

            cmbCombo1.setSelectedIndex(0);
            cmbCombo2.setSelectedIndex(0);
            cmbCombo3.setSelectedIndex(0);

            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
            btnRegistrar.setEnabled(true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Modificacion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtDato5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDato5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDato5ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Eliminar
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);
            PreparedStatement pst = cn.prepareStatement("delete from Alumnos where carnet_Alumnos = ?");

            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtDato1.setText("");
            txtDato2.setText("");
            txtDato3.setText("");
            txtDato4.setText("");
            txtDato5.setText("");
            txtDato6.setText("");
            txtDato7.setText("");
            txtDato8.setText("");
            txtDato9.setText("");
            txtDato10.setText("");
            lblCodigo1.setText("Código");
            lblCodigo2.setText("Código");
            lblCodigo3.setText("Código");

            cmbCombo1.setSelectedIndex(0);
            cmbCombo2.setSelectedIndex(0);
            cmbCombo3.setSelectedIndex(0);

            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
            btnRegistrar.setEnabled(true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Eliminacion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDato3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDato3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDato3ActionPerformed

    private void cmbCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCombo1ActionPerformed
        // Obtener código 
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select Codigo_Puesto from Puestos where Nombre_Puesto = ?");

            pst2.setString(1, cmbCombo1.getSelectedItem().toString());

            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                lblCodigo1.setText(rs2.getString("Codigo_Puesto"));
            }
            if (cmbCombo1.getSelectedItem().toString().contains("Seleccione una opción")) {
                lblCodigo1.setText("Codigo");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_cmbCombo1ActionPerformed

    private void cmbCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCombo2ActionPerformed
        // Obtener código 
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select Codigo_Puesto from Puestos where Nombre_Puesto = ?");

            pst2.setString(1, cmbCombo2.getSelectedItem().toString());

            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                lblCodigo2.setText(rs2.getString("Codigo_Puesto"));
            }
            if (cmbCombo2.getSelectedItem().toString().contains("Seleccione una opción")) {
                lblCodigo2.setText("Codigo");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbCombo2ActionPerformed

    private void cmbCombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCombo3ActionPerformed
        // Obtener código 
        try {
            Connection cn = DriverManager.getConnection(mdiVentana.BD, mdiVentana.Usuario, mdiVentana.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select Codigo_Puesto from Puestos where Nombre_Puesto = ?");

            pst2.setString(1, cmbCombo3.getSelectedItem().toString());

            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                lblCodigo3.setText(rs2.getString("Codigo_Puesto"));
            }
            if (cmbCombo3.getSelectedItem().toString().contains("Seleccione una opción")) {
                lblCodigo3.setText("Codigo");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbCombo3ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Limpiar
        txtDato1.setText("");
        txtDato2.setText("");
        txtDato3.setText("");
        txtDato4.setText("");
        txtDato5.setText("");
        txtDato6.setText("");
        txtDato7.setText("");
        txtDato8.setText("");
        txtDato9.setText("");
        txtDato10.setText("");
        lblCodigo1.setText("Código");
        lblCodigo2.setText("Código");
        lblCodigo3.setText("Código");

        cmbCombo1.setSelectedIndex(0);
        cmbCombo2.setSelectedIndex(0);
        cmbCombo3.setSelectedIndex(0);

        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnRegistrar.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCombo1;
    private javax.swing.JComboBox<String> cmbCombo2;
    private javax.swing.JComboBox<String> cmbCombo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCodigo3;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JTable tblTabla1;
    private javax.swing.JTable tblTabla2;
    private javax.swing.JTextField txtDato1;
    private javax.swing.JTextField txtDato10;
    private javax.swing.JTextField txtDato2;
    private javax.swing.JTextField txtDato3;
    private javax.swing.JTextField txtDato4;
    private javax.swing.JTextField txtDato5;
    private javax.swing.JTextField txtDato6;
    private javax.swing.JTextField txtDato7;
    private javax.swing.JTextField txtDato8;
    private javax.swing.JTextField txtDato9;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
