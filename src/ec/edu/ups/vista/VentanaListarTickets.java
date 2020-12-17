/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author ariel
 */
public class VentanaListarTickets extends javax.swing.JInternalFrame {

    private ControladorTicket controladorTicket;
    //idioma
    private Locale localizacion;
    private ResourceBundle mensaje;

    public VentanaListarTickets(ControladorTicket controladorTicket) {
        initComponents();

        //Controlador
        this.controladorTicket = controladorTicket;
    }

    public Locale getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Locale localizacion) {
        this.localizacion = localizacion;
    }

    public ResourceBundle getMensaje() {
        return mensaje;
    }

    public void setMensaje(ResourceBundle mensaje) {
        this.mensaje = mensaje;
    }

    public void cambiarIdioma(String idioma, String localizacion) {

        jLabelCedula1.setText(mensaje.getString("cedula"));
        jLabelMarca.setText(mensaje.getString("marca"));
        jLabelModelo.setText(mensaje.getString("modelo"));
        jLabelCliente.setText(mensaje.getString("clienteVS"));
        jLabelDireccion1.setText(mensaje.getString("direccion"));
        jLabelNombre1.setText(mensaje.getString("nombre"));
        jLabelPlaca.setText(mensaje.getString("placa"));
        jLabelTelefono1.setText(mensaje.getString("telefono"));
        labelDatosC.setText(mensaje.getString("datosCliente"));
        labelDatosV.setText(mensaje.getString("datosVehiculo"));
        TableColumnModel modelo = jTableTickets.getColumnModel();
        modelo.getColumn(0).setHeaderValue(mensaje.getString("numero"));
        modelo.getColumn(1).setHeaderValue(mensaje.getString("vehiculoVS"));
        modelo.getColumn(2).setHeaderValue(mensaje.getString("fechaDeIngreso"));
        modelo.getColumn(3).setHeaderValue(mensaje.getString("fechaDeSalida"));
        modelo.getColumn(4).setHeaderValue(mensaje.getString("total"));

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTickets = new javax.swing.JTable();
        jPanelDatosVehiculo = new javax.swing.JPanel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldPlaca = new javax.swing.JTextField();
        labelDatosV = new javax.swing.JLabel();
        jPanelDatosCliente1 = new javax.swing.JPanel();
        jLabelCedula1 = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelDireccion1 = new javax.swing.JLabel();
        jLabelTelefono1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        labelDatosC = new javax.swing.JLabel();

        setBackground(new java.awt.Color(12, 131, 131));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jScrollPane1.setBackground(new java.awt.Color(12, 131, 131));

        jTableTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Vehiculo", "Fecha y Hora de ingreso", "Fecha y Hora de salida", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTicketsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTickets);
        if (jTableTickets.getColumnModel().getColumnCount() > 0) {
            jTableTickets.getColumnModel().getColumn(0).setResizable(false);
            jTableTickets.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableTickets.getColumnModel().getColumn(1).setResizable(false);
            jTableTickets.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTableTickets.getColumnModel().getColumn(2).setResizable(false);
            jTableTickets.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableTickets.getColumnModel().getColumn(3).setResizable(false);
            jTableTickets.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableTickets.getColumnModel().getColumn(4).setResizable(false);
            jTableTickets.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanelDatosVehiculo.setBackground(new java.awt.Color(0, 102, 153));
        jPanelDatosVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Narrow", 0, 22))); // NOI18N
        jPanelDatosVehiculo.setMaximumSize(new java.awt.Dimension(0, 0));

        jLabelPlaca.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelPlaca.setText("Placa:");

        jLabelMarca.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelMarca.setText("Marca:");

        jLabelModelo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelModelo.setText("Modelo:");

        jLabelCliente.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelCliente.setText("Cliente:");

        jTextFieldMarca.setEditable(false);
        jTextFieldMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldCliente.setEditable(false);
        jTextFieldCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldModelo.setEditable(false);
        jTextFieldModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldPlaca.setEditable(false);
        jTextFieldPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelDatosV.setFont(new java.awt.Font("Arial Narrow", 1, 22)); // NOI18N
        labelDatosV.setText("Datos del Vehiculo");

        javax.swing.GroupLayout jPanelDatosVehiculoLayout = new javax.swing.GroupLayout(jPanelDatosVehiculo);
        jPanelDatosVehiculo.setLayout(jPanelDatosVehiculoLayout);
        jPanelDatosVehiculoLayout.setHorizontalGroup(
            jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(labelDatosV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosVehiculoLayout.setVerticalGroup(
            jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosVehiculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDatosV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlaca)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModelo)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCliente)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanelDatosCliente1.setBackground(new java.awt.Color(0, 102, 153));
        jPanelDatosCliente1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Narrow", 0, 22))); // NOI18N
        jPanelDatosCliente1.setMaximumSize(new java.awt.Dimension(0, 0));

        jLabelCedula1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelCedula1.setText("Cedula:");

        jLabelNombre1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelNombre1.setText("Nombre:");

        jLabelDireccion1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelDireccion1.setText("Direccion:");

        jLabelTelefono1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelTelefono1.setText("Telefono:");

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldTelefono.setEditable(false);
        jTextFieldTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldDireccion.setEditable(false);
        jTextFieldDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldCedula.setEditable(false);
        jTextFieldCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelDatosC.setFont(new java.awt.Font("Arial Narrow", 1, 22)); // NOI18N
        labelDatosC.setText("Datos del Cliente");

        javax.swing.GroupLayout jPanelDatosCliente1Layout = new javax.swing.GroupLayout(jPanelDatosCliente1);
        jPanelDatosCliente1.setLayout(jPanelDatosCliente1Layout);
        jPanelDatosCliente1Layout.setHorizontalGroup(
            jPanelDatosCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosCliente1Layout.createSequentialGroup()
                        .addComponent(jLabelTelefono1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosCliente1Layout.createSequentialGroup()
                        .addComponent(jLabelCedula1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosCliente1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosCliente1Layout.createSequentialGroup()
                        .addComponent(jLabelDireccion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosCliente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDatosC)
                .addGap(74, 74, 74))
        );
        jPanelDatosCliente1Layout.setVerticalGroup(
            jPanelDatosCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDatosC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanelDatosCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCedula1)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion1)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono1)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelDatosVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDatosCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDatosCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDatosVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelDatosVehiculo.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTicketsMouseClicked
        int filaSeleccionada = jTableTickets.getSelectedRow();
        if (filaSeleccionada >= 0) {
            Vehiculo vehiculo = (Vehiculo) jTableTickets.getValueAt(filaSeleccionada, 1);
            jTextFieldPlaca.setText(vehiculo.getPlaca());
            jTextFieldMarca.setText(vehiculo.getMarca());
            jTextFieldModelo.setText(vehiculo.getModelo());
            jTextFieldCliente.setText(vehiculo.getCliente().toString());
            Cliente cliente = vehiculo.getCliente();
            jTextFieldCedula.setText(cliente.getCedula());
            jTextFieldNombre.setText(cliente.getNombre());
            jTextFieldDireccion.setText(cliente.getDireccion());
            jTextFieldTelefono.setText(cliente.getTelefono());
        }
    }//GEN-LAST:event_jTableTicketsMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        limpiar();
        cargarDatosTablaClientes();
    }//GEN-LAST:event_formInternalFrameActivated

    public void cargarDatosTablaClientes() {
        DefaultTableModel modelo = (DefaultTableModel) jTableTickets.getModel();
        modelo.setRowCount(0);
        for (Ticket ticket : controladorTicket.listar()) {
            Object[] rowData = {ticket.getNumero(), ticket.getVehiculo(), ticket.getFechaEntrada().toString(), ticket.getFechaSalida(), ticket.getTotal()};
            modelo.addRow(rowData);

        }
        jTableTickets.setModel(modelo);
    }

    public void limpiar() {
        jTextFieldPlaca.setText("");
        jTextFieldMarca.setText("");
        jTextFieldModelo.setText("");
        jTextFieldCliente.setText("");
        jTextFieldCedula.setText("");
        jTextFieldNombre.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldTelefono.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCedula1;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDireccion1;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTelefono1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatosCliente1;
    private javax.swing.JPanel jPanelDatosVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTickets;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JLabel labelDatosC;
    private javax.swing.JLabel labelDatosV;
    // End of variables declaration//GEN-END:variables
}