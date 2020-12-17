/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.idao.ClienteDAO;
import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.idao.TicketDAO;
import ec.edu.ups.idao.VehiculoDAO;
import java.awt.Color;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author ariel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //Ventanas
    private VentanaListarTickets ventanaListarTickets;
    private VentanaRegistroDeEntrada ventanaRegistroDeEntrada;
    private VentanaRegistroDeSalida ventanaRegistroDeSalida;
    private VentanaCrearVehiculo ventanaCrearVehiculo;
    private VentanaCrearCliente ventanaCrearCliente;

    //Daos
    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;
    private ITicketDAO ticketDAO;

    //Controladores
    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorTicket controladorTicket;
    //idioma
    //localizacion
    private Locale localizacion;
    private ResourceBundle mensaje;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();

        //Instanciamos los Daos
        clienteDAO = new ClienteDAO();
        vehiculoDAO = new VehiculoDAO();
        ticketDAO = new TicketDAO();

        //Instanciamos los Controladores
        controladorCliente = new ControladorCliente(clienteDAO);
        controladorVehiculo = new ControladorVehiculo(vehiculoDAO, controladorCliente);
        controladorTicket = new ControladorTicket(ticketDAO);

        //Ventanas
        ventanaListarTickets = new VentanaListarTickets(controladorTicket);
        ventanaRegistroDeEntrada = new VentanaRegistroDeEntrada(controladorCliente, controladorTicket, controladorVehiculo);
        ventanaRegistroDeSalida = new VentanaRegistroDeSalida(controladorTicket);
        ventanaCrearVehiculo = new VentanaCrearVehiculo(ventanaRegistroDeEntrada, controladorVehiculo, controladorCliente);
        ventanaCrearCliente = new VentanaCrearCliente(ventanaRegistroDeEntrada, controladorCliente);

        //Agregar las ventanas internas
        jDesktopPane1.add(ventanaListarTickets);
        jDesktopPane1.add(ventanaRegistroDeEntrada);
        jDesktopPane1.add(ventanaRegistroDeSalida);

        //mensajes
        localizacion = new Locale("es", "EC");
        mensaje = ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes", localizacion);

    }

    public void cambiarIdioma(String idioma, String localidad) {
        localizacion = new Locale(idioma, localidad);
        mensaje = ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes", localizacion);
        //jButtonListarTickets.setText(mensaje.getString("listarTickets"));
        jButtonRegistrarEntrada.setText(mensaje.getString("registrarEntrada"));
        jButtonRegistrarSalida.setText(mensaje.getString("registrarSalida"));
        jLabelTitulo.setText(mensaje.getString("titulo"));
        jMenuAjustes.setText(mensaje.getString("ajustes"));
        jMenuIdioma.setText(mensaje.getString("idioma"));
        jMenuInicio.setText(mensaje.getString("inicio"));
        jMenuItemCerrar.setText(mensaje.getString("cerrar"));
        jMenuItemClientes.setText(mensaje.getString("clientes"));
        jMenuItemEspañol.setText(mensaje.getString("español"));
        jMenuItemIngles.setText(mensaje.getString("ingles"));
        jMenuItemIniciarSecion.setText(mensaje.getString("iniciarSesion"));
        jMenuItemRestaurar.setText(mensaje.getString("restaurar"));
        jMenuItemTickets.setText(mensaje.getString("tickets"));
        jMenuItemVehiculos.setText(mensaje.getString("vehiculos"));
        jMenuRegistro.setText(mensaje.getString("registro"));
        jMenuColor.setText(mensaje.getString("cambiarColorDelFondo"));
        rbCian.setText(mensaje.getString("cian"));
        rbGris.setText(mensaje.getString("gris"));
        rbMagenta.setText(mensaje.getString("magenta"));
        if (ventanaRegistroDeEntrada != null) {
            ventanaRegistroDeEntrada.setMensaje(mensaje);
            ventanaRegistroDeEntrada.cambiarIdioma(idioma, localidad);
            ventanaRegistroDeSalida.setMensaje(mensaje);
            ventanaRegistroDeSalida.cambiarIdioma(idioma, localidad);
            ventanaListarTickets.setMensaje(mensaje);
            ventanaListarTickets.cambiarIdioma(idioma, localidad);
            ventanaCrearVehiculo.setMensaje(mensaje);
            ventanaCrearVehiculo.cambiarIdioma(idioma, localidad);
            ventanaCrearCliente.setMensaje(mensaje);
            ventanaCrearCliente.cambiarIdioma(idioma, localidad);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonRegistrarEntrada = new javax.swing.JButton();
        jButtonRegistrarSalida = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuItemIniciarSecion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemCerrar = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemVehiculos = new javax.swing.JMenuItem();
        jMenuItemTickets = new javax.swing.JMenuItem();
        jMenuIdioma = new javax.swing.JMenu();
        jMenuItemEspañol = new javax.swing.JMenuItem();
        jMenuItemIngles = new javax.swing.JMenuItem();
        jMenuAjustes = new javax.swing.JMenu();
        jMenuColor = new javax.swing.JMenu();
        rbCian = new javax.swing.JRadioButtonMenuItem();
        rbGris = new javax.swing.JRadioButtonMenuItem();
        rbMagenta = new javax.swing.JRadioButtonMenuItem();
        jMenuItemRestaurar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parqueadero UPS");
        setResizable(false);
        setSize(new java.awt.Dimension(850, 600));

        jPanelPrincipal.setBackground(new java.awt.Color(12, 131, 131));

        jLabelTitulo.setFont(new java.awt.Font("Georgia", 1, 55)); // NOI18N
        jLabelTitulo.setText("Parqueadero UPS");

        jButtonRegistrarEntrada.setBackground(new java.awt.Color(86, 198, 93));
        jButtonRegistrarEntrada.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButtonRegistrarEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/botonRegistrarEntrada.png"))); // NOI18N
        jButtonRegistrarEntrada.setText("Registrar Entrada");
        jButtonRegistrarEntrada.setBorder(null);
        jButtonRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarEntradajButtonRegistroEntradaActionPerformed(evt);
            }
        });

        jButtonRegistrarSalida.setBackground(new java.awt.Color(228, 93, 93));
        jButtonRegistrarSalida.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButtonRegistrarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/botonRegistrarSalida.png"))); // NOI18N
        jButtonRegistrarSalida.setText("Registrar Salida");
        jButtonRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarSalidajButtonRegistroSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 227, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(147, 147, 147))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButtonRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanelPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setForeground(new java.awt.Color(0, 102, 102));

        jMenuInicio.setText("Inicio");
        jMenuInicio.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N

        jMenuItemIniciarSecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/iniciar-sesion.png"))); // NOI18N
        jMenuItemIniciarSecion.setText("Iniciar Sesion");
        jMenuInicio.add(jMenuItemIniciarSecion);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/hotel (1).png"))); // NOI18N
        jMenuItem1.setText("Registrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItem1);

        jMenuItemCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/cerrar.png"))); // NOI18N
        jMenuItemCerrar.setText("Cerrar");
        jMenuInicio.add(jMenuItemCerrar);

        menuBar.add(jMenuInicio);

        jMenuRegistro.setMnemonic('f');
        jMenuRegistro.setText("Registros");
        jMenuRegistro.setFocusTraversalPolicyProvider(true);
        jMenuRegistro.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N

        jMenuItemClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/hotel (1).png"))); // NOI18N
        jMenuItemClientes.setMnemonic('o');
        jMenuItemClientes.setText("Clientes");
        jMenuRegistro.add(jMenuItemClientes);

        jMenuItemVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/registro.png"))); // NOI18N
        jMenuItemVehiculos.setMnemonic('s');
        jMenuItemVehiculos.setText("Vehiculos");
        jMenuRegistro.add(jMenuItemVehiculos);

        jMenuItemTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/boleto-de-validacion.png"))); // NOI18N
        jMenuItemTickets.setMnemonic('a');
        jMenuItemTickets.setText("Tickets");
        jMenuItemTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTicketsActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemTickets);

        menuBar.add(jMenuRegistro);

        jMenuIdioma.setMnemonic('e');
        jMenuIdioma.setText("Idioma");
        jMenuIdioma.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N

        jMenuItemEspañol.setMnemonic('t');
        jMenuItemEspañol.setText("Español");
        jMenuItemEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEspañolActionPerformed(evt);
            }
        });
        jMenuIdioma.add(jMenuItemEspañol);

        jMenuItemIngles.setMnemonic('y');
        jMenuItemIngles.setText("Ingles");
        jMenuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInglesActionPerformed(evt);
            }
        });
        jMenuIdioma.add(jMenuItemIngles);

        menuBar.add(jMenuIdioma);

        jMenuAjustes.setText("Ajustes");
        jMenuAjustes.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N

        jMenuColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/paleta-de-color.png"))); // NOI18N
        jMenuColor.setText("Cambiar color del Fondo");

        rbCian.setText("Cian");
        rbCian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCianActionPerformed(evt);
            }
        });
        jMenuColor.add(rbCian);

        rbGris.setText("Gris");
        rbGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGrisActionPerformed(evt);
            }
        });
        jMenuColor.add(rbGris);

        rbMagenta.setText("Magenta");
        rbMagenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMagentaActionPerformed(evt);
            }
        });
        jMenuColor.add(rbMagenta);

        jMenuItemRestaurar.setText("Restaurar Color");
        jMenuItemRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRestaurarActionPerformed(evt);
            }
        });
        jMenuColor.add(jMenuItemRestaurar);

        jMenuAjustes.add(jMenuColor);

        menuBar.add(jMenuAjustes);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarEntradajButtonRegistroEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarEntradajButtonRegistroEntradaActionPerformed
        ventanaRegistroDeEntrada.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarEntradajButtonRegistroEntradaActionPerformed

    private void jButtonRegistrarSalidajButtonRegistroSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarSalidajButtonRegistroSalidaActionPerformed
        ventanaRegistroDeSalida.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarSalidajButtonRegistroSalidaActionPerformed

    private void rbCianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCianActionPerformed
        jPanelPrincipal.setBackground(Color.CYAN);

    }//GEN-LAST:event_rbCianActionPerformed

    private void rbGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGrisActionPerformed
        jPanelPrincipal.setBackground(Color.GRAY);

    }//GEN-LAST:event_rbGrisActionPerformed

    private void rbMagentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMagentaActionPerformed
        jPanelPrincipal.setBackground(Color.MAGENTA);

    }//GEN-LAST:event_rbMagentaActionPerformed

    private void jMenuItemRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRestaurarActionPerformed
        jPanelPrincipal.setBackground(new Color(12, 131, 131));

    }//GEN-LAST:event_jMenuItemRestaurarActionPerformed

    private void jMenuItemEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEspañolActionPerformed
        localizacion = new Locale("es", "EC");
        this.cambiarIdioma("es", "EC");
    }//GEN-LAST:event_jMenuItemEspañolActionPerformed

    private void jMenuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInglesActionPerformed
        localizacion = new Locale("en", "UK");
        this.cambiarIdioma("en", "UK");
    }//GEN-LAST:event_jMenuItemInglesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
ventanaCrearCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTicketsActionPerformed
   ventanaListarTickets.setVisible(true);
    }//GEN-LAST:event_jMenuItemTicketsActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarEntrada;
    private javax.swing.JButton jButtonRegistrarSalida;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenu jMenuAjustes;
    private javax.swing.JMenu jMenuColor;
    private javax.swing.JMenu jMenuIdioma;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCerrar;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemEspañol;
    private javax.swing.JMenuItem jMenuItemIngles;
    private javax.swing.JMenuItem jMenuItemIniciarSecion;
    private javax.swing.JMenuItem jMenuItemRestaurar;
    private javax.swing.JMenuItem jMenuItemTickets;
    private javax.swing.JMenuItem jMenuItemVehiculos;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButtonMenuItem rbCian;
    private javax.swing.JRadioButtonMenuItem rbGris;
    private javax.swing.JRadioButtonMenuItem rbMagenta;
    // End of variables declaration//GEN-END:variables

}
