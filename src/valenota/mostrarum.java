package valenota;


import java.awt.Button;
import java.awt.CheckboxGroup;
import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.*;
import static valenota.um.getindex;
import static valenota.um.vetor;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

public class mostrarum extends Frame  
{
    Label L1;
    Button b3;
    TextArea Ta1;
    
      
	public mostrarum()
	{
            setTitle("Cursos");
            setResizable(false);
            setSize(400,300);
            setLocation(100,100);
            setBackground(java.awt.Color.gray);
            setLayout(null);
            
                L1 = new Label("CURSOS");
                L1.setLocation(30,20);
                L1.setSize(490,60);
                L1.setFont(new Font("Serif", Font.BOLD, 22));

                Ta1 = new TextArea("", 5, 40,1);
		Ta1.setSize(300,150);
                Ta1.setLocation(30,80);
                
                
                b3 = new Button("Mostrar");
		b3.setSize(80,30);
		b3.setLocation(232,250);
		b3.setBackground(java.awt.Color.LIGHT_GRAY);
                
                add(L1);
                setLocationRelativeTo(null);
                setResizable(false);
                add(Ta1);
                add(b3);
                 ButtonHandler handler = new ButtonHandler();
                 b3.addActionListener(handler);
        }
       public boolean handleEvent(Event e)
          {
             if (e.id == Event.WINDOW_DESTROY) 
                dispose();           
                return (super.handleEvent(e));
          }

	private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {
                  
                   
                    
               if(e.getActionCommand()=="Mostrar")
                    {
                        try {
                        int n= getindex();
                        System.out.println("n:"+n);
                        for (int i=0;i<n;i++){
                        System.out.println(i);
                           Ta1.setText(Ta1.getText()+" "+vetor(i)+"\n" );          
                         }
                         }
                        catch(ArrayIndexOutOfBoundsException exception){
                            System.out.println("erro de lógica");
                                    }
                        
                    }
                }
	}
        
    
}
