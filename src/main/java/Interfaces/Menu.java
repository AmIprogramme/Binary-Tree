
package Interfaces;

import Clases.Movil;
import Interfaces.Insercion_eliminacion_y_busqueda_de_id.*;
import Interfaces.Mostrar_nodos.*;
import Interfaces.Recorridos.*;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    private Movil Objeto_de_registro;
    public Menu() {
        initComponents();
    }
    
    public void establecer_instancia(Movil instancia)
    {Objeto_de_registro = instancia;}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_insercion = new javax.swing.JButton();
        btn_eliminacion = new javax.swing.JButton();
        btn_busqueda_de_id_dispositivo_movil = new javax.swing.JButton();
        btn_Recorrido_IN_ORDEN = new javax.swing.JButton();
        btn_Recorrido_POST_ORDEN = new javax.swing.JButton();
        btn_Recorrido_PRE_ORDEN = new javax.swing.JButton();
        btn_Mostrar_altura_del_arbol = new javax.swing.JButton();
        btn_Mostrar_nodos_hojas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_insercion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_insercion.setText("Inserción");
        btn_insercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insercionActionPerformed(evt);
            }
        });

        btn_eliminacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_eliminacion.setText("Eliminación");
        btn_eliminacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminacionActionPerformed(evt);
            }
        });

        btn_busqueda_de_id_dispositivo_movil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_busqueda_de_id_dispositivo_movil.setText("Búsqueda de Id de un dispositivo móvil ");
        btn_busqueda_de_id_dispositivo_movil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busqueda_de_id_dispositivo_movilActionPerformed(evt);
            }
        });

        btn_Recorrido_IN_ORDEN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Recorrido_IN_ORDEN.setText("Recorrido IN-ORDEN ");
        btn_Recorrido_IN_ORDEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Recorrido_IN_ORDENActionPerformed(evt);
            }
        });

        btn_Recorrido_POST_ORDEN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Recorrido_POST_ORDEN.setText("Recorrido POST-ORDEN");
        btn_Recorrido_POST_ORDEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Recorrido_POST_ORDENActionPerformed(evt);
            }
        });

        btn_Recorrido_PRE_ORDEN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Recorrido_PRE_ORDEN.setText("Recorrido PRE-ORDEN");
        btn_Recorrido_PRE_ORDEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Recorrido_PRE_ORDENActionPerformed(evt);
            }
        });

        btn_Mostrar_altura_del_arbol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Mostrar_altura_del_arbol.setText("Mostrar altura del árbol ");
        btn_Mostrar_altura_del_arbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mostrar_altura_del_arbolActionPerformed(evt);
            }
        });

        btn_Mostrar_nodos_hojas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Mostrar_nodos_hojas.setText("Mostrar nodos hojas");
        btn_Mostrar_nodos_hojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mostrar_nodos_hojasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Recorrido_POST_ORDEN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                        .addComponent(btn_Mostrar_altura_del_arbol)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_busqueda_de_id_dispositivo_movil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_insercion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btn_eliminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Recorrido_IN_ORDEN)
                            .addComponent(btn_Recorrido_PRE_ORDEN))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(518, Short.MAX_VALUE)
                    .addComponent(btn_Mostrar_nodos_hojas)
                    .addGap(16, 16, 16)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insercion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_busqueda_de_id_dispositivo_movil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn_Recorrido_PRE_ORDEN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Recorrido_POST_ORDEN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mostrar_altura_del_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Recorrido_IN_ORDEN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(btn_Mostrar_nodos_hojas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insercionActionPerformed
        
        Insercion abrir = new Insercion();
        
        abrir.establecer_instancia(Objeto_de_registro);
        abrir.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_insercionActionPerformed

    private void btn_eliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminacionActionPerformed
        
        Eliminacion abrir = new Eliminacion();
        abrir.establecer_instancia(Objeto_de_registro);
        
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_eliminacionActionPerformed

    private void btn_busqueda_de_id_dispositivo_movilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busqueda_de_id_dispositivo_movilActionPerformed
        
        Busqueda_de_id_dispositivo_movil abrir = new Busqueda_de_id_dispositivo_movil();
        abrir.establecer_instancia(Objeto_de_registro);
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_busqueda_de_id_dispositivo_movilActionPerformed

    private void btn_Recorrido_PRE_ORDENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Recorrido_PRE_ORDENActionPerformed
        
       Panel_de_recorridos abrir = new Panel_de_recorridos();
       String tipo_de_recorrido = "Pre-Orden";
       String recorrido = Objeto_de_registro.Pre_Orden();
       abrir.establecer_tipo_de_recorrido_Y_datos(tipo_de_recorrido, recorrido);
         
       abrir.setVisible(true);
        
    }//GEN-LAST:event_btn_Recorrido_PRE_ORDENActionPerformed

    private void btn_Recorrido_POST_ORDENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Recorrido_POST_ORDENActionPerformed
       Panel_de_recorridos abrir = new Panel_de_recorridos();
        
       String tipo_de_recorrido = "Post-Orden";
       String recorrido = Objeto_de_registro.Post_orden();   
       abrir.establecer_tipo_de_recorrido_Y_datos(tipo_de_recorrido, recorrido);
        
       abrir.setVisible(true);
        
    }//GEN-LAST:event_btn_Recorrido_POST_ORDENActionPerformed

    private void btn_Recorrido_IN_ORDENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Recorrido_IN_ORDENActionPerformed
       
       Panel_de_recorridos abrir = new Panel_de_recorridos();
       String tipo_de_recorrido = "In-Orden";
       String recorrido = Objeto_de_registro.In_orden();
       abrir.establecer_tipo_de_recorrido_Y_datos(tipo_de_recorrido, recorrido);
        
       abrir.setVisible(true);
        
    }//GEN-LAST:event_btn_Recorrido_IN_ORDENActionPerformed

    private void btn_Mostrar_nodos_hojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mostrar_nodos_hojasActionPerformed
        
        Mostrar__nodos abrir = new Mostrar__nodos();
        String nodos_hoja = Objeto_de_registro.Encontrar_nodos_hoja_en_String();
        String mensaje = "Nodos hoja";
        
        abrir.establecer_campos_mostrar_nodos(mensaje, nodos_hoja);
        
        abrir.setVisible(true);
      
    }//GEN-LAST:event_btn_Mostrar_nodos_hojasActionPerformed

    private void btn_Mostrar_altura_del_arbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mostrar_altura_del_arbolActionPerformed
        
        Mostrar__nodos abrir = new Mostrar__nodos();
        int altura = Objeto_de_registro.Obtener_altura();
        String mensaje = "Altura del árbol:";
        
        abrir.establecer_campos_mostrar_nodos(mensaje, altura);
        
        abrir.setVisible(true);
        
    }//GEN-LAST:event_btn_Mostrar_altura_del_arbolActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Mostrar_altura_del_arbol;
    private javax.swing.JButton btn_Mostrar_nodos_hojas;
    private javax.swing.JButton btn_Recorrido_IN_ORDEN;
    private javax.swing.JButton btn_Recorrido_POST_ORDEN;
    private javax.swing.JButton btn_Recorrido_PRE_ORDEN;
    private javax.swing.JButton btn_busqueda_de_id_dispositivo_movil;
    private javax.swing.JButton btn_eliminacion;
    private javax.swing.JButton btn_insercion;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
