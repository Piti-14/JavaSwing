import javax.swing.*;

public class Lhinus {

    public static void main(String[] args) {

        createInitialButtons(createInitialFrame());
    }

    private static JFrame createInitialFrame() {
        JFrame initialFrame = new JFrame();
        initialFrame.setBounds(0, 0, 300, 300);
        initialFrame.setDefaultCloseOperation(3);
        return initialFrame;
    }

    private static void createInitialButtons(JFrame frame) {
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Lhinus");
        JButton button2 = new JButton("Eliminate");

        button1.addActionListener(e -> createDescendantFrame());
        button2.addActionListener(e -> closeLastChildFrame());
        
        panel.add(button1);
        panel.add(button2);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void closeLastChildFrame() {
    }

    private static void createDescendantFrame() {
        JFrame childFrame = new JFrame();
        childFrame.setBounds(0, 0, 300, 300);
        childFrame.setDefaultCloseOperation(2);
        
        JPanel childPanel = new JPanel();
        JButton childButton = new JButton("Eliminate Descendants");
        childFrame.setVisible(true);
    }
}
