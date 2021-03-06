/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdv_dall;

/**
 *
 * @author Daniela
 */
public class FrameApartado extends javax.swing.JFrame {

    /**
     * Creates new form FrameApartado
     */
    FrameDashboard frameDashboard;
    
    public FrameApartado() {
        initComponents();
    }

    
     public void setDashboardFrame(FrameDashboard frameDashboard){
        this.frameDashboard = frameDashboard;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelApartado = new javax.swing.JPanel();
        FrameApartado = new javax.swing.JLabel();
        BotonDashboard = new javax.swing.JButton();
        BotonClientes = new javax.swing.JButton();
        BotonSolicitudProveedores = new javax.swing.JButton();
        BotonProveedores = new javax.swing.JButton();
        BotonColaboradores = new javax.swing.JButton();
        BotonProductos = new javax.swing.JButton();
        BotonFactura = new javax.swing.JButton();
        BotonTienda = new javax.swing.JButton();
        BotonPedido = new javax.swing.JButton();
        BotonApartados = new javax.swing.JButton();
        LabelIDApartado = new javax.swing.JLabel();
        TextFieldIDApartado = new javax.swing.JTextField();
        LabelIDCliente = new javax.swing.JLabel();
        TextFieldIDCliente = new javax.swing.JTextField();
        LabelSaldo = new javax.swing.JLabel();
        TextFieldSaldo = new javax.swing.JTextField();
        LabelIDColaborador = new javax.swing.JLabel();
        TextFieldIDColaborador = new javax.swing.JTextField();
        TextFieldIDProducto = new javax.swing.JTextField();
        LabelIDProducto = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        TextFieldFecha = new javax.swing.JTextField();
        BotonImprimir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonAgregar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        LabelUsuario = new javax.swing.JLabel();
        BotonAbono = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelApartado.setPreferredSize(new java.awt.Dimension(1150, 600));

        FrameApartado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FrameApartado.setText("Apartados");

        BotonDashboard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonDashboard.setText("Dashboard");
        BotonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDashboardActionPerformed(evt);
            }
        });

        BotonClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonClientes.setText("Clientes");

        BotonSolicitudProveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonSolicitudProveedores.setText("Solicitud a Proveedores");
        BotonSolicitudProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSolicitudProveedoresActionPerformed(evt);
            }
        });

        BotonProveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonProveedores.setText("Proveedores");

        BotonColaboradores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonColaboradores.setText("Colaboradores");

        BotonProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonProductos.setText("Productos");

        BotonFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonFactura.setText("Factura");
        BotonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturaActionPerformed(evt);
            }
        });

        BotonTienda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonTienda.setText("Tienda");
        BotonTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTiendaActionPerformed(evt);
            }
        });

        BotonPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonPedido.setText("Pedido entre Tiendas");
        BotonPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidoActionPerformed(evt);
            }
        });

        BotonApartados.setBackground(new java.awt.Color(153, 153, 153));
        BotonApartados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonApartados.setText("Apartados");
        BotonApartados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonApartadosActionPerformed(evt);
            }
        });

        LabelIDApartado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelIDApartado.setText("ID Apartado");

        TextFieldIDApartado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldIDApartado.setText("jTextField1");

        LabelIDCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelIDCliente.setText("ID Cliente");

        TextFieldIDCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldIDCliente.setText("jTextField1");

        LabelSaldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelSaldo.setText("Saldo");

        TextFieldSaldo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldSaldo.setText("jTextField1");

        LabelIDColaborador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelIDColaborador.setText("ID Colaborador");

        TextFieldIDColaborador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldIDColaborador.setText("jTextField1");

        TextFieldIDProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldIDProducto.setText("jTextField1");

        LabelIDProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelIDProducto.setText("ID Producto");

        LabelFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelFecha.setText("Fecha");

        TextFieldFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldFecha.setText("jTextField1");

        BotonImprimir.setBackground(new java.awt.Color(0, 153, 102));
        BotonImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonImprimir.setForeground(new java.awt.Color(255, 255, 255));
        BotonImprimir.setText("Imprimir");

        BotonGuardar.setBackground(new java.awt.Color(255, 102, 0));
        BotonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setText("Guardar");

        BotonAgregar.setBackground(new java.awt.Color(51, 153, 0));
        BotonAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAgregar.setText("Agregar");

        BotonModificar.setBackground(new java.awt.Color(0, 51, 255));
        BotonModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificar.setText("Modificar");

        BotonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        BotonEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setText("Eliminar");

        LabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelUsuario.setText("Usuario");

        BotonAbono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonAbono.setText("Abonos");
        BotonAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbonoActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelApartadoLayout = new javax.swing.GroupLayout(PanelApartado);
        PanelApartado.setLayout(PanelApartadoLayout);
        PanelApartadoLayout.setHorizontalGroup(
            PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelApartadoLayout.createSequentialGroup()
                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelApartadoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelFecha)
                        .addGap(18, 18, 18))
                    .addGroup(PanelApartadoLayout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelIDApartado)
                            .addComponent(LabelIDCliente)
                            .addComponent(LabelSaldo)
                            .addComponent(LabelIDColaborador)
                            .addComponent(LabelIDProducto))
                        .addGap(18, 18, 18)
                        .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldIDColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldIDApartado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(TextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(PanelApartadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelApartadoLayout.createSequentialGroup()
                        .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FrameApartado, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelApartadoLayout.createSequentialGroup()
                                .addComponent(BotonDashboard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelApartadoLayout.createSequentialGroup()
                                        .addComponent(BotonSolicitudProveedores)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonApartados)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonAbono))
                                    .addGroup(PanelApartadoLayout.createSequentialGroup()
                                        .addComponent(BotonClientes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonProveedores)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonColaboradores)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonProductos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonFactura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonTienda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonPedido)
                                        .addGap(104, 104, 104)
                                        .addComponent(LabelUsuario)))))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelApartadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelApartadoLayout.createSequentialGroup()
                        .addComponent(BotonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonEliminar))
                    .addGroup(PanelApartadoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(BotonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonImprimir)))
                .addGap(262, 262, 262))
        );
        PanelApartadoLayout.setVerticalGroup(
            PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelApartadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FrameApartado)
                .addGap(24, 24, 24)
                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonDashboard)
                    .addComponent(BotonClientes)
                    .addComponent(BotonProveedores)
                    .addComponent(BotonColaboradores)
                    .addComponent(BotonProductos)
                    .addComponent(BotonFactura)
                    .addComponent(BotonTienda)
                    .addComponent(BotonPedido)
                    .addComponent(LabelUsuario))
                .addGap(31, 31, 31)
                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSolicitudProveedores)
                    .addComponent(BotonApartados)
                    .addComponent(BotonAbono))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelApartadoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelIDApartado)
                            .addComponent(TextFieldIDApartado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelIDCliente))
                        .addGap(18, 18, 18)
                        .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelSaldo)
                            .addComponent(TextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelIDColaborador)
                            .addComponent(TextFieldIDColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelApartadoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFecha)
                            .addComponent(TextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelIDProducto)
                    .addComponent(TextFieldIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonImprimir))
                .addGap(18, 18, 18)
                .addGroup(PanelApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonModificar)
                    .addComponent(BotonEliminar))
                .addGap(196, 196, 196))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelApartado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelApartado, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDashboardActionPerformed
        this.frameDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDashboardActionPerformed

    private void BotonSolicitudProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSolicitudProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSolicitudProveedoresActionPerformed

    private void BotonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonFacturaActionPerformed

    private void BotonTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonTiendaActionPerformed

    private void BotonPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPedidoActionPerformed

    private void BotonApartadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonApartadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonApartadosActionPerformed

    private void BotonAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAbonoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameApartado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameApartado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameApartado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameApartado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameApartado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbono;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonApartados;
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonColaboradores;
    private javax.swing.JButton BotonDashboard;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonFactura;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonImprimir;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonPedido;
    private javax.swing.JButton BotonProductos;
    private javax.swing.JButton BotonProveedores;
    private javax.swing.JButton BotonSolicitudProveedores;
    private javax.swing.JButton BotonTienda;
    private javax.swing.JLabel FrameApartado;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelIDApartado;
    private javax.swing.JLabel LabelIDCliente;
    private javax.swing.JLabel LabelIDColaborador;
    private javax.swing.JLabel LabelIDProducto;
    private javax.swing.JLabel LabelSaldo;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel PanelApartado;
    private javax.swing.JTextField TextFieldFecha;
    private javax.swing.JTextField TextFieldIDApartado;
    private javax.swing.JTextField TextFieldIDCliente;
    private javax.swing.JTextField TextFieldIDColaborador;
    private javax.swing.JTextField TextFieldIDProducto;
    private javax.swing.JTextField TextFieldSaldo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
