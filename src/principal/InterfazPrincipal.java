
package principal;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author MARLON
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    
    String Nombres [] = {
        "Alfredo","Diego","Sandra","Teresa","Hernan","Cristian","Carlos","Monica","Paloma","Juan","Marlon","Pedro","Gonzalo","Miguel","Angel","Tatiana",
        "Mauricio","Jose","Patricia","Pablo","Alberto","Carmen","Nanci","Sebastian","Andres","Andrea","Simon","Laura","Tomas","Henri","Julian","Lilian",
        "Paco","Santiago","Linibeth","Eucaris","Erica","Maria"
    };
    
    String ciudades[] ={
        "Cucuta","Bogota","Cali","Medellin","Bucaramanga","Cartagena","Barranquilla"
    };
    
    Conexion con;
    
    public InterfazPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        checkAgCajeros = new javax.swing.JCheckBox();
        checkAgClientes = new javax.swing.JCheckBox();
        txAgClientes = new javax.swing.JTextField();
        txAgCajeros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        checkBoClientes = new javax.swing.JCheckBox();
        checkBoCajeros = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checkAgCajeros.setText("Cajeros");
        checkAgCajeros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkAgCajerosItemStateChanged(evt);
            }
        });

        checkAgClientes.setText("Clientes");
        checkAgClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkAgClientesItemStateChanged(evt);
            }
        });

        txAgClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txAgClientesKeyTyped(evt);
            }
        });

        txAgCajeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txAgCajerosKeyTyped(evt);
            }
        });

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkAgClientes)
                            .addComponent(checkAgCajeros))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txAgClientes)
                            .addComponent(txAgCajeros, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton1)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAgClientes)
                    .addComponent(txAgClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAgCajeros)
                    .addComponent(txAgCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Agregar", jPanel4);

        checkBoClientes.setText("Clientes");

        checkBoCajeros.setText("Cajeros");

        jTextField3.setEnabled(false);

        jTextField4.setEnabled(false);

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoCajeros)
                            .addComponent(checkBoClientes))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton2)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(checkBoClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkBoCajeros)))
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Eliminar", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (checkAgClientes.isSelected()) {
            try {
                CrearClientes();
            } catch (Exception ex) {
                Logger.getLogger(InterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (checkAgCajeros.isSelected()) {
            try {
                CrearCajeros();
            } catch (Exception ex) {
                Logger.getLogger(InterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txAgClientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAgClientesKeyTyped
        int key = evt.getKeyChar();
        if ((Character.isDigit(evt.getKeyChar())) || (key == 8) || (key == 127)) {
            txAgClientes.setEditable(true);
        }
        else
        {
            txAgClientes.setEditable(false);
        }
    }//GEN-LAST:event_txAgClientesKeyTyped

    private void txAgCajerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAgCajerosKeyTyped
        int key = evt.getKeyChar();
        if ((Character.isDigit(evt.getKeyChar())) || (key == 8) || (key == 127)) {
            txAgCajeros.setEditable(true);
        }
        else
        {
            txAgCajeros.setEditable(false);
        }
    }//GEN-LAST:event_txAgCajerosKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (checkBoClientes.isSelected()) {
            try {
                BorrarClientes();
            } catch (Exception ex) {
                Logger.getLogger(InterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (checkBoCajeros.isSelected()) {
            try {
                BorrarCajeros();
            } catch (Exception ex) {
                Logger.getLogger(InterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void checkAgClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkAgClientesItemStateChanged
        
    }//GEN-LAST:event_checkAgClientesItemStateChanged

    private void checkAgCajerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkAgCajerosItemStateChanged
        
    }//GEN-LAST:event_checkAgCajerosItemStateChanged

        
    void CrearClientes() throws Exception
    {
        con = new Conexion();
        con.ConexionPostgres();
        String nuevos = "";
        int Cantidad = Integer.parseInt(txAgClientes.getText().trim());
        for (int i = 0; i < Cantidad; i++) {
            int PrimerNombre = (int) (Math.random() * Nombres.length);
            int SegundoNombre = (int) (Math.random() * Nombres.length);
            String NuevoNombre = Nombres[PrimerNombre] + " " + Nombres[SegundoNombre];
            int clave = (int) (Math.random()*1000000);
            int saldo = (int) (Math.random()*100000000);
            nuevos += "insert into clientes values ("+ clave +",'" + NuevoNombre + "',"+ saldo + ");\n";
        }
        con.actualizar(nuevos);
        con.cerrar();
    }
    
    void CrearCajeros() throws Exception
    {
        con = new Conexion();
        con.ConexionPostgres();
        String nuevos = "";
        int Cantidad = Integer.parseInt(txAgCajeros.getText().trim());
        for (int i = 0; i < Cantidad; i++) {
            int id = (int) (Math.random()*1000000);
            int ciudad = (int) (Math.random() * ciudades.length);
            int tipo = (int) (Math.random() * 2)+1;
            int dinero = (int) (Math.random() * 10000000);
            dinero = tipo == 2 ? (3 * dinero) : dinero;
            int maxima = tipo == 2 ? 90000000 : 30000000;
            nuevos += "insert into cajeros (id_cajero,ciudad,tipo_cajero,dinero,cantidad_maxima) values"
                    + "("+ id +",'" + ciudades[ciudad] + "',"+ tipo + ","+ dinero + "," + maxima + ");\n";
        }
        con.actualizar(nuevos);
        con.cerrar();
    }
    
    void BorrarClientes() throws Exception
    {
        con = new Conexion();
        con.ConexionPostgres();
        con.actualizar("delete from clientes");
        con.cerrar();
    }
    
    void BorrarCajeros() throws Exception
    {
        con = new Conexion();
        con.ConexionPostgres();
        con.actualizar("delete from cajeros");
        con.cerrar();
    }
    
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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkAgCajeros;
    private javax.swing.JCheckBox checkAgClientes;
    private javax.swing.JCheckBox checkBoCajeros;
    private javax.swing.JCheckBox checkBoClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txAgCajeros;
    private javax.swing.JTextField txAgClientes;
    // End of variables declaration//GEN-END:variables
}
