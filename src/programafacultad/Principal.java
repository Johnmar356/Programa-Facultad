package programafacultad;

import conexion.*;
import java.sql.Connection;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import registrodeclases.LectorTxt;

/**
 * La clase principal del programa
 *
 * @author Leslie Vidal
 * @version 03.12.2020
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Constructor del principal
     */
    public Principal() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println(ex.toString());
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        PanelPrincipal = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Consultas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        consultaMaestro = new javax.swing.JButton();
        consultaHorario = new javax.swing.JButton();
        consultaMateria = new javax.swing.JButton();
        consultaHoras = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Modificaciones = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        modificarDocente = new javax.swing.JButton();
        modificarMateria = new javax.swing.JButton();
        modificarCurso = new javax.swing.JButton();
        Altas = new javax.swing.JPanel();
        altaMateria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        altaMaestro = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        altaCursoHorario = new javax.swing.JButton();
        LecturaDeArchivos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        leerArchivo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa Consultas");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Facultad De Ingenieria Campus Mexicali ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/uabc.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<Titulo del programa>");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Consultas");

        consultaMaestro.setText("Consulta por Maestro");
        consultaMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaMaestroActionPerformed(evt);
            }
        });

        consultaHorario.setText("Consulta por Horario");
        consultaHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaHorarioActionPerformed(evt);
            }
        });

        consultaMateria.setText("Consulta por Materia");
        consultaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaMateriaActionPerformed(evt);
            }
        });

        consultaHoras.setText("Consulta Hrs TC, Asig ");
        consultaHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultasLayout = new javax.swing.GroupLayout(Consultas);
        Consultas.setLayout(ConsultasLayout);
        ConsultasLayout.setHorizontalGroup(
            ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(ConsultasLayout.createSequentialGroup()
                                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(consultaHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(consultaHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(consultaMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(consultaMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(10, 10, 10))
                    .addGroup(ConsultasLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        ConsultasLayout.setVerticalGroup(
            ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultasLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaHorario)
                    .addComponent(consultaMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaHoras)
                    .addComponent(consultaMaestro))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Modificaciones");

        modificarDocente.setText("Modificar Docente");

        modificarMateria.setText("Modificar Materia");
        modificarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarMateriaActionPerformed(evt);
            }
        });

        modificarCurso.setText("Modificar Curso");

        javax.swing.GroupLayout ModificacionesLayout = new javax.swing.GroupLayout(Modificaciones);
        Modificaciones.setLayout(ModificacionesLayout);
        ModificacionesLayout.setHorizontalGroup(
            ModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(ModificacionesLayout.createSequentialGroup()
                        .addComponent(modificarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modificarDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ModificacionesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(modificarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ModificacionesLayout.setVerticalGroup(
            ModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificacionesLayout.createSequentialGroup()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarMateria)
                    .addComponent(modificarDocente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificarCurso)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        altaMateria.setFont(altaMateria.getFont().deriveFont((float)11));
        altaMateria.setText("Alta de  Materia");
        altaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaMateriaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Altas");

        altaMaestro.setText("Alta de Docente");
        altaMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaMaestroActionPerformed(evt);
            }
        });

        altaCursoHorario.setFont(altaCursoHorario.getFont().deriveFont((float)11));
        altaCursoHorario.setText("Alta de Curso");
        altaCursoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaCursoHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AltasLayout = new javax.swing.GroupLayout(Altas);
        Altas.setLayout(AltasLayout);
        AltasLayout.setHorizontalGroup(
            AltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(AltasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(AltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(altaCursoHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(AltasLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(AltasLayout.createSequentialGroup()
                                .addComponent(altaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(altaMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        AltasLayout.setVerticalGroup(
            AltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altaMateria)
                    .addComponent(altaMaestro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(altaCursoHorario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Leer Archivos");

        leerArchivo.setText("Leer Cursos, Horarios y Docentes");
        leerArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LecturaDeArchivosLayout = new javax.swing.GroupLayout(LecturaDeArchivos);
        LecturaDeArchivos.setLayout(LecturaDeArchivosLayout);
        LecturaDeArchivosLayout.setHorizontalGroup(
            LecturaDeArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LecturaDeArchivosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LecturaDeArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(leerArchivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LecturaDeArchivosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        LecturaDeArchivosLayout.setVerticalGroup(
            LecturaDeArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LecturaDeArchivosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leerArchivo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Consultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Altas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LecturaDeArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Consultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Altas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LecturaDeArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Inicia la ventana de la consulta horario y la hace visible
     *
     */    /**
     * Inicia la ventana de la consulta maestro y la hace visible
     *
     */    /**
     * Inicia la ventana de la consulta materia y la hace visible
     *
     */    /**
     * Inicia la ventana de la consulta horas y la hace visible
     *
     */    /**
     * Inicia la ventana de la alta maestro y la hace visible
     */    /**
     * Inicia la ventana de la alta materia y la hace visible
     *
     */
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
//        //Sirve para tener una proporción de las letras
//        int proporcion = 40;
//        //Crea la fuente
//        Font fuente = new Font("Arial", 1, 1 * getWidth() / proporcion);
//        //Asigna el tamaño de letra a cada boton y label
//        consultaHorario.setFont(fuente);
//        consultaHoras.setFont(fuente);
//        consultaMaestro.setFont(fuente);
//        consultaMateria.setFont(fuente);
//        altaMaestro.setFont(fuente);
//        altaMateria.setFont(fuente);
//        leerArchivo.setFont(fuente);
//        jLabel1.setFont(fuente);
//        jLabel2.setFont(fuente);
//        jLabel3.setFont(fuente);
    }//GEN-LAST:event_formComponentResized

    private void leerArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerArchivoActionPerformed
        //Crear el lector de texto
        LectorTxt lector = new LectorTxt();
        //Recupera los datos del archivo y si esta vacio le marca error
        if (lector.recuperarDatos().isEmpty()) {
            //Muestra los mensajes de error
            JOptionPane.showMessageDialog(this, "ERROR AL RECUPERAR ARCHIVOS", "ERROR",
                JOptionPane.ERROR_MESSAGE);
            //Si el archivo no esta vacio lee los datos
        } else {
            //Crear el objeto de profesor
            ProfesorDAO profesorDAO = new ProfesorDAO();
            //Se crea el objeto que comunica con la tabla
            MateriaDAO materiaDAO = new MateriaDAO();
            //Se crea el objeto que comunica con la tabla
            HorarioDAO horarioDAO = new HorarioDAO();
            //Se crea el objeto que comunica con la tabla
            CursoHorarioDAO cursoHorarioDAO = new CursoHorarioDAO();
            //Abre la conexión ssh
            profesorDAO.abrirSSH();
            //Abre la conexión a la base de datos
            profesorDAO.abrirConexion();
            try {
                Connection conexion = profesorDAO.getConexionBD();
                //Borra todos los elementos de la tabla
                profesorDAO.deleteAll();
                System.out.println("DATOS ELIMINADOS PROFESOR");
                //Recorre todo el arreglo del archivo que manda
                for (Profesor profesor : lector.getProfesor()) {
                    //Ingresa la información a la base de datos
                    profesorDAO.append(profesor);
                    //System.out.println("Agregado ---> " + profesor);
                }
                //Abre la conexión a la base de datos
                materiaDAO.setConexion(conexion);
                try {
                    //Borra todos los elementos de la tabla
                    materiaDAO.deleteAll();
                    System.out.println("DATOS ELIMINADOS MATERIA");
                    //Recorre todo el arreglo del archivo que manda
                    for (Materia materia : lector.getMateria()) {
                        //Ingresa la información a la base de datos
                        materiaDAO.append(materia);
                        //System.out.println("Agregado ---> " + materia);
                    }
                    //Abre la conexión a la base de datos
                    //horarioDAO.abrirConexion();
                    horarioDAO.setConexion(conexion);
                    try {
                        //Borra todos los elementos de la tabla
                        horarioDAO.deleteAll();
                        System.out.println("DATOS ELIMINADOS HORARIOS");
                        //Recorre todo el arreglo del archivo que manda
                        for (Horario horario : lector.getHorario()) {
                            //Ingresa la información a la base de datos
                            horarioDAO.append(horario);
                            //System.out.println("Agregado ---> " + horario);
                        }
                        //Se crea el objeto que comunica con la tabla
                        CursoDAO cursoDAO = new CursoDAO();
                        //Abre la conexión a la base de datos
                        //cursoDAO.abrirConexion();
                        cursoDAO.setConexion(conexion);
                        try {
                            //Borra todos los elementos de la tabla
                            cursoDAO.deleteAll();
                            System.out.println("DATOS ELIMINADOS CURSO");
                            //Recorre todo el arreglo del archivo que manda
                            for (Curso curso : lector.getCurso()) {
                                //Ingresa la información a la base de datos
                                cursoDAO.append(curso);
                                //System.out.println("Agregado ---> " + curso);
                            }
                            //Abre la conexión a la base de datos
                            //horarioDAO.abrirConexion();
                            horarioDAO.setConexion(conexion);
                            //Abre la conexión a la base de datos
                            //cursoHorarioDAO.abrirConexion();
                            cursoHorarioDAO.setConexion(conexion);
                            try {
                                //Borra todos los elementos de la tabla
                                cursoHorarioDAO.deleteAll();
                                System.out.println("DATOS ELIMINADOS CURSO_HORARIO");
                                //Recorre todo el arreglo del archivo que manda
                                for (CursoHorario cursoHorario : lector.getCursoHorario()) {
                                    cursoHorario.setHorario(horarioDAO.read(cursoHorario.getHorario()));
                                    //Ingresa la información a la base de datos
                                    cursoHorarioDAO.append(cursoHorario);
                                    //System.out.println("Agregado ---> " + cursoHorario);
                                }
                            } catch (Exception e) {
                                //Muestra los mensajes de error
                                System.out.println(e.toString());
                                JOptionPane.showMessageDialog(this, "ERROR CURSO_HORARIO\n" + e.getMessage(), "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                            }
                            JOptionPane.showMessageDialog(this, "SE HAN AGREGADO LOS DATOS", "DATOS AGREGADOS",
                                JOptionPane.INFORMATION_MESSAGE);
                        } catch (Exception e) {
                            //Muestra los mensajes de error
                            System.out.println(e.toString());
                            JOptionPane.showMessageDialog(this, "ERROR CURSO BD\n" + e.getMessage(), "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception e) {
                        //Muestra los mensajes de error
                        System.out.println(e.toString());
                        JOptionPane.showMessageDialog(this, "ERROR LEER BASE DE DATOS\n" + e.getMessage(), "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    //Muestra los mensajes de error
                    System.out.println(e.toString());
                    JOptionPane.showMessageDialog(this, "ERROR LEER BASE DE DATOS\n" + e.getMessage(), "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                //Muestra los mensajes de error
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(this, "ERROR BASE DE DATOS\n" + e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            } finally {
                //Cierra la conexion con el SSH
                profesorDAO.cerrarSSH();
            }
        }
    }//GEN-LAST:event_leerArchivoActionPerformed

    private void consultaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaMateriaActionPerformed
        //Hace visible la consulta horario
        FrmMateria materia = new FrmMateria(this);
        materia.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_consultaMateriaActionPerformed

    private void consultaHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaHorarioActionPerformed
        //Hace visible la consulta horario
        FrmHorario horario = new FrmHorario(this);
        horario.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_consultaHorarioActionPerformed

    private void consultaMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaMaestroActionPerformed
        //Hace visible la consulta horario
        FrmMaestro maestro = new FrmMaestro(this);
        maestro.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_consultaMaestroActionPerformed

    private void consultaHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaHorasActionPerformed
        //Hace visible la consulta horario
        FrmHoras hora = new FrmHoras(this, true);
        hora.setVisible(true);
    }//GEN-LAST:event_consultaHorasActionPerformed

    private void altaMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaMaestroActionPerformed
        //Hace visible la consulta horario
        AltaMaestro alta = new AltaMaestro(this);
        alta.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_altaMaestroActionPerformed

    private void altaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaMateriaActionPerformed
        AltaMateria alta = new AltaMateria(this);
        alta.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_altaMateriaActionPerformed

    private void altaCursoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaCursoHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altaCursoHorarioActionPerformed

    private void modificarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMateriaActionPerformed

    /**
     * Ejecución del programa
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Principal principal = new Principal();
        principal.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Altas;
    private javax.swing.JPanel Consultas;
    private javax.swing.JPanel LecturaDeArchivos;
    private javax.swing.JPanel Modificaciones;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton altaCursoHorario;
    private javax.swing.JButton altaMaestro;
    private javax.swing.JButton altaMateria;
    private javax.swing.JButton consultaHorario;
    private javax.swing.JButton consultaHoras;
    private javax.swing.JButton consultaMaestro;
    private javax.swing.JButton consultaMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton leerArchivo;
    private javax.swing.JButton modificarCurso;
    private javax.swing.JButton modificarDocente;
    private javax.swing.JButton modificarMateria;
    // End of variables declaration//GEN-END:variables
}
