
package Interfaces.Insercion_eliminacion_y_busqueda_de_id;

import Interfaces.Menu;
import Clases.Movil;
import javax.swing.JOptionPane;

public class Busqueda_de_id_dispositivo_movil extends javax.swing.JFrame {

   
    Movil Objeto_de_registro;
    public Busqueda_de_id_dispositivo_movil() {
        initComponents();
        
        jPanel_de_DATOS_DE_REGISTRO.setVisible(false);
        Label_de_no_encontrado.setVisible(false);
    }
    
    public void establecer_instancia(Movil instancia)
    {
        Objeto_de_registro = instancia;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jPanel_de_DATOS_DE_REGISTRO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_de_sistema_operativo = new javax.swing.JTextField();
        campo_de_marca = new javax.swing.JTextField();
        campo_de_anio_de_creacion = new javax.swing.JTextField();
        Label_de_no_encontrado = new javax.swing.JLabel();
        campo_de_id_busqueda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese la identificación que desea buscar:");

        btn_volver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jPanel_de_DATOS_DE_REGISTRO.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_de_DATOS_DE_REGISTRO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Año de creación:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Sistema operativo:");

        campo_de_sistema_operativo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        campo_de_marca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        campo_de_anio_de_creacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel_de_DATOS_DE_REGISTROLayout = new javax.swing.GroupLayout(jPanel_de_DATOS_DE_REGISTRO);
        jPanel_de_DATOS_DE_REGISTRO.setLayout(jPanel_de_DATOS_DE_REGISTROLayout);
        jPanel_de_DATOS_DE_REGISTROLayout.setHorizontalGroup(
            jPanel_de_DATOS_DE_REGISTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_de_DATOS_DE_REGISTROLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_de_DATOS_DE_REGISTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_de_DATOS_DE_REGISTROLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(campo_de_sistema_operativo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_de_DATOS_DE_REGISTROLayout.createSequentialGroup()
                        .addGroup(jPanel_de_DATOS_DE_REGISTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_de_DATOS_DE_REGISTROLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_de_DATOS_DE_REGISTROLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(113, 113, 113)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_de_DATOS_DE_REGISTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_de_anio_de_creacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_de_marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel_de_DATOS_DE_REGISTROLayout.setVerticalGroup(
            jPanel_de_DATOS_DE_REGISTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_de_DATOS_DE_REGISTROLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel_de_DATOS_DE_REGISTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_de_DATOS_DE_REGISTROLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_de_DATOS_DE_REGISTROLayout.createSequentialGroup()
                        .addComponent(campo_de_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_de_anio_de_creacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_de_DATOS_DE_REGISTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_de_sistema_operativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        Label_de_no_encontrado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_de_no_encontrado.setForeground(new java.awt.Color(255, 0, 0));
        Label_de_no_encontrado.setText("* No hay datos para mostrar *");

        campo_de_id_busqueda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_de_id_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_de_id_busquedaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Identificación:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_de_id_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel_de_DATOS_DE_REGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Label_de_no_encontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campo_de_id_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Label_de_no_encontrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_de_DATOS_DE_REGISTRO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
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

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        Label_de_no_encontrado.setVisible(false);
        try
        {
            if(campo_de_id_busqueda.getText().isBlank())
            {
                throw new Exception();
            }
            
            int id_a_buscar = Integer.parseInt(campo_de_id_busqueda.getText());
            String datos_de_busqueda = Objeto_de_registro.Buscar_Id(id_a_buscar);

            if("No se encontraron datos para el Id especificado.".equals(datos_de_busqueda))
            {
                Label_de_no_encontrado.setVisible(true);
                jPanel_de_DATOS_DE_REGISTRO.setVisible(false);
            }else
            {
                Label_de_no_encontrado.setVisible(false);
                jPanel_de_DATOS_DE_REGISTRO.setVisible(true);
                String[] datos_extraidos = datos_de_busqueda.split("/");

                campo_de_marca.setText(datos_extraidos[1]);
                campo_de_anio_de_creacion.setText(datos_extraidos[2]);
                campo_de_sistema_operativo.setText(datos_extraidos[3]);
            }
        }    
        catch(NumberFormatException ext)
       {
           System.out.println("Excepción de tipo: "+ ext);
           
       }    
        catch(Exception ex)
        {
            Label_de_no_encontrado.setVisible(true);
            Label_de_no_encontrado.setText("Tiene que llenar el campo para poder hacer la busqueda.");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void campo_de_id_busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_de_id_busquedaKeyTyped
         
        Label_de_no_encontrado.setVisible(false);
        char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9')evt.consume();
    }//GEN-LAST:event_campo_de_id_busquedaKeyTyped

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Busqueda_de_id_dispositivo_movil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda_de_id_dispositivo_movil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda_de_id_dispositivo_movil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda_de_id_dispositivo_movil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda_de_id_dispositivo_movil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_de_no_encontrado;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campo_de_anio_de_creacion;
    private javax.swing.JTextField campo_de_id_busqueda;
    private javax.swing.JTextField campo_de_marca;
    private javax.swing.JTextField campo_de_sistema_operativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_de_DATOS_DE_REGISTRO;
    // End of variables declaration//GEN-END:variables
}
