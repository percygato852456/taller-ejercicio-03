package CEjemplo;

import java.awt.Color;
import java.awt.Dimension;

public class CEjemplo01 extends javax.swing.JFrame {
    Operaciones objOpera = new Operaciones();

    public CEjemplo01() {
        initComponents();
        formulario();
    }
    
    private void formulario(){
        this.setTitle("Operaciones Matematicas");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(255 ,255, 255));
        this.panelOperaciones.setBackground(new Color(255 ,255, 255));
        this.panelDatos.setBackground(new Color(255 ,255, 255));
        this.setSize(new Dimension(500,400));
        this.txtNum1.requestFocus();
    }
    private void limpiarCampos() {
    txtNum1.setText("");
    txtNum2.setText("");
    txtSalida.setText("");
}
    
    private float leerNumero1(){
        float num;
        num = Float.parseFloat(this.txtNum1.getText().trim());
        return num;
    }
    private float leerNumero2(){
        float num;
        num = Float.parseFloat(this.txtNum2.getText().trim());
        return num;
    }
     private float leerNumero3(){
        float num;
        num = Float.parseFloat(this.txtNum3.getText().trim());
        return num;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelOperaciones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNum2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNum3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculos Estadisticos");
        jLabel1.setToolTipText("");

        btnCalcular.setBackground(new java.awt.Color(153, 255, 255));
        btnCalcular.setForeground(new java.awt.Color(204, 0, 0));
        btnCalcular.setMnemonic('C');
        btnCalcular.setText("Calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setDoubleBuffered(true);
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalcularMouseExited(evt);
            }
        });
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(153, 255, 255));
        btnNuevo.setForeground(new java.awt.Color(204, 0, 51));
        btnNuevo.setMnemonic('N');
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir.setForeground(new java.awt.Color(204, 0, 51));
        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Ingrese un Numero:");

        txtNum1.setForeground(new java.awt.Color(0, 51, 204));
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum1KeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Ingrese un Numero:");

        txtNum2.setForeground(new java.awt.Color(0, 51, 204));
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum2KeyTyped(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Ingrese un Numero:");

        txtNum3.setForeground(new java.awt.Color(0, 51, 204));
        txtNum3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum3KeyTyped(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(173, 173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked

    }//GEN-LAST:event_btnCalcularMouseClicked

    private void btnCalcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseEntered
this.btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 14));
    }//GEN-LAST:event_btnCalcularMouseEntered

    private void btnCalcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseExited
  this.btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 12));
    }//GEN-LAST:event_btnCalcularMouseExited

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        float num1, num2,num3;
        num1 = leerNumero1();
        num2 = leerNumero2();
        num3 = leerNumero3();
        float[] numeros = {num1, num2, num3};
        this.txtSalida.setText("\t Resutlado\n");
        this.txtSalida.setText("\t ------------\n");
        if (num2 != 0) {
        txtSalida.append("La media es: " + String.valueOf(objOpera.media(numeros)) + "\n");
        txtSalida.append("La mediana es: " + String.valueOf(objOpera.mediana(numeros)) + "\n");
        txtSalida.append("La moda es: " + String.valueOf(objOpera.moda(numeros)) + "\n");
        txtSalida.append("La varianza es: " + String.valueOf(objOpera.varianza(numeros)) + "\n");
        txtSalida.append("La desviación estándar es: " + String.valueOf(objOpera.desviacionEstandar(numeros)) + "\n");
        } 
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNum1KeyTyped

    private void txtNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyTyped

    }//GEN-LAST:event_txtNum2KeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtNum3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum3KeyTyped

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
            java.util.logging.Logger.getLogger(CEjemplo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CEjemplo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CEjemplo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CEjemplo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEjemplo01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
