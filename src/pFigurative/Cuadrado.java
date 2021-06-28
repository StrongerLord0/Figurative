package pFigurative;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;

public class Cuadrado extends JFrame implements ActionListener {

    // Creacion de los componentes del JFrame
    private Color color;
    private JTextField txtLado, txtPerimetrocdo, txtAreacdo;
    private JButton btninfCdo, btnPruebaCdo, btnRegresarCdo;
    private JLabel jl1cd, jl2cd, jl3cd, jl4cd, jl5cd, jl6cd, jl7cd, jl8cd;
    private JMenuBar menubarcdo;
    private JMenu menu1cdo, menu2cdo;
    private JMenuItem jmi1cdo, jmi2cdo;
    private JSlider slRCdo, slGCdo, slBCdo;
    private double lado2 = 10;
    private int R2, G2, B2;

    // Creacion del constructor donde se agregan los elementos a la interfaz grafica
    public Cuadrado() {
        setLayout(null);
        setTitle("Figurative");

        menubarcdo = new JMenuBar();
        setJMenuBar(menubarcdo);
        getContentPane().setBackground(new Color(52, 52, 52));

        // Creacion del pequeño menu
        menu1cdo = new JMenu("Opciones");
        menubarcdo.add(menu1cdo);
        menu2cdo = new JMenu("Tema");
        menu1cdo.add(menu2cdo);
        jmi1cdo = new JMenuItem("Claro");
        menu2cdo.add(jmi1cdo);
        jmi1cdo.addActionListener(this);
        jmi2cdo = new JMenuItem("Oscuro");
        menu2cdo.add(jmi2cdo);
        jmi2cdo.addActionListener(this);

        // Creacion de componentes
        jl1cd = new JLabel("Figura seleccionada: Cuadrado");
        jl1cd.setBounds(82, 40, 250, 20);
        jl1cd.setFont(new Font("Verdana", Font.BOLD, 14));
        jl1cd.setForeground(new Color(255, 255, 255));
        add(jl1cd);

        jl2cd = new JLabel("Fórmula:     L*L");
        jl2cd.setBounds(40, 178, 250, 20);
        jl2cd.setForeground(new Color(255, 255, 255));
        jl2cd.setFont(new Font("Verdana", Font.BOLD, 14));
        add(jl2cd);

        jl3cd = new JLabel("Perimetro: ");
        jl3cd.setBounds(40, 218, 250, 20);
        jl3cd.setForeground(new Color(255, 255, 255));
        jl3cd.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl3cd);

        jl4cd = new JLabel("Area: ");
        jl4cd.setBounds(40, 263, 250, 20);
        jl4cd.setForeground(new Color(255, 255, 255));
        jl4cd.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl4cd);

        jl5cd = new JLabel("Rojo: ");
        jl5cd.setBounds(40, 308, 250, 20);
        jl5cd.setForeground(new Color(255, 255, 255));
        jl5cd.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl5cd);

        jl6cd = new JLabel("Verde: ");
        jl6cd.setBounds(40, 353, 250, 20);
        jl6cd.setForeground(new Color(255, 255, 255));
        jl6cd.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl6cd);

        jl7cd = new JLabel("Azul: ");
        jl7cd.setBounds(40, 404, 250, 20);
        jl7cd.setForeground(new Color(255, 255, 255));
        jl7cd.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl7cd);

        jl8cd = new JLabel("Lado: ");
        jl8cd.setBounds(40, 78, 250, 20);
        jl8cd.setForeground(new Color(255, 255, 255));
        jl8cd.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl8cd);

        txtLado = new JTextField("Ingrese el valor del lado");
        txtLado.setBounds(110, 79, 250, 20);
        txtLado.setBackground(new Color(52, 52, 52));
        txtLado.setForeground(new Color(255, 255, 255));
        txtLado.setBorder(null);
        txtLado.setVisible(true);
        add(txtLado);

        btninfCdo = new JButton("Mandar informacion");
        btninfCdo.setBounds(80, 120, 225, 25);
        btninfCdo.setBackground(new Color(40, 40, 40));
        btninfCdo.setForeground(new Color(255, 255, 255));
        btninfCdo.addActionListener(this);
        btninfCdo.setBorder(null);
        add(btninfCdo);

        btnRegresarCdo = new JButton("Regresar");
        btnRegresarCdo.setBounds(625, 485, 95, 20);
        btnRegresarCdo.setBackground(new Color(40, 40, 40));
        btnRegresarCdo.setForeground(new Color(255, 255, 255));
        btnRegresarCdo.addActionListener(this);
        btnRegresarCdo.setBorder(null);
        add(btnRegresarCdo);

        btnPruebaCdo = new JButton("Vista previa");
        btnPruebaCdo.setBounds(275, 470, 100, 25);
        btnPruebaCdo.addActionListener(this);
        btnPruebaCdo.setBorder(null);
        btnPruebaCdo.setBackground(new Color(40, 40, 40));
        btnPruebaCdo.setForeground(new Color(255, 255, 255));
        add(btnPruebaCdo);

        // Textfields donde se arrojaran los resultados obtenidos
        txtPerimetrocdo = new JTextField("0 unidades");
        txtPerimetrocdo.setEditable(false);
        txtPerimetrocdo.setBounds(155, 218, 250, 20);
        txtPerimetrocdo.setBackground(new Color(52, 52, 52));
        txtPerimetrocdo.setForeground(new Color(255, 255, 255));
        txtPerimetrocdo.setVisible(true);
        txtPerimetrocdo.setBorder(null);
        add(txtPerimetrocdo);

        txtAreacdo = new JTextField("0 unidades cuadradas");
        txtAreacdo.setEditable(false);
        txtAreacdo.setBounds(120, 264, 250, 20);
        txtAreacdo.setBackground(new Color(52, 52, 52));
        txtAreacdo.setForeground(new Color(255, 255, 255));
        txtAreacdo.setVisible(true);
        txtAreacdo.setBorder(null);
        add(txtAreacdo);

        // Creacion de sliders
        slRCdo = new JSlider();
        slRCdo.setBounds(115, 310, 255, 15);
        slRCdo.setBackground(new Color(52, 52, 52));
        slRCdo.setValue(0);
        slRCdo.setMaximum(255);
        slRCdo.setMajorTickSpacing(1);

        // Metodo que implementa la funcion de los sliders
        slRCdo.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent sRcd) {
                cambiarColorCdo();
            }
        });

        add(slRCdo);

        slGCdo = new JSlider();
        slGCdo.setBounds(115, 360, 255, 15);
        slGCdo.setBackground(new Color(52, 52, 52));
        slGCdo.setValue(0);
        slGCdo.setMaximum(255);
        slGCdo.setMajorTickSpacing(1);
        add(slGCdo);

        slGCdo.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent sRcd) {
                cambiarColorCdo();
            }
        });

        slBCdo = new JSlider();
        slBCdo.setBounds(115, 409, 255, 15);
        slBCdo.setBackground(new Color(52, 52, 52));
        slBCdo.setValue(0);
        slBCdo.setMaximum(255);
        slBCdo.setMajorTickSpacing(1);
        add(slBCdo);
        slBCdo.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent sRc) {
                cambiarColorCdo();
            }
        });
    }

    // Metodo que cambia el color de la figura y del boton "vista previa"
    public void cambiarColorCdo() {
        R2 = slRCdo.getValue();
        G2 = slGCdo.getValue();
        B2 = slBCdo.getValue();
        color = new Color(R2,G2,B2);
        btnPruebaCdo.setBackground(color);
    }

    // Creacion de la interfaz
    public void Cuadrado() {
        Cuadrado cdo = new Cuadrado();
        cdo.setBounds(0, 0, 765, 588);
        cdo.setResizable(false);
        cdo.setVisible(true);
        cdo.setLocationRelativeTo(null);
        ImageIcon fig = new ImageIcon("src/images/figurative.png");
        cdo.setIconImage(fig.getImage());
    }

    // Metodos que permiten la funcionalidad del boton
    @Override
    public void actionPerformed(ActionEvent c) {

        if (c.getSource() == btninfCdo) {
            try {
                txtLado.setEditable(false);
                double lado = Double.parseDouble(txtLado.getText());
                lado2 = lado;
                double areaCdo = Math.pow(lado, 2);
                double perimetroCdo = lado * 4;
                txtPerimetrocdo.setText(perimetroCdo + " unidades");
                txtAreacdo.setText(areaCdo + " unidades cuadradas");
                repaint();
            } catch (Exception er) {
                JOptionPane.showMessageDialog(null, "Ingresa valores numericos, por favor.", "Error",
                        JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figJO.png"));
            }
        }

        if (c.getSource() == btnRegresarCdo) {
            this.setVisible(false);
            GUI interfaz = new GUI();
            interfaz.GUI();
        }

        if (c.getSource() == btnPruebaCdo) {
            repaint();
        }

        // Configuracion del modo claro
        if (c.getSource() == jmi1cdo) {
            getContentPane().setBackground(new Color(245, 245, 245));
            jl1cd.setForeground(new Color(0, 0, 0));
            jl2cd.setForeground(new Color(0, 0, 0));
            jl3cd.setForeground(new Color(0, 0, 0));
            jl4cd.setForeground(new Color(0, 0, 0));
            jl5cd.setForeground(new Color(0, 0, 0));
            jl6cd.setForeground(new Color(0, 0, 0));
            jl7cd.setForeground(new Color(0, 0, 0));
            jl8cd.setForeground(new Color(0, 0, 0));
            btnPruebaCdo.setBackground(new Color(156, 0, 188));
            btninfCdo.setBackground(new Color(156, 0, 188));
            btnRegresarCdo.setBackground(new Color(156, 0, 188));
            slRCdo.setBackground(new Color(245, 245, 245));
            slGCdo.setBackground(new Color(245, 245, 245));
            slBCdo.setBackground(new Color(245, 245, 245));
            txtLado.setBackground(new Color(245, 245, 245));
            txtLado.setForeground(new Color(0, 0, 0));
            txtPerimetrocdo.setBackground(new Color(245, 245, 245));
            txtPerimetrocdo.setForeground(new Color(0, 0, 0));
            txtAreacdo.setBackground(new Color(245, 245, 245));
            txtAreacdo.setForeground(new Color(0, 0, 0));
        }

        // Configuracion del modo oscuro
        if (c.getSource() == jmi2cdo) {
            getContentPane().setBackground(new Color(52, 52, 52));
            jl1cd.setForeground(new Color(255, 255, 255));
            jl2cd.setForeground(new Color(255, 255, 255));
            jl3cd.setForeground(new Color(255, 255, 255));
            jl4cd.setForeground(new Color(255, 255, 255));
            jl5cd.setForeground(new Color(255, 255, 255));
            jl6cd.setForeground(new Color(255, 255, 255));
            jl7cd.setForeground(new Color(255, 255, 255));
            jl8cd.setForeground(new Color(255, 255, 255));
            btnPruebaCdo.setBackground(new Color(40, 40, 40));
            btninfCdo.setBackground(new Color(40, 40, 40));
            btnRegresarCdo.setBackground(new Color(40, 40, 40));
            slRCdo.setBackground(new Color(52, 52, 52));
            slGCdo.setBackground(new Color(52, 52, 52));
            slBCdo.setBackground(new Color(52, 52, 52));
            txtLado.setBackground(new Color(52, 52, 52));
            txtLado.setForeground(new Color(255, 255, 255));
            txtPerimetrocdo.setBackground(new Color(50, 50, 50));
            txtPerimetrocdo.setForeground(new Color(255, 255, 255));
            txtAreacdo.setBackground(new Color(50, 50, 50));
            txtAreacdo.setForeground(new Color(255, 255, 255));
        }
    }
    @Override
    public void paint(Graphics g){
        super.paintComponents(g);
        int z=0;
        int mid=0;
        Color colorrojo= new Color(204,0,0);
        Color colorgris= new Color(192,192,192);
        
        z=(int)300/(int)lado2;
          g.setColor(colorgris);
          for(int c=400;c<765;c=c+z){
              g.drawLine(c, 60, c, 460);
              mid++;
          } 
          for(int c=60;c<460;c=c+z){
              g.drawLine(400, c, 765, c);
              }
              g.setColor(colorrojo);
              mid=z*mid/2;
              g.drawLine(400+mid,60,400+mid,400);
              g.drawLine(400,mid+60,765,mid+60);
              g.setColor(color);
              g.drawRect((int)(400+mid-(z*lado2/2)), (int)(60+mid-(z*lado2/2)), (int)(lado2*z), (int)(lado2*z));
              g.fillRect((int)(400+mid-(z*lado2/2)), (int)(60+mid-(z*lado2/2)), (int)(lado2*z), (int)(lado2*z));
    }
}
