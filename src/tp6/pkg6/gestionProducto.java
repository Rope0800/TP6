
package tp6.pkg6;

import javax.swing.JOptionPane;
import static tp6.pkg6.Menuu.listaProductos;


public class gestionProducto extends javax.swing.JInternalFrame {

    
    public gestionProducto() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbRubro = new javax.swing.JComboBox<>();
        jtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Precio");

        jLabel4.setText("Rubro");

        cbRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Elija una opcion", "COMESTIBLE", "LIMPIEZA", "PERFUMERIA" }));

        jLabel5.setText("Stock");

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBnuevo.setText("Agregar Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBnuevo)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbRubro, 0, 1, Short.MAX_VALUE)
                        .addGap(121, 121, 121))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jBeliminar)
                        .addGap(43, 43, 43)
                        .addComponent(jBguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jtDescripcion)
                            .addComponent(jtPrecio))
                        .addGap(39, 39, 39)
                        .addComponent(jBbuscar)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir)
                    .addComponent(jBnuevo))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
         try {
            int codigo = Integer.parseInt(jtCodigo.getText().trim());
            // el producto se va agregar solo si el codigo no existe y todos los datos estan completos. 
            boolean existe = false;
            for (Productos prod : Menuu.listaProductos) {
                if (prod.getCodigo() == codigo) {
                    jtCodigo.setText("");
                    existe = true;
                    JOptionPane.showMessageDialog(this, "Producto Existente: el código ya esta registrado\n"
                            + "Puede ingresar el código y modificar los datos del producto");
                }
            }
            //capturo los campos de texto en variables con el tipo de dato parseado:
            String descripcion = jtDescripcion.getText().trim();
            Double precio = Double.parseDouble(jtPrecio.getText().trim());
            int stock = Integer.parseInt(jtStock.getText().trim());
            String categoria = cbRubro.getSelectedItem().toString();

            if (categoria.equals("- Elija una opcion")) {
                JOptionPane.showMessageDialog(this, "Seleccione un Rubro por favor...");
            }
            if (existe == false) {
                listaProductos.add(new Productos(codigo, descripcion, precio, stock, Categoria.valueOf(categoria)));
                JOptionPane.showMessageDialog(this, "¡ Producto Agregado !");
            }

        } catch (NumberFormatException nfe) {
            //si hay datos vacios o datos incorrectos , mostrara un cartel.
            jtCodigo.setText("");
            JOptionPane.showMessageDialog(this, "Datos incorrectos o vacios, verifique los datos ingresados");

        }
        borrarCampos();
         


    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try {
            boolean datosOk = true;
            int codigo = Integer.parseInt(jtCodigo.getText().trim());
            if (jtDescripcion.getText().trim().equals("") || jtPrecio.getText().trim().equals("") || jtStock.getText().trim().equals("") || jtStock.getText().trim().equals("")) {
                datosOk = false;
                JOptionPane.showMessageDialog(this, "Datos vacios!!!");
            }
            // el producto se va a modificar solo si el codigo existe y todos los datos estan completos. 
            for (Productos prod : Menuu.listaProductos) {
                if (prod.getCodigo() == codigo && datosOk == true) {
                    //capturo los campos de texto en variables con el tipo de dato parseado:
                    String descripcion = jtDescripcion.getText().trim();
                    Double precio = Double.parseDouble(jtPrecio.getText().trim());
                    int stock = Integer.parseInt(jtStock.getText().trim());
                    String categoria = cbRubro.getSelectedItem().toString();
                    int verificarCodigo = Integer.parseInt(jtCodigo.getText().trim());

                    if (codigo == verificarCodigo) {
                        if (categoria.equals("- Elija una opcion")) {
                            JOptionPane.showMessageDialog(this, "Seleccione un Rubro por favor...");
                        } else {
                            prod.setDescripcion(descripcion);
                            prod.setPrecio(precio);
                            prod.setStock(stock);
                            if (categoria.equalsIgnoreCase("PERFUMERIA")) {
                                prod.setRubro(Categoria.PERFUMERIA);
                            }
                            if (categoria.equalsIgnoreCase("COMESTIBLE")) {
                                prod.setRubro(Categoria.COMESTIBLE);
                            }
                            if (categoria.equalsIgnoreCase("LIMPIEZA")) {
                                prod.setRubro(Categoria.LIMPIEZA);
                            }
                            JOptionPane.showMessageDialog(this, "Cambios Guardados !");

                        }
                    }

                } 
            }
            String categoria = cbRubro.getSelectedItem().toString();
            if (categoria.equals("- Elija una opcion")) {
                JOptionPane.showMessageDialog(this, "Seleccione un Rubro por favor...");
            }
        } catch (NumberFormatException nfe) {
            //si hay datos vacios o datos incorrectos , mostrara un cartel.
            jtCodigo.setText("");
            JOptionPane.showMessageDialog(this, "Datos incorrectos, verifique los datos ingresados");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Datos vacios, verifique los datos ingresados");

        }
        borrarCampos();

        
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
 boolean eliminar = false;
        try {
            int codigo = Integer.parseInt(jtCodigo.getText().trim());
            //busco el producto por el codigo para eliminarlo
            for (Productos prod : Menuu.listaProductos) {
                if (prod.getCodigo() == codigo) {
                    eliminar = true;
                    break;
                }
            }
            if (eliminar == true) {
                Menuu.listaProductos.removeIf(prod -> prod.getCodigo() == codigo);
                JOptionPane.showMessageDialog(this, "Producto Eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado");
            }
        } catch (NumberFormatException nfe) {
            //si hay datos vacios o datos incorrectos , mostrara un cartel.
            jtCodigo.setText("");
            JOptionPane.showMessageDialog(this, "Ingrese el codigo del producto que desea eliminar");
        }
        borrarCampos();
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        try {
            int cont = 0;
            int codigo = Integer.parseInt(jtCodigo.getText().trim());
            for (Productos prod : Menuu.listaProductos) {
                if (prod.getCodigo() == codigo) {
                    jtDescripcion.setText(prod.getDescripcion());
                    //paso precio a string para setearlo en el jtPrecio:
                    String precioString = Double.toString(prod.getPrecio());
                    jtPrecio.setText(precioString);
                    String rubroString = prod.getRubro().toString();
                    cbRubro.setSelectedItem(rubroString);
                    //paso el stock de int a string para setText
                    String stockString = Integer.toString(prod.getStock());
                    jtStock.setText(stockString);
                    cont = cont - 1;
                }
                cont = cont + 1;
                if (Menuu.listaProductos.size() == cont) {
                    borrarCampos();
                    JOptionPane.showMessageDialog(this, "El codigo: " + codigo + " NO existe, puede registrar un producto con el codigo ingresado ");
                }
            }

        } catch (NumberFormatException nfe) {
            borrarCampos();
            JOptionPane.showMessageDialog(this, "Ingrese un numero en el código, para realizar la busqueda del producto");

        }
    }//GEN-LAST:event_jBbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(gestionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbRubro;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables

private void borrarCampos() {
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        cbRubro.setSelectedIndex(0);
    }

}
