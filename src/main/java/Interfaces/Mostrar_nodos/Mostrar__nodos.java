
package Interfaces.Mostrar_nodos;


public class Mostrar__nodos extends javax.swing.JFrame {

    
    public Mostrar__nodos() {
        initComponents();
        
        campo_de_lista_de_hojas.setEditable(false);
        campo_de_tamanio_de_arbol.setEditable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Mensaje_de_tipo_de_nodo_a_mostrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_de_lista_de_hojas = new javax.swing.JTextPane();
        btn_de_cerrar = new javax.swing.JButton();
        campo_de_tamanio_de_arbol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Mensaje_de_tipo_de_nodo_a_mostrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Mensaje_de_tipo_de_nodo_a_mostrar.setText("Tipo de evento a solicitar");

        jScrollPane1.setViewportView(campo_de_lista_de_hojas);

        btn_de_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_de_cerrar.setText("Cerrar");
        btn_de_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_de_cerrarActionPerformed(evt);
            }
        });

        campo_de_tamanio_de_arbol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mensaje_de_tipo_de_nodo_a_mostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campo_de_tamanio_de_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btn_de_cerrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mensaje_de_tipo_de_nodo_a_mostrar)
                    .addComponent(campo_de_tamanio_de_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_de_cerrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_de_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_de_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_de_cerrarActionPerformed

    public void establecer_campos_mostrar_nodos( String Mensaje, String lista)
    {
       campo_de_tamanio_de_arbol.setVisible(false);
       campo_de_lista_de_hojas.setVisible(true);
       campo_de_lista_de_hojas.setText(lista);
       
       Mensaje_de_tipo_de_nodo_a_mostrar.setText(Mensaje);
    
    }
    
    public void establecer_campos_mostrar_nodos( String Mensaje, int tamanio)
    {
       campo_de_tamanio_de_arbol.setVisible(true);
       campo_de_lista_de_hojas.setVisible(false);
       campo_de_tamanio_de_arbol.setText(tamanio+"");
       
       Mensaje_de_tipo_de_nodo_a_mostrar.setText(Mensaje);
    
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar__nodos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje_de_tipo_de_nodo_a_mostrar;
    private javax.swing.JButton btn_de_cerrar;
    private javax.swing.JTextPane campo_de_lista_de_hojas;
    private javax.swing.JTextField campo_de_tamanio_de_arbol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
