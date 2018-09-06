package valenota;


import java.awt.Button;
import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.*;
import static valenota.tres.getindex;
import static valenota.tres.vetor;
import javafx.scene.paint.Color;


public class mostrartres extends Frame  
{
    Label L1;
    Button b3;
    TextArea Ta1;
    
      
	public mostrartres()
	{
            setLocationRelativeTo(null);
      setResizable(false);
            setTitle("Disciplina");
            setResizable(false);
            setSize(400,300);
            setLocation(100,100);
            setBackground(java.awt.Color.gray);
            setLayout(null);
            
                L1 = new Label("DISCIPLNA");
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
                        int n= getindex();
                        for (int i=0;i<n;i++){
                     System.out.println(i);
                           Ta1.setText(Ta1.getText()+" "+vetor(i)+"\n" );
                            
                            
                        }
                    }
                }
	}
        
    
}
