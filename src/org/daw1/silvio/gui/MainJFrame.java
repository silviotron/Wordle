/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.daw1.silvio.gui;

import org.daw1.silvio.motores.MotorArchivo;
import org.daw1.silvio.motores.MotorAlumnos;
import org.daw1.silvio.motores.IMotor;
import org.daw1.silvio.motores.MotorBD;
import org.daw1.silvio.motores.MotorTest;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author silvi
 */
public class MainJFrame extends javax.swing.JFrame {
    
    protected static final Color COLOR_NEGRO = new Color(55,55,55);
    protected static final Color COLOR_GRIS = new Color(100,100,100);
    protected static final Color COLOR_BLANCO = new Color(255,255,255);
    protected static final Color COLOR_AMARILLO = new Color(255,201,0);
    protected static final Color COLOR_ROJO = new Color(255,60,14);
    protected static final Color COLOR_VERDE = new Color(150,255,70);
    protected static final Color COLOR_CLARO = new Color(150,150,150);

    private IMotor motor;
    private JRadioButtonMenuItem motorSeleccionado = this.motor1JRadioButtonMenuItem;
    private Map<Character, Integer> mapaObjetivo;   
    private String objetivo;
    private String palabra;
    private String palabras[];
    private int fila = 0;
    private JLabel cuadricula[][];
    Map<Character, JButton> mapaTeclado;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame(IMotor motor) {

        initComponents();
        inicializar();
        this.motor = motor;
        objetivo = motor.obtenerPalabraAleatoria();
        mapaObjetivo = crearMapaObjetivo();
        palabras = new String[6];

    }

    public MainJFrame() {
        initComponents();
        inicializar();
        this.motor = new MotorTest();
        objetivo = motor.obtenerPalabraAleatoria();
        mapaObjetivo = crearMapaObjetivo();
        palabras = new String[6];
        this.palabrajTextField.setHighlighter(null);
        this.motor1JRadioButtonMenuItem.setSelected(true);
        this.motor2JRadioButtonMenuItem.setSelected(false);


    }
    
    private Map crearMapaObjetivo(){
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : objetivo.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }else{
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
        
    }
    
    private void inicializar(){
        JLabel eje[][] = {
            {this.jLabel0_0, this.jLabel0_1, this.jLabel0_2, this.jLabel0_3, this.jLabel0_4},
            {this.jLabel1_0, this.jLabel1_1, this.jLabel1_2, this.jLabel1_3, this.jLabel1_4},
            {this.jLabel2_0, this.jLabel2_1, this.jLabel2_2, this.jLabel2_3, this.jLabel2_4},
            {this.jLabel3_0, this.jLabel3_1, this.jLabel3_2, this.jLabel3_3, this.jLabel3_4},
            {this.jLabel4_0, this.jLabel4_1, this.jLabel4_2, this.jLabel4_3, this.jLabel4_4},
            {this.jLabel5_0, this.jLabel5_1, this.jLabel5_2, this.jLabel5_3, this.jLabel5_4}
        }; 
        cuadricula = eje;        
        this.mapaTeclado = new HashMap<>();
        mapaTeclado.put('Q', TecladojButtonQ);
        mapaTeclado.put('W', TecladojButtonW);
        mapaTeclado.put('E', TecladojButtonE);
        mapaTeclado.put('R', TecladojButtonR);
        mapaTeclado.put('T', TecladojButtonT);
        mapaTeclado.put('Y', TecladojButtonY);
        mapaTeclado.put('U', TecladojButtonU);
        mapaTeclado.put('I', TecladojButtonI);
        mapaTeclado.put('O', TecladojButtonO);
        mapaTeclado.put('P', TecladojButtonP);
        mapaTeclado.put('A', TecladojButtonA);
        mapaTeclado.put('S', TecladojButtonS);
        mapaTeclado.put('D', TecladojButtonD);
        mapaTeclado.put('F', TecladojButtonF);
        mapaTeclado.put('G', TecladojButtonG);
        mapaTeclado.put('H', TecladojButtonH);
        mapaTeclado.put('J', TecladojButtonJ);
        mapaTeclado.put('K', TecladojButtonK);
        mapaTeclado.put('L', TecladojButtonL);
        mapaTeclado.put('Ñ', TecladojButtonÑ);
        mapaTeclado.put('Z', TecladojButtonZ);
        mapaTeclado.put('X', TecladojButtonX);
        mapaTeclado.put('C', TecladojButtonC);
        mapaTeclado.put('V', TecladojButtonV);
        mapaTeclado.put('B', TecladojButtonB);
        mapaTeclado.put('N', TecladojButtonN);
        mapaTeclado.put('M', TecladojButtonM);
        mapaTeclado.put('+', TecladojButtonEnter);
        mapaTeclado.put('-', TecladojButtonDelete);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        motoresButtonGroup = new javax.swing.ButtonGroup();
        palabrajTextField = new javax.swing.JTextField();
        fondojPanel = new javax.swing.JPanel();
        principaljPanel = new javax.swing.JPanel();
        jLabel0_0 = new javax.swing.JLabel();
        jLabel0_1 = new javax.swing.JLabel();
        jLabel0_2 = new javax.swing.JLabel();
        jLabel0_3 = new javax.swing.JLabel();
        jLabel0_4 = new javax.swing.JLabel();
        jLabel1_0 = new javax.swing.JLabel();
        jLabel1_1 = new javax.swing.JLabel();
        jLabel1_2 = new javax.swing.JLabel();
        jLabel1_3 = new javax.swing.JLabel();
        jLabel1_4 = new javax.swing.JLabel();
        jLabel2_0 = new javax.swing.JLabel();
        jLabel2_1 = new javax.swing.JLabel();
        jLabel2_2 = new javax.swing.JLabel();
        jLabel2_3 = new javax.swing.JLabel();
        jLabel2_4 = new javax.swing.JLabel();
        jLabel3_0 = new javax.swing.JLabel();
        jLabel3_1 = new javax.swing.JLabel();
        jLabel3_2 = new javax.swing.JLabel();
        jLabel3_3 = new javax.swing.JLabel();
        jLabel3_4 = new javax.swing.JLabel();
        jLabel4_0 = new javax.swing.JLabel();
        jLabel4_1 = new javax.swing.JLabel();
        jLabel4_2 = new javax.swing.JLabel();
        jLabel4_3 = new javax.swing.JLabel();
        jLabel4_4 = new javax.swing.JLabel();
        jLabel5_0 = new javax.swing.JLabel();
        jLabel5_1 = new javax.swing.JLabel();
        jLabel5_2 = new javax.swing.JLabel();
        jLabel5_3 = new javax.swing.JLabel();
        jLabel5_4 = new javax.swing.JLabel();
        titulojLabel = new javax.swing.JLabel();
        textojLabel1 = new javax.swing.JLabel();
        TecladojPanel = new javax.swing.JPanel();
        TecladojButtonQ = new javax.swing.JButton();
        TecladojButtonW = new javax.swing.JButton();
        TecladojButtonE = new javax.swing.JButton();
        TecladojButtonR = new javax.swing.JButton();
        TecladojButtonT = new javax.swing.JButton();
        TecladojButtonY = new javax.swing.JButton();
        TecladojButtonU = new javax.swing.JButton();
        TecladojButtonI = new javax.swing.JButton();
        TecladojButtonO = new javax.swing.JButton();
        TecladojButtonP = new javax.swing.JButton();
        TecladojButtonA = new javax.swing.JButton();
        TecladojButtonS = new javax.swing.JButton();
        TecladojButtonD = new javax.swing.JButton();
        TecladojButtonF = new javax.swing.JButton();
        TecladojButtonG = new javax.swing.JButton();
        TecladojButtonH = new javax.swing.JButton();
        TecladojButtonJ = new javax.swing.JButton();
        TecladojButtonK = new javax.swing.JButton();
        TecladojButtonL = new javax.swing.JButton();
        TecladojButtonÑ = new javax.swing.JButton();
        TecladojButtonEnter = new javax.swing.JButton();
        TecladojButtonZ = new javax.swing.JButton();
        TecladojButtonX = new javax.swing.JButton();
        TecladojButtonC = new javax.swing.JButton();
        TecladojButtonV = new javax.swing.JButton();
        TecladojButtonB = new javax.swing.JButton();
        TecladojButtonN = new javax.swing.JButton();
        TecladojButtonM = new javax.swing.JButton();
        TecladojButtonDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nuevoJMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        motor1JRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        motor2JRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        motor4JRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        motor3JRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        motor5JRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        palabrajTextField.setBackground(new java.awt.Color(102, 102, 102));
        palabrajTextField.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        palabrajTextField.setForeground(new java.awt.Color(102, 102, 102));
        palabrajTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        palabrajTextField.setBorder(null);
        palabrajTextField.setCaretColor(new java.awt.Color(102, 102, 102));
        palabrajTextField.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        palabrajTextField.setMargin(new java.awt.Insets(2, 10, 2, 6));
        palabrajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabrajTextFieldActionPerformed(evt);
            }
        });
        palabrajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                palabrajTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                palabrajTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                palabrajTextFieldKeyTyped(evt);
            }
        });

        fondojPanel.setBackground(new java.awt.Color(51, 51, 51));

        principaljPanel.setBackground(new java.awt.Color(100, 100, 100));
        principaljPanel.setLayout(new java.awt.GridLayout(6, 5));

        jLabel0_0.setBackground(new java.awt.Color(60, 60, 60));
        jLabel0_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_0.setForeground(new java.awt.Color(150, 150, 150));
        jLabel0_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_0.setAlignmentX(0.5F);
        jLabel0_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_0);

        jLabel0_1.setBackground(new java.awt.Color(60, 60, 60));
        jLabel0_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_1.setForeground(new java.awt.Color(150, 150, 150));
        jLabel0_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_1.setAlignmentX(0.5F);
        jLabel0_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_1);

        jLabel0_2.setBackground(new java.awt.Color(60, 60, 60));
        jLabel0_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_2.setForeground(new java.awt.Color(150, 150, 150));
        jLabel0_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_2.setAlignmentX(0.5F);
        jLabel0_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_2);

        jLabel0_3.setBackground(new java.awt.Color(60, 60, 60));
        jLabel0_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_3.setForeground(new java.awt.Color(150, 150, 150));
        jLabel0_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_3.setAlignmentX(0.5F);
        jLabel0_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_3);

        jLabel0_4.setBackground(new java.awt.Color(60, 60, 60));
        jLabel0_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_4.setForeground(new java.awt.Color(150, 150, 150));
        jLabel0_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_4.setAlignmentX(0.5F);
        jLabel0_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_4);

        jLabel1_0.setBackground(new java.awt.Color(60, 60, 60));
        jLabel1_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_0.setForeground(new java.awt.Color(150, 150, 150));
        jLabel1_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_0.setAlignmentX(0.5F);
        jLabel1_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_0);

        jLabel1_1.setBackground(new java.awt.Color(60, 60, 60));
        jLabel1_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_1.setForeground(new java.awt.Color(150, 150, 150));
        jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_1.setAlignmentX(0.5F);
        jLabel1_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_1);

        jLabel1_2.setBackground(new java.awt.Color(60, 60, 60));
        jLabel1_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_2.setForeground(new java.awt.Color(150, 150, 150));
        jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_2.setAlignmentX(0.5F);
        jLabel1_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_2);

        jLabel1_3.setBackground(new java.awt.Color(60, 60, 60));
        jLabel1_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_3.setForeground(new java.awt.Color(150, 150, 150));
        jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_3.setAlignmentX(0.5F);
        jLabel1_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_3);

        jLabel1_4.setBackground(new java.awt.Color(60, 60, 60));
        jLabel1_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_4.setForeground(new java.awt.Color(150, 150, 150));
        jLabel1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_4.setAlignmentX(0.5F);
        jLabel1_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_4);

        jLabel2_0.setBackground(new java.awt.Color(60, 60, 60));
        jLabel2_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_0.setForeground(new java.awt.Color(150, 150, 150));
        jLabel2_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_0.setAlignmentX(0.5F);
        jLabel2_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_0);

        jLabel2_1.setBackground(new java.awt.Color(60, 60, 60));
        jLabel2_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_1.setForeground(new java.awt.Color(150, 150, 150));
        jLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_1.setAlignmentX(0.5F);
        jLabel2_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_1);

        jLabel2_2.setBackground(new java.awt.Color(60, 60, 60));
        jLabel2_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_2.setForeground(new java.awt.Color(150, 150, 150));
        jLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_2.setAlignmentX(0.5F);
        jLabel2_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_2);

        jLabel2_3.setBackground(new java.awt.Color(60, 60, 60));
        jLabel2_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_3.setForeground(new java.awt.Color(150, 150, 150));
        jLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_3.setAlignmentX(0.5F);
        jLabel2_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_3);

        jLabel2_4.setBackground(new java.awt.Color(60, 60, 60));
        jLabel2_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_4.setForeground(new java.awt.Color(150, 150, 150));
        jLabel2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_4.setAlignmentX(0.5F);
        jLabel2_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_4);

        jLabel3_0.setBackground(new java.awt.Color(60, 60, 60));
        jLabel3_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_0.setForeground(new java.awt.Color(150, 150, 150));
        jLabel3_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_0.setAlignmentX(0.5F);
        jLabel3_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_0);

        jLabel3_1.setBackground(new java.awt.Color(60, 60, 60));
        jLabel3_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_1.setForeground(new java.awt.Color(150, 150, 150));
        jLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_1.setAlignmentX(0.5F);
        jLabel3_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_1);

        jLabel3_2.setBackground(new java.awt.Color(60, 60, 60));
        jLabel3_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_2.setForeground(new java.awt.Color(150, 150, 150));
        jLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_2.setAlignmentX(0.5F);
        jLabel3_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_2);

        jLabel3_3.setBackground(new java.awt.Color(60, 60, 60));
        jLabel3_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_3.setForeground(new java.awt.Color(150, 150, 150));
        jLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_3.setAlignmentX(0.5F);
        jLabel3_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_3);

        jLabel3_4.setBackground(new java.awt.Color(60, 60, 60));
        jLabel3_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_4.setForeground(new java.awt.Color(150, 150, 150));
        jLabel3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_4.setAlignmentX(0.5F);
        jLabel3_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_4);

        jLabel4_0.setBackground(new java.awt.Color(60, 60, 60));
        jLabel4_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_0.setForeground(new java.awt.Color(150, 150, 150));
        jLabel4_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_0.setAlignmentX(0.5F);
        jLabel4_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_0);

        jLabel4_1.setBackground(new java.awt.Color(60, 60, 60));
        jLabel4_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_1.setForeground(new java.awt.Color(150, 150, 150));
        jLabel4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_1.setAlignmentX(0.5F);
        jLabel4_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_1);

        jLabel4_2.setBackground(new java.awt.Color(60, 60, 60));
        jLabel4_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_2.setForeground(new java.awt.Color(150, 150, 150));
        jLabel4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_2.setAlignmentX(0.5F);
        jLabel4_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_2);

        jLabel4_3.setBackground(new java.awt.Color(60, 60, 60));
        jLabel4_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_3.setForeground(new java.awt.Color(150, 150, 150));
        jLabel4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_3.setAlignmentX(0.5F);
        jLabel4_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_3);

        jLabel4_4.setBackground(new java.awt.Color(60, 60, 60));
        jLabel4_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_4.setForeground(new java.awt.Color(150, 150, 150));
        jLabel4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_4.setAlignmentX(0.5F);
        jLabel4_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_4);

        jLabel5_0.setBackground(new java.awt.Color(60, 60, 60));
        jLabel5_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_0.setForeground(new java.awt.Color(150, 150, 150));
        jLabel5_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_0.setAlignmentX(0.5F);
        jLabel5_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_0);

        jLabel5_1.setBackground(new java.awt.Color(60, 60, 60));
        jLabel5_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_1.setForeground(new java.awt.Color(150, 150, 150));
        jLabel5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_1.setAlignmentX(0.5F);
        jLabel5_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_1);

        jLabel5_2.setBackground(new java.awt.Color(60, 60, 60));
        jLabel5_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_2.setForeground(new java.awt.Color(150, 150, 150));
        jLabel5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_2.setAlignmentX(0.5F);
        jLabel5_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_2);

        jLabel5_3.setBackground(new java.awt.Color(60, 60, 60));
        jLabel5_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_3.setForeground(new java.awt.Color(150, 150, 150));
        jLabel5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_3.setAlignmentX(0.5F);
        jLabel5_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_3);

        jLabel5_4.setBackground(new java.awt.Color(60, 60, 60));
        jLabel5_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_4.setForeground(new java.awt.Color(150, 150, 150));
        jLabel5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_4.setAlignmentX(0.5F);
        jLabel5_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_4);

        titulojLabel.setFont(new java.awt.Font("Monospaced", 1, 56)); // NOI18N
        titulojLabel.setForeground(new java.awt.Color(153, 153, 153));
        titulojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulojLabel.setText("WORDLE");

        textojLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textojLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textojLabel1.setText(" ");

        TecladojPanel.setBackground(new java.awt.Color(51, 51, 51));
        TecladojPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 2));

        TecladojButtonQ.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonQ.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonQ.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonQ.setText("Q");
        TecladojButtonQ.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        TecladojButtonQ.setFocusable(false);
        TecladojButtonQ.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonQ.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonQ.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonQ.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonQActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonQ);

        TecladojButtonW.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonW.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonW.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonW.setText("W");
        TecladojButtonW.setFocusable(false);
        TecladojButtonW.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonW.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonW.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonW.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonWActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonW);

        TecladojButtonE.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonE.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonE.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonE.setText("E");
        TecladojButtonE.setFocusable(false);
        TecladojButtonE.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonE.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonE.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonE.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonEActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonE);

        TecladojButtonR.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonR.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonR.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonR.setText("R");
        TecladojButtonR.setFocusable(false);
        TecladojButtonR.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonR.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonR.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonR.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonRActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonR);

        TecladojButtonT.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonT.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonT.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonT.setText("T");
        TecladojButtonT.setFocusable(false);
        TecladojButtonT.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonT.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonT.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonT.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonTActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonT);

        TecladojButtonY.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonY.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonY.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonY.setText("Y");
        TecladojButtonY.setFocusable(false);
        TecladojButtonY.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonY.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonY.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonY.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonYActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonY);

        TecladojButtonU.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonU.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonU.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonU.setText("U");
        TecladojButtonU.setFocusable(false);
        TecladojButtonU.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonU.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonU.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonU.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonUActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonU);

        TecladojButtonI.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonI.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonI.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonI.setText("I");
        TecladojButtonI.setFocusable(false);
        TecladojButtonI.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonI.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonI.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonI.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonIActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonI);

        TecladojButtonO.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonO.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonO.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonO.setText("O");
        TecladojButtonO.setFocusable(false);
        TecladojButtonO.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonO.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonO.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonO.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonOActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonO);

        TecladojButtonP.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonP.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonP.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonP.setText("P");
        TecladojButtonP.setFocusable(false);
        TecladojButtonP.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonP.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonP.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonP.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonPActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonP);

        TecladojButtonA.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonA.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonA.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonA.setText("A");
        TecladojButtonA.setFocusable(false);
        TecladojButtonA.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonA.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonA.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonA.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonAActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonA);

        TecladojButtonS.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonS.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonS.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonS.setText("S");
        TecladojButtonS.setFocusable(false);
        TecladojButtonS.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonS.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonS.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonS.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonSActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonS);

        TecladojButtonD.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonD.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonD.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonD.setText("D");
        TecladojButtonD.setFocusable(false);
        TecladojButtonD.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonD.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonD.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonD.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonDActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonD);

        TecladojButtonF.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonF.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonF.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonF.setText("F");
        TecladojButtonF.setFocusable(false);
        TecladojButtonF.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonF.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonF.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonF.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonFActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonF);

        TecladojButtonG.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonG.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonG.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonG.setText("G");
        TecladojButtonG.setFocusable(false);
        TecladojButtonG.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonG.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonG.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonG.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonGActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonG);

        TecladojButtonH.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonH.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonH.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonH.setText("H");
        TecladojButtonH.setFocusable(false);
        TecladojButtonH.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonH.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonH.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonH.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonHActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonH);

        TecladojButtonJ.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonJ.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonJ.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonJ.setText("J");
        TecladojButtonJ.setFocusable(false);
        TecladojButtonJ.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonJ.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonJ.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonJ.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonJActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonJ);

        TecladojButtonK.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonK.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonK.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonK.setText("K");
        TecladojButtonK.setFocusable(false);
        TecladojButtonK.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonK.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonK.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonK.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonKActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonK);

        TecladojButtonL.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonL.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonL.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonL.setText("L");
        TecladojButtonL.setFocusable(false);
        TecladojButtonL.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonL.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonL.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonL.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonLActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonL);

        TecladojButtonÑ.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonÑ.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonÑ.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonÑ.setText("Ñ");
        TecladojButtonÑ.setFocusable(false);
        TecladojButtonÑ.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonÑ.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonÑ.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonÑ.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonÑ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonÑActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonÑ);

        TecladojButtonEnter.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonEnter.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TecladojButtonEnter.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonEnter.setText("✔");
        TecladojButtonEnter.setFocusable(false);
        TecladojButtonEnter.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonEnter.setMaximumSize(new java.awt.Dimension(40, 25));
        TecladojButtonEnter.setMinimumSize(new java.awt.Dimension(40, 25));
        TecladojButtonEnter.setPreferredSize(new java.awt.Dimension(42, 25));
        TecladojButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonEnterActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonEnter);

        TecladojButtonZ.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonZ.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonZ.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonZ.setText("Z");
        TecladojButtonZ.setFocusable(false);
        TecladojButtonZ.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonZ.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonZ.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonZ.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonZActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonZ);

        TecladojButtonX.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonX.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonX.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonX.setText("X");
        TecladojButtonX.setFocusable(false);
        TecladojButtonX.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonX.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonX.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonX.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonXActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonX);

        TecladojButtonC.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonC.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonC.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonC.setText("C");
        TecladojButtonC.setFocusable(false);
        TecladojButtonC.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonC.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonC.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonC.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonCActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonC);

        TecladojButtonV.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonV.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonV.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonV.setText("V");
        TecladojButtonV.setFocusable(false);
        TecladojButtonV.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonV.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonV.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonV.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonVActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonV);

        TecladojButtonB.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonB.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonB.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonB.setText("B");
        TecladojButtonB.setFocusable(false);
        TecladojButtonB.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonB.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonB.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonB.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonBActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonB);

        TecladojButtonN.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonN.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonN.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonN.setText("N");
        TecladojButtonN.setFocusable(false);
        TecladojButtonN.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonN.setMaximumSize(new java.awt.Dimension(25, 25));
        TecladojButtonN.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonN.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonNActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonN);

        TecladojButtonM.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonM.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TecladojButtonM.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonM.setText("M");
        TecladojButtonM.setFocusable(false);
        TecladojButtonM.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonM.setMaximumSize(new java.awt.Dimension(50, 25));
        TecladojButtonM.setMinimumSize(new java.awt.Dimension(25, 25));
        TecladojButtonM.setPreferredSize(new java.awt.Dimension(25, 25));
        TecladojButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonMActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonM);

        TecladojButtonDelete.setBackground(new java.awt.Color(100, 100, 100));
        TecladojButtonDelete.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        TecladojButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        TecladojButtonDelete.setText("⬅");
        TecladojButtonDelete.setAlignmentY(0.0F);
        TecladojButtonDelete.setFocusable(false);
        TecladojButtonDelete.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TecladojButtonDelete.setMaximumSize(new java.awt.Dimension(35, 25));
        TecladojButtonDelete.setMinimumSize(new java.awt.Dimension(35, 25));
        TecladojButtonDelete.setPreferredSize(new java.awt.Dimension(35, 25));
        TecladojButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladojButtonDeleteActionPerformed(evt);
            }
        });
        TecladojPanel.add(TecladojButtonDelete);

        javax.swing.GroupLayout fondojPanelLayout = new javax.swing.GroupLayout(fondojPanel);
        fondojPanel.setLayout(fondojPanelLayout);
        fondojPanelLayout.setHorizontalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TecladojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(principaljPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addComponent(textojLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        fondojPanelLayout.setVerticalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titulojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principaljPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textojLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TecladojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jMenu1.setText("Archivo");

        nuevoJMenuItem1.setText("juego nuevo");
        nuevoJMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoJMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(nuevoJMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Motores");

        motoresButtonGroup.add(motor1JRadioButtonMenuItem);
        motor1JRadioButtonMenuItem.setSelected(true);
        motor1JRadioButtonMenuItem.setText("TEST");
        motor1JRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor1JRadioButtonMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(motor1JRadioButtonMenuItem);

        motoresButtonGroup.add(motor2JRadioButtonMenuItem);
        motor2JRadioButtonMenuItem.setText("Alumnos");
        motor2JRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor2JRadioButtonMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(motor2JRadioButtonMenuItem);

        motoresButtonGroup.add(motor4JRadioButtonMenuItem);
        motor4JRadioButtonMenuItem.setText("Archivo");
        motor4JRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor4JRadioButtonMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(motor4JRadioButtonMenuItem);

        motoresButtonGroup.add(motor3JRadioButtonMenuItem);
        motor3JRadioButtonMenuItem.setText("BD (Español)");
        motor3JRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor3JRadioButtonMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(motor3JRadioButtonMenuItem);

        motoresButtonGroup.add(motor5JRadioButtonMenuItem);
        motor5JRadioButtonMenuItem.setText("BD (Galego)");
        motor5JRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor5JRadioButtonMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(motor5JRadioButtonMenuItem);

        jMenuItem1.setText("administrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(palabrajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(185, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(palabrajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palabrajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabrajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabrajTextFieldActionPerformed

    private void palabrajTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabrajTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enter();
        }
        setPalabra();
    }//GEN-LAST:event_palabrajTextFieldKeyPressed

    private void enter(){
        if (fila <= 5) {
            if (!cuadricula[fila][4].getText().isEmpty()) {
                if (motor.checkPalabra(palabra)) {
                    palabras[fila] = palabra;
                    setColores();
                    if (palabras[fila].equals(objetivo)) {
                        this.textojLabel1.setForeground(COLOR_VERDE);
                        String intento;
                        switch(fila){
                            case 0:
                                intento = "primer";
                                break;
                            case 1:
                                intento = "segundo";
                                break;
                            case 2:
                                intento = "tercer";
                                break;
                            case 3:
                                intento = "cuarto";
                                break;
                            case 4:
                                intento = "quinto";
                                break;
                            case 5:
                                intento = "sexto";
                                break;
                            default:
                                intento = "";
                                
                        }
                        this.textojLabel1.setText("Ganaste en el " + intento + " intento");
                        fila = 6;
                    } else if (fila == 5) {
                        this.textojLabel1.setForeground(COLOR_ROJO);
                        this.textojLabel1.setText("Perdiste mi pana, era " + objetivo);
                        fila = 6;
                    }
                    palabrajTextField.setText("");
                    fila++;

                }

            }
        }        
    }
    private void setColores() {
        //Primero cuenta las palabras que serian verdes
        Map<Character, Integer> mapaObjetivo = new HashMap<>(this.mapaObjetivo);
        for (int i = 0; i < 5; i++) {
            if (objetivo.charAt(i) == palabras[fila].charAt(i)) {
                mapaObjetivo.put(palabras[fila].charAt(i), mapaObjetivo.get(palabras[fila].charAt(i))-1);
                
            }
        }
        //luego colorea cada una de su color correspondiente
        for (int i = 0; i < 5; i++) {
            if (objetivo.charAt(i) == palabras[fila].charAt(i)) {
                cuadricula[fila][i].setForeground(COLOR_VERDE);
                mapaTeclado.get(palabras[fila].charAt(i)).setBackground(COLOR_VERDE);
            } else if (objetivo.toString().contains(palabras[fila].charAt(i) + "") && mapaObjetivo.get(palabras[fila].charAt(i)) > 0) {
                cuadricula[fila][i].setForeground(COLOR_AMARILLO);
                mapaObjetivo.put(palabras[fila].charAt(i), mapaObjetivo.get(palabras[fila].charAt(i))-1);                
                if (!mapaTeclado.get(palabras[fila].charAt(i)).getBackground().equals(COLOR_VERDE)) {
                    mapaTeclado.get(palabras[fila].charAt(i)).setBackground(COLOR_AMARILLO);
                }
                
            } else {
                cuadricula[fila][i].setForeground(COLOR_NEGRO);
                if (!mapaTeclado.get(palabras[fila].charAt(i)).getBackground().equals(COLOR_VERDE) && !mapaTeclado.get(palabras[fila].charAt(i)).getBackground().equals(COLOR_AMARILLO)) {
                    mapaTeclado.get(palabras[fila].charAt(i)).setBackground(COLOR_NEGRO);
                }                
            }          
            
        }
    }


    private void palabrajTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabrajTextFieldKeyReleased
        setPalabra();
    }//GEN-LAST:event_palabrajTextFieldKeyReleased

    private void palabrajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabrajTextFieldKeyTyped
        setPalabra();

    }//GEN-LAST:event_palabrajTextFieldKeyTyped

    
    private void motor1JRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor1JRadioButtonMenuItemActionPerformed
        if (this.motorSeleccionado != motor1JRadioButtonMenuItem) {
            motor = new MotorTest();
            restart();
            motorSeleccionado = motor1JRadioButtonMenuItem;

        }

    }//GEN-LAST:event_motor1JRadioButtonMenuItemActionPerformed

    private void motor2JRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor2JRadioButtonMenuItemActionPerformed
        if (this.motorSeleccionado != motor2JRadioButtonMenuItem) {
            motor = new MotorAlumnos();
            restart();
            motorSeleccionado = motor2JRadioButtonMenuItem;
        }

    }//GEN-LAST:event_motor2JRadioButtonMenuItemActionPerformed

    private void nuevoJMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoJMenuItem1ActionPerformed
        restart();
    }//GEN-LAST:event_nuevoJMenuItem1ActionPerformed

    private void motor4JRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor4JRadioButtonMenuItemActionPerformed
        if (this.motorSeleccionado != motor4JRadioButtonMenuItem) {
            motor = new MotorArchivo();
            restart();
            motorSeleccionado = motor4JRadioButtonMenuItem;
        }
    }//GEN-LAST:event_motor4JRadioButtonMenuItemActionPerformed

    private void escribirLetra(char letra){
        String palabra = this.palabrajTextField.getText();
        if (palabra.length() <= 4) {
            this.palabrajTextField.setText(palabra + letra);
            setPalabra();
            
        }
    }
    
    private void TecladojButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonQActionPerformed
        escribirLetra('Q');
    }//GEN-LAST:event_TecladojButtonQActionPerformed

    private void TecladojButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonWActionPerformed
        escribirLetra('W');
    }//GEN-LAST:event_TecladojButtonWActionPerformed

    private void TecladojButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonEActionPerformed
        escribirLetra('E');
    }//GEN-LAST:event_TecladojButtonEActionPerformed

    private void TecladojButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonRActionPerformed
        escribirLetra('R');
    }//GEN-LAST:event_TecladojButtonRActionPerformed

    private void TecladojButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonTActionPerformed
        escribirLetra('T');
    }//GEN-LAST:event_TecladojButtonTActionPerformed

    private void TecladojButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonYActionPerformed
        escribirLetra('Y');
    }//GEN-LAST:event_TecladojButtonYActionPerformed

    private void TecladojButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonUActionPerformed
        escribirLetra('U');
    }//GEN-LAST:event_TecladojButtonUActionPerformed

    private void TecladojButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonIActionPerformed
        escribirLetra('I');
    }//GEN-LAST:event_TecladojButtonIActionPerformed

    private void TecladojButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonOActionPerformed
        escribirLetra('O');
    }//GEN-LAST:event_TecladojButtonOActionPerformed

    private void TecladojButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonPActionPerformed
        escribirLetra('P');
    }//GEN-LAST:event_TecladojButtonPActionPerformed

    private void TecladojButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonAActionPerformed
        escribirLetra('A');
    }//GEN-LAST:event_TecladojButtonAActionPerformed

    private void TecladojButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonSActionPerformed
        escribirLetra('S');
    }//GEN-LAST:event_TecladojButtonSActionPerformed

    private void TecladojButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonDActionPerformed
        escribirLetra('D');
    }//GEN-LAST:event_TecladojButtonDActionPerformed

    private void TecladojButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonFActionPerformed
        escribirLetra('F');
    }//GEN-LAST:event_TecladojButtonFActionPerformed

    private void TecladojButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonGActionPerformed
        escribirLetra('G');
    }//GEN-LAST:event_TecladojButtonGActionPerformed

    private void TecladojButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonHActionPerformed
        escribirLetra('H');
    }//GEN-LAST:event_TecladojButtonHActionPerformed

    private void TecladojButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonJActionPerformed
        escribirLetra('J');
    }//GEN-LAST:event_TecladojButtonJActionPerformed

    private void TecladojButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonKActionPerformed
        escribirLetra('K');
    }//GEN-LAST:event_TecladojButtonKActionPerformed

    private void TecladojButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonLActionPerformed
        escribirLetra('L');
    }//GEN-LAST:event_TecladojButtonLActionPerformed

    private void TecladojButtonÑActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonÑActionPerformed
        escribirLetra('Ñ');
    }//GEN-LAST:event_TecladojButtonÑActionPerformed

    private void TecladojButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonEnterActionPerformed
        enter();
    }//GEN-LAST:event_TecladojButtonEnterActionPerformed

    private void TecladojButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonZActionPerformed
        escribirLetra('Z');
    }//GEN-LAST:event_TecladojButtonZActionPerformed

    private void TecladojButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonXActionPerformed
        escribirLetra('X');
    }//GEN-LAST:event_TecladojButtonXActionPerformed

    private void TecladojButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonCActionPerformed
        escribirLetra('C');
    }//GEN-LAST:event_TecladojButtonCActionPerformed

    private void TecladojButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonVActionPerformed
        escribirLetra('V');
    }//GEN-LAST:event_TecladojButtonVActionPerformed

    private void TecladojButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonBActionPerformed
        escribirLetra('B');
    }//GEN-LAST:event_TecladojButtonBActionPerformed

    private void TecladojButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonNActionPerformed
        escribirLetra('N');
    }//GEN-LAST:event_TecladojButtonNActionPerformed

    private void TecladojButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonMActionPerformed
        escribirLetra('M');
    }//GEN-LAST:event_TecladojButtonMActionPerformed

    private void TecladojButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladojButtonDeleteActionPerformed
        String palabra = this.palabrajTextField.getText();
        if (palabra.length() >= 1) {
            StringBuilder sb = new StringBuilder(palabra);
            sb.deleteCharAt(palabra.length() - 1);
            this.palabrajTextField.setText(sb.toString());
            setPalabra();
        }
    }//GEN-LAST:event_TecladojButtonDeleteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        EditMotorJDialog editMotorJDialog = new EditMotorJDialog(this,true,this.motor);
        editMotorJDialog.setVisible(true);
        restart();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void motor3JRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor3JRadioButtonMenuItemActionPerformed
        if (this.motorSeleccionado != motor3JRadioButtonMenuItem) {
            motor = new MotorBD("es");
            restart();
            motorSeleccionado = motor3JRadioButtonMenuItem;
        }
    }//GEN-LAST:event_motor3JRadioButtonMenuItemActionPerformed

    private void motor5JRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor5JRadioButtonMenuItemActionPerformed
        if (this.motorSeleccionado != motor5JRadioButtonMenuItem) {
            motor = new MotorBD("gl");
            restart();
            motorSeleccionado = motor5JRadioButtonMenuItem;
        }
    }//GEN-LAST:event_motor5JRadioButtonMenuItemActionPerformed

    protected  void restart() {                
        for (JButton x : mapaTeclado.values()) {
            x.setBackground(COLOR_GRIS);
        }
        for (JLabel[] x : cuadricula) {
            for (JLabel y : x) {
                y.setText("");
                y.setForeground(COLOR_CLARO);
            }
        }
        for (String p : palabras) {
            p = "";
        }
        this.palabrajTextField.setText("");
        fila = 0;
        this.textojLabel1.setText(" ");
        objetivo = motor.obtenerPalabraAleatoria();
        mapaObjetivo = crearMapaObjetivo();
    }

    private void setPalabra() {
        palabra = this.palabrajTextField.getText().toUpperCase().replaceAll("[^A-ZÑÁÉÍÓÚ]", ""); //tildes: ÁÉÍÓÚ

        if (fila < 6) {
            setLetras();
        }
    }

    private void setLetras() {
        if (palabra.length() == 0) {
            cuadricula[fila][0].setText("");
            cuadricula[fila][1].setText("");
            cuadricula[fila][2].setText("");
            cuadricula[fila][3].setText("");
            cuadricula[fila][4].setText("");
        }
        else if (palabra.length() == 1) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText("");
            cuadricula[fila][2].setText("");
            cuadricula[fila][3].setText("");
            cuadricula[fila][4].setText("");
        }
        else if (palabra.length() == 2) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText(palabra.charAt(1) + "");
            cuadricula[fila][2].setText("");
            cuadricula[fila][3].setText("");
            cuadricula[fila][4].setText("");
        }
        else if (palabra.length() == 3) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText(palabra.charAt(1) + "");
            cuadricula[fila][2].setText(palabra.charAt(2) + "");
            cuadricula[fila][3].setText("");
            cuadricula[fila][4].setText("");
        }
        else if (palabra.length() == 4) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText(palabra.charAt(1) + "");
            cuadricula[fila][2].setText(palabra.charAt(2) + "");
            cuadricula[fila][3].setText(palabra.charAt(3) + "");
            cuadricula[fila][4].setText("");
        }
        else if (palabra.length() == 5) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText(palabra.charAt(1) + "");
            cuadricula[fila][2].setText(palabra.charAt(2) + "");
            cuadricula[fila][3].setText(palabra.charAt(3) + "");
            cuadricula[fila][4].setText(palabra.charAt(4) + "");
        }
        else if (palabra.length() > 5) {
            palabra = palabra.substring(0, 5);
        }
        this.palabrajTextField.setText(palabra);
    }

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame(new MotorTest()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TecladojButtonA;
    private javax.swing.JButton TecladojButtonB;
    private javax.swing.JButton TecladojButtonC;
    private javax.swing.JButton TecladojButtonD;
    private javax.swing.JButton TecladojButtonDelete;
    private javax.swing.JButton TecladojButtonE;
    private javax.swing.JButton TecladojButtonEnter;
    private javax.swing.JButton TecladojButtonF;
    private javax.swing.JButton TecladojButtonG;
    private javax.swing.JButton TecladojButtonH;
    private javax.swing.JButton TecladojButtonI;
    private javax.swing.JButton TecladojButtonJ;
    private javax.swing.JButton TecladojButtonK;
    private javax.swing.JButton TecladojButtonL;
    private javax.swing.JButton TecladojButtonM;
    private javax.swing.JButton TecladojButtonN;
    private javax.swing.JButton TecladojButtonO;
    private javax.swing.JButton TecladojButtonP;
    private javax.swing.JButton TecladojButtonQ;
    private javax.swing.JButton TecladojButtonR;
    private javax.swing.JButton TecladojButtonS;
    private javax.swing.JButton TecladojButtonT;
    private javax.swing.JButton TecladojButtonU;
    private javax.swing.JButton TecladojButtonV;
    private javax.swing.JButton TecladojButtonW;
    private javax.swing.JButton TecladojButtonX;
    private javax.swing.JButton TecladojButtonY;
    private javax.swing.JButton TecladojButtonZ;
    private javax.swing.JButton TecladojButtonÑ;
    private javax.swing.JPanel TecladojPanel;
    private javax.swing.JPanel fondojPanel;
    private javax.swing.JLabel jLabel0_0;
    private javax.swing.JLabel jLabel0_1;
    private javax.swing.JLabel jLabel0_2;
    private javax.swing.JLabel jLabel0_3;
    private javax.swing.JLabel jLabel0_4;
    private javax.swing.JLabel jLabel1_0;
    private javax.swing.JLabel jLabel1_1;
    private javax.swing.JLabel jLabel1_2;
    private javax.swing.JLabel jLabel1_3;
    private javax.swing.JLabel jLabel1_4;
    private javax.swing.JLabel jLabel2_0;
    private javax.swing.JLabel jLabel2_1;
    private javax.swing.JLabel jLabel2_2;
    private javax.swing.JLabel jLabel2_3;
    private javax.swing.JLabel jLabel2_4;
    private javax.swing.JLabel jLabel3_0;
    private javax.swing.JLabel jLabel3_1;
    private javax.swing.JLabel jLabel3_2;
    private javax.swing.JLabel jLabel3_3;
    private javax.swing.JLabel jLabel3_4;
    private javax.swing.JLabel jLabel4_0;
    private javax.swing.JLabel jLabel4_1;
    private javax.swing.JLabel jLabel4_2;
    private javax.swing.JLabel jLabel4_3;
    private javax.swing.JLabel jLabel4_4;
    private javax.swing.JLabel jLabel5_0;
    private javax.swing.JLabel jLabel5_1;
    private javax.swing.JLabel jLabel5_2;
    private javax.swing.JLabel jLabel5_3;
    private javax.swing.JLabel jLabel5_4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem motor1JRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem motor2JRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem motor3JRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem motor4JRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem motor5JRadioButtonMenuItem;
    private javax.swing.ButtonGroup motoresButtonGroup;
    private javax.swing.JMenuItem nuevoJMenuItem1;
    private javax.swing.JTextField palabrajTextField;
    private javax.swing.JPanel principaljPanel;
    private javax.swing.JLabel textojLabel1;
    private javax.swing.JLabel titulojLabel;
    // End of variables declaration//GEN-END:variables

}
