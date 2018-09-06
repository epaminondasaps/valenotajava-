package valenota;


import java.awt.*;
import java.awt.event.*;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;

public class Valenota extends JFrame implements ActionListener
{
                MenuBar bMenu;
                Menu menu1, menu2,menu4 ;
                MenuItem m1, m2, m3, m5, m6, m7,m8,m9,m10,m11,m12;
                String c;
                int n;
                

	public Valenota()
	{
            
	      setTitle("Sistema de controle acadêmico");
	     
	      setSize(400,300);
	     
	      setBackground(Color.gray);
	      setLayout(null);

                menu1 = new Menu("Cadastrar");
                m1 = new MenuItem("Curso");
                m1.addActionListener(this);
                m2 = new MenuItem("Professor");
                m2.addActionListener(this);
                m3 = new MenuItem("Disciplina");
                m3.addActionListener(this);
                
                menu1.add(m1);
                menu1.add(m2);
                menu1.add(m3);
                

                menu2 = new Menu("Mostrar");
                m5 = new MenuItem("Cursos");
                m5.addActionListener(this);
                m6 = new MenuItem("Professor");
                m6.addActionListener(this);
                m7 = new MenuItem("Disciplina");
                m7.addActionListener(this);
                m11 = new MenuItem("Cursos e professores");
                m11.addActionListener(this);
                m12 = new MenuItem("Cursos e disciplinas");
                m12.addActionListener(this);
                
                menu2.add(m5);
                menu2.add(m6);
                menu2.add(m7);
                menu2.add(m11);
                menu2.addSeparator();
                menu2.add(m12);
               
                menu4 = new Menu("Sair");
                m8 = new MenuItem("Sair");
                m8.addActionListener(this);
                menu4.add(m8); 
                
	        bMenu = new MenuBar();
	        bMenu.add(menu1);
	        bMenu.add(menu2);
                bMenu.add(menu4);

	        setMenuBar(bMenu);
                setLocationRelativeTo(null);
                setResizable(false);
	}
          public boolean handleEvent(Event e)
          {
             if (e.id == Event.WINDOW_DESTROY) 
                System.exit(0);           
                return (super.handleEvent(e));
          }

	public void actionPerformed(ActionEvent e)
	{

            String evento;
            if (e.getSource()==m1)
            {
                new um().setVisible(true);
            }
            if (e.getSource()==m2)
            {
                new dois().setVisible(true);
            }
            if(e.getSource()==m3)
            {
                new tres().setVisible(true);
            }
            if (e.getSource()==m5)
            {
                new mostrarum().setVisible(true);
            }
            if (e.getSource()==m8)
            {
                System.exit(0);
            }
            if(e.getSource()==m6)
            {
                new mostrardois().setVisible(true);
            }
            if(e.getSource()==m7)
            {
                new mostrartres().setVisible(true);
            }
            if(e.getSource()==m11)
            {
                new CursosProf().setVisible(true);
            }
	}
          public static void main(String arg[])
	{
		new Tela().setVisible(true);
	}
          
}