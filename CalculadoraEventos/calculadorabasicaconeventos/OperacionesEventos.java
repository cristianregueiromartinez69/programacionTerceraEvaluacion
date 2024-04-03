
package calculadorabasicaconeventos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OperacionesEventos extends JFrame {
    
   JButton botonSuma;
   JButton botonResta;
   JTextField campoNumero1;
   JTextField campoNumero2;
   JTextArea resultado;
   
           
   public OperacionesEventos(){
       
       super("CALCULADORA");
        setLayout(new FlowLayout());
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(600,600);
        botonSuma = new JButton("Suma");
        add(botonSuma);
        botonResta = new JButton("Resta");
        add(botonResta);
        campoNumero1 = new JTextField(10);
        add(campoNumero1);
        campoNumero2 = new JTextField(10);
        add(campoNumero2);
        
        botonSuma.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              sumar();
           }
        
        });
        botonResta.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               restar();
           }
            
        });
        
        resultado = new JTextArea(5, 20);
        add(new JScrollPane(resultado));
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
       
   }
   
   public void sumar(){
       
       try{
       float num1 = Float.parseFloat(campoNumero1.getText());
       float num2 = Float.parseFloat(campoNumero2.getText());
       float resultadoOperacion = num1 + num2;
       resultado.setText("Resultado de la suma: " + resultadoOperacion);
        }catch(NumberFormatException e){
            
          resultado.setText("Error al introducir los numeros, vuelva a intentarlo");
        }
       
   }
   
     
   public void restar(){
       
       try{
       float num1 = Float.parseFloat(campoNumero1.getText());
       float num2 = Float.parseFloat(campoNumero2.getText());
       float resultadoOperacion = num1 - num2;
       resultado.setText("Resultado de la resta: " + resultadoOperacion);
        }catch(NumberFormatException e){
            
          resultado.setText("Error al introducir los numeros, vuelva a intentarlo");
        }
       
   }
   
    
    
    
}
