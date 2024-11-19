/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import Archivo.Archivo;
import Modelo.Producto;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentanaProductos extends javax.swing.JPanel {
   private Archivo archivo; 

    // Constructor que recibe categoría y archivo
    public VentanaProductos(String categoria, Archivo archivo) {
        this.archivo = archivo; // Asignar la instancia de Archivo
        initComponents(); // Inicializa componentes de la interfaz
        cargarProductos(categoria); // Cargar productos de la categoría
    }
    public VentanaProductos(){
        //este constructor debe estar vacio para llamar a las otras interfaces
    }

    // Método para cargar productos de una categoría específica
    private void cargarProductos(String categoria) {
        List<Producto> productos = archivo.consultarPorCategoria(categoria);
        setLayout(new FlowLayout()); // Configura el layout

        for (Producto producto : productos) {
            JButton botonProducto = new JButton(producto.getNombre() + " - S/" + producto.getPrecio());
            botonProducto.addActionListener(e -> mostrarDetallesProducto(producto));
            add(botonProducto); // Añade el botón al panel
        }
        revalidate(); // Revalida el panel para actualizar la interfaz
        repaint(); // Repinta el panel
    }

    // Método para mostrar detalles de un producto en un cuadro de diálogo
    private void mostrarDetallesProducto(Producto producto) {
        JOptionPane.showMessageDialog(this,
            "ID: " + producto.getId() + "\nNombre: " + producto.getNombre() +
            "\nPrecio: S/" + producto.getPrecio() + "\nCategoría: " + producto.getCategoria(),
            "Detalles del Producto", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
