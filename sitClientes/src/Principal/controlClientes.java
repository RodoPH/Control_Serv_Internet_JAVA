package Principal;

import Personas.Clientes;
import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class controlClientes extends javax.swing.JFrame {

    ArrayList<Clientes> lista = new ArrayList<>();

    public controlClientes() {
        initComponents();

    }

    private void limpiarTxtCampos() {
        txtIP.setText("");
        txtNomCompleto.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }

    public void mostrar() {

        // Matriz para llenar el contenido de la tabla 
        String matriz[][] = new String[lista.size()][5];

        for (int i = 0; i < lista.size(); i++) {

            matriz[i][0] = lista.get(i).getIp();
            matriz[i][1] = lista.get(i).getNomCompleto();
            matriz[i][2] = lista.get(i).getTelCel();
            matriz[i][3] = lista.get(i).getDomicilio();
        }
        tablaClienteLlenado.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "IP", "NOMBRE COMPLETO", "DIRECCIÓN", "TELEFONO"
                }
        ));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBucar = new javax.swing.JButton();
        txtDato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIP = new javax.swing.JTextField();
        txtNomCompleto = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        comboMes = new javax.swing.JComboBox<>();
        txtFolio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEliminar1 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btbCobrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClienteLlenado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("DokChampa", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/User Group Man Woman-48.png"))); // NOI18N
        jLabel2.setText("USUARIOS");

        btnBucar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/iconBuscarLista2.png"))); // NOI18N
        btnBucar.setText("Buscar Cliente");
        btnBucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucarActionPerformed(evt);
            }
        });

        txtDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoActionPerformed(evt);
            }
        });
        txtDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDatoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR IP:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DIRECCIÓN:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TEL. CEL:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NOMBRE COMPLETO:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("IP:");

        txtIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPActionPerformed(evt);
            }
        });

        txtNomCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomCompletoActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/agregarClientes.png"))); // NOI18N
        btnAgregarCliente.setText("Agregar cliente");
        btnAgregarCliente.setToolTipText("Agregar un clientes");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        btnAgregarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnAgregarClienteKeyTyped(evt);
            }
        });

        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre" }));
        comboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mes:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Folio:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomCompleto)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDireccion)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(btnAgregarCliente)
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNomCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/Delete-48.png"))); // NOI18N
        btnEliminar1.setText("Eliminar cliente");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/Edit-48.png"))); // NOI18N
        btnActualizar.setText("Actualizar cliente");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btbCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/Money Bag-48.png"))); // NOI18N
        btbCobrar.setText("Cobrar");
        btbCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnEliminar1)
                .addGap(41, 41, 41)
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(btbCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnBucar)
                .addGap(54, 54, 54))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBucar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/Exit-48.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Cancelar, cierre del programa");
        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tablaClienteLlenado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "NOMBRE COMPLETO", "DIRECCIÓN", "TEL. CEL."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaClienteLlenado);
        if (tablaClienteLlenado.getColumnModel().getColumnCount() > 0) {
            tablaClienteLlenado.getColumnModel().getColumn(0).setMinWidth(10);
            tablaClienteLlenado.getColumnModel().getColumn(0).setPreferredWidth(60);
            tablaClienteLlenado.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed

        //Creación del objeto de tipo Clientes para pasar los parametros que requiere el constructor para ser usado 
        String ip = txtIP.getText();
        String nombreC = txtNomCompleto.getText();
        String dir = txtDireccion.getText();
        String tel = txtTelefono.getText();
        Clientes cliente = new Clientes(ip.toUpperCase(), nombreC.toUpperCase(), dir.toUpperCase(), tel.toUpperCase());

        lista.add(cliente);

        if ((ip.equals("")) || (nombreC.equals("")) || (dir.equals("")) || (tel.equals(""))) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa los datos que se solicitan", "Datos", JOptionPane.ERROR_MESSAGE);

        } else {

            String opciones[] = {"Elige una opción", "Misantla", "Crearte", "Tenoch y colorado"};
            String res = (String) JOptionPane.showInputDialog(null, "Selecciona la red del cliente", "Ubicación", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (res == opciones[1]) {

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection conexionBD = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                    java.sql.Statement statement = conexionBD.createStatement();

                    ((java.sql.Statement) statement).executeUpdate("insert into misantla (ip,nomCompleto,direccion,telefono) values('" + ip + "','" + nombreC + "','" + dir + "','" + tel + "') ");

                    mostrar();
                    conexionBD.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al momento de hacer conexión con la base de datos de Misantla", "INFORMACIÓN DE ERROR", JOptionPane.ERROR_MESSAGE);
                    System.err.println(e.getMessage());

                }
            }
            if (res == opciones[2]) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try (java.sql.Connection conexionBD = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "")) {
                        java.sql.Statement statement = conexionBD.createStatement();

                        ((java.sql.Statement) statement).executeUpdate("insert into crearte (ip,nomCompleto,direccion,telefono) values('" + ip + "','" + nombreC + "','" + dir + "','" + tel + "') ");

                        mostrar();
                        conexionBD.close();

                    }
                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al momento de hacer conexión con la base de datos de Crearte", "INFORMACIÓN DE ERROR", JOptionPane.ERROR_MESSAGE);
                    System.err.println(e.getMessage());

                }

            }
            if (res == opciones[3]) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection conexionBD = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                    java.sql.Statement statement = conexionBD.createStatement();

                    ((java.sql.Statement) statement).executeUpdate("insert into tenoch_y_colorado values('" + ip + "','" + nombreC + "','" + dir + "','" + tel + "') ");

                    mostrar();
                    conexionBD.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al momento de hacer conexión con la base de datos de Tenoch y colorado", "INFORMACIÓN DE ERROR", JOptionPane.ERROR_MESSAGE);
                    System.err.println(e.getMessage());

                }
            }

        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoActionPerformed

    }//GEN-LAST:event_txtDatoActionPerformed

    private void btnBucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucarActionPerformed
        String IP = txtDato.getText();
        String mes = (String) comboMes.getSelectedItem();

        String opciones[] = {"Elige una opción", "Misantla", "Crearte", "Tenoch y colorado"};

        String respuesta = (String) JOptionPane.showInputDialog(null, "Elije el lugar de red del ip", "Selección", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (respuesta == opciones[1]) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                java.sql.Statement statement = conexion.createStatement();
                ResultSet resultadoIp = statement.executeQuery("Select * from misantla where ip=" + IP);

                if (resultadoIp.next() == true) {//Si el ResultSet es verdadero entonces entra al ciclo 

                    //Asiganción de lo que se obtenga de la consulta
                    String datoIp = resultadoIp.getString("ip");
                    String datoNombre = resultadoIp.getString("nomCompleto");
                    String datoDir = resultadoIp.getString("direccion");
                    String datoTelefono = resultadoIp.getString("telefono");
                    String mesCon = resultadoIp.getString(mes);

                    //Muestra los datos obtenidos de la consulta en la cas cajas de texto
                    txtIP.setText(datoIp);
                    txtNomCompleto.setText(datoNombre);
                    txtDireccion.setText(datoDir);
                    txtTelefono.setText(datoTelefono);
                    txtFolio.setText(mesCon);

                    Object[][] datos = {{datoIp, datoNombre, datoDir, datoTelefono}};  //Arreglo Bidimencional donde asignamos lo obtenido en la consulta 

                    //Ciclo para llenar la Tabla con los datos obtenidos de la consulta SQL 
                    for (int i = 0; i < lista.size(); i++) {
                        datos[i][0] = lista.get(i).getIp();
                        datos[i][1] = lista.get(i).getNomCompleto();
                        datos[i][2] = lista.get(i).getDomicilio();
                        datos[i][3] = lista.get(i).getTelCel();
                       
                    }
                    tablaClienteLlenado.setModel(new javax.swing.table.DefaultTableModel(
                            datos,
                            new String[]{
                                "IP", "NOMBRE COMPLETO", "DIRECCIÓN", "TELEFONO" 
                            }
                    ));

                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra información de la IP que has ingresado", "INFORMACIÓN DE ERROR", JOptionPane.ERROR_MESSAGE);
                }
                conexion.close();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
        if (respuesta == opciones[2]) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                java.sql.Statement statement = conexion.createStatement();
                ResultSet resultadoIp = statement.executeQuery("Select * from crearte where ip=" + IP);

                if (resultadoIp.next() == true) {//Si el ResultSet es verdadero entonces entra al ciclo 

                    //Asiganción de lo que se obtenga de la consulta
                    String datoIp = resultadoIp.getString("ip");
                    String datoNombre = resultadoIp.getString("nomCompleto");
                    String datoDir = resultadoIp.getString("direccion");
                    String datoTelefono = resultadoIp.getString("telefono");

                    //Muestra los datos obtenidos de la consulta en la cas cajas de texto
                    txtIP.setText(datoIp);
                    txtNomCompleto.setText(datoNombre);
                    txtDireccion.setText(datoDir);
                    txtTelefono.setText(datoTelefono);

                    Object[][] datos = {{datoIp, datoNombre, datoDir, datoTelefono}};  //Arreglo Bidimencional donde asignamos lo obtenido en la consulta 

                    //Ciclo para llenar la Tabla con los datos obtenidos de la consulta SQL 
                    for (int i = 0; i < lista.size(); i++) {
                        datos[i][0] = lista.get(i).getIp();
                        datos[i][1] = lista.get(i).getNomCompleto();
                        datos[i][2] = lista.get(i).getDomicilio();
                        datos[i][3] = lista.get(i).getTelCel();
                    }
                    tablaClienteLlenado.setModel(new javax.swing.table.DefaultTableModel(
                            datos,
                            new String[]{
                                "IP", "NOMBRE COMPLETO", "DIRECCIÓN", "TELEFONO"
                            }
                    ));

                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra información de la IP que has ingresado", "INFORMACIÓN DE ERROR", JOptionPane.ERROR_MESSAGE);
                }
                conexion.close();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Crearte", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
        if (respuesta == opciones[3]) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                java.sql.Statement statement = conexion.createStatement();
                ResultSet resultadoIp = statement.executeQuery("Select * from tenoch_y_colorado where ip=" + IP);

                if (resultadoIp.next() == true) {//Si el ResultSet es verdadero, sí contiene algo entonces entra al ciclo 

                    //Asiganción de lo que se obtenga de la consulta
                    String datoIp = resultadoIp.getString("ip");
                    String datoNombre = resultadoIp.getString("nomCompleto");
                    String datoTelefono = resultadoIp.getString("telefono");
                    String datoDir = resultadoIp.getString("direccion");

                    //Muestra los datos obtenidos de la consulta en la    cajas de texto
                    txtIP.setText(datoIp);
                    txtNomCompleto.setText(datoNombre);
                    txtDireccion.setText(datoDir);
                    txtTelefono.setText(datoTelefono);

                    Object[][] datos = {{datoIp, datoNombre, datoDir, datoTelefono}};  //Arreglo Bidimencional donde asignamos lo obtenido en la consulta 

                    //Ciclo para llenar la Tabla con los datos obtenidos de la consulta SQL 
                    for (int i = 0; i < lista.size(); i++) {
                        datos[i][0] = lista.get(i).getIp();
                        datos[i][1] = lista.get(i).getNomCompleto();
                        datos[i][2] = lista.get(i).getDomicilio();
                        datos[i][3] = lista.get(i).getTelCel();
                    }
                    tablaClienteLlenado.setModel(new javax.swing.table.DefaultTableModel(
                            datos,
                            new String[]{
                                "IP", "NOMBRE COMPLETO", "DIRECCIÓN", "TELEFONO"
                            }
                    ));

                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra información de la IP que has ingresado", "INFORMACIÓN DE ERROR", JOptionPane.ERROR_MESSAGE);
                }
                conexion.close();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Crearte", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }

        }

    }//GEN-LAST:event_btnBucarActionPerformed

    private void txtDatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatoKeyTyped
        //contenido es la variable que obtendrá lo que haya en la caja de texto
        char contenido = evt.getKeyChar();

        if (contenido == KeyEvent.VK_ENTER) {//compara si el evento ocurrido ha sido un enter
            btnBucar.doClick();//ejecuta la opción llamando al botón asignado
        }
    }//GEN-LAST:event_txtDatoKeyTyped

    private void btnAgregarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAgregarClienteKeyTyped


    }//GEN-LAST:event_btnAgregarClienteKeyTyped

    private void txtIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPActionPerformed

    }//GEN-LAST:event_txtIPActionPerformed

    private void txtNomCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomCompletoActionPerformed

    }//GEN-LAST:event_txtNomCompletoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed

    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed

    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped

    }//GEN-LAST:event_txtDireccionKeyTyped

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String ip = txtIP.getText();
        String nomCompleto = txtNomCompleto.getText().toUpperCase();
        String direc = txtDireccion.getText().toUpperCase();
        String telefono = txtTelefono.getText();

        String opciones[] = {"Elige una opción", "Misantla", "Crearte", "Tenoch y colorado"};

        String respuesta = (String) JOptionPane.showInputDialog(null, "Elije el lugar de red del ip", "Selección", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (respuesta == opciones[1]) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                PreparedStatement pps = conexion.prepareStatement("UPDATE misantla SET ip ='" + ip + "', nomCompleto='" + nomCompleto + "', direccion='" + direc + "',telefono='" + telefono + "' WHERE ip ='" + ip + "' ");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                limpiarTxtCampos();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
        if (respuesta == opciones[2]) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                PreparedStatement pps = conexion.prepareStatement("UPDATE crearte SET ip ='" + ip + "', nomCompleto='" + nomCompleto + "', direccion='" + direc + "',telefono='" + telefono + "' WHERE ip ='" + ip + "' ");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                limpiarTxtCampos();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
        if (respuesta == opciones[3]) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                PreparedStatement pps = conexion.prepareStatement("UPDATE tenoch_y_colorado SET ip ='" + ip + "', nomCompleto='" + nomCompleto + "', direccion='" + direc + "',telefono='" + telefono + "' WHERE ip ='" + ip + "' ");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                limpiarTxtCampos();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }

        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed

        String ip = txtIP.getText();

        String opciones[] = {"Elige una opción", "Misantla", "Crearte", "Tenoch y colorado"};

        String respuesta = (String) JOptionPane.showInputDialog(null, "Elije el lugar de red del ip", "Selección", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (respuesta == opciones[1]) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                PreparedStatement pps = conexion.prepareStatement("DELETE FROM misantla WHERE ip='" + ip + "' ");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato eliminado", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                limpiarTxtCampos();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
        if (respuesta == opciones[2]) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                PreparedStatement pps = conexion.prepareStatement("DELETE FROM crearte WHERE ip='" + ip + "' ");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato eliminado", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                limpiarTxtCampos();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
        if (respuesta == opciones[3]) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                PreparedStatement pps = conexion.prepareStatement("DELETE FROM tenoch_y_colorado WHERE ip='" + ip + "' ");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato eliminado", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                limpiarTxtCampos();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }

        }


    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btbCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCobrarActionPerformed
        String mes = (String) comboMes.getSelectedItem();
        String ip = txtIP.getText();
        String folio = txtFolio.getText();

        String opciones[] = {"Elige una opción", "Misantla", "Crearte", "Tenoch y colorado"};

        String respuesta = (String) JOptionPane.showInputDialog(null, "Elije el lugar de red del ip", "Selección", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (respuesta == opciones[1]) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                PreparedStatement pps = conexion.prepareStatement("update misantla set " + mes + " = '" + folio + "' where ip =" + ip + " ");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro almacenado", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                limpiarTxtCampos();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
        if (respuesta == opciones[2]) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                PreparedStatement pps = conexion.prepareStatement("update crearte set " + mes + " = '" + folio + "' where ip =" + ip + " ");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro almacenado", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                limpiarTxtCampos();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
        if (respuesta == opciones[3]) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/servclientes", "root", "");
                PreparedStatement pps = conexion.prepareStatement("update tenoch_y_colorado set " + mes + " = '" + folio + "' where ip =" + ip + " ");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato eliminado", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                limpiarTxtCampos();
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar hacer conexión con la base de datos de Misantla", "ERROR BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }

        }


    }//GEN-LAST:event_btbCobrarActionPerformed

    private void comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesActionPerformed

    }//GEN-LAST:event_comboMesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbCobrar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBucar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaClienteLlenado;
    private javax.swing.JTextField txtDato;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtNomCompleto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
