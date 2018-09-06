package valenota;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class tres extends JFrame implements ActionListener, ListSelectionListener, ItemListener
{
    static int n=Integer.parseInt(JOptionPane.showInputDialog(null,"quantos cadastros?", ERROR));
    static String[]Disciplina= new String[n];
    static String[]mostrar= new String[n];
    int cont=0;
    String w,x,y,z,T,total;
   JButton B1, B2;
   JTextField a, b, c;
   JLabel L1, L2, L3, L4, L6, L7;
   JCheckBox Idi1, Idi2, Idi3,Idi4;
   
   

		
   public tres()
   {
      setTitle("Sistema de controle academico");
      setSize(500,500);
      setLocation(80,50);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      L1 = new JLabel("Cadastro de Disciplina");
      L1.setLocation(30,20);
      L1.setSize(490,20);
      L1.setFont(new Font("Serif", Font.BOLD, 22));

      L2 = new JLabel("NOME:");
      L2.setLocation(30,70);
      L2.setSize(70,20);

      a = new JTextField("");
      a.setSize(170,25);
      a.setLocation(140,70);

      L3 = new JLabel("CÓDIGO:");
      L3.setLocation(30,120);
      L3.setSize(70,20);

      b = new JTextField("");
      b.setSize(170,25);
      b.setLocation(140,120);	
	
      L4 = new JLabel("DURAÇÃO:");
      L4.setLocation(30,170);
      L4.setSize(70,20);

      c = new JTextField("");
      c.setSize(170,25);
      c.setLocation(140,170);
      
      L7 = new JLabel("QUANTIDADE DE AULAS");
      L7.setLocation(30,220);
      L7.setSize(150,70);

      Idi1 = new JCheckBox("1",false);
      Idi1.setLocation(25,280);
      Idi1.setSize(120,20);
      Idi1.addItemListener(this);
      Idi1.setBackground(Color.LIGHT_GRAY);
		
      Idi2 = new JCheckBox("2",false);
      Idi2.setLocation(25,300);
      Idi2.setSize(120,20);
      Idi2.addItemListener(this);
      Idi2.setBackground(Color.LIGHT_GRAY);
		
      Idi3 = new JCheckBox("3",false);
      Idi3.setLocation(25,320);
      Idi3.setSize(120,20);
      Idi3.addItemListener(this);
      Idi3.setBackground(Color.LIGHT_GRAY);
      
      Idi4 = new JCheckBox("4",false);
      Idi4.setLocation(25,340);
      Idi4.setSize(120,20);
      Idi4.addItemListener(this);
      Idi4.setBackground(Color.LIGHT_GRAY);
		
      B1 = new JButton("Incluir");
      B1.setSize(100,40);
      B1.setLocation(110,400);
      B1.setBackground(new Color(150,220,255));
      B1.addActionListener(this);
      B1.setFont(new Font("Serif", Font.BOLD, 18));      
      B1.setBackground(Color.LIGHT_GRAY);

      B2 = new JButton("Sair");
      B2.setSize(100,40);
      B2.setLocation(300,400);
      B2.setBackground(new Color(150,220,255));
      B2.addActionListener(this);
      B2.setFont(new Font("Serif", Font.BOLD, 18));      
      B2.setBackground(Color.LIGHT_GRAY);

      getContentPane().setLayout(null);
      getContentPane().add(L1);
      getContentPane().add(L2);
      getContentPane().add(L3);
      getContentPane().add(L4);
      getContentPane().add(L7);     
      getContentPane().add(a);
      getContentPane().add(b);
      getContentPane().add(c);
      getContentPane().add(Idi1);
      getContentPane().add(Idi2);
      getContentPane().add(Idi3);
      getContentPane().add(Idi4);
      getContentPane().add(B1);
      getContentPane().add(B2);
			
   }
   public static void main (String arg[])
   {
      new um().setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == B2)
         dispose(); 
      else
         if (e.getSource() == B1)
         {
             
             w=a.getText();
             x=b.getText();
             y=c.getText();
             T="Nome:"+w+"      Código:"+x+"    Carga horario:"+y+"       Quantidade de aulas:"+z;
             total="Disciplina:"+w;
           try {
                            if (cont<=n)
                    {  
                                   Disciplina[cont]=T;
                                   mostrar[cont]=total;
                                   System.out.println(""+Disciplina[cont]);  
                                   
                         cont++;
                         
                         }
                         }
                        catch(ArrayIndexOutOfBoundsException exception){
                            JOptionPane.showMessageDialog(null, "Você escolheu fazer apenas "+n+" cadastro!!!" );
                                    }
          
           
         }
   }

   public void valueChanged(ListSelectionEvent e) 
   {
      
   }   

   public void itemStateChanged(ItemEvent e)
   {
      if(e.getSource()==Idi3)
      {
         if(e.getStateChange()==ItemEvent.SELECTED)
         {
             z="3";
         }
      }
      if(e.getSource()==Idi1)
      {
         if(e.getStateChange()==ItemEvent.SELECTED)
         {
             z="1";
         }
      }
      if(e.getSource()==Idi2)
      {
         if(e.getStateChange()==ItemEvent.SELECTED)
         {
             z="2";
         }
      }  
      if(e.getSource()==Idi4)
      {
         if(e.getStateChange()==ItemEvent.SELECTED)
         {
             z="4";
         }
      }  
      
   }
   public static String vetor(int index) {
        return Disciplina[index];
    }
   
            public static int getindex() {
        return n;
    }  
      public static String vetorc(int index) {
        return mostrar[index];
    }
   
            public static int getindexc() {
        return n;
    }  
            
}