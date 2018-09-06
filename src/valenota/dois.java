package valenota;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class dois extends JFrame implements ActionListener, ListSelectionListener, ItemListener
{
    static int n=Integer.parseInt(JOptionPane.showInputDialog(null,"quantos cadastros?", ERROR));
    static String[]Professores= new String[n];
     static String[]CursoProf= new String[n];
     static String[]CursoProfa= new String[n];
    int cont=0;
    String w,x,y,z,beta,alfa,T,Ta;
   JButton B1, B2;
   JTextField a, b, c,d;
   JLabel L1, L2, L3, L4, L5, L6, L7;
   DefaultListModel lista;
   JList Est;
   JCheckBox Idi1, Idi2, Idi3;
   
   
   String Matricula = "123.456-7"; 

		
   public dois()
   {
       setLocationRelativeTo(null);
      setResizable(false);
      setTitle("Sistema de controle academico");
      setSize(500,500);
      setLocation(80,50);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      L1 = new JLabel("Cadastro de Professores");
      L1.setLocation(30,20);
      L1.setSize(490,20);
      L1.setFont(new Font("Serif", Font.BOLD, 22));

      L2 = new JLabel("NOME:");
      L2.setLocation(30,70);
      L2.setSize(70,20);

      a = new JTextField("");
      a.setSize(170,25);
      a.setLocation(140,70);

      L3 = new JLabel("RG:");
      L3.setLocation(30,120);
      L3.setSize(70,20);

      b = new JTextField("");
      b.setSize(170,25);
      b.setLocation(140,120);	
	
      L4 = new JLabel("ENDEREÇO:");
      L4.setLocation(30,170);
      L4.setSize(70,20);

      c = new JTextField("");
      c.setSize(170,25);
      c.setLocation(140,170);
      
      L5= new JLabel ("NASC:");
      L5.setSize(70,20);
      L5.setLocation(30,220);
      
      d = new JTextField("");
      d.setSize(170,25);
      d.setLocation(140,220);
      
      L6 = new JLabel("Cursos");
      L6.setLocation(350,160);
      L6.setSize(70,20);

      lista = new DefaultListModel();
      lista.addElement("Administração");
      lista.addElement("Biomedicina");
      lista.addElement("Ciências Biologicas");
      lista.addElement("Ciência da Computação");
      lista.addElement("Direito");
      lista.addElement("Educação Fisica");
      lista.addElement("Sistema de Computadores");

      Est = new JList(lista);
      Est.setSize(110,150);
      Est.setLocation(330,180);
      Est.setBackground(Color.LIGHT_GRAY);
      Est.addListSelectionListener(this);

      L7 = new JLabel("Tipo");
      L7.setLocation(30,250);
      L7.setSize(70,40);

      Idi1 = new JCheckBox("Lacto sensu",false);
      Idi1.setLocation(25,280);
      Idi1.setSize(120,20);
      Idi1.addItemListener(this);
      Idi1.setBackground(Color.LIGHT_GRAY);
		
      Idi2 = new JCheckBox("Mestrado",false);
      Idi2.setLocation(25,300);
      Idi2.setSize(120,20);
      Idi2.addItemListener(this);
      Idi2.setBackground(Color.LIGHT_GRAY);
		
      Idi3 = new JCheckBox("Doutorado",false);
      Idi3.setLocation(25,320);
      Idi3.setSize(120,20);
      Idi3.addItemListener(this);
      Idi3.setBackground(Color.LIGHT_GRAY);
		
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
      getContentPane().add(L5);
      getContentPane().add(L6);
      getContentPane().add(L7);
      
      getContentPane().add(a);
      getContentPane().add(b);
      getContentPane().add(c);
      getContentPane().add(d);
      getContentPane().add(Est);
      getContentPane().add(Idi1);
      getContentPane().add(Idi2);
      getContentPane().add(Idi3);
      
      
      
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
             alfa=d.getText();
             z=(String) Est.getSelectedValue();
             T="Nome: "+w+"     Rg:"+x+"     Endereço:"+y+"      Nascimento:"+alfa+"    Curso:"+z+"     Tipo:"+beta;
             Ta="Nome:"+w+"    Curso:"+z;
              try {
                            if (cont<=n)
                    {  
                                   Professores[cont]=T;
                                   CursoProf[cont]=Ta;
                                   System.out.println(""+Professores[cont]);      
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
             beta="Doutorado";
         }
      }
      if(e.getSource()==Idi1)
      {
         if(e.getStateChange()==ItemEvent.SELECTED)
         {
             beta="Lacto Sensu";
         }
      }
      if(e.getSource()==Idi2)
      {
         if(e.getStateChange()==ItemEvent.SELECTED)
         {
             beta="Mestrado";
         }
      }  
      
   }
   public static String vetor(int index) {
        return Professores[index];
    }
            public static int getindex() {
        return n;
    }  
            public static String vetora(int index) {
        return CursoProf[index];
    }
   
            public static int getindexa() {
        return n;
    }  
}