
package Interfaces.Insercion_eliminacion_y_busqueda_de_id;

import Clases.Movil;
import Interfaces.Menu;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Eliminacion extends javax.swing.JFrame {

    Movil Objeto_de_registro;
    
    private static int id_a_eliminar;
    public Eliminacion() 
    {
        initComponents();
        
         Label_de_Datos_de_registro.setVisible(false);
         btn_eliminar.setEnabled(false);
    }

    public void establecer_instancia(Movil instancia)
    {Objeto_de_registro = instancia;}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        Label_de_Datos_de_registro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_de_identificacion = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_volver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        Label_de_Datos_de_registro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_de_Datos_de_registro.setText("Datos del registro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Identificación:");

        campo_de_identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_de_identificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_de_identificacionKeyTyped(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Digite la identificación del registro que desea eliminar:");

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
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
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_de_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 158, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Label_de_Datos_de_registro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_de_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Label_de_Datos_de_registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel3)
                    .addContainerGap(210, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed

        Menu abrir = new Menu();
        abrir.establecer_instancia(Objeto_de_registro);
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        String mensaje_de_respuesta = Objeto_de_registro.Eliminar_nodo(id_a_eliminar);
        
        
        if(mensaje_de_respuesta != "No se puede eliminar el nodo porque tiene 2 hijos.")
        {
            Label_de_Datos_de_registro.setText(mensaje_de_respuesta);
            Label_de_Datos_de_registro.setForeground(Color.green);
            btn_eliminar.setEnabled(false);
        
            id_a_eliminar = 0;
        }
        else 
        {
            Label_de_Datos_de_registro.setText(mensaje_de_respuesta);
            Label_de_Datos_de_registro.setForeground(Color.red);
        }
       
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       
       try
       { 
           if(campo_de_identificacion.getText().isBlank())
            {
                throw new Exception("Primero tiene que llenar el campo de id");
            }
           
            Label_de_Datos_de_registro.setForeground(Color.black);
            String datos_de_busqueda;
            id_a_eliminar = Integer.parseInt(campo_de_identificacion.getText());
            
            
            datos_de_busqueda = Objeto_de_registro.Buscar_Id(id_a_eliminar);

            if(datos_de_busqueda != "No se encontraron datos para el Id especificado.")
            {
                String []arreglo = datos_de_busqueda.split("/");


                Label_de_Datos_de_registro.setVisible(true);
                Label_de_Datos_de_registro.setText("Id: "+arreglo[0]+" Marca: "+arreglo[1]+" Año: "+arreglo[2]+" S/O: "+ arreglo[3]);

                btn_eliminar.setEnabled(true);
            }else
            {
                Label_de_Datos_de_registro.setVisible(true);
                Label_de_Datos_de_registro.setText(datos_de_busqueda);
                Label_de_Datos_de_registro.setForeground(Color.blue);
            }
       
       }
        catch(NumberFormatException ext)
       {
           System.out.println("Excepción de tipo: "+ ext);
           
       }
       catch(Exception ex)
       {
           Label_de_Datos_de_registro.setVisible(true);
           Label_de_Datos_de_registro.setText(ex.getMessage());
           Label_de_Datos_de_registro.setForeground(Color.blue);
       }
      
        
       
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void campo_de_identificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_de_identificacionKeyTyped
       
        Label_de_Datos_de_registro.setVisible(false);
        char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9')evt.consume();
        
    }//GEN-LAST:event_campo_de_identificacionKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_de_Datos_de_registro;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campo_de_identificacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
