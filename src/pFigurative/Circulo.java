package pFigurative;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;

public class Circulo extends JFrame implements ActionListener {

    // Creacion de los componentes del JFrame
    private JTextField txtRadio, txtDiametroCrc, txtPerimetroCrc, txtAreaCrc;
    private JLabel jlDiametro, jl1c, jl2c, jl12c, jl3c, jl4c, jl5c, jl6c, jl7c;
    private JButton btninfCrc, btnPruebaCrc, btnRegresarCrc;
    private JMenuBar menubarcrc;
    private JMenu menu1crc, menu2crc;
    private JMenuItem jmi1crc, jmi2crc;
    private int R1, G1, B1;
    private Color color = new Color(0,0,0);
    private JSlider slRCrc, slGCrc, slBCrc;
    private double r=10;

    // Creacion del constructor donde se agregan los elementos a la interfaz grafica
    public Circulo() {
        setLayout(null);
        setTitle("Figurative");
        menubarcrc = new JMenuBar();
        setJMenuBar(menubarcrc);
        getContentPane().setBackground(new Color(52, 52, 52));

        // Creacion del pequeño menu
        menu1crc = new JMenu("Opciones");
        menubarcrc.add(menu1crc);
        menu2crc = new JMenu("Tema");
        menu1crc.add(menu2crc);
        jmi1crc = new JMenuItem("Claro");
        menu2crc.add(jmi1crc);
        jmi1crc.addActionListener(this);
        jmi2crc = new JMenuItem("Oscuro");
        menu2crc.add(jmi2crc);
        jmi2crc.addActionListener(this);

        // Creacion de los sliders
        slRCrc = new JSlider();
        slRCrc.setBounds(115, 360, 255, 15);
        slRCrc.setBackground(new Color(52, 52, 52));
        slRCrc.setValue(0);
        slRCrc.setMaximum(255);
        slRCrc.setMajorTickSpacing(1);

        // Metodo que implementa la funcion de los sliders
        slRCrc.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent sRc) {
                cambiarColorCrc();
            }
        });

        add(slRCrc);

        slGCrc = new JSlider();
        slGCrc.setBounds(115, 410, 255, 15);
        slGCrc.setBackground(new Color(52, 52, 52));
        slGCrc.setValue(0);
        slGCrc.setMaximum(255);
        slGCrc.setMajorTickSpacing(1);
        add(slGCrc);

        slGCrc.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent sRc) {
                cambiarColorCrc();
            }
        });

        slBCrc = new JSlider();
        slBCrc.setBounds(115, 454, 255, 15);
        slBCrc.setBackground(new Color(52, 52, 52));
        slBCrc.setValue(0);
        slBCrc.setMaximum(255);
        slBCrc.setMajorTickSpacing(1);
        add(slBCrc);
        slBCrc.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent sRc) {
                cambiarColorCrc();
            }
        });

        // Creacion de los componentes del JFrame
        jl1c = new JLabel("Figura seleccionada: Circulo");
        jl1c.setBounds(85, 40, 250, 20);
        jl1c.setFont(new Font("Verdana", Font.BOLD, 14));
        jl1c.setForeground(new Color(255, 255, 255));
        add(jl1c);

        jl12c = new JLabel("Radio: ");
        jl12c.setBounds(40, 77, 250, 20);
        jl12c.setForeground(new Color(255, 255, 255));
        jl12c.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl12c);

        jl2c = new JLabel("Fórmula:     πr²");
        jl2c.setBounds(40, 178, 250, 20);
        jl2c.setForeground(new Color(255, 255, 255));
        jl2c.setFont(new Font("Verdana", Font.BOLD, 14));
        add(jl2c);

        jlDiametro = new JLabel("Diametro: ");
        jlDiametro.setBounds(40, 218, 250, 20);
        jlDiametro.setForeground(new Color(255, 255, 255));
        jlDiametro.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jlDiametro);

        jl3c = new JLabel("Perimetro: ");
        jl3c.setBounds(40, 263, 250, 20);
        jl3c.setForeground(new Color(255, 255, 255));
        jl3c.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl3c);

        jl4c = new JLabel("Area: ");
        jl4c.setBounds(40, 308, 250, 20);
        jl4c.setForeground(new Color(255, 255, 255));
        jl4c.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl4c);

        jl5c = new JLabel("Rojo: ");
        jl5c.setBounds(40, 353, 250, 20);
        jl5c.setForeground(new Color(255, 255, 255));
        jl5c.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl5c);

        jl6c = new JLabel("Verde: ");
        jl6c.setBounds(40, 404, 250, 20);
        jl6c.setForeground(new Color(255, 255, 255));
        jl6c.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl6c);

        jl7c = new JLabel("Azul: ");
        jl7c.setBounds(40, 445, 250, 20);
        jl7c.setForeground(new Color(255, 255, 255));
        jl7c.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl7c);

        txtRadio = new JTextField("Ingresa el valor del radio");
        txtRadio.setBounds(115, 79, 250, 20);
        txtRadio.setBackground(new Color(52, 52, 52));
        txtRadio.setForeground(new Color(255, 255, 255));
        txtRadio.setBorder(null);
        txtRadio.setVisible(true);
        add(txtRadio);

        btninfCrc = new JButton("Mandar informacion");
        btninfCrc.setBounds(80, 120, 230, 25);
        btninfCrc.setBackground(new Color(40, 40, 40));
        btninfCrc.setForeground(new Color(255, 255, 255));
        btninfCrc.addActionListener(this);
        add(btninfCrc);

        btnRegresarCrc = new JButton("Regresar");
        btnRegresarCrc.setBounds(625, 485, 95, 20);
        btnRegresarCrc.setBackground(new Color(40, 40, 40));
        btnRegresarCrc.setForeground(new Color(255, 255, 255));
        btnRegresarCrc.addActionListener(this);
        add(btnRegresarCrc);

        btnPruebaCrc = new JButton("Vista Previa");
        btnPruebaCrc.setBounds(275, 480, 100, 25);
        btnPruebaCrc.addActionListener(this);
        btnPruebaCrc.setBorder(null);
        btnPruebaCrc.setBackground(new Color(40, 40, 40));
        btnPruebaCrc.setForeground(new Color(255, 255, 255));
        add(btnPruebaCrc);

        // Textfields donde se arrojaran los resultados obtenidos
        txtDiametroCrc = new JTextField("0 unidades");
        txtDiametroCrc.setEditable(false);
        txtDiametroCrc.setBounds(140, 219, 250, 20);
        txtDiametroCrc.setBackground(new Color(52, 52, 52));
        txtDiametroCrc.setForeground(new Color(255, 255, 255));
        txtDiametroCrc.setVisible(true);
        txtDiametroCrc.setBorder(null);
        add(txtDiametroCrc);

        txtPerimetroCrc = new JTextField("0 unidades");
        txtPerimetroCrc.setEditable(false);
        txtPerimetroCrc.setBounds(140, 264, 250, 20);
        txtPerimetroCrc.setBackground(new Color(52, 52, 52));
        txtPerimetroCrc.setForeground(new Color(255, 255, 255));
        txtPerimetroCrc.setVisible(true);
        txtPerimetroCrc.setBorder(null);
        add(txtPerimetroCrc);

        txtAreaCrc = new JTextField("0 unidades cuadradas");
        txtAreaCrc.setEditable(false);
        txtAreaCrc.setBounds(122, 310, 250, 20);
        txtAreaCrc.setBackground(new Color(52, 52, 52));
        txtAreaCrc.setForeground(new Color(255, 255, 255));
        txtAreaCrc.setVisible(true);
        txtAreaCrc.setBorder(null);
        add(txtAreaCrc);
    }

    // Metodo que cambia el color de la figura y del boton "vista previa"
    public void cambiarColorCrc() {
        R1 = slRCrc.getValue();
        G1 = slGCrc.getValue();
        B1 = slBCrc.getValue();
        color = new Color(R1,G1,B1);
        btnPruebaCrc.setBackground(color);
    }

    // Creacion de la interfaz
    public void Circulo() {
        Circulo crc = new Circulo();
        crc.setBounds(0, 0, 765, 588);
        crc.setResizable(false);
        crc.setVisible(true);
        crc.setLocationRelativeTo(null);
        ImageIcon fig = new ImageIcon("src/images/figurative.png");
        crc.setIconImage(fig.getImage());
    }

    // Metodos que permiten la funcionalidad del boton
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btninfCrc) {
            try {
                // El usuario no puede editar el cuadro de texto
                txtRadio.setEditable(false);
                double Radio = Double.parseDouble(txtRadio.getText());
                r = Radio;
                double diametro = Radio * 2;
                double perimetroCrc = diametro * Math.PI;
                double areaCrc = Math.PI * Math.pow(Radio, 2);
                txtDiametroCrc.setText(diametro + " unidades");
                txtPerimetroCrc.setText(perimetroCrc + " unidades");
                txtAreaCrc.setText(areaCrc + " unidades cuadradas");
                repaint();
            } catch (Exception er) {
                JOptionPane.showMessageDialog(null, "Ingresa valores numericos, por favor.", "Error",
                        JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figJO.png"));
            }
        }

        if (e.getSource() == btnRegresarCrc) {
            this.setVisible(false);
            GUI interfaz = new GUI();
            interfaz.GUI();
        }

        if (e.getSource() == btnPruebaCrc) {
            repaint();
        }

        // Configuracion del modo claro
        if (e.getSource() == jmi1crc) {
            getContentPane().setBackground(new Color(245, 245, 245));
            btninfCrc.setBackground(new Color(156, 0, 188));
            btnPruebaCrc.setBackground(new Color(156, 0, 188));
            btnRegresarCrc.setBackground(new Color(156, 0, 188));
            jlDiametro.setForeground(new Color(0, 0, 0));
            jl1c.setForeground(new Color(0, 0, 0));
            jl12c.setForeground(new Color(0, 0, 0));
            jl2c.setForeground(new Color(0, 0, 0));
            jl3c.setForeground(new Color(0, 0, 0));
            jl4c.setForeground(new Color(0, 0, 0));
            jl5c.setForeground(new Color(0, 0, 0));
            jl6c.setForeground(new Color(0, 0, 0));
            jl7c.setForeground(new Color(0, 0, 0));
            slRCrc.setBackground(new Color(245, 245, 245));
            slGCrc.setBackground(new Color(245, 245, 245));
            slBCrc.setBackground(new Color(245, 245, 245));
            txtRadio.setBackground(new Color(245, 245, 245));
            txtRadio.setForeground(new Color(0, 0, 0));
            txtDiametroCrc.setBackground(new Color(245, 245, 245));
            txtPerimetroCrc.setBackground(new Color(245, 245, 245));
            txtAreaCrc.setBackground(new Color(245, 245, 245));
            txtDiametroCrc.setForeground(new Color(0, 0, 0));
            txtPerimetroCrc.setForeground(new Color(0, 0, 0));
            txtAreaCrc.setForeground(new Color(0, 0, 0));
        }

        // Configuracion del modo oscuro
        if (e.getSource() == jmi2crc) {
            getContentPane().setBackground(new Color(52, 52, 52));
            btninfCrc.setBackground(new Color(40, 40, 40));
            btnPruebaCrc.setBackground(new Color(40, 40, 40));
            btnRegresarCrc.setBackground(new Color(40, 40, 40));
            jlDiametro.setForeground(new Color(255, 255, 255));
            jl1c.setForeground(new Color(255, 255, 255));
            jl12c.setForeground(new Color(255, 255, 255));
            jl2c.setForeground(new Color(255, 255, 255));
            jl3c.setForeground(new Color(255, 255, 255));
            jl4c.setForeground(new Color(255, 255, 255));
            jl5c.setForeground(new Color(255, 255, 255));
            jl6c.setForeground(new Color(255, 255, 255));
            jl7c.setForeground(new Color(255, 255, 255));
            slRCrc.setBackground(new Color(52, 52, 52));
            slGCrc.setBackground(new Color(52, 52, 52));
            slBCrc.setBackground(new Color(52, 52, 52));
            txtRadio.setBackground(new Color(52, 52, 52));
            txtRadio.setForeground(new Color(255, 255, 255));
            txtDiametroCrc.setBackground(new Color(52, 52, 52));
            txtPerimetroCrc.setBackground(new Color(52, 52, 52));
            txtAreaCrc.setBackground(new Color(52, 52, 52));
            txtDiametroCrc.setForeground(new Color(255, 255, 255));
            txtPerimetroCrc.setForeground(new Color(255, 255, 255));
            txtAreaCrc.setForeground(new Color(255, 255, 255));
        }
    }
    @Override
    public void paint(Graphics g){
    
        super.paintComponents(g);
        int z=(int)(300/(2*r));  
        int mid=0;
        Color colorrojo= new Color(204,0,0);
        Color colorgris= new Color(192,192,192);
        g.setColor(colorgris);
        for(int c=400;c<765;c=c+z){
              g.drawLine(c,60,c,400);
              mid++;
              }
              for(int c=60;c<400;c=c+z){
              g.drawLine(400, c, 765, c);
              }
        mid=(z*(mid/2));
        g.setColor(colorrojo);
        g.drawLine(400+mid,60,400+mid,400);
        g.drawLine(400,mid+60,765,mid+60);
        
        g.setColor(color);
        g.drawOval( (400+(int)(mid-(z*r))), (60+(int)(mid-(z*r))), (int)(2*r*z), (int)(2*r*z)); 
        g.fillOval( (400+(int)(mid-(z*r))), (60+(int)(mid-(z*r))), (int)(2*r*z), (int)(2*r*z));
    } 
}
