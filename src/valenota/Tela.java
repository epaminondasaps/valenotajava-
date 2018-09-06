package valenota;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela extends JFrame  implements ActionListener
{
   JTextField Tx1;
   JLabel L1, L2, L3;
   JPasswordField Sx;
                
   int Vezes = 0;
		int a,b,c;
   public Tela()
   {
      setTitle("^");
      setSize(200,150);
      setLocation(100,100);
      getContentPane().setBackground(Color.WHITE);
      setLocationRelativeTo(null); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setIconImage(new ImageIcon(getClass().getResource("incongrap.png")).getImage());
		
      L1 = new JLabel("digite seu usuario e senha");
      L1.setLocation(10,10);	
      L1.setSize(190,20);
      L1.setFont(new Font("Serif", Font.BOLD, 16));

      L2 = new JLabel("Usuario: ");
      L2.setLocation(10,35);
      L2.setSize(90,30);
      L2.setFont(new Font("Serif", Font.BOLD, 14));

      Tx1 = new JTextField("");
      Tx1.setLocation(80,35);
      Tx1.setSize(100,20);
      Tx1.setFont(new Font("Serif", Font.BOLD, 14));

      L3 = new JLabel("Senha: ");
      L3.setLocation(10,70);
      L3.setSize(100,30);
      L3.setFont(new Font("Serif", Font.BOLD, 16));
		
      JPasswordField Sx = new JPasswordField();
      this.Sx = Sx ;
      Sx.setEchoChar('º');
      Sx.setSize(100,20);
      Sx.setLocation(80,70);
      Sx.addActionListener(this);
      Sx.setFont(new Font("Serif", Font.BOLD, 14));

      getContentPane().setLayout(null);
      getContentPane().add(L1);
      getContentPane().add(L2);
      getContentPane().add(L3);
      getContentPane().add(Tx1);
      getContentPane().add(Sx);

   }
   public static void main (String arg[])
   {
      new Tela().setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      Vezes = Vezes + 1;

      if((Tx1.getText().equals("root")) && (Sx.getText().equals("root"))){
         new Valenota().setVisible(true);
         dispose();
          }
      else
      {
         if(Vezes == 3)
         {
            JOptionPane.showMessageDialog(null,"3 Tentativas :(");
  	        System.exit(0);
	     }
         else
	        JOptionPane.showMessageDialog(null,"SENHA ERRADA !!!!TENTE NOVAMENTE !");
      }
   }
}