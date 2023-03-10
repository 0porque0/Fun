import javax.swing.*;

public class PasswordGenerator extends JFrame{

    public static void main(String[] args) {
        String letter = "azertyuiopqsdfghjklmwxcvbn";
        String LETTER = "AZERTYUIOPQSDFGHJKLMWXCVBN";
        String number = "1234567890";
        String symbols = "!@#$%^&*";
        String password = "";

        for (int i=0; i<10; i++) {
            int type = (int) (Math.random() * (4 - 0));
            if (type == 0) {
                int num = (int) (Math.random() * (26 - 0));
                password = password + letter.charAt(num);
            }
            else if (type == 1) {
                int num = (int)(Math.random() * (26 - 0));
                password = password + LETTER.charAt(num);
            }
            else if (type == 2) {
                int num = (int)(Math.random() * (10 - 0));
                password = password + number.charAt(num);
            }
            else if (type == 3) {
                int num = (int)(Math.random() * (8 - 0));
                password = password + symbols.charAt(num);
            }
        }

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        frame.add(panel);
        frame.setSize(824,824);
        frame.show();
        panel.add(label);
        frame.pack();

        System.out.println(password);


    }
    
}
