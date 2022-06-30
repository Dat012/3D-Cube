import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer{
    private JPanel panel;

    private MySlider slider;

    public Controller(JPanel panel){

        this.panel = panel;
    }

    public void addSlider(MySlider slider) {
        this.slider = slider;
    }

    public void update(Observable o, Object arg) {

        panel.repaint();
    }

}