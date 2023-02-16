import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessTheNumber extends JFrame{
    private JPanel panelMain;
    private JTextField textNumber;
    private JButton letSGoButton;
    private JLabel text;

    public GuessTheNumber() {
        letSGoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int user_number = Integer.parseInt(textNumber.getText());
                int points = 0;
                int random_number = (int) (Math.random() * (101) + 1);
                if (random_number == user_number) {
                    System.out.println("You guessed it orrect !!");
                    points++;
                } else if (random_number < user_number) {
                    System.out.println("Higher :( ");
                } else if (random_number > user_number) {
                    System.out.println("Lower :(");
                }
            }


        });

    }

    public static void main(String[] args) {
        GuessTheNumber g = new GuessTheNumber();
        g.setContentPane(g.panelMain);
        g.setTitle("Guess the Number ");
        g.setBounds(500,500,300,120);
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
