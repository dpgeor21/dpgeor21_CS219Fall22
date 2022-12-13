package ZipCodeDB;

import javax.swing.*;

public class GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CS219 Weather App");
        frame.add(new GUIPanel());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //this will terminate the program when the user exits
        frame.pack();//should make the jframe the size of the internal components
    }
}
