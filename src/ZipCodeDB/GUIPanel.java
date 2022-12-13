package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// JPanel is the base class. Gui panel is the derived class
public class GUIPanel extends JPanel {

    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;
    private Database db; // the zipcode data base


    public GUIPanel(){
        // zipcode searchbar
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        // zipcode submit
        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());


        // lat submit
        this.submit = new JButton("Northernmost");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener2());



        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.db = new Database(); // how you load the zipcodes

        // we have to add an event handler to the button
    }

    class SubmitButtonListener implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            // this will be called when an event happens on the submit button

            // get the data about the zipcode
            String code = zipcode.getText();

            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);
        }
    }

    class SubmitButtonListener2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // this will be called when an event happens on the submit button

            // get the data about the zipcode
            String code = zipcode.getText();

            Zipcode max = db.getNorthern();
            WeatherObservation wob = max.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);
        }
    }
}
