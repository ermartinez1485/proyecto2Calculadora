package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casa
 */
public class Basica extends javax.swing.JFrame {

    protected Calculadora cal;
    protected List<String> operadores;
    

    public Basica() {
        initComponents();
        cal = new Calculadora();
        operadores = new ArrayList<String>();
        operadores.add("+");
        operadores.add("-");
        operadores.add("/");
        operadores.add("*");
        operadores.add("=");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtValores = new javax.swing.JFormattedTextField();
        txtMas = new javax.swing.JButton();
        txt8 = new javax.swing.JButton();
        txt7 = new javax.swing.JButton();
        txt9 = new javax.swing.JButton();
        txtMenos = new javax.swing.JButton();
        txtMulti = new javax.swing.JButton();
        txtDiv = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();
        txt4 = new javax.swing.JButton();
        txt5 = new javax.swing.JButton();
        txt6 = new javax.swing.JButton();
        txt1 = new javax.swing.JButton();
        txt2 = new javax.swing.JButton();
        txt3 = new javax.swing.JButton();
        txt0 = new javax.swing.JButton();
        txtIgual = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnBasica = new javax.swing.JMenuItem();
        btnCientifica = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMas.setText("+");
        txtMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMasActionPerformed(evt);
            }
        });

        txt8.setText("8");
        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });

        txt7.setText("7");
        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });

        txt9.setText("9");
        txt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt9ActionPerformed(evt);
            }
        });

        txtMenos.setText("-");
        txtMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenosActionPerformed(evt);
            }
        });

        txtMulti.setText("*");
        txtMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMultiActionPerformed(evt);
            }
        });

        txtDiv.setText("/");
        txtDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivActionPerformed(evt);
            }
        });

        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });

        txt4.setText("4");
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });

        txt5.setText("5");
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        txt6.setText("6");
        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });

        txt1.setText("1");
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.setText("2");
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.setText("3");
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        txt0.setText("0");
        txt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt0ActionPerformed(evt);
            }
        });

        txtIgual.setText("=");
        txtIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIgualActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");

        btnBasica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        btnBasica.setText("Basica");
        btnBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasicaActionPerformed(evt);
            }
        });
        jMenu1.add(btnBasica);

        btnCientifica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        btnCientifica.setText("Cientifica");
        btnCientifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCientificaActionPerformed(evt);
            }
        });
        jMenu1.add(btnCientifica);

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValores)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCientificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCientificaActionPerformed
        // TODO add your handling code here:
        Cientifica cien = new Cientifica();
        cien.setVisible(true);
        cien.dispose();
    }//GEN-LAST:event_btnCientificaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        numeroPulsado("7");
    }//GEN-LAST:event_txt7ActionPerformed

    private void txt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt0ActionPerformed
        numeroPulsado("0");
    }//GEN-LAST:event_txt0ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        numeroPulsado("4");
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        numeroPulsado("8");
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt9ActionPerformed
        numeroPulsado("9");
    }//GEN-LAST:event_txt9ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        numeroPulsado("5");
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        numeroPulsado("6");
    }//GEN-LAST:event_txt6ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        numeroPulsado("1");
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        numeroPulsado("2");
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        numeroPulsado("3");
    }//GEN-LAST:event_txt3ActionPerformed

    private void txtMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMasActionPerformed
        noOperadorRepetido("+",txtValores.getText());
    }//GEN-LAST:event_txtMasActionPerformed

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
        //noOperadorRepetido("CE",txtValores.getText());
        cal = new Calculadora();
        txtValores.setText("");
    }//GEN-LAST:event_txtLimpiarActionPerformed

    private void txtIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIgualActionPerformed
        //operacionPulsado("=");
        if (operadorValido(txtValores.getText())) {
            operacionPulsado("=");
        }
        //noOperadorRepetido("=",txtValores.getText());
    }//GEN-LAST:event_txtIgualActionPerformed

    private void txtMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenosActionPerformed
        noOperadorRepetido("-",txtValores.getText());
    }//GEN-LAST:event_txtMenosActionPerformed

    private void txtMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultiActionPerformed
        noOperadorRepetido("*",txtValores.getText());
    }//GEN-LAST:event_txtMultiActionPerformed

    private void txtDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivActionPerformed
        noOperadorRepetido("/",txtValores.getText());
    }//GEN-LAST:event_txtDivActionPerformed

    private void btnBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasicaActionPerformed
        // TODO add your handling code here:
        cal = new Calculadora();
        txtValores.setText("");
    }//GEN-LAST:event_btnBasicaActionPerformed

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
            java.util.logging.Logger.getLogger(Basica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basica().setVisible(true);
            }
        });
    }
    
    private void noOperadorRepetido(String op, String value) {

        if (!(value.equals(""))) {
            for (int i = 0; i < operadores.size(); i++) {
                String opIni = operadores.get(i);
                for (int j = 0; j < operadores.size(); j++) {
                    if (!(opIni.equals(op))) {
                        operacionPulsado(op);
                        txtValores.setText(op);
                    }
                }
            }
        }
    }
    
    private boolean operadorValido(String opV) {

        for (String operador : operadores) {
            if (operador.equals(opV)) {
                return false;
            }
        }
        return true;
    }

    private void operacionPulsado(String tecla) {
        switch (tecla) {
            case "=":
                calcularResultado();
                break;
            case "CE":
                cal.setResultado(0.0);
                txtValores.setText("");
                cal.setNuevaOperacion(true); 
                break;
            default:
                cal.setOperacion(tecla);
                if ((cal.getResultado() > 0) && !cal.isNuevaOperacion()) {
                    calcularResultado();
                } else if (operadorValido(txtValores.getText())){
                    Double resul = new Double(txtValores.getText());
                    cal.setResultado(resul);
                }
                break;
        }
        cal.setNuevaOperacion(true);
    }

    private void calcularResultado() {
        switch (cal.getOperacion()) {
            case "+":
                //resul += new Double(txtValores.getText());
                cal.sumar(new Double(txtValores.getText()));
                break;
            case "-":
                //resul -= new Double(txtValores.getText());
                cal.restar(new Double(txtValores.getText()));
                break;
            case "/":
                //resul /= new Double(txtValores.getText());
                cal.dividir(new Double(txtValores.getText()));
                break;
            case "*":
                //resul *= new Double(txtValores.getText());
                cal.multiplicar(new Double(txtValores.getText()));
                break;
        }
        txtValores.setText("" + cal.getResultado());
        cal.setOperacion("");
    }

    private void numeroPulsado(String digito) {
        if (txtValores.getText().equals("0") || cal.isNuevaOperacion()) {
            txtValores.setText(digito);
        } else {
            txtValores.setText(txtValores.getText() + digito);
        }
        cal.setNuevaOperacion(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnBasica;
    private javax.swing.JMenuItem btnCientifica;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton txt0;
    private javax.swing.JButton txt1;
    private javax.swing.JButton txt2;
    private javax.swing.JButton txt3;
    private javax.swing.JButton txt4;
    private javax.swing.JButton txt5;
    private javax.swing.JButton txt6;
    private javax.swing.JButton txt7;
    private javax.swing.JButton txt8;
    private javax.swing.JButton txt9;
    private javax.swing.JButton txtDiv;
    private javax.swing.JButton txtIgual;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JButton txtMas;
    private javax.swing.JButton txtMenos;
    private javax.swing.JButton txtMulti;
    private javax.swing.JFormattedTextField txtValores;
    // End of variables declaration//GEN-END:variables
}
