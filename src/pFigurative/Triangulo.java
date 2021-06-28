package pFigurative;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Arrays;
import javax.swing.event.ChangeEvent;

public class Triangulo extends JFrame implements ActionListener {

    // Creacion de los componentes del JFrame
    private Color color;
    private double[] x = {1, 1, 1};
    private double[] z = {1, 1, 1};
    private double x1;
    private double y1;
    private JTextField txtL, txtL2, txtL3, txtPerimetrotrn, txtAreatrn, txtTipotrn;
    private JLabel jl1t, jl2t, jl3t, jl4t, jl5t, jl6t, jl7t, jl8t, jl9t, jl10t, jl11t, jRT, jVT, jAT;
    private JButton btninfTrn, btnPruebaTrn, btnRegresarTrn, btnEditarTrn;
    private JMenuBar menubartrn;
    private JMenu menu1trn, menu2trn;
    private JMenuItem jmi1trn, jmi2trn;
    private JSlider slRTrn, slGTrn, slBTrn;
    private Color blanco = new Color(255, 255, 255);
    private Color lila = new Color(156, 0, 188);
    private Color negro = new Color (0, 0, 0);
    private Color fondoOsc = new Color(52, 52, 52);
    private Color gris = new Color(40, 40, 40);
    private Color fondoCro = new Color(245 , 245, 245);
    int R3, G3, B3;

    // Creacion del constructor donde se agregan los elementos a la interfaz grafica
    public Triangulo() {
        setLayout(null);
        setTitle("Figurative");
        menubartrn = new JMenuBar();
        setJMenuBar(menubartrn);
        getContentPane().setBackground(new Color(245, 245, 245));

        menu1trn = new JMenu("Opciones");
        menubartrn.add(menu1trn);
        menu2trn = new JMenu("Tema");
        menu1trn.add(menu2trn);
        jmi1trn = new JMenuItem("Claro");
        menu2trn.add(jmi1trn);
        jmi1trn.addActionListener(this);
        jmi2trn = new JMenuItem("Oscuro");
        menu2trn.add(jmi2trn);
        jmi2trn.addActionListener(this);

        // Creacion de los componentes
        jl1t = new JLabel("Figura seleccionada: Triangulo");
        jl1t.setBounds(85, 40, 250, 20);
        jl1t.setFont(new Font("Verdana", Font.BOLD, 14));
        jl1t.setForeground(new Color(0, 0, 0));
        add(jl1t);

        jl2t = new JLabel("Lado A: ");
        jl2t.setBounds(40, 78, 250, 20);
        jl2t.setForeground(new Color(0, 0, 0));
        jl2t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl2t);

        jl3t = new JLabel("Lado B: ");
        jl3t.setBounds(40, 102, 250, 20);
        jl3t.setForeground(new Color(0, 0, 0));
        jl3t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl3t);

        jl4t = new JLabel("Lado C: ");
        jl4t.setBounds(40, 130, 250, 20);
        jl4t.setForeground(new Color(0, 0, 0));
        jl4t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl4t);

        jl5t = new JLabel("Fórmula:     (b*h)/2");
        jl5t.setBounds(40, 218, 250, 20);
        jl5t.setForeground(new Color(0, 0, 0));
        jl5t.setFont(new Font("Verdana", Font.BOLD, 14));
        add(jl5t);

        jl6t = new JLabel("Tipo: ");
        jl6t.setBounds(40, 253, 250, 20);
        jl6t.setForeground(new Color(0, 0, 0));
        jl6t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl6t);

        jl7t = new JLabel("Perimetro: ");
        jl7t.setBounds(40, 288, 250, 20);
        jl7t.setForeground(new Color(0, 0, 0));
        jl7t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl7t);

        jl8t = new JLabel("Area: ");
        jl8t.setBounds(40, 326, 250, 20);
        jl8t.setForeground(new Color(0, 0, 0));
        jl8t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl8t);

        jl9t = new JLabel("Rojo: ");
        jl9t.setBounds(40, 370, 250, 20);
        jl9t.setForeground(new Color(0, 0, 0));
        jl9t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl9t);

        jl10t = new JLabel("Verde: ");
        jl10t.setBounds(40, 408, 250, 20);
        jl10t.setForeground(new Color(0, 0, 0));
        jl10t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl10t);

        jl11t = new JLabel("Azul: ");
        jl11t.setBounds(40, 438, 250, 20);
        jl11t.setForeground(new Color(0, 0, 0));
        jl11t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl11t);
        
        jRT = new JLabel("R: 0");
        jRT.setBounds(55, 485, 60, 25);
        jRT.setForeground(new Color(0, 0, 0));
        jRT.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jRT);

        jVT = new JLabel("G: 0");
        jVT.setBounds(155, 485, 60, 25);
        jVT.setForeground(new Color(0, 0, 0));
        jVT.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jVT);

        jAT = new JLabel("B: 0");
        jAT.setBounds(255, 485, 60, 25);
        jAT.setForeground(new Color(0, 0, 0));
        jAT.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jAT);

        txtL = new JTextField("Ingresa el valor del lado 1");
        txtL.setEditable(false);
        txtL.setBounds(110, 79, 250, 20);
        txtL.setBackground(new Color(245, 245, 245));
        txtL.setForeground(new Color(0, 0, 0));
        txtL.setBorder(null);
        add(txtL);

        txtL2 = new JTextField("Ingresa el valor del lado 2");
        txtL2.setEditable(false);
        txtL2.setBounds(110, 105, 250, 20);
        txtL2.setBackground(new Color(245, 245, 245));
        txtL2.setForeground(new Color(0, 0, 0));
        txtL2.setBorder(null);
        add(txtL2);

        txtL3 = new JTextField("Ingresa el valor del lado 3");
        txtL3.setEditable(false);
        txtL3.setBounds(110, 131, 250, 20);
        txtL3.setBackground(new Color(245, 245, 245));
        txtL3.setForeground(new Color(0, 0, 0));
        txtL3.setBorder(null);
        add(txtL3);

        btninfTrn = new JButton("Enviar");
        btninfTrn.setBounds(200, 170, 130, 25);
        btninfTrn.addActionListener(this);
        btninfTrn.setBorder(null);
        btninfTrn.setBackground(new Color(156, 0, 188));
        btninfTrn.setForeground(new Color(255, 255, 255));
        add(btninfTrn);

        btnRegresarTrn = new JButton("Regresar");
        btnRegresarTrn.setBounds(625, 455, 95, 20);
        btnRegresarTrn.addActionListener(this);
        btnRegresarTrn.setBorder(null);
        btnRegresarTrn.setBackground(new Color(156, 0, 188));
        btnRegresarTrn.setForeground(new Color(255, 255, 255));
        add(btnRegresarTrn);

        btnEditarTrn = new JButton("Editar");
        btnEditarTrn.setBounds(50, 170, 130, 25);
        btnEditarTrn.setBackground(new Color(156, 0, 188));
        btnEditarTrn.setForeground(new Color(255, 255, 255));
        btnEditarTrn.addActionListener(this);
        add(btnEditarTrn);

        btnPruebaTrn = new JButton("Salir");
        btnPruebaTrn.setBounds(625, 485, 95, 20);
        btnPruebaTrn.addActionListener(this);
        btnPruebaTrn.setBorder(null);
        btnPruebaTrn.setBackground(new Color(156, 0, 188));
        btnPruebaTrn.setForeground(new Color(255, 255, 255));
        add(btnPruebaTrn);

        // Textfields donde se arrojaran los resultados obtenidos
        txtTipotrn = new JTextField("El triangulo es de tipo: ");
        txtTipotrn.setEditable(false);
        txtTipotrn.setBounds(110, 253, 250, 20);
        txtTipotrn.setBackground(new Color(245, 245, 245));
        txtTipotrn.setForeground(new Color(0, 0, 0));
        txtTipotrn.setBorder(null);
        txtTipotrn.setVisible(true);
        add(txtTipotrn);

        txtPerimetrotrn = new JTextField("0 unidades");
        txtPerimetrotrn.setEditable(false);
        txtPerimetrotrn.setBounds(165, 288, 250, 20);
        txtPerimetrotrn.setBackground(new Color(245, 245, 245));
        txtPerimetrotrn.setForeground(new Color(0, 0, 0));
        txtPerimetrotrn.setVisible(true);
        txtPerimetrotrn.setBorder(null);
        add(txtPerimetrotrn);

        txtAreatrn = new JTextField("0 unidades cuadradas");
        txtAreatrn.setEditable(false);
        txtAreatrn.setBounds(120, 326, 250, 20);
        txtAreatrn.setBackground(new Color(245, 245, 245));
        txtAreatrn.setForeground(new Color(0, 0, 0));
        txtAreatrn.setVisible(true);
        txtAreatrn.setBorder(null);
        add(txtAreatrn);

        slRTrn = new JSlider();
        slRTrn.setBounds(115, 370, 255, 15);
        slRTrn.setBackground(new Color(245, 245, 245));
        slRTrn.setValue(0);
        slRTrn.setMaximum(255);
        slRTrn.setMajorTickSpacing(1);

        // Metodo que implementa la funcion de los sliders
        slRTrn.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent sRt) {
                cambiarColorTrn();
            }
        });

        add(slRTrn);

        slGTrn = new JSlider();
        slGTrn.setBounds(115, 410, 255, 15);
        slGTrn.setBackground(new Color(245, 245, 245));
        slGTrn.setValue(0);
        slGTrn.setMaximum(255);
        slGTrn.setMajorTickSpacing(1);

        slGTrn.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent sRcd) {
                cambiarColorTrn();
            }
        });

        add(slGTrn);

        slBTrn = new JSlider();
        slBTrn.setBounds(115, 440, 255, 15);
        slBTrn.setBackground(new Color(245, 245, 245));
        slBTrn.setValue(0);
        slBTrn.setMaximum(255);
        slBTrn.setMajorTickSpacing(1);
        slBTrn.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent sRc) {
                cambiarColorTrn();
            }
        });

        add(slBTrn);
    }

    // Metodo que cambia el color de la figura y del boton "vista previa"
    public void cambiarColorTrn() {
        R3 = slRTrn.getValue();
        G3 = slGTrn.getValue();
        B3 = slBTrn.getValue();
        jRT.setText("R: " + R3);
        jVT.setText("G: " + G3);
        jAT.setText("B: " + B3);
        color = new Color(R3, G3, B3);
        btnPruebaTrn.setBackground(color);
        btnRegresarTrn.setBackground(color);
        btninfTrn.setBackground(color);
        btnEditarTrn.setBackground(color);
        magic(); //Metodo que permite que la figura cambie de color en tiempo real
    }

    // Creacion de la interfaz
    public void Triangulo() {
        Triangulo trn = new Triangulo();
        trn.setBounds(0, 0, 765, 588);
        trn.setResizable(false);
        trn.setVisible(true);
        trn.setLocationRelativeTo(null);
        ImageIcon fig = new ImageIcon("src/images/figurative.png");
        trn.setIconImage(fig.getImage());
    }

    // Metodos que permiten la funcionalidad del boton
    @Override
    public void actionPerformed(ActionEvent t) {

        if (t.getSource() == btninfTrn) {
            try {
                txtL.setEditable(false);
                txtL2.setEditable(false);
                txtL3.setEditable(false);
                x[0] = Double.parseDouble(txtL.getText()); // Lado A
                x[1] = Double.parseDouble(txtL2.getText()); // Lado B
                x[2] = Double.parseDouble(txtL3.getText()); // Lado C
                double perimetrotrn = x[0] + x[1] + x[2];
                double peri = (x[0] + x[1] + x[2]) / 2;
                double areatrn = Math.sqrt(peri * (peri - x[0]) * (peri - x[1]) * (peri - x[2]));
                magic();

                if (x[0] == x[1] && x[1] == x[2]) {
                    txtTipotrn.setText("El triangulo es equilatero");
                } else if (x[0] == x[2] || x[1] == x[2] || x[0] == x[1]) {
                    txtTipotrn.setText("El triangulo es isoscéles");
                } else {
                    txtTipotrn.setText("El triangulo es escaleno");
                }

                txtPerimetrotrn.setText(perimetrotrn + " unidades");
                txtAreatrn.setText(areatrn + " unidades cuadradas");

            } catch (Exception er) {
                JOptionPane.showMessageDialog(null, "Ingresa valores numericos, por favor.", "Error",
                        JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figJO.png"));
            }
        }

        if (t.getSource() == btnRegresarTrn) {
            this.setVisible(false);
            GUI interfaz = new GUI();
            interfaz.GUI();
        }

        if (t.getSource() == btnPruebaTrn) {
            System.exit(0);
        }

        if (t.getSource() == btnEditarTrn) {
            txtL.setEditable(true);
            txtL2.setEditable(true);
            txtL3.setEditable(true);
            txtL.setText("");
            txtL2.setText("");
            txtL3.setText("");
            txtPerimetrotrn.setText("0 unidades");
            txtAreatrn.setText("0 unidades cuadradas");
            txtTipotrn.setText("El triangulo es de tipo: ");
        }

        // Configuracion del modo claro
        if (t.getSource() == jmi1trn) {
            getContentPane().setBackground(fondoCro);
            jl1t.setForeground(negro);
            jl2t.setForeground(negro);
            jl3t.setForeground(negro);
            jl4t.setForeground(negro);
            jl5t.setForeground(negro);
            jl6t.setForeground(negro);
            jl7t.setForeground(negro);
            jl8t.setForeground(negro);
            jl9t.setForeground(negro);
            jl10t.setForeground(negro);
            jl11t.setForeground(negro);
            jRT.setForeground(negro);
            jVT.setForeground(negro);
            jAT.setForeground(negro);
            btnPruebaTrn.setBackground(lila);
            btnRegresarTrn.setBackground(lila);
            btninfTrn.setBackground(lila);
            btnEditarTrn.setBackground(lila);
            slRTrn.setBackground(fondoCro);
            slGTrn.setBackground(fondoCro);
            slBTrn.setBackground(fondoCro);
            txtL.setBackground(fondoCro);
            txtL.setForeground(negro);
            txtL2.setBackground(fondoCro);
            txtL2.setForeground(negro);
            txtL3.setBackground(fondoCro);
            txtL3.setForeground(negro);
            txtTipotrn.setBackground(fondoCro);
            txtTipotrn.setForeground(negro);
            txtPerimetrotrn.setBackground(fondoCro);
            txtPerimetrotrn.setForeground(negro);
            txtAreatrn.setBackground(fondoCro);
            txtAreatrn.setForeground(negro);
        }

        // Configuracion del modo oscuro
        if (t.getSource() == jmi2trn) {
            getContentPane().setBackground(fondoOsc);
            jl1t.setForeground(blanco);
            jl2t.setForeground(blanco);
            jl3t.setForeground(blanco);
            jl4t.setForeground(blanco);
            jl5t.setForeground(blanco);
            jl6t.setForeground(blanco);
            jl7t.setForeground(blanco);
            jl8t.setForeground(blanco);
            jl9t.setForeground(blanco);
            jl10t.setForeground(blanco);
            jl11t.setForeground(blanco);
            jRT.setForeground(blanco);
            jVT.setForeground(blanco);
            jAT.setForeground(blanco);
            btnPruebaTrn.setBackground(gris);
            btnRegresarTrn.setBackground(gris);
            btninfTrn.setBackground(gris);
            btnEditarTrn.setBackground(gris);
            slRTrn.setBackground(fondoOsc);
            slGTrn.setBackground(fondoOsc);
            slBTrn.setBackground(fondoOsc);
            txtL.setBackground(fondoOsc);
            txtL.setForeground(blanco);
            txtL2.setBackground(fondoOsc);
            txtL2.setForeground(blanco);
            txtL3.setBackground(fondoOsc);
            txtL3.setForeground(blanco);
            txtTipotrn.setBackground(fondoOsc);
            txtTipotrn.setForeground(blanco);
            txtPerimetrotrn.setBackground(fondoOsc);
            txtPerimetrotrn.setForeground(blanco);
            txtAreatrn.setBackground(fondoOsc);
            txtAreatrn.setForeground(blanco);
        }
    }

    // Metodos que permiten la creación de los triangulos
    @Override
    public void paint(Graphics g) {

        super.paintComponents(g);
        int t = (int) (100 / z[2]);
        int mid = 0;
        Color colorgris = new Color(192, 192, 192);
        g.setColor(colorgris);

        for (int c = 400; c < 765; c = c + t) {
            g.drawLine(c, 60, c, 400);
            mid++;
        }
        for (int c = 60; c < 400; c = c + t) {
            g.drawLine(400, c, 765, c);
        }
        double refx = t * mid / 2;
        double refy = t * z[2] + t;
        g.setColor(color);

        int[] ux = {(int) (400 + refx), (int) (400 + refx + t * z[0]), (int) ((400 + refx) + (t * x1))};
        int[] uy = {(int) (60 + refy), (int) (60 + refy), (int) ((60 + refy) - (t * y1))};

        g.drawPolygon(ux, uy, 3);
        g.fillPolygon(ux, uy, 3);
    }

    public void magic() {
        for (int a = 0; a < 3; a++) {
            z[a] = x[a];
        }
        Arrays.sort(z);

        x1 = coordenadax();
        y1 = coordenaday();
        repaint();
    }

    private double coordenadax() {

        Arrays.sort(x);
        double a;
        double pendiente = ((x[2] * x[2]) - (x[1] * x[1]) - (x[0] * x[0])) / (-2 * x[1] * x[0]);
        double angulo = (180 * Math.acos(pendiente)) / Math.PI;

        if (angulo != 90 || angulo != 180 || angulo != 270 || angulo != 360) {
            a = x[1] * Math.cos(Math.PI * angulo / 180);
        } else {
            a = 0;
        }
        return a;
    }

    private double coordenaday() {

        Arrays.sort(x);
        double a;
        double pendiente = ((x[2] * x[2]) - (x[1] * x[1]) - (x[0] * x[0])) / (-2 * x[1] * x[0]);
        double angulo = (180 * Math.acos(pendiente)) / Math.PI;

        if (angulo != 90 || angulo != 180 || angulo != 270 || angulo != 360) {
            a = x[1] * Math.sin(Math.PI * angulo / 180);
        } else {
            a = x[1];
        }
        return a;
    }
}
