import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JComponent implements KeyListener, ActionListener {
    Font e=new Font("Areal",Font.BOLD,15);
    Rectangle rectangle1=new Rectangle(0,0,0,0);

    Mypenal mypenal=new Mypenal();



    class Mypenal extends JPanel {
        public void paint(Graphics g){

            g.fillRect(100,100,100,100);
            g.setColor(Color.green);
        }
    }
    Main() {

        JButton button = new JButton(); //создание кнопки
        button.setSize(200,100);
        button.setVisible(true);
        button.setLocation(220,550);
        button.setText("сортировать");
        button.setFont(e);

        JFrame frame = new JFrame(); //создание окна
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setLocation(200,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        TextField field=new TextField();
        field.setSize(200,100);
        field.setLocation(220,10);
        field.setVisible(true);
        field.setFont(e);
        field.setText("длина и ширина");





        mypenal.setLocation(400,400);
       mypenal.setVisible(true);

        frame.add(button);
        frame.add(field);
        frame.add(mypenal);


    }



    public static void main(String[] args) {
       Main main=new Main();




    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void actionPerformed(ActionEvent e) {

    }
}
