package pFigurative;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Arrays;
import javax.swing.event.ChangeEvent;

public class Triangulo extends JFrame implements ActionListener {

    // Creacion de los componentes del JFrame
    private Color color;
    private double[] x = {1,1,1};
    private double[] z = {1,1,1};
    private double x1;
    private double y1;  
    private JTextField txtL, txtL2, txtL3, txtPerimetrotrn, txtAreatrn, txtTipotrn;
    private JLabel jl1t, jl2t, jl3t, jl4t, jl5t, jl6t, jl7t, jl8t, jl9t, jl10t, jl11t;
    private JButton btninfTrn, btnPruebaTrn, btnRegresarTrn;
    private JMenuBar menubartrn;
    private JMenu menu1trn, menu2trn;
    private JMenuItem jmi1trn, jmi2trn;
    private JSlider slRTrn, slGTrn, slBTrn;
    int R3, G3, B3;

    // Creacion del constructor donde se agregan los elementos a la interfaz grafica
    public Triangulo() {
        setLayout(null);
        setTitle("Figurative");
        menubartrn = new JMenuBar();
        setJMenuBar(menubartrn);
        getContentPane().setBackground(new Color(52, 52, 52));

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
        jl1t.setForeground(new Color(255, 255, 255));
        add(jl1t);

        jl2t = new JLabel("Lado A: ");
        jl2t.setBounds(40, 78, 250, 20);
        jl2t.setForeground(new Color(255, 255, 255));
        jl2t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl2t);

        jl3t = new JLabel("Lado B: ");
        jl3t.setBounds(40, 102, 250, 20);
        jl3t.setForeground(new Color(255, 255, 255));
        jl3t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl3t);

        jl4t = new JLabel("Lado C: ");
        jl4t.setBounds(40, 130, 250, 20);
        jl4t.setForeground(new Color(255, 255, 255));
        jl4t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl4t);

        jl5t = new JLabel("Fórmula:     (b*h)/2");
        jl5t.setBounds(40, 218, 250, 20);
        jl5t.setForeground(new Color(255, 255, 255));
        jl5t.setFont(new Font("Verdana", Font.BOLD, 14));
        add(jl5t);

        jl6t = new JLabel("Tipo: ");
        jl6t.setBounds(40, 253, 250, 20);
        jl6t.setForeground(new Color(255, 255, 255));
        jl6t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl6t);

        jl7t = new JLabel("Perimetro: ");
        jl7t.setBounds(40, 288, 250, 20);
        jl7t.setForeground(new Color(255, 255, 255));
        jl7t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl7t);

        jl8t = new JLabel("Area: ");
        jl8t.setBounds(40, 326, 250, 20);
        jl8t.setForeground(new Color(255, 255, 255));
        jl8t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl8t);

        jl9t = new JLabel("Rojo: ");
        jl9t.setBounds(40, 370, 250, 20);
        jl9t.setForeground(new Color(255, 255, 255));
        jl9t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl9t);

        jl10t = new JLabel("Verde: ");
        jl10t.setBounds(40, 408, 250, 20);
        jl10t.setForeground(new Color(255, 255, 255));
        jl10t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl10t);

        jl11t = new JLabel("Azul: ");
        jl11t.setBounds(40, 438, 250, 20);
        jl11t.setForeground(new Color(255, 255, 255));
        jl11t.setFont(new Font("Verdana", Font.BOLD, 13));
        add(jl11t);

        txtL = new JTextField("Ingresa el valor del lado 1");
        txtL.setBounds(110, 79, 250, 20);
        txtL.setBackground(new Color(52, 52, 52));
        txtL.setForeground(new Color(255, 255, 255));
        txtL.setBorder(null);
        add(txtL);

        txtL2 = new JTextField("Ingresa el valor del lado 2");
        txtL2.setBounds(110, 105, 250, 20);
        txtL2.setBackground(new Color(52, 52, 52));
        txtL2.setForeground(new Color(255, 255, 255));
        txtL2.setBorder(null);
        add(txtL2);

        txtL3 = new JTextField("Ingresa el valor del lado 3");
        txtL3.setBounds(110, 131, 250, 20);
        txtL3.setBackground(new Color(52, 52, 52));
        txtL3.setForeground(new Color(255, 255, 255));
        txtL3.setBorder(null);
        add(txtL3);

        btninfTrn = new JButton("Mandar informacion");
        btninfTrn.setBounds(76, 170, 225, 25);
        btninfTrn.addActionListener(this);
        btninfTrn.setBorder(null);
        btninfTrn.setBackground(new Color(40, 40, 40));
        btninfTrn.setForeground(new Color(255, 255, 255));
        add(btninfTrn);

        btnRegresarTrn = new JButton("Regresar");
        btnRegresarTrn.setBounds(625, 485, 95, 20);
        btnRegresarTrn.addActionListener(this);
        btnRegresarTrn.setBorder(null);
        btnRegresarTrn.setBackground(new Color(40, 40, 40));
        btnRegresarTrn.setForeground(new Color(255, 255, 255));
        add(btnRegresarTrn);

        btnPruebaTrn = new JButton("Vista previa");
        btnPruebaTrn.setBounds(275, 470, 100, 25);
        btnPruebaTrn.addActionListener(this);
        btnPruebaTrn.setBorder(null);
        btnPruebaTrn.setBackground(new Color(40, 40, 40));
        btnPruebaTrn.setForeground(new Color(255, 255, 255));
        add(btnPruebaTrn);

        // Textfields donde se arrojaran los resultados obtenidos
        txtTipotrn = new JTextField("El triangulo es de tipo: ");
        txtTipotrn.setEditable(false);
        txtTipotrn.setBounds(110, 253, 250, 20);
        txtTipotrn.setBackground(new Color(52, 52, 52));
        txtTipotrn.setForeground(new Color(255, 255, 255));
        txtTipotrn.setBorder(null);
        txtTipotrn.setVisible(true);
        add(txtTipotrn);

        txtPerimetrotrn = new JTextField("0 unidades");
        txtPerimetrotrn.setEditable(false);
        txtPerimetrotrn.setBounds(165, 288, 250, 20);
        txtPerimetrotrn.setBackground(new Color(52, 52, 52));
        txtPerimetrotrn.setForeground(new Color(255, 255, 255));
        txtPerimetrotrn.setVisible(true);
        txtPerimetrotrn.setBorder(null);
        add(txtPerimetrotrn);

        txtAreatrn = new JTextField("0 unidades cuadradas");
        txtAreatrn.setEditable(false);
        txtAreatrn.setBounds(120, 326, 250, 20);
        txtAreatrn.setBackground(new Color(50, 52, 52));
        txtAreatrn.setForeground(new Color(255, 255, 255));
        txtAreatrn.setVisible(true);
        txtAreatrn.setBorder(null);
        add(txtAreatrn);

        slRTrn = new JSlider();
        slRTrn.setBounds(115, 370, 255, 15);
        slRTrn.setBackground(new Color(52, 52, 52));
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
        slGTrn.setBackground(new Color(52, 52, 52));
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
        slBTrn.setBackground(new Color(52, 52, 52));
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
        color = new Color(R3,G3,B3);
        btnPruebaTrn.setBackground(color);
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
                double peri=(x[0]+x[1]+x[2])/2;
                double areatrn=Math.sqrt(peri*(peri-x[0])*(peri-x[1])*(peri-x[2]));
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
            magic();
        }

        // Configuracion del modo claro
        if (t.getSource() == jmi1trn) {
            getContentPane().setBackground(new Color(245, 245, 245));
            jl1t.setForeground(new Color(0, 0, 0));
            jl2t.setForeground(new Color(0, 0, 0));
            jl3t.setForeground(new Color(0, 0, 0));
            jl4t.setForeground(new Color(0, 0, 0));
            jl5t.setForeground(new Color(0, 0, 0));
            jl6t.setForeground(new Color(0, 0, 0));
            jl7t.setForeground(new Color(0, 0, 0));
            jl8t.setForeground(new Color(0, 0, 0));
            jl9t.setForeground(new Color(0, 0, 0));
            jl10t.setForeground(new Color(0, 0, 0));
            jl11t.setForeground(new Color(0, 0, 0));
            btnPruebaTrn.setBackground(new Color(156, 0, 188));
            btnRegresarTrn.setBackground(new Color(156, 0, 188));
            btninfTrn.setBackground(new Color(156, 0, 188));
            slRTrn.setBackground(new Color(245, 245, 245));
            slGTrn.setBackground(new Color(245, 245, 245));
            slBTrn.setBackground(new Color(245, 245, 245));
            txtL.setBackground(new Color(245, 245, 245));
            txtL.setForeground(new Color(0, 0, 0));
            txtL2.setBackground(new Color(245, 245, 245));
            txtL2.setForeground(new Color(0, 0, 0));
            txtL3.setBackground(new Color(245, 245, 245));
            txtL3.setForeground(new Color(0, 0, 0));
            txtTipotrn.setBackground(new Color(245, 245, 245));
            txtTipotrn.setForeground(new Color(0, 0, 0));
            txtPerimetrotrn.setBackground(new Color(245, 245, 245));
            txtPerimetrotrn.setForeground(new Color(0, 0, 0));
            txtAreatrn.setBackground(new Color(245, 245, 245));
            txtAreatrn.setForeground(new Color(0, 0, 0));
        }

        // Configuracion del modo oscuro
        if (t.getSource() == jmi2trn) {
             getContentPane().setBackground(new Color(52, 52, 52));
            jl1t.setForeground(new Color(255, 255, 255));
            jl2t.setForeground(new Color(255, 255, 255));
            jl3t.setForeground(new Color(255, 255, 255));
            jl4t.setForeground(new Color(255, 255, 255));
            jl5t.setForeground(new Color(255, 255, 255));
            jl6t.setForeground(new Color(255, 255, 255));
            jl7t.setForeground(new Color(255, 255, 255));
            jl8t.setForeground(new Color(255, 255, 255));
            jl9t.setForeground(new Color(255, 255, 255));
            jl10t.setForeground(new Color(255, 255, 255));
            jl11t.setForeground(new Color(255, 255, 255));
            btnPruebaTrn.setBackground(new Color(40, 40, 40));
            btnRegresarTrn.setBackground(new Color(40, 40, 40));
            btninfTrn.setBackground(new Color(40, 40, 40));
            slRTrn.setBackground(new Color(52, 52, 52));
            slGTrn.setBackground(new Color(52, 52, 52));
            slBTrn.setBackground(new Color(52, 52, 52));
            txtL.setBackground(new Color(52, 52, 52));
            txtL.setForeground(new Color(255, 255, 255));
            txtL2.setBackground(new Color(52, 52, 52));
            txtL2.setForeground(new Color(255, 255, 255));
            txtL3.setBackground(new Color(52, 52, 52));
            txtL3.setForeground(new Color(255, 255, 255));
            txtTipotrn.setBackground(new Color(52, 52, 52));
            txtTipotrn.setForeground(new Color(255, 255, 255));
            txtPerimetrotrn.setBackground(new Color(52, 52, 52));
            txtPerimetrotrn.setForeground(new Color(255, 255, 255));
            txtAreatrn.setBackground(new Color(52, 52, 52));
            txtAreatrn.setForeground(new Color(255, 255, 255));
        }
    }
    @Override
        public void paint(Graphics g){
               
            super.paintComponents(g);
            int t=(int)(100/z[2]);
            int mid=0;
            Color colorgris= new Color(192,192,192);
            g.setColor(colorgris);
        
        for(int c=400;c<765;c=c+t){
              g.drawLine(c, 60, c, 400);
              mid++;
          } 
          for(int c=60;c<400;c=c+t){
              g.drawLine(400, c, 765, c);
              }
        double refx=t*mid/2;
        double refy=t*z[2]+t;
        g.setColor(color);
        
        int[] ux={(int)(400+refx),(int)(400+refx+t*z[0]),(int)((400+refx)+(t*x1))};
        int[] uy={(int)(60+refy),(int)(60+refy),(int)((60+refy)-(t*y1))};
        
        g.drawPolygon(ux,uy,3);
        g.fillPolygon(ux,uy,3);
            }
        
        
        
        public void magic(){
            for(int a=0;a<3;a++){
                z[a]=x[a];
            }
            Arrays.sort(z);
            
            x1=coordenadax(); y1=coordenaday();
            repaint();
        }
        private double coordenadax(){
            
            Arrays.sort(x);
            double a;
            double pendiente = ((x[2]*x[2])-(x[1]*x[1])-(x[0]*x[0]))/(-2*x[1]*x[0]);
            double angulo = (180*Math.acos(pendiente))/Math.PI;
            
            if (angulo!=90 || angulo!=180 || angulo!=270 || angulo!=360){
                  a=x[1]*Math.cos(Math.PI*angulo/180);             
            }
            else{
                a=0;
            }
            return a;
        }
        private double coordenaday(){
            
            Arrays.sort(x);
            double a;
            double pendiente = ((x[2]*x[2])-(x[1]*x[1])-(x[0]*x[0]))/(-2*x[1]*x[0]);
            double angulo = (180*Math.acos(pendiente))/Math.PI;
            
            if(angulo!=90 || angulo!=180 || angulo!=270 || angulo!=360){
                  a=x[1]*Math.sin(Math.PI*angulo/180);
            } else{
                a=x[1];
            }
            return a;
        }
}
