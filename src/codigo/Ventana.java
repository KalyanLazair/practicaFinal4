/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;


/**
 *
 * @author Marta
 */
public class Ventana extends javax.swing.JFrame {

    //Creamos un objeto Conexiones para poder llamar a la clase Conexiones y obtener los métodos
    //que nos van a permitir insertar, modificar, borrar y acceder a los datos de la BBDD.
    Conexiones gesConn = new Conexiones();
    //Booleano de instancia que nos va a servir para cambiar el botón de insertar a borrar y para ejecutar la función de borrar.
    boolean cambiaBoton=false;
    
    public Ventana() {
        initComponents();
        //Sacamos por las tablas los registros en el momento en que el usuario abra el programa.
        tablaPerros.setModel(gesConn.consultaPerros());
        tablaSocios.setModel(gesConn.consultaProp());
        tablaClub.setModel(gesConn.consultaClub());
        
        //Los botones de modificar están iinvisibles.
        botonMP.setVisible(false);
        botonMS.setVisible(false);
        botonMC.setVisible(false);
        //Botones de cancelar empiezan en invisibles.
        botonCP.setVisible(false);
        botonCS.setVisible(false);
        botonCC.setVisible(false);
        //Ponemos la caja del año a false.
        jCheckBox1.setVisible(false);
        //Vamos a añadir un itemlistener para saber qué elemento ha sido seleccionado.
        desplegablePerro.addItemListener(new ItemListener(){
            
            public void itemStateChanged(ItemEvent event) {
               JComboBox desplegablePerro = (JComboBox) event.getSource();  //Obtenemos el origen del evento.
               //Cuando detecta que un elemento ha sido seleccionado, comprueba cuál es ese elemento. Si es
               //el elemento Nacimiento, entonces pone el checkbox de Año en visible. En caso que no sea Nacimiento
               //el checkbox desaparece.
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    String cajaSeleccionada=(String) desplegablePerro.getSelectedItem();
                    if(cajaSeleccionada.equals("Nacimiento")){
                       jCheckBox1.setVisible(true);
                    }else{
                       jCheckBox1.setVisible(false);
                    }
                }
               
            }
        });
        
    }


    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelPerros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPerros = new javax.swing.JTable();
        desplegablePerro = new javax.swing.JComboBox<>();
        botonBP = new javax.swing.JButton();
        cajaBuscaPerro = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cajaChip = new javax.swing.JTextField();
        cajaNombreP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaAfijo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaProp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaRaza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaSexo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cajaNac = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cajaDeporte = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cajaGrado = new javax.swing.JTextField();
        botonMP = new javax.swing.JButton();
        botonIP = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        mensajePerro = new javax.swing.JLabel();
        botonCP = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        panelProp = new javax.swing.JPanel();
        desplegableSocio = new javax.swing.JComboBox<>();
        cajaBuscaS = new javax.swing.JTextField();
        botonBS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSocios = new javax.swing.JTable();
        jTextField14 = new javax.swing.JTextField();
        cajaDNI = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cajaNombreS = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cajaApellidoS = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cajaClub = new javax.swing.JTextField();
        cajaTelefonoS = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cajaDirS = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        botonMS = new javax.swing.JButton();
        botonIS = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        botonCS = new javax.swing.JButton();
        panelClub = new javax.swing.JPanel();
        desplegableClub = new javax.swing.JComboBox<>();
        cajaBuscaClub = new javax.swing.JTextField();
        botonBC = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaClub = new javax.swing.JTable();
        jTextField46 = new javax.swing.JTextField();
        cajaCif = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        cajaDirC = new javax.swing.JTextField();
        cajaTelefonoC = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cajaNombreC = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        botonMC = new javax.swing.JButton();
        botonIC = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        botonCC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tablaPerros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPerros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaPerrosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPerros);

        desplegablePerro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desplegablePerro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chip", "Nombre", "Afijo", "Raza", "Deporte", "Grado", "Nacimiento", "Sexo", "Propietario" }));

        botonBP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBP.setText("Buscar");
        botonBP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBPMousePressed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Número de Chip;");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre;");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Afijo;");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Propietario;");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Raza;");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Sexo;");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Nacimiento;");

        cajaNac.setText("2001-01-20");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Deporte;");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Grado;");

        cajaGrado.setText("Brevet/1/2/3");

        botonMP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonMP.setText("Modificar");
        botonMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMPMousePressed(evt);
            }
        });

        botonIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonIP.setText("Insertar");
        botonIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIPMousePressed(evt);
            }
        });

        jTextField12.setBackground(new java.awt.Color(0, 51, 153));

        botonCP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCP.setText("Cancelar");
        botonCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCPMousePressed(evt);
            }
        });

        jCheckBox1.setText("AÑO");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBox1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelPerrosLayout = new javax.swing.GroupLayout(panelPerros);
        panelPerros.setLayout(panelPerrosLayout);
        panelPerrosLayout.setHorizontalGroup(
            panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTextField12)
            .addGroup(panelPerrosLayout.createSequentialGroup()
                .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelPerrosLayout.createSequentialGroup()
                        .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPerrosLayout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(desplegablePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaBuscaPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1))
                            .addGroup(panelPerrosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaChip, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPerrosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cajaNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4))
                    .addGroup(panelPerrosLayout.createSequentialGroup()
                        .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPerrosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajaAfijo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(panelPerrosLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(botonMP, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCP, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(mensajePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaProp, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonIP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerrosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        panelPerrosLayout.setVerticalGroup(
            panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desplegablePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaBuscaPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cajaChip, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cajaRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cajaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cajaNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cajaAfijo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPerrosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaProp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPerrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonMP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mensajePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Perros", panelPerros);

        desplegableSocio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desplegableSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Club" }));

        botonBS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBS.setText("Buscar");
        botonBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBSMousePressed(evt);
            }
        });

        tablaSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaSociosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaSocios);

        jTextField14.setBackground(new java.awt.Color(0, 51, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("DNI;");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Nombre;");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Apellidos;");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Club;");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Teléfono;");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Dirección;");

        jTextField44.setBackground(new java.awt.Color(0, 51, 153));

        botonMS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonMS.setText("Modificar");
        botonMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMSMousePressed(evt);
            }
        });

        botonIS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonIS.setText("Insertar");
        botonIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonISMousePressed(evt);
            }
        });

        botonCS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCS.setText("Cancelar");
        botonCS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCSMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelPropLayout = new javax.swing.GroupLayout(panelProp);
        panelProp.setLayout(panelPropLayout);
        panelPropLayout.setHorizontalGroup(
            panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTextField44)
            .addGroup(panelPropLayout.createSequentialGroup()
                .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPropLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPropLayout.createSequentialGroup()
                                .addComponent(desplegableSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cajaBuscaS, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(botonBS, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220))
                            .addGroup(panelPropLayout.createSequentialGroup()
                                .addComponent(botonMS, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCS, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(botonIS, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPropLayout.createSequentialGroup()
                        .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPropLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPropLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelPropLayout.createSequentialGroup()
                                        .addComponent(cajaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPropLayout.createSequentialGroup()
                                        .addComponent(cajaDirS, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPropLayout.createSequentialGroup()
                                        .addComponent(cajaNombreS, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaApellidoS, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPropLayout.createSequentialGroup()
                                        .addComponent(cajaTelefonoS, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cajaClub, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 314, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPropLayout.setVerticalGroup(
            panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPropLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desplegableSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaBuscaS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBS, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNombreS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaApellidoS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cajaClub, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(cajaDirS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTelefonoS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonMS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonIS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Socios", panelProp);

        desplegableClub.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desplegableClub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIF", "Nombre" }));

        botonBC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBC.setText("Buscar");
        botonBC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBCMousePressed(evt);
            }
        });

        tablaClub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaClubMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tablaClub);

        jTextField46.setBackground(new java.awt.Color(0, 51, 153));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("CIF;");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Dirección;");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Teléfono;");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Nombre;");

        jTextField56.setBackground(new java.awt.Color(0, 51, 153));

        botonMC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonMC.setText("Modificar");
        botonMC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMCMousePressed(evt);
            }
        });

        botonIC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonIC.setText("Insertar");
        botonIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonICMousePressed(evt);
            }
        });

        botonCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCC.setText("Cancelar");
        botonCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCCMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelClubLayout = new javax.swing.GroupLayout(panelClub);
        panelClub.setLayout(panelClubLayout);
        panelClubLayout.setHorizontalGroup(
            panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField46, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTextField56)
            .addGroup(panelClubLayout.createSequentialGroup()
                .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClubLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClubLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(desplegableClub, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cajaBuscaClub, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(botonBC, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClubLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClubLayout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cajaDirC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelClubLayout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaCif, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127)
                        .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelClubLayout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelClubLayout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(panelClubLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(botonMC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonIC, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelClubLayout.setVerticalGroup(
            panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClubLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desplegableClub, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaBuscaClub, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cajaCif, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38)
                        .addComponent(cajaNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClubLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaDirC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelClubLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(cajaTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Club", panelClub);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBPMousePressed
        //Botón de búsqueda de perro donde se va a ejecutar una consulta en función de la caja seleccionada.
        //Lo primero que hacemos es poner el mensaje de la caja en un string vacío.
        mensajePerro.setText("");
        botonIP.setText("Insertar"); //Ponemos el botón también de vuelta a insertar en caso de haber cambiado.
        //Obtenemos el objeto seleccionado del jComboBox y lo casteamos a string.
        String cajaSeleccionada=(String) desplegablePerro.getSelectedItem();
        String opcion="%"+cajaBuscaPerro.getText()+"%";
        String consulta="";
        
        //Si el textarea no está vacío, ejecutamos una consulta con prepared Statement.
        if(!cajaBuscaPerro.getText().equals("")){
             if(cajaSeleccionada.equals("Chip")){
                 //Le cambiamos la consulta a un valor absoluto para evitar problemas con la consulta equivalente.
                 opcion=cajaBuscaPerro.getText();
                 //Le pasamos la consulta como parámetro de entrada a la función.
                 consulta="SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI AND chip= ?";
                 //Ejecutamos la función y lo guardamos en la tabla.
                  tablaPerros.setModel(gesConn.consultaPerroPS(consulta, opcion));
                  //Reseteamos el textbox
                 cajaBuscaPerro.setText("");
             }else if(cajaSeleccionada.equals("Nombre")){
                 consulta="SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI AND p.nombre LIKE ?";
                 //Ejecutamos la función y lo guardamos en la tabla.
                  tablaPerros.setModel(gesConn.consultaPerroPS(consulta, opcion));
                  //Reseteamos el textbox
                 cajaBuscaPerro.setText("");
             }else if(cajaSeleccionada.equals("Afijo")){
                 consulta="SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI AND afijo LIKE ?";
                 //Ejecutamos la función y lo guardamos en la tabla.
                  tablaPerros.setModel(gesConn.consultaPerroPS(consulta, opcion));
                  //Reseteamos el textbox
                 cajaBuscaPerro.setText("");
             }else if(cajaSeleccionada.equals("Raza")){
                  consulta="SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI AND raza LIKE ?";
                  //Ejecutamos la función y lo guardamos en la tabla.
                  tablaPerros.setModel(gesConn.consultaPerroPS(consulta, opcion));
                  //Reseteamos el textbox
                 cajaBuscaPerro.setText("");
             }else if(cajaSeleccionada.equals("Deporte")){
                  consulta="SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI AND deporte LIKE ?";
                  //Ejecutamos la función y lo guardamos en la tabla.
                  tablaPerros.setModel(gesConn.consultaPerroPS(consulta, opcion));
                  //Reseteamos el textbox
                 cajaBuscaPerro.setText("");
             }else if(cajaSeleccionada.equals("Grado")){
                  consulta="SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI AND grado LIKE ?";
                  //Ejecutamos la función y lo guardamos en la tabla.
                  tablaPerros.setModel(gesConn.consultaPerroPS(consulta, opcion));
                  //Reseteamos el textbox
                 cajaBuscaPerro.setText("");
             }else if(cajaSeleccionada.equals("Sexo")){
                  consulta="SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI AND sexo LIKE ?";
                  //Ejecutamos la función y lo guardamos en la tabla.
                  tablaPerros.setModel(gesConn.consultaPerroPS(consulta, opcion));
                  //Reseteamos el textbox
                 cajaBuscaPerro.setText("");
             }else if(cajaSeleccionada.equals("Propietario")){
                 opcion=cajaBuscaPerro.getText(); //Obtenemos el texto de la caja.
                 int longitud= opcion.length(); //Obtenemos la longitud del texto
                 String nombre="";
                 String apellido="";
                 boolean espacioDetectado=false; //Para saber si hemos detectado un espacio o no.
                    //Procesamos usando un bucle for para saber si detectamos un espacio en blanco. Si lo hay es un
                    //nombre y apellido. Separamos el nombre y apellido en substrings que introducimos como párametro.
                    //También ponemos el booleano a true para saber que hemos encontrado un nombre y un apellido.
                 for(int i=0; i<longitud; i++){
                   if(opcion.charAt(i)==' '){
                      nombre= "%"+opcion.substring(0,i)+"%";
                      apellido= "%"+opcion.substring(i+1)+"%";
                      espacioDetectado=true;
                   }
                 } 
                 //Si el booleano está a false, el valor de nombre y apellido es el texto que encontramos en la caja (no hay espacio)
                 if(espacioDetectado==false){
                     nombre="%"+cajaBuscaPerro.getText()+"%";
                     apellido="%"+cajaBuscaPerro.getText()+"%"; 
                     tablaPerros.setModel(gesConn.consultaPerrosNA(nombre, apellido));
                 }else{  //Si el booleano está a true, ejecutamos con los substrings que hemos obtenido del bucle, y ponemos el booleano a false
                   tablaPerros.setModel(gesConn.consultaPerrosNA(nombre, apellido));
                   espacioDetectado=false;
                 }
                  
                  
             }else if(cajaSeleccionada.equals("Nacimiento")){
                opcion=cajaBuscaPerro.getText();
                if(jCheckBox1.isSelected()){
                   consulta="SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI AND YEAR(nacimiento) > ?";
                }else{                  
                   consulta= "SELECT * FROM perro p, propietario pr WHERE p.propietario=pr.DNI AND YEAR(nacimiento) < ?";
                }
                //Ejecutamos la función y lo guardamos en la tabla.
                System.out.println(consulta);
                  tablaPerros.setModel(gesConn.consultaPerroPS(consulta, opcion));
                  //Reseteamos el textbox
                 cajaBuscaPerro.setText("");
             }
            
        }else{
            //Si nos encontramos con una cadena vacía en el textbox, ejecuta una consulta y muestra todos los resultados de la bbdd
            //en la tabla.
            tablaPerros.setModel(gesConn.consultaPerros());
        }
        
        //Ponemos loas jTextFields a cadena vacía por si hubiesen estado usándose.
                     cajaChip.setText("");
                     cajaNombreP.setText("");
                     cajaAfijo.setText("");
                     cajaRaza.setText("");
                     cajaSexo.setText("");
                     cajaNac.setText("");
                     cajaDeporte.setText("");
                     cajaGrado.setText("");
                     cajaProp.setText("");
    }//GEN-LAST:event_botonBPMousePressed

    private void botonBSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBSMousePressed
         //Botón cosultas Prepared Statement en la tabla propietarios.
         jLabel16.setText(""); //Ponemos el jLabel a cadena vacía.
         botonIS.setText("Insertar");
         //
         String cajaSeleccionada=(String) desplegableSocio.getSelectedItem(); //Obtenemos cual de las opciones ha sido seleccionada.
         String consulta="";
         String parametro= "%" + cajaBuscaS.getText() + "%";
         
         //Si la caja no está vacía, ejecuta la consulta con Prepared Statement. En caso contrario nos muestra todos los resultados.
         if(!cajaBuscaS.getText().equals("")){
             //La consulta dependerá de la caja seleccionada
             if(cajaSeleccionada.equals("DNI")){
                consulta="SELECT * FROM propietario pr, club c WHERE c.CIF=pr.club AND DNI LIKE ?";
             }else if(cajaSeleccionada.equals("Nombre")){
                 consulta="SELECT * FROM propietario pr, club c WHERE c.CIF=pr.club AND pr.nombre LIKE ?";
             }else if(cajaSeleccionada.equals("Apellidos")){
                 consulta="SELECT * FROM propietario pr, club c WHERE c.CIF=pr.club AND apellidos LIKE ?";
             }else if(cajaSeleccionada.equals("Club")){
                 consulta="SELECT * FROM propietario pr, club c WHERE c.CIF=pr.club AND c.nombre LIKE ?";
             }
            //Sacamos el resultado por la tabla.
             tablaSocios.setModel(gesConn.consultaPropPR(consulta, parametro));
             //Reseteamos la caja.
             cajaBuscaS.setText("");
         }else{
             tablaSocios.setModel(gesConn.consultaProp());
         }
         
         //Ponemos los jTextFields a cadena vacía por si hubiesen estado usándose
                    cajaDNI.setText("");
                    cajaNombreS.setText("");
                    cajaApellidoS.setText("");
                    cajaDirS.setText("");
                    cajaTelefonoS.setText("");
                    cajaClub.setText("");
         
    }//GEN-LAST:event_botonBSMousePressed

    private void botonBCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBCMousePressed
        //Botón de búsqueda de Club por prepared Statement.
        jLabel17.setText(""); //Ponemos el jLabel a cadena vacía.
        botonIC.setText("Insertar"); //Restauramos también el botón.
        //Obtenemos el objeto seleccionado del jComboBox.
        String cajaSeleccionada = (String) desplegableClub.getSelectedItem(); //Casteamos a String porque jComboBox no nos genera un String.
        String consulta="";
        String parametro="%"+cajaBuscaClub.getText()+"%";
        
         if(!cajaBuscaClub.getText().equals("")){ //Si la caja de texto no está vacía, ejecuta.
            if(cajaSeleccionada.equals("CIF")){
                consulta="SELECT * FROM club WHERE CIF LIKE ?";
            }else if(cajaSeleccionada.equals("Nombre")){
                consulta="SELECT * FROM club WHERE nombre LIKE ?";
            }
            tablaClub.setModel(gesConn.consultaClubPS(consulta, parametro));
            cajaBuscaClub.setText(""); //Vacíamos la caja y la volvemos a poner en cadena vacía
         }else{ //Si la caja de texto está vacía, entonces nos muestra todos los resultados.
            tablaClub.setModel(gesConn.consultaClub());
         }
         
         //Ponemos los jTextFields a cadena vacía por si hubiesen estado usándose.
              cajaCif.setText("");
              cajaNombreC.setText("");
              cajaDirC.setText("");
              cajaTelefonoC.setText("");
    }//GEN-LAST:event_botonBCMousePressed

    private void botonIPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIPMousePressed
        //Botón de insertar perro. Necesitamos obtener las variables correspondientes de los textboxes.
        int chip = Integer.valueOf(cajaChip.getText());
        String nombre = cajaNombreP.getText();
        String afijo= cajaAfijo.getText();
        String raza= cajaRaza.getText();
        String sexo= cajaSexo.getText();
        String nac= cajaNac.getText();
        String deporte= cajaDeporte.getText();
        String grado= cajaGrado.getText();
        String prop= cajaProp.getText();
        
           //Vamos a comprobar el valor del booleano. Insertará o borrará dependiendo de ese valor.
           if(cambiaBoton==false){
               //Guardamos el valor que nos devuelve la función en un int para poder mostrar el mensaje en función de
               //si se ha insertado correctamente el perro o no.
               int ejecutaInsert=gesConn.insertaPerro(chip, nombre, afijo, raza, sexo, deporte, nac, grado, prop);
   
               //Si el perro se inserta correctamente, llamamos de nuevo a consultaPerros para que nos saque los datos por pantalla refrescados.
                if(ejecutaInsert==1){
                      mensajePerro.setText("El perro se ha insertado correctamente.");
                      tablaPerros.setModel(gesConn.consultaPerros());
                     //Ponemos las cajas con sus valores a cero.
                     cajaChip.setText("");
                     cajaNombreP.setText("");
                     cajaAfijo.setText("");
                     cajaRaza.setText("");
                     cajaSexo.setText("");
                     cajaNac.setText("");
                     cajaDeporte.setText("");
                     cajaGrado.setText("");
                     cajaProp.setText("");
           
                }else if(ejecutaInsert==-1){
                    mensajePerro.setText("No se ha podido insertar el registro en la Base de Datos!");
                }
           }else{
               int borraRegistro= gesConn.borraPerro(chip);
               
               if(borraRegistro==1){
                   mensajePerro.setText("El registro se ha borrado correctamente.");
                   tablaPerros.setModel(gesConn.consultaPerros());
                     //Ponemos las cajas con sus valores a cero.
                     cajaChip.setText("");
                     cajaNombreP.setText("");
                     cajaAfijo.setText("");
                     cajaRaza.setText("");
                     cajaSexo.setText("");
                     cajaNac.setText("");
                     cajaDeporte.setText("");
                     cajaGrado.setText("");
                     cajaProp.setText("");
                     //Ponemos el booleano a false.
                     cambiaBoton=false;
                     //Restauramos los botones.
                     botonIP.setText("Insertar");
                     botonMP.setVisible(false);
                     botonCP.setVisible(false);
               }else if(borraRegistro==-1){
                   mensajePerro.setText("No se ha podido borrar el registro de la Base de Datos!");
                   //Ponemos las cajas con sus valores a cero.
                     cajaChip.setText("");
                     cajaNombreP.setText("");
                     cajaAfijo.setText("");
                     cajaRaza.setText("");
                     cajaSexo.setText("");
                     cajaNac.setText("");
                     cajaDeporte.setText("");
                     cajaGrado.setText("");
                     cajaProp.setText("");
                     //Ponemos el booleano a false. De esta manera, funcione o no funcione el borrado, el booleano no se queda con
                     //valor a true y el usuario está obligado a clickear de nuevo en la tabla para iniciar de nuevo la función.
                     cambiaBoton=false;
               }
           }
    }//GEN-LAST:event_botonIPMousePressed

    private void botonISMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonISMousePressed
        //Inserción de un nuevo socio en la tabla propietario
        //Obtenemos los valores a insertar de las cajas en el interfaz gráfico.
        String dni= cajaDNI.getText();
        String nombre= cajaNombreS.getText();
        String apellidos= cajaApellidoS.getText();
        String direccion= cajaDirS.getText();
        int telefono= Integer.valueOf(cajaTelefonoS.getText());
        int club= Integer.valueOf(cajaClub.getText());
        
        
        //Comprobamos el valor del booleano. Para saber si insertamos (false) o borramos (true).
        if(cambiaBoton==false){
            //Guardamos el valor que nos devuelve la función en una variable int.
            int ejecutaInsert= gesConn.insertaProp(dni, nombre, apellidos, direccion, telefono, club);
            //Si se ha ejecutado correctamente.
             if(ejecutaInsert==1){
                    jLabel16.setText("El usuario se ha insertado correctamente.");
                    tablaSocios.setModel(gesConn.consultaProp());
                    //Ponemos las cajas con sus valores a cero.
                    cajaDNI.setText("");
                    cajaNombreS.setText("");
                    cajaApellidoS.setText("");
                    cajaDirS.setText("");
                    cajaTelefonoS.setText("");
                    cajaClub.setText("");
            
              }else if(ejecutaInsert==-1){
                    jLabel16.setText("No se ha podido insertar el registro en la Base de Datos!");
              }
        }else{
           int borraRegistro=gesConn.borraProp(dni);
           if(borraRegistro==1){
                jLabel16.setText("El registro se ha borrado correctamente.");
                tablaSocios.setModel(gesConn.consultaProp()); //Recargamos la tabla.
                    //Ponemos las cajas con sus valores a cero.
                    cajaDNI.setText("");
                    cajaNombreS.setText("");
                    cajaApellidoS.setText("");
                    cajaDirS.setText("");
                    cajaTelefonoS.setText("");
                    cajaClub.setText("");
                   //Ponemos el booleano a false.
                   cambiaBoton=false;
                   //Restauramos los botones.
                   botonIP.setText("Insertar");
                   botonMP.setVisible(false);
                   botonCP.setVisible(false);
                
           }else if(borraRegistro==-1){
                jLabel16.setText("No se ha podido borrar el registro.");
                //Ponemos las cajas con sus valores a cero.
                    cajaDNI.setText("");
                    cajaNombreS.setText("");
                    cajaApellidoS.setText("");
                    cajaDirS.setText("");
                    cajaTelefonoS.setText("");
                    cajaClub.setText("");
                 //Ponemos el booleano a false. Esto está pensado para que el usuario tenga que clickear en la tabla otra vez.
                 //Y el booleano no se quede con valor positivo.
                 cambiaBoton=false;
           }
        }
    }//GEN-LAST:event_botonISMousePressed

    private void botonICMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonICMousePressed
        //Inserción de un nuevo club. Obtenemos los valores de las cajas correspondientes.
        int CIF= Integer.valueOf(cajaCif.getText());
        String nombre= cajaNombreC.getText();
        String direccion= cajaDirC.getText();
        int telefono= Integer.valueOf(cajaTelefonoC.getText());
        
        //Vamos a comprobar el valor del booleano. Si es FALSE es un botón de insertar. Si es TRUE es un botón de borrar registro.
        if(cambiaBoton==false){
            //guardamos el valor que nos devuelve en una variable int.
            int ejecutaInsert=gesConn.insertaClub(CIF, nombre, direccion, telefono);
            //Comprobamos si la ejecución se ha hecho correctamente.
            if(ejecutaInsert==1){
                jLabel17.setText("El club se ha insertado correctamente.");
                tablaClub.setModel(gesConn.consultaClub());
                //Ponemos las cajas en vacío de nuevo.
                cajaCif.setText("");
                cajaNombreC.setText("");
                cajaDirC.setText("");
                cajaTelefonoC.setText("");
            }else if(ejecutaInsert==-1){
                jLabel17.setText("No se ha podido insertar el registro en la Base de Datos!");
            }
        }else{
            int borraRegistro=gesConn.borraClub(CIF);
            
            if(borraRegistro==1){
                jLabel17.setText("El registro se ha borrado correctamente.");
                tablaClub.setModel(gesConn.consultaClub()); //Hacemos un reload de la tabla.
                //Ponemos las cajas en vacío de nuevo.
                cajaCif.setText("");
                cajaNombreC.setText("");
                cajaDirC.setText("");
                cajaTelefonoC.setText("");
                //La variable booleana la ponemos a false.
                cambiaBoton=false;
                //Restauramos los botones.
                botonIC.setText("Insertar");
                botonCC.setVisible(false);
                botonMC.setVisible(false);
            }else if(borraRegistro==-1){
                jLabel17.setText("No se ha podido borrar el registro.");
                //Ponemos las cajas en vacío de nuevo.
                cajaCif.setText("");
                cajaNombreC.setText("");
                cajaDirC.setText("");
                cajaTelefonoC.setText("");
                //La variable booleana la ponemos a false. El usuario tiene que volver a clickear en la tabla y el booleano
                //no se queda a true una vez pulsado el botón.
                cambiaBoton=false;
            } 
        }
    }//GEN-LAST:event_botonICMousePressed

    private void tablaClubMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClubMousePressed
        //Método que nos va a permitir obtener los datos directamente de la tabla Club y sacarlos por los jTextFields.
        //Habilitamos el botón de modificar y cancelar. Cambiamos el texto del botón Inserta Club.
        botonMC.setVisible(true);
        botonCC.setVisible(true);
        botonIC.setText("Borrar");
        //Valor de booleano a true para poder acceder a los comandos que nos permiten borrar registros al presionar el botón de "editar"
        //reconfigurado a "borrar".
        cambiaBoton=true;
        
        int row= tablaClub.getSelectedRow(); //Obtenemos la tupla seleccionada.
        //Con ella obtenemos los valores de las diferentes celdas.
        String CIF= tablaClub.getModel().getValueAt(row, 0).toString();
        String nombre= tablaClub.getModel().getValueAt(row, 1).toString();
        String direccion= tablaClub.getModel().getValueAt(row, 2).toString();
        String telefono= tablaClub.getModel().getValueAt(row, 0).toString();
        //Sacamos esos valores a través de las cajas.
        cajaCif.setText(CIF);
        cajaNombreC.setText(nombre);
        cajaDirC.setText(direccion);
        cajaTelefonoC.setText(telefono);
    }//GEN-LAST:event_tablaClubMousePressed

    private void tablaPerrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPerrosMousePressed
        //Método que nos va a permitir obtener los datos directamente de la tabla Perro y sacarlos por los jTextFields.
        //Hacemos visible el botón de modificar. Cambiamos el texto y la funcionalidad (con el booleano) del botón insertar.
        botonMP.setVisible(true);
        botonCP.setVisible(true);
        botonIP.setText("Borrar");
        //Valor de booleano a true para poder acceder a los comandos que nos permiten borrar registros al presionar el botón de "editar"
        //reconfigurado a "borrar".
        cambiaBoton=true;
        
        int row= tablaPerros.getSelectedRow(); //Obtenemos la posición de la tupla seleccionada.
        
        //Vamos a sacar los valores de las celdas en variables string. 
        String chip= tablaPerros.getModel().getValueAt(row,0).toString();
        String nombre= tablaPerros.getModel().getValueAt(row,1).toString();
        String afijo= tablaPerros.getModel().getValueAt(row,2).toString();
        String raza= tablaPerros.getModel().getValueAt(row,3).toString();
        String sexo= tablaPerros.getModel().getValueAt(row,4).toString();
        String nac= tablaPerros.getModel().getValueAt(row,5).toString();
        String deporte= tablaPerros.getModel().getValueAt(row,6).toString();
        String grado= tablaPerros.getModel().getValueAt(row,7).toString();
        String prop= tablaPerros.getModel().getValueAt(row,9).toString();

        //Vamos a situar estos valores dentro de su correspondiente textfield.
        cajaChip.setText(chip);
        cajaNombreP.setText(nombre);
        cajaAfijo.setText(afijo);
        cajaRaza.setText(raza);
        cajaSexo.setText(sexo);
        cajaNac.setText(nac);
        cajaDeporte.setText(deporte);
        cajaGrado.setText(grado);
        cajaProp.setText(prop);
    }//GEN-LAST:event_tablaPerrosMousePressed

    private void tablaSociosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSociosMousePressed
        //Método para sacar los valores de propietario directamente de la tabla a través de los jTextFields.
        //Habilitamos el botón de modificar. Cambiamos el texto del botón insertar.
        botonMS.setVisible(true);
        botonCS.setVisible(true);
        botonIS.setText("Borrar");
        //Valor de booleano a true para poder acceder a los comandos que nos permiten borrar registros al presionar el botón de "editar"
        //reconfigurado a "borrar".
        cambiaBoton=true;
        
        int row= tablaSocios.getSelectedRow(); //Obtenemos la posición de la tupla seleccionada.
 
        //Sacamos los valores y los guardamos en variables.
        
        String dni= tablaSocios.getModel().getValueAt(row,0).toString();
        String nombre = tablaSocios.getModel().getValueAt(row,1).toString();
        String apellido= tablaSocios.getModel().getValueAt(row,2).toString();
        String direccion= tablaSocios.getModel().getValueAt(row,3).toString();
        String telefono= tablaSocios.getModel().getValueAt(row,4).toString();
        String cif= tablaSocios.getModel().getValueAt(row,6).toString();
        
        //Vamos a sacar los valores a través de los textfields.
        cajaDNI.setText(dni);
        cajaNombreS.setText(nombre);
        cajaApellidoS.setText(apellido);
        cajaDirS.setText(direccion);
        cajaTelefonoS.setText(telefono);
        cajaClub.setText(cif);
    }//GEN-LAST:event_tablaSociosMousePressed

    private void botonMPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMPMousePressed
        //Botón de modificar perro. Lo primero que vamos a hacer es poner el booleano a false.
        cambiaBoton=false;
        //Obtenemos de los textfields los valores que vamos a modificar.
        int chip = Integer.valueOf(cajaChip.getText());
        String nombre = cajaNombreP.getText();
        String afijo= cajaAfijo.getText();
        String raza= cajaRaza.getText();
        String sexo= cajaSexo.getText();
        String nac= cajaNac.getText();
        String deporte= cajaDeporte.getText();
        String grado= cajaGrado.getText();
        String prop= cajaProp.getText();
        
        //Obtenemos también el valor del método de modificarPerro.
        int ejecutaMod= gesConn.modificaPerro(chip, nombre, afijo, raza, sexo, nac, deporte, grado, prop);
        //Comprobamos si se ha modificado correctamente. 
        if(ejecutaMod==1){
           mensajePerro.setText("El registro se ha modificado correctamente.");
           tablaPerros.setModel(gesConn.consultaPerros());
           //Ponemos las cajas con sus valores a cero.
           cajaChip.setText("");
           cajaNombreP.setText("");
           cajaAfijo.setText("");
           cajaRaza.setText("");
           cajaSexo.setText("");
           cajaNac.setText("");
           cajaDeporte.setText("");
           cajaGrado.setText("");
           cajaProp.setText("");
           //Ocultamos de nuevo los botones.
           botonMP.setVisible(false);
           botonCP.setVisible(false);
           //El botón de borrar vuelve a insertar
              botonIP.setText("Insertar");
        }else if(ejecutaMod==-1){
           mensajePerro.setText("No se ha podido modificar el registro. Compruebe los valores e inténtelo de nuevo.");
        }
    }//GEN-LAST:event_botonMPMousePressed

    private void botonMSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMSMousePressed
        //MODIFICAR Propietario. El valor del booleano lo ponemos de nuevo a false.
        cambiaBoton= false;
        //Sacamos los valores de los jTextArea.
        String dni= cajaDNI.getText();
        String nombre= cajaNombreS.getText();
        String apellidos= cajaApellidoS.getText();
        String direccion= cajaDirS.getText();
        int telefono= Integer.valueOf(cajaTelefonoS.getText());
        int club= Integer.valueOf(cajaClub.getText());
        
        //Guardamos el valor del método en una variable int.
        int ejecutaMod= gesConn.modificaProp(dni, nombre, apellidos, direccion, telefono, club);
        
        if(ejecutaMod==1){
            jLabel16.setText("El registro se ha modificado correctamente.");
            tablaSocios.setModel(gesConn.consultaProp()); //Recargamos la tabla.
            //Ponemos las cajas con sus valores a cero.
            cajaDNI.setText("");
            cajaNombreS.setText("");
            cajaApellidoS.setText("");
            cajaDirS.setText("");
            cajaTelefonoS.setText("");
            cajaClub.setText("");
            //Ocultamos el botón
            botonMS.setVisible(false);
            botonCS.setVisible(false);
            //El botón de borrar vuelve a insertar
              botonIS.setText("Insertar");
        }else if(ejecutaMod==-1){
           jLabel16.setText("No se ha podido modificar el registro.");
        }
        
    }//GEN-LAST:event_botonMSMousePressed

    private void botonMCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMCMousePressed
        //BOTÓN DE MODIFICAR DATOS DE CLUB
        //Lo primero es poner el booleano a false.
        cambiaBoton= false;
        //Sacamos los datos de las cajas.
        int CIF= Integer.valueOf(cajaCif.getText());
        String nombre= cajaNombreC.getText();
        String direccion= cajaDirC.getText();
        int telefono= Integer.valueOf(cajaTelefonoC.getText());
        
        //Ejecutamos la función y guardamos su valor en una variable int.
        int ejecutaMod= gesConn.modificaClub(CIF, nombre, direccion, telefono);
        
        if(ejecutaMod==1){
              jLabel17.setText("El registro se ha modificado correctamente.");
              tablaClub.setModel(gesConn.consultaClub());
              //Ponemos las cajas en vacío de nuevo.
              cajaCif.setText("");
              cajaNombreC.setText("");
              cajaDirC.setText("");
              cajaTelefonoC.setText("");
              //Ocultamos de nuevo el botón.
              botonMC.setVisible(false);
              botonCC.setVisible(false);
              //El botón de borrar vuelve a insertar
              botonIC.setText("Insertar");
        }else if(ejecutaMod==-1){
             jLabel17.setText("No se ha podido modificar el registro.");
        }
    }//GEN-LAST:event_botonMCMousePressed

    private void botonCPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCPMousePressed
        //Botón cancelar en la pestaña perros.
        botonMP.setVisible(false);
        botonCP.setVisible(false);
        //Ponemos la variable booleana a false.
        cambiaBoton=false;
        //Ponemos el texto del botón de insertar de vuelta a insertar.
        botonIP.setText("Insertar");
         //Ponemos las cajas con sus valores a cero.
        cajaChip.setText("");
        cajaNombreP.setText("");
        cajaAfijo.setText("");
        cajaRaza.setText("");
        cajaSexo.setText("");
        cajaNac.setText("");
        cajaDeporte.setText("");
        cajaGrado.setText("");
        cajaProp.setText("");
    }//GEN-LAST:event_botonCPMousePressed

    private void botonCSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCSMousePressed
        //Botón cancelar pestaña socios.
        botonMS.setVisible(false);
        botonCS.setVisible(false);
        //Ponemos la variable booleana a false.
        cambiaBoton=false;
        //Ponemos el texto del botón de insertar de vuelta a insertar.
        botonIS.setText("Insertar");
        //Ponemos las cajas con sus valores a cero.
        cajaDNI.setText("");
        cajaNombreS.setText("");
        cajaApellidoS.setText("");
        cajaDirS.setText("");
        cajaTelefonoS.setText("");
        cajaClub.setText("");
    }//GEN-LAST:event_botonCSMousePressed

    private void botonCCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCCMousePressed
        //Botón cancelar pestaña club
        botonMC.setVisible(false);
        botonCC.setVisible(false);
        //Ponemos la variable booleana a false.
        cambiaBoton=false;
        //Ponemos el texto del botón de insertar de vuelta a insertar.
        botonIC.setText("Insertar");
        //Ponemos las cajas en vacío de nuevo.
        cajaCif.setText("");
        cajaNombreC.setText("");
        cajaDirC.setText("");
        cajaTelefonoC.setText("");
    }//GEN-LAST:event_botonCCMousePressed

    private void jCheckBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MousePressed
        //Caja checkbox.
        if(jCheckBox1.isSelected()){
           jCheckBox1.setText("Año; Menor qué");
        }else{
           jCheckBox1.setText("Año; Mayor qué");
        }
    }//GEN-LAST:event_jCheckBox1MousePressed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBC;
    private javax.swing.JButton botonBP;
    private javax.swing.JButton botonBS;
    private javax.swing.JButton botonCC;
    private javax.swing.JButton botonCP;
    private javax.swing.JButton botonCS;
    private javax.swing.JButton botonIC;
    private javax.swing.JButton botonIP;
    private javax.swing.JButton botonIS;
    private javax.swing.JButton botonMC;
    private javax.swing.JButton botonMP;
    private javax.swing.JButton botonMS;
    private javax.swing.JTextField cajaAfijo;
    private javax.swing.JTextField cajaApellidoS;
    private javax.swing.JTextField cajaBuscaClub;
    private javax.swing.JTextField cajaBuscaPerro;
    private javax.swing.JTextField cajaBuscaS;
    private javax.swing.JTextField cajaChip;
    private javax.swing.JTextField cajaCif;
    private javax.swing.JTextField cajaClub;
    private javax.swing.JTextField cajaDNI;
    private javax.swing.JTextField cajaDeporte;
    private javax.swing.JTextField cajaDirC;
    private javax.swing.JTextField cajaDirS;
    private javax.swing.JTextField cajaGrado;
    private javax.swing.JTextField cajaNac;
    private javax.swing.JTextField cajaNombreC;
    private javax.swing.JTextField cajaNombreP;
    private javax.swing.JTextField cajaNombreS;
    private javax.swing.JTextField cajaProp;
    private javax.swing.JTextField cajaRaza;
    private javax.swing.JTextField cajaSexo;
    private javax.swing.JTextField cajaTelefonoC;
    private javax.swing.JTextField cajaTelefonoS;
    private javax.swing.JComboBox<String> desplegableClub;
    private javax.swing.JComboBox<String> desplegablePerro;
    private javax.swing.JComboBox<String> desplegableSocio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JLabel mensajePerro;
    private javax.swing.JPanel panelClub;
    private javax.swing.JPanel panelPerros;
    private javax.swing.JPanel panelProp;
    private javax.swing.JTable tablaClub;
    private javax.swing.JTable tablaPerros;
    private javax.swing.JTable tablaSocios;
    // End of variables declaration//GEN-END:variables
}
