/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import Modelo.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisf
 */
public class Menu extends javax.swing.JFrame {

    private Controlador controlador;

    /**
     * Creates new form Menu
     */
    public Menu(Controlador controlador) {
        initComponents();
        this.controlador = controlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelRegistrarProductos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelVerProductos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelBuscarProductos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProdVer = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/point vert.png"))); // NOI18N
        jLabel5.setText("En linea");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 130, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logotipo.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 150, 80));

        panelRegistrarProductos.setBackground(new java.awt.Color(102, 102, 255));
        panelRegistrarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegistrarProductosMouseClicked(evt);
            }
        });
        panelRegistrarProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setText("REGISTRAR PRODUCTO");
        panelRegistrarProductos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        jPanel2.add(panelRegistrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 270, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo-azul-degradado-8259614_640.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 176));

        panelVerProductos.setBackground(new java.awt.Color(102, 102, 255));
        panelVerProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelVerProductosMouseClicked(evt);
            }
        });
        panelVerProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel7.setText("VER PRODUCTOS");
        panelVerProductos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 30));

        jPanel2.add(panelVerProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 50));

        panelBuscarProductos.setBackground(new java.awt.Color(102, 102, 255));
        panelBuscarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBuscarProductosMouseClicked(evt);
            }
        });
        panelBuscarProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel8.setText("BUSCAR PRODUCTOS");
        panelBuscarProductos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 30));

        jPanel2.add(panelBuscarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 270, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 560));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setText("LS SU PROVEEDOR S.A.S.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 740, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo-azul-degradado-8259614_1280.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 780, 90));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tablaProdVer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "código", "nombre", "cantidad", "proveedor"
            }
        ));
        jScrollPane1.setViewportView(tablaProdVer);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel8);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 780, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelVerProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVerProductosMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        DefaultTableModel tbModel = (DefaultTableModel) tablaProdVer.getModel();
        ArrayList<Producto> productos = controlador.obtenerProductos();
        for (Producto producto : productos) {
            tbModel.addRow(convertirProductoAFila(producto));
        }
    }//GEN-LAST:event_panelVerProductosMouseClicked

    private void panelBuscarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBuscarProductosMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_panelBuscarProductosMouseClicked

    private void panelRegistrarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarProductosMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_panelRegistrarProductosMouseClicked

    private Object[] convertirProductoAFila(Producto producto) {
        return new Object[]{producto.getIdProducto(), producto.getCod(), producto.getNombre(), producto.getCantidad(), producto.getProveedor()};
        // Reemplaza getAtributo1(), getAtributo2(), getAtributo3() con los métodos reales de la clase Producto
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelBuscarProductos;
    private javax.swing.JPanel panelRegistrarProductos;
    private javax.swing.JPanel panelVerProductos;
    private javax.swing.JTable tablaProdVer;
    // End of variables declaration//GEN-END:variables
}
