import javax.swing.*;
import java.awt.*;

public class ConvexCube extends JFrame {

    public static final int width = 400;
    public static final int height = 450;

    private Cube cube;

    public ConvexCube(Cube cube){
        this.cube = cube;
        start();
    }

    private void start(){
        this.pack();
        this.setSize(width, height);
        this.setTitle("Cube");
        this.setLocation(200, 200);
        this.setVisible(true); // --> paint(g)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = this.getContentPane();
        BorderLayout layout = new BorderLayout();
        JPanel panel = new JPanel();
        pane.setLayout(layout);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        pane.add(slider, BorderLayout.SOUTH);

        Controller controller = new Controller(panel);
        MySlider mySlider = new MySlider(slider, panel, cube, this);
        controller.addSlider(mySlider);
    }

    public void paint(Graphics g){
        super.paint(g);

        g.translate(width/2, height/2);
        g.drawLine(-width/2, 0, width/2, 0);
        g.drawLine(0, height/2, 0, -height/2);




        cube.ortDraw(g);
    }

}
