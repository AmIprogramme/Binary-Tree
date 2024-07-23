
package Interfaces.Insercion_eliminacion_y_busqueda_de_id;

import Interfaces.Menu;
import Clases.Movil;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Insercion extends javax.swing.JFrame {

    Movil Objeto_de_registro;
    
    public Insercion() {
        initComponents();
        
        quitar_mensajes();
                
    }

    public void establecer_instancia(Movil instancia)
    {Objeto_de_registro = instancia;}
    
    public void quitar_mensajes()
    {
 
        Mensaje_para_guardado_con_exito.setVisible(false);
    
    }
    
    public void mostrar_mensaje_de_guardado()
    {
        limpiar_campo();
        Mensaje_para_guardado_con_exito.setText("Los datos se guardaron con satisfacción. ");
        Mensaje_para_guardado_con_exito.setForeground(Color.green);
        
        Mensaje_para_guardado_con_exito.setVisible(true);
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_de_ano_creacion = new javax.swing.JTextField();
        campo_de_id = new javax.swing.JTextField();
        campo_de_marca = new javax.swing.JTextField();
        combo_de_sistema_operativo = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        Mensaje_para_guardado_con_exito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_volver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Marca:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Identificación:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Año de creación:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Sistema operativo:");

        campo_de_ano_creacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_de_ano_creacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_de_ano_creacionKeyTyped(evt);
            }
        });

        campo_de_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_de_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_de_idKeyTyped(evt);
            }
        });

        campo_de_marca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        combo_de_sistema_operativo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_de_sistema_operativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Android", "iOS", "Windows 10 Mobile", "Symbian OS", "Firefox OS", "Ubuntu Touch", "Harmony OS" }));

        btn_guardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        Mensaje_para_guardado_con_exito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Mensaje_para_guardado_con_exito.setForeground(new java.awt.Color(51, 255, 51));
        Mensaje_para_guardado_con_exito.setText("Los datos se guardaron con satisfacción.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(campo_de_ano_creacion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(combo_de_sistema_operativo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(Mensaje_para_guardado_con_exito)
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(campo_de_id, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(334, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(campo_de_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(391, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_de_ano_creacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_de_sistema_operativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(Mensaje_para_guardado_con_exito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(campo_de_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(campo_de_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(239, Short.MAX_VALUE)))
        );

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

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed

        Menu abrir = new Menu();
        abrir.establecer_instancia(Objeto_de_registro);
        
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        
        Mensaje_para_guardado_con_exito.setVisible(false);
        try
        {
            if(campo_de_id.getText().isBlank())
                {
                     throw new Exception("Por favor, tiene que llenar el campo de Identificación.");
                }

                int id = Integer.parseInt(campo_de_id.getText());
            
            String datos_de_busqueda = Objeto_de_registro.Buscar_Id(id);

            if("No se encontraron datos para el Id especificado.".equals(datos_de_busqueda))
            {
                
                
                String marca = campo_de_marca.getText();

                if(marca.isBlank())
                {
                    throw new Exception("Por favor, tiene que llenar el campo de marca.");
                }

                if(campo_de_ano_creacion.getText().isBlank())
                {
                    throw new Exception("Por favor, tiene que llenar el campo de año.");

                }else if(campo_de_ano_creacion.getText().length() != 4 )
                {
                    throw new Exception("La fecha tiene que ser de cuatro dígitos");
                }

                int anio = Integer.parseInt(campo_de_ano_creacion.getText().toString());


                String SO = String.valueOf(combo_de_sistema_operativo.getSelectedItem());


                Objeto_de_registro.insertar_datos(id, marca, anio, SO);
                
                mostrar_mensaje_de_guardado();
            }else
            {
                Mensaje_para_guardado_con_exito.setVisible(true);
                Mensaje_para_guardado_con_exito.setText("*No se puede registrar este id repetido ");
                Mensaje_para_guardado_con_exito.setForeground(Color.RED);
            }
            
        }
       catch (NumberFormatException e) 
       {
           System.out.println("Excepción de tipo: "+ e);
           
       }
        catch(Exception ex)
        {
           Mensaje_para_guardado_con_exito.setVisible(true);
           Mensaje_para_guardado_con_exito.setText(ex.getMessage());
           Mensaje_para_guardado_con_exito.setForeground(Color.RED);
        }
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    public void limpiar_campo()
    {
        campo_de_id.setText("");
        campo_de_marca.setText("");
        campo_de_ano_creacion.setText("");
        combo_de_sistema_operativo.setSelectedIndex(0);
        
    }
    
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        limpiar_campo();
        quitar_mensajes();
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void campo_de_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_de_idKeyTyped
       
        Mensaje_para_guardado_con_exito.setVisible(false);
        char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9')evt.consume(); 
    }//GEN-LAST:event_campo_de_idKeyTyped

    private void campo_de_ano_creacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_de_ano_creacionKeyTyped
      
        Mensaje_para_guardado_con_exito.setVisible(false);
        char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9')evt.consume(); 
    }//GEN-LAST:event_campo_de_ano_creacionKeyTyped

     
    
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
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insercion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje_para_guardado_con_exito;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campo_de_ano_creacion;
    private javax.swing.JTextField campo_de_id;
    private javax.swing.JTextField campo_de_marca;
    private javax.swing.JComboBox<String> combo_de_sistema_operativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
