package selectorcolores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OpcionColores extends JFrame {

    private JComboBox<String> comboColores;
    private JPanel panelColor;

    public OpcionColores() {
        super("SELECCIÓN DE LOS COLORES");
        setLayout(new FlowLayout());
        DefaultComboBoxModel<String> paletaColores = new DefaultComboBoxModel<>();
        paletaColores.addElement("Azul");
        paletaColores.addElement("Rojo");
        paletaColores.addElement("Amarillo");
        paletaColores.addElement("Verde");
        comboColores = new JComboBox<>(paletaColores);
        comboColores.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColores();
            }
        });
         panelColor = new JPanel();
        panelColor.setPreferredSize(new Dimension(300, 300));
        panelColor.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        add(comboColores, BorderLayout.NORTH);
        add(panelColor, BorderLayout.CENTER);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void cambiarColores() {

        String colorSeleccionado = (String) comboColores.getSelectedItem();
        Color color = Color.WHITE;

        switch (colorSeleccionado) {

            case "Azul":
                color = Color.BLUE;
                break;
            case "Rojo":
                color = Color.red;
                break;
            case "Amarillo":
                color = Color.YELLOW;
                break;
            case "Verde":
                color = Color.GREEN;
                break;
        }
        panelColor.setBackground(color);

    }

}
