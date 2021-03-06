/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import colas.ColaPrioridadBicola;

/**
 *
 * @author ING-JUANMATA
 */
public class Programa extends javax.swing.JFrame {

    ColaPrioridadBicola cp;

    /**
     * Creates new form Programa
     */
    public Programa() {
        initComponents();
        cp = new ColaPrioridadBicola(5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        cmbPrioridad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVista = new javax.swing.JTextArea();
        lblMensaje = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInserINI = new javax.swing.JButton();
        btnEliminarFin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUAN JESUS MATA SOLIS COLA PRIORIDAD BICOLA");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Dato:");

        txtDato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmbPrioridad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija prioridad", "Baja", "Media", "Alta" }));

        txtVista.setEditable(false);
        txtVista.setColumns(20);
        txtVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtVista.setRows(5);
        jScrollPane1.setViewportView(txtVista);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnInsertar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnInserINI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInserINI.setText("Insertar INI");
        btnInserINI.setEnabled(false);
        btnInserINI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserINIActionPerformed(evt);
            }
        });

        btnEliminarFin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarFin.setText("Eliminar FIN");
        btnEliminarFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInserINI)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarFin)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar)
                    .addComponent(btnEliminar)
                    .addComponent(btnInserINI)
                    .addComponent(btnEliminarFin))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (cmbPrioridad.getSelectedIndex() == 0) {
            lblMensaje.setText("FAVOR DE ELEGIR PRIORIDAD");
            return;
        }

        if (!cp.insertar(txtDato.getText().charAt(0), cmbPrioridad.getSelectedIndex())) {
            lblMensaje.setText("COLA LLENA");
            btnInserINI.setEnabled(true);
            return;
        }
        mostrar();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!cp.eliminar()) {
            lblMensaje.setText("COLA VACIA");
            btnInserINI.setEnabled(false);
            return;
        }
        mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInserINIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserINIActionPerformed
        if (cmbPrioridad.getSelectedIndex() == 0) {
            lblMensaje.setText("FAVOR DE ELEGIR PRIORIDAD");
            return;
        }

        if (!cp.insertarINI(txtDato.getText().charAt(0), cmbPrioridad.getSelectedIndex())) {
            lblMensaje.setText("COLA LLENA POR INICIO");
            return;
        }

        mostrar();
    }//GEN-LAST:event_btnInserINIActionPerformed

    private void btnEliminarFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFinActionPerformed
        if (!cp.EliminarFin()) {
            lblMensaje.setText("COLA VACIA");
            btnInserINI.setEnabled(false);
            return;
        }

        mostrar();
    }//GEN-LAST:event_btnEliminarFinActionPerformed

    private void mostrar() {
        String cad = "";
        if (cp.getIni() == -1) {
            txtVista.setText("");
            return;
        }
        for (int i = cp.getIni(); i <= cp.getFin(); i++) {
            cad += String.format("[%d] = [%s]", i, cp.getDato(i));
        }

        txtVista.setText(cad);
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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarFin;
    private javax.swing.JButton btnInserINI;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtDato;
    private javax.swing.JTextArea txtVista;
    // End of variables declaration//GEN-END:variables
}
