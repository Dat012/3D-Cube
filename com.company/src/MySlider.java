import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySlider extends JSlider {
    private JPanel panel;
    private Cube cube;
    private JSlider slider;

    private ConvexCube convex;

    public MySlider(JSlider slider, JPanel panel, Cube cube, ConvexCube convex){
        this.cube = cube;
        this.panel = panel;
        this.slider = slider;
        this.convex = convex;

        MySliderListener listener = new MySliderListener();
        slider.addChangeListener(listener);
        this.addChangeListener(listener);

    }

    private class MySliderListener implements ChangeListener {
        int ux = 0;
        int uy = 0;
        int uz = 0;
        int sum = 0;

        int curSlider = 0;
        int lastSlider = 0;
        int cordCude = 0;
        @Override
        public void stateChanged(ChangeEvent e) {
            curSlider = slider.getValue() - 25;

            ux = 0;
            uy = 1;
            uz = 0;


            if (curSlider > lastSlider) {
//                System.out.println(" cordCude: " + cordCude);
//                System.out.print(" curSlider: " + curSlider);
                cube.rotate(ux, uy, uz);
            } else if (curSlider < lastSlider) {
//                System.out.println(" cordCude: " + cordCude);
//                System.out.print(" curSlider: " + curSlider);
                cube.rotate(-ux, -uy, -uz);
            }
            /*for (int i = 0; i < 40; i++) {
                System.out.println(" cordCude: " + cordCude);
                System.out.print(" curSlider: " + curSlider);
                cube.rotate(c, c, c);
                cube.rotate(-c, -c, -c);
            }*/
            lastSlider = curSlider;
            panel.repaint();
            convex.repaint();
        }
    }
}