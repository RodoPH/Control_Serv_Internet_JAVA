package Principal;

import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

public class usrEntrar extends javax.swing.JFrame {

    public usrEntrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsrAcceso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregarUsr = new javax.swing.JButton();
        txtPassAcceso = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtUsrAcceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsrAccesoKeyTyped(evt);
            }
        });

        jLabel1.setText("USUARIO");

        jLabel2.setText("CONTRASEÑA");

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/iconAcepta.png"))); // NOI18N
        btnIngresar.setText("ACEPTAR");
        btnIngresar.setToolTipText("Ingresar ");
        btnIngresar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), null));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/Exit-48.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setToolTipText("Cancelar, cierre del programa");
        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE)
            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        btnAgregarUsr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgregarUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/iconContacto.png"))); // NOI18N
        btnAgregarUsr.setText("Agregar Usuario");
        btnAgregarUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsrActionPerformed(evt);
            }
        });

        txtPassAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassAccesoActionPerformed(evt);
            }
        });
        txtPassAcceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassAccesoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsrAcceso)
                            .addComponent(txtPassAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnAgregarUsr)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsrAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPassAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ACCESO A CONTROL DE CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usr = txtUsrAcceso.getText();//Usuario Entrar
        String contrasena = txtPassAcceso.getText();//contraseña Entrar

        try {
            String rutaPass = "Pass.dat"; //Ruta y noombre del archivo que contiene a la contraseña.
            String rutaUsr = "Usuario.dat";// Ruta y nombre del archivo que contiene al USR.

            FileInputStream leerUsr = new FileInputStream(rutaUsr);
            ObjectInputStream conUsr = new ObjectInputStream(leerUsr);
            String contenidoUsr = (String) conUsr.readObject();
            conUsr.close();

            FileInputStream leerPass = new FileInputStream(rutaPass);
            ObjectInputStream conPass = new ObjectInputStream(leerPass);
            String contenidoPass = (String) conPass.readObject();
            conPass.close();

            if ((usr.equals("") && contrasena.equals("")) || (usr.equals("") || (contrasena.equals("")))) {
                JOptionPane.showMessageDialog(null, "Por favor escribe el usuario y contraseña solicitados", "Notificación", JOptionPane.WARNING_MESSAGE);
            }
            if ((!(usr.equals(contenidoUsr))) || (!(contrasena.equals(contenidoPass)))) {
                JOptionPane.showMessageDialog(null, "Los datos que ingresaste son inconrrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if ((usr.equals(contenidoUsr)) && (contrasena.equals(contenidoPass))) {

                JOptionPane.showMessageDialog(null, "Acceso permitido", "Acceso", JOptionPane.INFORMATION_MESSAGE);
                controlClientes acceso = new controlClientes();
                acceso.setVisible(true);
               
            }
        } catch (IOException | ClassNotFoundException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. \n\t Intenta CREAR USUARIO \n", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnAgregarUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsrActionPerformed
        Usuarios dialog = new Usuarios(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnAgregarUsrActionPerformed

    private void txtUsrAccesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsrAccesoKeyTyped
        //contenido es la variable que obtendrá lo que haya en la caja de texto
        char contenido = evt.getKeyChar();

        if (contenido == KeyEvent.VK_ENTER) {//compara si el evento ocurrido ha sido un enter
            btnIngresar.doClick();//ejecuta la opción llamando al botón asignado
        }
    }//GEN-LAST:event_txtUsrAccesoKeyTyped

    private void txtPassAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassAccesoActionPerformed

    private void txtPassAccesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassAccesoKeyTyped
        //contenido es la variable que obtendrá lo que haya en la caja de texto
        char contenido = evt.getKeyChar();

        if (contenido == KeyEvent.VK_ENTER) {//compara si el evento ocurrido ha sido un enter
            btnIngresar.doClick();//ejecuta la opción llamando al botón asignado
        }
    }//GEN-LAST:event_txtPassAccesoKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usrEntrar().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsr;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPasswordField txtPassAcceso;
    public static javax.swing.JTextField txtUsrAcceso;
    // End of variables declaration//GEN-END:variables
}
