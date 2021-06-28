
package pFigurative;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI extends JFrame implements ActionListener {
    
    JLabel jlImagen, jlImagen2;
    JButton btnCirculo, btnTriangulo, btnCuadrado, btnSalir;
    JMenuBar menubar;
    JMenu menu1, menu2;
    JMenuItem jmi1, jmi2;
    
    public GUI(){
        setLayout(null);
        setTitle("Figurative");
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        getContentPane().setBackground(new Color (0,0,0));
        
        menu1 = new JMenu("Opciones");
        menubar.add(menu1);
        menu2 = new JMenu("Tema");
        menu1.add(menu2);
        jmi1 = new JMenuItem("Claro");
        menu2.add(jmi1);
        jmi1.addActionListener(this);
        jmi2 = new JMenuItem("Oscuro");
        menu2.add(jmi2);
        jmi2.addActionListener(this);
        
        btnCirculo = new JButton();
        btnCirculo.setBounds(155, 105, 205, 30);
        btnCirculo.addActionListener(this);
        btnCirculo.setBorder(null);
        btnCirculo.setContentAreaFilled(false);
        add(btnCirculo);

        btnCuadrado = new JButton();
        btnCuadrado.setBounds(145, 215, 220, 30);
        btnCuadrado.addActionListener(this);
        btnCuadrado.setBorder(null); 
        btnCuadrado.setContentAreaFilled(false);
        add(btnCuadrado);

        btnTriangulo = new JButton();
        btnTriangulo.setBounds(145, 325, 220, 30);
        btnTriangulo.addActionListener(this);
        btnTriangulo.setBorder(null);
        btnTriangulo.setContentAreaFilled(false);
        add(btnTriangulo);
        
        btnSalir = new JButton();
        btnSalir.setBounds(605, 390, 90, 50);
        btnSalir.addActionListener(this);
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        add(btnSalir);
        
        ImageIcon fonOscuro = new ImageIcon("src/images/figurativeOsc.png");
        jlImagen = new JLabel(fonOscuro);
        jlImagen.setBounds(0, 0, 727, 458);
        jlImagen.setVisible(true);
        add(jlImagen);
        
        ImageIcon fonClaro = new ImageIcon("src/images/figurativeCro.png");
        jlImagen2 = new JLabel(fonClaro);
        jlImagen2.setBounds(0, 0, 727, 458);
        jlImagen2.setVisible(false);
        add(jlImagen2);
    }
    
    // Se crea la interfaz donde todos los elementos se plasmaran
    public void GUI(){
        GUI GUI = new GUI();
        GUI.setBounds(0, 0, 743, 519);
        GUI.setResizable(false);
        GUI.setVisible(true);
        GUI.setLocationRelativeTo(null);
        ImageIcon fig = new ImageIcon("src/images/figurative.png");
        GUI.setIconImage(fig.getImage());
    }
    
    @Override
    public void actionPerformed (ActionEvent k){
        
            UIManager.put("OptionPane.background", new Color(255,255,255));
            UIManager.put("Panel.background", new Color(255,255,255));
            UIManager.put("OptionPane.messageForeground", new Color(0,0,0));
            UIManager.put("Button.background", new Color(156,0,188));
            UIManager.put("Button.foreground", new Color(255,255,255));
           
            if (k.getSource() == jmi1) {
            getContentPane().setBackground(new Color(245, 245, 245));
            jlImagen.setVisible(false);
            jlImagen2.setVisible(true);
        }

            if (k.getSource() == jmi2) {
            getContentPane().setBackground(new Color(55,55,55));
            jlImagen.setVisible(true);
            jlImagen2.setVisible(false);
        }
            
            if (k.getSource() == btnCirculo) {
            try {
                this.setVisible(false);
                Circulo crc = new Circulo();
                crc.Circulo();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor"
                        + " que sea valido y logico, o cumple la indicación dada.",
                        "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figJO.png"));
            }
        }

        if (k.getSource() == btnCuadrado) {
            try {
                this.setVisible(false);
                Cuadrado cd = new Cuadrado();
                cd.Cuadrado();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor"
                        + " que sea valido y logico, o cumple la indicación dada.",
                        "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figJO.png"));
            }
        }

        if (k.getSource() == btnTriangulo) {
            try {
                this.setVisible(false);
                Triangulo trn = new Triangulo();
                trn.Triangulo();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor"
                        + " que sea valido y logico, o cumple la indicación dada.",
                        "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figJO.png"));
            }
        }

        if (k.getSource() == btnSalir) {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Gracias por visitarnos.", "Te queremos",
                    JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figJO.png"));
            System.exit(0);
        }

    }
    
}

