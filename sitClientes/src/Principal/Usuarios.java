package Principal;

import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Usuarios extends javax.swing.JDialog {

    public void limpiar() {
        txtUsuarioN.setText("");
        txtContraN.setText("");
    }

    public Usuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuarioN = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtContraN = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear usuario");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/iconMenuUsuario.png"))); // NOI18N
        jLabel1.setText("USUARIOS");

        jLabel2.setText("USUARIO");

        jLabel3.setText("CONTRASEÑA");

        txtUsuarioN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioNKeyTyped(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/iconAgregar.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/Exit-48.png"))); // NOI18N
        btnSalir.setText("REGRESAR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtContraN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraNKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuarioN)
                    .addComponent(txtContraN, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuarioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addGap(30, 30, 30))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        usrEntrar regresar = new usrEntrar();
        regresar.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        usrEntrar regreso = new usrEntrar();  //Objeto nuevo del JFrame usrEntrar
        //Guardando datos obtenidos en TXT 
        String usuarioN = txtUsuarioN.getText(); //obteniendo datos ingresados por usuario
        String contraN = txtContraN.getText();//obteniendo datos ingresados por usuario

        String rutaUsr = "Usuario.dat";// Ruta y nombre del archivo que contiene al USR.
        String rutaPass = "Pass.dat"; //Ruta y noombre del archivo que contiene a la contraseña.

        File fPass = new File(rutaPass);
        File fUsr = new File(rutaUsr);

        if (usuarioN.equals("") || contraN.equals("")) { //sino hay contenido en los campos... 
            JOptionPane.showMessageDialog(null, "Escribe los datos que se te solicitan", "Información", JOptionPane.INFORMATION_MESSAGE);

        } else if (fPass.exists() && fUsr.exists()) {
            System.out.println("Creación existente");
            //El archivo existe por lo tanto sólo leerá el contenido del archivo

            try {  //Tratar de leer los archivos que contienen el USR y el PASS 

                //Leer el contenido del archivo Usuario
                FileInputStream leerUsr = new FileInputStream(rutaUsr);
                ObjectInputStream conUsr = new ObjectInputStream(leerUsr);
                String contenidoUsr = (String) conUsr.readObject();
                conUsr.close();

                //Leer el contenido del archivo Pass
                FileInputStream leerPass = new FileInputStream(rutaPass);
                ObjectInputStream conPass = new ObjectInputStream(leerPass);
                String contenidoPass = (String) conPass.readObject();
                conPass.close();

                if ((usuarioN.equals(contenidoUsr)) && (contraN.equals(contenidoPass))) {
                    JOptionPane.showMessageDialog(null, "El usuario y contraseña que ingresaste ya existen", "Notificación", JOptionPane.WARNING_MESSAGE);
                    regreso.setVisible(true);
                    dispose();

                } else {
                    FileOutputStream fw = new FileOutputStream(rutaUsr);
                    ObjectOutputStream salidaUsr = new ObjectOutputStream(fw);
                    salidaUsr.writeObject(usuarioN);
                    salidaUsr.close();

                    FileOutputStream fw2 = new FileOutputStream(rutaPass);//escribir en archivo lo que se ingrese como datos
                    ObjectOutputStream salidaPass = new ObjectOutputStream(fw2);
                    salidaPass.writeObject(contraN);
                    salidaPass.close();
                    //////////////////////////////////////////////////////////
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña creado, ahora puedes iniciar sesión", "Información", JOptionPane.INFORMATION_MESSAGE);

                    regreso.setVisible(true);
                    dispose();

                }
            } catch (IOException | ClassNotFoundException | HeadlessException e) {
                System.out.println(e.toString());
            }
        } else { //caso contrario, los archivos no existen entonces primero los creará y después los leerá 
            try {

                FileOutputStream fw = new FileOutputStream(rutaUsr);
                ObjectOutputStream salidaUsr = new ObjectOutputStream(fw);
                salidaUsr.writeObject(usuarioN);
                salidaUsr.close();

                FileOutputStream fw2 = new FileOutputStream(rutaPass);//escribir en archivo lo que se ingrese como datos
                ObjectOutputStream salidaPass = new ObjectOutputStream(fw2);
                salidaPass.writeObject(contraN);
                salidaPass.close();
                //////////////////////////////////////////////////////////
                //Lectura de archivo Usuario.dat
                FileInputStream leerUsr = new FileInputStream(rutaUsr);
                ObjectInputStream conUsr = new ObjectInputStream(leerUsr);
                String contenidoUsr = (String) conUsr.readObject();
                conUsr.close();

                //Leer el contenido del archivo Pass.dat
                FileInputStream leerPass = new FileInputStream(rutaPass);
                ObjectInputStream conPass = new ObjectInputStream(leerPass);
                String contenidoPass = (String) conPass.readObject();
                conPass.close();
                /////////////////////////////////////////////////////////////7

                JOptionPane.showMessageDialog(null, "Usuario y contraseña creado, ahora puedes iniciar sesión", "Información", JOptionPane.INFORMATION_MESSAGE);

                regreso.setVisible(true);
                dispose();

            } catch (IOException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error  " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtUsuarioNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioNKeyTyped
        //contenido es la variable que obtendrá lo que haya en la caja de texto
        char contenido = evt.getKeyChar();

        if (contenido == KeyEvent.VK_ENTER) {//compara si el evento ocurrido ha sido un enter
            btnAceptar.doClick();//ejecuta la opción llamando al botón asignado
        }
    }//GEN-LAST:event_txtUsuarioNKeyTyped

    private void txtContraNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraNKeyTyped
        //contenido es la variable que obtendrá lo que haya en la caja de texto
        char contenido = evt.getKeyChar();

        if (contenido == KeyEvent.VK_ENTER) {//compara si el evento ocurrido ha sido un enter
            btnAceptar.doClick();//ejecuta la opción llamando al botón asignado
        }
    }//GEN-LAST:event_txtContraNKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField txtContraN;
    public static javax.swing.JTextField txtUsuarioN;
    // End of variables declaration//GEN-END:variables
}
