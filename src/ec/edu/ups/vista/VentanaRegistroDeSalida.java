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
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author HI andres
 */
public class VentanaRegistroDeSalida extends javax.swing.JInternalFrame {

    private ControladorTicket controladorTicket;
    //idioma
    private Locale localizacion;
    private ResourceBundle mensaje;
    private String alerta2;
    private String alerta3;
    private String salida;

    public VentanaRegistroDeSalida(ControladorTicket controladorTicket) {
        initComponents();

        //Controlador
        this.controladorTicket = controladorTicket;
        alerta2 = "Registro de salida correcto ";
        alerta3 = "No existe ningun ticket relacionado con ese numero";
        salida = "\nHora de Salida: ";
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
        jButtonCalcular.setText(mensaje.getString("calcular"));
        jButtonLimpiar.setText(mensaje.getString("limpiar"));
        jLabelCedula4.setText(mensaje.getString("total"));
        jLabelDireccion.setText(mensaje.getString("direccion"));
        jLabelFechaEntrada.setText(mensaje.getString("fechaEntrada"));
        jLabelFechaSalida.setText(mensaje.getString("fechaSalida"));
        jLabelFraccciones.setText(mensaje.getString("fracciones"));
        jLabelMarca.setText(mensaje.getString("marca"));
        jLabelModelo.setText(mensaje.getString("modelo"));
        jLabelNombre.setText(mensaje.getString("nombre"));
        jLabelNumeroDeTicket.setText(mensaje.getString("numeroDeTicket"));
        jLabelPlaca.setText(mensaje.getString("placa"));
        jLabelTelefono.setText(mensaje.getString("telefono"));
        jLabelTiempo.setText(mensaje.getString("tiempo"));
        jLabelTitulo.setText(mensaje.getString("tituloVS"));
        jLabelCedula1.setText(mensaje.getString("cedula"));
        labelClientePanel.setText(mensaje.getString("clienteVS"));
        labelVehiculoPanel.setText(mensaje.getString("vehiculoVS"));
        alerta2 = mensaje.getString("alerta2");
        alerta3 = mensaje.getString("alerta3");
        salida = mensaje.getString("salida");
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
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNumeroDeTicket = new javax.swing.JLabel();
        jPanelDatosVehiculo = new javax.swing.JPanel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldPlaca = new javax.swing.JTextField();
        labelVehiculoPanel = new javax.swing.JLabel();
        jPanelDatosCliente = new javax.swing.JPanel();
        jLabelCedula1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        labelClientePanel = new javax.swing.JLabel();
        jLabelFechaEntrada = new javax.swing.JLabel();
        jTextFieldFechaSalida = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelCedula4 = new javax.swing.JLabel();
        jTextFieldFechaEntrada = new javax.swing.JTextField();
        jLabelFechaSalida = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelTiempo = new javax.swing.JLabel();
        jTextFieldFracciones = new javax.swing.JTextField();
        jLabelFraccciones = new javax.swing.JLabel();
        jTextFieldTiempo = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();

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

        jLabelTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabelTitulo.setText("Registrar Salida");

        jLabelNumeroDeTicket.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelNumeroDeTicket.setText("Numero de Ticket :");

        jPanelDatosVehiculo.setBackground(new java.awt.Color(0, 102, 153));
        jPanelDatosVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Narrow", 0, 22))); // NOI18N
        jPanelDatosVehiculo.setMaximumSize(new java.awt.Dimension(0, 0));

        jLabelPlaca.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelPlaca.setText("Placa:");

        jLabelMarca.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelMarca.setText("Marca:");

        jLabelModelo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelModelo.setText("Modelo:");

        jTextFieldMarca.setEditable(false);
        jTextFieldMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldModelo.setEditable(false);
        jTextFieldModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldPlaca.setEditable(false);
        jTextFieldPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelVehiculoPanel.setFont(new java.awt.Font("Arial Narrow", 1, 22)); // NOI18N
        labelVehiculoPanel.setText("Vehiculo");

        javax.swing.GroupLayout jPanelDatosVehiculoLayout = new javax.swing.GroupLayout(jPanelDatosVehiculo);
        jPanelDatosVehiculo.setLayout(jPanelDatosVehiculoLayout);
        jPanelDatosVehiculoLayout.setHorizontalGroup(
            jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanelDatosVehiculoLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(labelVehiculoPanel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosVehiculoLayout.setVerticalGroup(
            jPanelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosVehiculoLayout.createSequentialGroup()
                .addComponent(labelVehiculoPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(71, 71, 71))
        );

        jPanelDatosCliente.setBackground(new java.awt.Color(0, 102, 153));
        jPanelDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Narrow", 0, 22))); // NOI18N
        jPanelDatosCliente.setMaximumSize(new java.awt.Dimension(0, 0));

        jLabelCedula1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelCedula1.setText("Cedula:");

        jLabelNombre.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelDireccion.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelDireccion.setText("Direccion:");

        jLabelTelefono.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelTelefono.setText("Telefono:");

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldTelefono.setEditable(false);
        jTextFieldTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldDireccion.setEditable(false);
        jTextFieldDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldCedula.setEditable(false);
        jTextFieldCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelClientePanel.setFont(new java.awt.Font("Arial Narrow", 1, 22)); // NOI18N
        labelClientePanel.setText("Cliente");

        javax.swing.GroupLayout jPanelDatosClienteLayout = new javax.swing.GroupLayout(jPanelDatosCliente);
        jPanelDatosCliente.setLayout(jPanelDatosClienteLayout);
        jPanelDatosClienteLayout.setHorizontalGroup(
            jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelCedula1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(labelClientePanel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosClienteLayout.setVerticalGroup(
            jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClientePanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCedula1)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jLabelFechaEntrada.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelFechaEntrada.setText("Fecha de entrada:");

        jTextFieldFechaSalida.setEditable(false);
        jTextFieldFechaSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelCedula4.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabelCedula4.setText("Total:");

        jTextFieldFechaEntrada.setEditable(false);
        jTextFieldFechaEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelFechaSalida.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelFechaSalida.setText("Fecha de salida:");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTotal.setText("0.0");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/iconoVentanaRegistrarSalida.png"))); // NOI18N

        jLabelTiempo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelTiempo.setText("Tiempo:");

        jTextFieldFracciones.setEditable(false);
        jTextFieldFracciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelFraccciones.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelFraccciones.setText("Numero de fracciones:");

        jTextFieldTiempo.setEditable(false);
        jTextFieldTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonCalcular.setText("Calcular ");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelDatosVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNumeroDeTicket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabelCedula4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFechaEntrada)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelFechaSalida)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFraccciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTiempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButtonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCalcular)
                        .addGap(48, 48, 48)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumeroDeTicket)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFechaEntrada)
                            .addComponent(jTextFieldFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFechaSalida)
                            .addComponent(jTextFieldFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFraccciones)
                            .addComponent(jTextFieldFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTiempo)
                            .addComponent(jTextFieldTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpiar)
                            .addComponent(jButtonCalcular))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCedula4)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelDatosVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        //obtenemos el ticket que tiene por numero lo ingresado por el usuario
        try {
            Ticket ticket = controladorTicket.buscar(Integer.valueOf(jTextFieldNumero.getText()));
            if (ticket != null) {
                if (ticket.getTotal() == 0.0) {
                    //obtenemos la hora actual
                    jTextFieldFechaSalida.setText(controladorTicket.obtenerFechaActual().toString());

                    //agregamos la fecha de salida al ticket
                    ticket.setFechaSalida(LocalDateTime.parse(jTextFieldFechaSalida.getText()));

                    //obtenemos el total y lo mostramos en los textField
                    jTextFieldTiempo.setText(ticket.calcularTiempo());
                    jTextFieldFracciones.setText(String.valueOf(ticket.getFracciones()));
                    jTextFieldTotal.setText(String.valueOf(ticket.getTotal()));

                    //llenamos los datos relacionamos al ticket
                    Vehiculo vehiculo = ticket.getVehiculo();
                    Cliente cliente = vehiculo.getCliente();

                    jTextFieldCedula.setText(cliente.getCedula());
                    jTextFieldDireccion.setText(cliente.getDireccion());
                    jTextFieldFechaEntrada.setText(ticket.getFechaEntrada().toString());
                    jTextFieldMarca.setText(vehiculo.getMarca());
                    jTextFieldModelo.setText(vehiculo.getModelo());
                    jTextFieldNombre.setText(cliente.getNombre());
                    jTextFieldPlaca.setText(vehiculo.getPlaca());
                    jTextFieldTelefono.setText(cliente.getTelefono());
                    JOptionPane.showMessageDialog(this, alerta2 + " " + salida + jTextFieldFechaSalida.getText().toString());
                    jTextFieldNumero.setText("");

                } else {
                    JOptionPane.showMessageDialog(this, alerta3);
                    jTextFieldNumero.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(this, alerta3);
                jTextFieldNumero.setText("");

            }
        } catch (NumberFormatException excepcion) {
            JOptionPane.showMessageDialog(this, alerta3);
            jTextFieldNumero.setText("");

        }

    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();

    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        limpiar();

    }//GEN-LAST:event_formInternalFrameActivated

    public void limpiar() {
        jTextFieldCedula.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldFechaEntrada.setText("");
        jTextFieldFechaSalida.setText("");
        jTextFieldMarca.setText("");
        jTextFieldModelo.setText("");
        jTextFieldNombre.setText("");
        jTextFieldPlaca.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldNumero.setText("");
        jTextFieldTotal.setText("0.0");
        jTextFieldFracciones.setText("");
        jTextFieldTiempo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCedula1;
    private javax.swing.JLabel jLabelCedula4;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFechaEntrada;
    private javax.swing.JLabel jLabelFechaSalida;
    private javax.swing.JLabel jLabelFraccciones;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroDeTicket;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTiempo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatosCliente;
    private javax.swing.JPanel jPanelDatosVehiculo;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldFechaEntrada;
    private javax.swing.JTextField jTextFieldFechaSalida;
    private javax.swing.JTextField jTextFieldFracciones;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldTiempo;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JLabel labelClientePanel;
    private javax.swing.JLabel labelVehiculoPanel;
    // End of variables declaration//GEN-END:variables
}