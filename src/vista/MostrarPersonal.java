package vista;


import celdaCustom.TableActionCellEditor;
import celdaCustom.TableActionCellRender;
import celdaCustom.TableActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import Modelo.ArchivoPersonal;
import Modelo.Personal;
import java.util.List;
import javax.swing.JTable;
import javax.swing.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Luis Bizarro
 */
public class MostrarPersonal extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    int xMouse, yMouse;
    public MostrarPersonal() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        table.getTableHeader().setFont(new Font("Yu Gothi UI", Font.BOLD,12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(200,200,200));
        TableActionEvent event;
        cargarEmpleadosEnTabla();
        event = new TableActionEvent() {
            
            
            // QUE NI SE LES OCURRA TOCAR ALGO DE LA CARPETA "CELDA CUSTOM"
            
            //Esto es para el boton de editar en la tabla (ESTO SI LO PUEDES MODIFICAR A TU GUSTO)
            @Override
            public void onEdit(int row) {
                ArchivoPersonal ap = new ArchivoPersonal();
                List<Personal> trabajadores = ap.getArregloPersonal();
                // Obtener el modelo de la tabla
                DefaultTableModel model = (DefaultTableModel) table.getModel();

                // Obtener los datos de la fila seleccionada (suponiendo que el ID está en la columna 0)
                String id = (String) model.getValueAt(row, 0); 

                // Buscar el Personal correspondiente en la lista (suponiendo que trabajadores es la lista de objetos Personal)
                Personal empleado = null;
                for (Personal p : trabajadores) {
                    if (p.getId().equals(id)) {
                        empleado = p;
                        break;
                    }
                }

                if (empleado != null) {
                    // Crear campos de texto para mostrar los datos actuales
                    JTextField txtNombre = new JTextField(empleado.getNombre());
                    JTextField txtApellido = new JTextField(empleado.getApellido());
                    JTextField txtUsuario = new JTextField(empleado.getUsuario());
                    JPasswordField txtContraseña = new JPasswordField(empleado.getContrasenia());

                    // Mostrar el JOptionPane con los campos de texto
                    Object[] mensaje = {
                        "Nombre:", txtNombre,
                        "Apellido:", txtApellido,
                        "Usuario:", txtUsuario,
                        "Contraseña:", txtContraseña
                    };

                    int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Editar Empleado", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                    // Si el usuario hace clic en OK
                    if (opcion == JOptionPane.OK_OPTION) {
                        // Obtener los nuevos valores de los campos
                        String nuevoNombre = txtNombre.getText();
                        String nuevoApellido = txtApellido.getText();
                        String nuevoUsuario = txtUsuario.getText();
                        String nuevaContraseña = new String(txtContraseña.getPassword());

                        // Actualizar los valores del objeto empleado
                        empleado.setNombre(nuevoNombre);
                        empleado.setApellido(nuevoApellido);
                        empleado.setUsuario(nuevoUsuario);
                        empleado.setContrasenia(nuevaContraseña);

                        // Actualizar la lista en el archivo
                        ap.actualizarPersonal(empleado);

                        // Actualizar la tabla con los nuevos datos
                        model.setValueAt(nuevoNombre, row, 1);
                        model.setValueAt(nuevoApellido, row, 2);
                        model.setValueAt(nuevoUsuario, row, 3);
                        model.setValueAt(nuevaContraseña, row, 4);
                    }
                }
                System.out.println("Edit row: " + row);
            }

            @Override
            //Este es para el boton de borrar que esta en la tabla(ESTO NOOOOOOOOOO)
            
            public void onDelete(int row) {
                if (table.isEditing()) {
                    table.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) table.getModel();

                // Obtener el ID de la fila a eliminar
                String id = (String) model.getValueAt(row, 0);
                ArchivoPersonal ap= new ArchivoPersonal();

                // Eliminar el empleado de la lista original (trabajadores) y de la fuente de datos
                ap.eliminarPersonal(id);  // Llamar al método de eliminar de `ArchivoPersonal`

                // Eliminar la fila de la tabla
                model.removeRow(row);
            }
            //Esto es para el boton de ver los datos
            @Override
            public void onView(int row) {
                System.out.println("View row: "+row);
            }
        };
        
        table.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRender());
        table.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor(event));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panelAdministrador = new javax.swing.JPanel();
        imgCocosBurguer = new javax.swing.JLabel();
        imgRetroceder = new javax.swing.JLabel();
        panelOpcionPanelDeControl = new vista.PanelRound();
        lblOpcionPanelDeControl = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        panelOpcionPedidos = new vista.PanelRound();
        lblOpcionPedidos = new javax.swing.JLabel();
        panelOpcionListadoProductos = new vista.PanelRound();
        lblOpcionListadoProductos = new javax.swing.JLabel();
        panelOpcionAdministrador = new vista.PanelRound();
        lblOpcionAdministrador = new javax.swing.JLabel();
        panelOpcionPersonal = new vista.PanelRound();
        lblOpcionPersonal = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        panelMoverVentana = new javax.swing.JPanel();
        panelExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID EMPLEADO", "NOMBRE", "USUARIO", "ACCION", "Title 5", "Title 6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(40);
        table.setSelectionBackground(new java.awt.Color(138, 234, 143));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 1000, 430));

        panelAdministrador.setBackground(new java.awt.Color(200, 200, 200));
        panelAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCocosBurguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/logoCocosBurger.png"))); // NOI18N
        imgCocosBurguer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelAdministrador.add(imgCocosBurguer, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        imgRetroceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/celdaCustom/Retroceder.png"))); // NOI18N
        imgRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetrocederMouseClicked(evt);
            }
        });
        panelAdministrador.add(imgRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 24, 37, 49));

        panelOpcionPanelDeControl.setBackground(new java.awt.Color(255, 255, 255));
        panelOpcionPanelDeControl.setRoundBottomLeft(25);
        panelOpcionPanelDeControl.setRoundBottomRight(25);
        panelOpcionPanelDeControl.setRoundTopLeft(25);
        panelOpcionPanelDeControl.setRoundTopRight(25);
        panelOpcionPanelDeControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOpcionPanelDeControlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOpcionPanelDeControlMouseExited(evt);
            }
        });

        lblOpcionPanelDeControl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOpcionPanelDeControl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpcionPanelDeControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/iconosPanelDeControl/Panel de control.png"))); // NOI18N
        lblOpcionPanelDeControl.setText(" Panel de control");
        lblOpcionPanelDeControl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpcionPanelDeControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpcionPanelDeControlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOpcionPanelDeControlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOpcionPanelDeControlMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionPanelDeControlLayout = new javax.swing.GroupLayout(panelOpcionPanelDeControl);
        panelOpcionPanelDeControl.setLayout(panelOpcionPanelDeControlLayout);
        panelOpcionPanelDeControlLayout.setHorizontalGroup(
            panelOpcionPanelDeControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionPanelDeControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcionPanelDeControl, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );
        panelOpcionPanelDeControlLayout.setVerticalGroup(
            panelOpcionPanelDeControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionPanelDeControlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblOpcionPanelDeControl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelAdministrador.add(panelOpcionPanelDeControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 60));

        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/iconosPanelDeControl/UsuarioAdmin.png"))); // NOI18N
        panelAdministrador.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        lblRol.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblRol.setText("[Rol]");
        panelAdministrador.add(lblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, -1));

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNombre.setText("[Nombre]");
        panelAdministrador.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, -1, -1));

        panelOpcionPedidos.setBackground(new java.awt.Color(255, 255, 255));
        panelOpcionPedidos.setRoundBottomLeft(25);
        panelOpcionPedidos.setRoundBottomRight(25);
        panelOpcionPedidos.setRoundTopLeft(25);
        panelOpcionPedidos.setRoundTopRight(25);
        panelOpcionPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOpcionPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOpcionPedidosMouseExited(evt);
            }
        });

        lblOpcionPedidos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOpcionPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpcionPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/iconosPanelDeControl/Pedidos.png"))); // NOI18N
        lblOpcionPedidos.setText(" Pedidos");
        lblOpcionPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpcionPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpcionPedidosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOpcionPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOpcionPedidosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionPedidosLayout = new javax.swing.GroupLayout(panelOpcionPedidos);
        panelOpcionPedidos.setLayout(panelOpcionPedidosLayout);
        panelOpcionPedidosLayout.setHorizontalGroup(
            panelOpcionPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcionPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );
        panelOpcionPedidosLayout.setVerticalGroup(
            panelOpcionPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionPedidosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblOpcionPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelAdministrador.add(panelOpcionPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        panelOpcionListadoProductos.setBackground(new java.awt.Color(255, 255, 255));
        panelOpcionListadoProductos.setRoundBottomLeft(25);
        panelOpcionListadoProductos.setRoundBottomRight(25);
        panelOpcionListadoProductos.setRoundTopLeft(25);
        panelOpcionListadoProductos.setRoundTopRight(25);
        panelOpcionListadoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOpcionListadoProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOpcionListadoProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOpcionListadoProductosMouseExited(evt);
            }
        });

        lblOpcionListadoProductos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOpcionListadoProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpcionListadoProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/iconosPanelDeControl/listadoDeProductos.png"))); // NOI18N
        lblOpcionListadoProductos.setText(" Listado de productos");
        lblOpcionListadoProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpcionListadoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpcionListadoProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOpcionListadoProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOpcionListadoProductosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionListadoProductosLayout = new javax.swing.GroupLayout(panelOpcionListadoProductos);
        panelOpcionListadoProductos.setLayout(panelOpcionListadoProductosLayout);
        panelOpcionListadoProductosLayout.setHorizontalGroup(
            panelOpcionListadoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionListadoProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcionListadoProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );
        panelOpcionListadoProductosLayout.setVerticalGroup(
            panelOpcionListadoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionListadoProductosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblOpcionListadoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelAdministrador.add(panelOpcionListadoProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        panelOpcionAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        panelOpcionAdministrador.setRoundBottomLeft(25);
        panelOpcionAdministrador.setRoundBottomRight(25);
        panelOpcionAdministrador.setRoundTopLeft(25);
        panelOpcionAdministrador.setRoundTopRight(25);
        panelOpcionAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOpcionAdministradorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOpcionAdministradorMouseExited(evt);
            }
        });

        lblOpcionAdministrador.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOpcionAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpcionAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/iconosPanelDeControl/administrador.png"))); // NOI18N
        lblOpcionAdministrador.setText(" Administrador");
        lblOpcionAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpcionAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpcionAdministradorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOpcionAdministradorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOpcionAdministradorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionAdministradorLayout = new javax.swing.GroupLayout(panelOpcionAdministrador);
        panelOpcionAdministrador.setLayout(panelOpcionAdministradorLayout);
        panelOpcionAdministradorLayout.setHorizontalGroup(
            panelOpcionAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcionAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );
        panelOpcionAdministradorLayout.setVerticalGroup(
            panelOpcionAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionAdministradorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblOpcionAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelAdministrador.add(panelOpcionAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        panelOpcionPersonal.setBackground(new java.awt.Color(255, 255, 255));
        panelOpcionPersonal.setRoundBottomLeft(25);
        panelOpcionPersonal.setRoundBottomRight(25);
        panelOpcionPersonal.setRoundTopLeft(25);
        panelOpcionPersonal.setRoundTopRight(25);
        panelOpcionPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOpcionPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOpcionPersonalMouseExited(evt);
            }
        });

        lblOpcionPersonal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOpcionPersonal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpcionPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/iconosPanelDeControl/Personal.png"))); // NOI18N
        lblOpcionPersonal.setText(" Personal");
        lblOpcionPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpcionPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpcionPersonalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOpcionPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOpcionPersonalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionPersonalLayout = new javax.swing.GroupLayout(panelOpcionPersonal);
        panelOpcionPersonal.setLayout(panelOpcionPersonalLayout);
        panelOpcionPersonalLayout.setHorizontalGroup(
            panelOpcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcionPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );
        panelOpcionPersonalLayout.setVerticalGroup(
            panelOpcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionPersonalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblOpcionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelAdministrador.add(panelOpcionPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jPanel1.add(panelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 720));

        lblPedidos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblPedidos.setText("Personal");
        jPanel1.add(lblPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 1070, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 1020, 20));

        panelMoverVentana.setBackground(new java.awt.Color(255, 255, 255));
        panelMoverVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMoverVentanaMouseDragged(evt);
            }
        });
        panelMoverVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMoverVentanaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMoverVentanaLayout = new javax.swing.GroupLayout(panelMoverVentana);
        panelMoverVentana.setLayout(panelMoverVentanaLayout);
        panelMoverVentanaLayout.setHorizontalGroup(
            panelMoverVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        panelMoverVentanaLayout.setVerticalGroup(
            panelMoverVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(panelMoverVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1010, 20));

        panelExit.setBackground(new java.awt.Color(255, 255, 255));

        btnExit.setBackground(new java.awt.Color(102, 102, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("x");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelExitLayout = new javax.swing.GroupLayout(panelExit);
        panelExit.setLayout(panelExitLayout);
        panelExitLayout.setHorizontalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelExitLayout.setVerticalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 20, 20));

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

        private void cargarEmpleadosEnTabla() {
        ArchivoPersonal ap = new ArchivoPersonal();
        List<Personal> trabajadores = ap.getArregloPersonal();

        // Contar cuántos empleados tienen el rol de "Cajero"
        int count = 0;
        for (Personal p : trabajadores) {
            if ("Cajero".equals(p.getRol())) {
                count++;
            }
        }

        // Crear la matriz `data` con el tamaño correcto para los cajeros y las 5 columnas iniciales
        String[][] data = new String[count][5]; 

        // Llenar `data` solo con los empleados que tienen el rol de "Cajero"
        int index = 0;
        for (Personal p : trabajadores) {
            if ("Cajero".equals(p.getRol())) {
                data[index][0] = p.getId();
                data[index][1] = p.getNombre();
                data[index][2] = p.getApellido();
                data[index][3] = p.getUsuario();
                data[index][4] = p.getContrasenia();
                index++;
            }
        }

        // Nombres de columnas, incluyendo "Acciones"
        String[] columnNames = {"ID", "Nombre", "Apellido", "Usuario", "Contraseña", "Acciones"}; 
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table.setModel(model);
    }

    private void panelMoverVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverVentanaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelMoverVentanaMousePressed

    private void panelMoverVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverVentanaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_panelMoverVentanaMouseDragged

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        panelExit.setBackground(new Color(251,40,67));
        btnExit.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        panelExit.setBackground(Color.white);
        btnExit.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnExitMouseExited

    private void lblOpcionPanelDeControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionPanelDeControlMouseClicked
        PanelDeControlAdministrador objeto = new PanelDeControlAdministrador();
        objeto.setVisible(true);
        objeto.setVisible(false);
    }//GEN-LAST:event_lblOpcionPanelDeControlMouseClicked

    private void lblOpcionPanelDeControlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionPanelDeControlMouseEntered
        panelOpcionPanelDeControl.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_lblOpcionPanelDeControlMouseEntered

    private void lblOpcionPanelDeControlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionPanelDeControlMouseExited
        panelOpcionPanelDeControl.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblOpcionPanelDeControlMouseExited

    private void panelOpcionPanelDeControlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionPanelDeControlMouseExited
        panelOpcionPanelDeControl.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_panelOpcionPanelDeControlMouseExited

    private void panelOpcionPanelDeControlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionPanelDeControlMouseEntered
        panelOpcionPanelDeControl.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_panelOpcionPanelDeControlMouseEntered

    private void lblOpcionPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionPedidosMouseClicked
        OrdenPedido obj = new OrdenPedido();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblOpcionPedidosMouseClicked

    private void lblOpcionPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionPedidosMouseEntered
        panelOpcionPedidos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_lblOpcionPedidosMouseEntered

    private void lblOpcionPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionPedidosMouseExited
        panelOpcionPedidos.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblOpcionPedidosMouseExited

    private void panelOpcionPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionPedidosMouseEntered
        panelOpcionPedidos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_panelOpcionPedidosMouseEntered

    private void panelOpcionPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionPedidosMouseExited
        panelOpcionPedidos.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_panelOpcionPedidosMouseExited

    private void lblOpcionListadoProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionListadoProductosMouseClicked
        ListadoDeProductosAdministrador ob = new ListadoDeProductosAdministrador();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblOpcionListadoProductosMouseClicked

    private void lblOpcionListadoProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionListadoProductosMouseEntered
        // TODO add your handling code here:
        panelOpcionListadoProductos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_lblOpcionListadoProductosMouseEntered

    private void lblOpcionListadoProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionListadoProductosMouseExited
        panelOpcionListadoProductos.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblOpcionListadoProductosMouseExited

    private void panelOpcionListadoProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionListadoProductosMouseEntered
        panelOpcionListadoProductos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_panelOpcionListadoProductosMouseEntered

    private void panelOpcionListadoProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionListadoProductosMouseExited
        panelOpcionListadoProductos.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_panelOpcionListadoProductosMouseExited

    private void lblOpcionAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionAdministradorMouseClicked
        MostrarAdministradores obj = new MostrarAdministradores();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblOpcionAdministradorMouseClicked

    private void lblOpcionAdministradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionAdministradorMouseEntered
        panelOpcionAdministrador.setBackground(new Color(204,204,204));
        
    }//GEN-LAST:event_lblOpcionAdministradorMouseEntered

    private void lblOpcionAdministradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionAdministradorMouseExited
        panelOpcionAdministrador.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblOpcionAdministradorMouseExited

    private void panelOpcionAdministradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionAdministradorMouseEntered
        panelOpcionAdministrador.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_panelOpcionAdministradorMouseEntered

    private void panelOpcionAdministradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionAdministradorMouseExited
        panelOpcionAdministrador.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_panelOpcionAdministradorMouseExited

    private void lblOpcionPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionPersonalMouseClicked
        MostrarPersonal obj = new MostrarPersonal();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblOpcionPersonalMouseClicked

    private void lblOpcionPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionPersonalMouseEntered
        panelOpcionPersonal.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_lblOpcionPersonalMouseEntered

    private void lblOpcionPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcionPersonalMouseExited
        panelOpcionPersonal.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblOpcionPersonalMouseExited

    private void panelOpcionPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionPersonalMouseEntered
        panelOpcionPersonal.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_panelOpcionPersonalMouseEntered

    private void panelOpcionPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionPersonalMouseExited
        panelOpcionPersonal.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_panelOpcionPersonalMouseExited

    private void panelOpcionListadoProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionListadoProductosMouseClicked
        ListadoDeProductosAdministrador obj = new ListadoDeProductosAdministrador();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panelOpcionListadoProductosMouseClicked

    private void imgRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetrocederMouseClicked
        LoginV login = new LoginV();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_imgRetrocederMouseClicked

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
            java.util.logging.Logger.getLogger(MostrarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarPersonal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel imgCocosBurguer;
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOpcionAdministrador;
    private javax.swing.JLabel lblOpcionListadoProductos;
    private javax.swing.JLabel lblOpcionPanelDeControl;
    private javax.swing.JLabel lblOpcionPedidos;
    private javax.swing.JLabel lblOpcionPersonal;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblRol;
    private javax.swing.JPanel panelAdministrador;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelMoverVentana;
    private vista.PanelRound panelOpcionAdministrador;
    private vista.PanelRound panelOpcionListadoProductos;
    private vista.PanelRound panelOpcionPanelDeControl;
    private vista.PanelRound panelOpcionPedidos;
    private vista.PanelRound panelOpcionPersonal;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}