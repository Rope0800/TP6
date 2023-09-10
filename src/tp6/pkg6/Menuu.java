
package tp6.pkg6;

import java.util.TreeSet;


public class Menuu extends javax.swing.JFrame {
public static TreeSet<Productos> listaProductos = new TreeSet<>();
    
    public Menuu() {
        initComponents();
        cargarProductos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMproductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        porrubro = new javax.swing.JMenuItem();
        porprecio = new javax.swing.JMenuItem();
        busqPnombre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        jMenu1.setText("Administracion");

        jMproductos.setText("Productos");
        jMproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMproductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMproductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        porrubro.setText("Por Rubro");
        porrubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porrubroActionPerformed(evt);
            }
        });
        jMenu2.add(porrubro);

        porprecio.setText("Por Precio");
        porprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porprecioActionPerformed(evt);
            }
        });
        jMenu2.add(porprecio);

        busqPnombre.setText("Por Nombre");
        busqPnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqPnombreActionPerformed(evt);
            }
        });
        jMenu2.add(busqPnombre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void jMproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMproductosActionPerformed
        //sacamos todo lo que este mostrando en el escritorio
        escritorio.removeAll();
        escritorio.repaint();
        //objeto de la vista
        gestionProducto gp = new gestionProducto();
       //Hacemos Visible la ventana
        gp.setVisible(true);
        //mostramos la ventana adelante
        escritorio.add(gp);
        escritorio.moveToFront(gp);
        
    }//GEN-LAST:event_jMproductosActionPerformed

    private void porrubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porrubroActionPerformed
       //sacamos todo lo que este mostrando en el escritorio
        escritorio.removeAll();
        escritorio.repaint();
       //objeto de la vista
        BuscarPorRubro BPR = new BuscarPorRubro();
        //Hacemos Visible la ventana
        BPR.setVisible(true);
        //mostramos la ventana adelante
        escritorio.add(BPR);
        escritorio.moveToFront(BPR);
    }//GEN-LAST:event_porrubroActionPerformed

    private void porprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porprecioActionPerformed
        //sacamos todo lo que este mostrando en el escritorio
        escritorio.removeAll();
        escritorio.repaint();
       //objeto de la vista
        BuscarPorPrecio Pp = new BuscarPorPrecio();
        //Hacemos Visible la ventana
        Pp.setVisible(true);
        //mostramos la ventana adelante
        escritorio.add(Pp);
        escritorio.moveToFront(Pp);
    }//GEN-LAST:event_porprecioActionPerformed

    private void busqPnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqPnombreActionPerformed
         //sacamos todo lo que este mostrando en el escritorio
        escritorio.removeAll();
        escritorio.repaint();
       //objeto de la vista
        BuscarPorNombre Pn = new BuscarPorNombre();
        //Hacemos Visible la ventana
        Pn.setVisible(true);
        //mostramos la ventana adelante
        escritorio.add(Pn);
        escritorio.moveToFront(Pn);
    }//GEN-LAST:event_busqPnombreActionPerformed

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
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem busqPnombre;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMproductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JMenuItem porprecio;
    private javax.swing.JMenuItem porrubro;
    // End of variables declaration//GEN-END:variables

    
    private void cargarProductos() {
        listaProductos.add(new Productos(990, "Paleta", 4000, 5, Categoria.COMESTIBLE));
        listaProductos.add(new Productos(991, "Yerba-Mate 750Gr", 600, 4, Categoria.COMESTIBLE));
        listaProductos.add(new Productos(992, "Cafe 750Gr", 1500, 13, Categoria.COMESTIBLE));
        listaProductos.add(new Productos(1013, "Detergente 500Cc", 700, 35, Categoria.LIMPIEZA));
        listaProductos.add(new Productos(1014, "Lavandina 5L", 400.50, 17, Categoria.LIMPIEZA));
        listaProductos.add(new Productos(1015, "Crema Nivea", 500, 95, Categoria.LIMPIEZA));
        listaProductos.add(new Productos(1020, "Colgate", 750, 10, Categoria.PERFUMERIA));
        listaProductos.add(new Productos(1021, "Desodorante 500cc", 600.70, 302, Categoria.PERFUMERIA));
        listaProductos.add(new Productos(1023, "Shampoo 500Cc", 1200, 43, Categoria.PERFUMERIA));
        listaProductos.add(new Productos(990, "Enpanadas 12", 2000, 20, Categoria.COMESTIBLE));
        listaProductos.add(new Productos(990, "Acondicionador", 900, 600, Categoria.LIMPIEZA));
    }


}
