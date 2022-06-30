import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.translate(-0.5, -0.5, -0.5);
        cube.scale(200);
        cube.rotate(1,1,1);

        ConvexCube convexCube = new ConvexCube(cube);

        /*frame.addKeyListener(new KeyListener(){
            //Клавиша нажата и отпущена.
            public void keyTyped(KeyEvent ke) { ;}

            //Клавиша отпущена.
            public void keyReleased(KeyEvent e) {;}

            //Клавиша нажата, но не отпущена.
            public void keyPressed(KeyEvent e){
                int keyCode = e.getKeyCode();
                switch(keyCode) {
                    case KeyEvent.VK_UP:
                        //System.out.println(keyCode);
                        cube.rotate(-1, 0, 0);
                        cubeFrame.paint(cubeFrame.getGraphics());
                        break;
                    case KeyEvent.VK_DOWN:
                        //System.out.println(keyCode);
                        cube.rotate(1, 0, 0);
                        cubeFrame.paint(cubeFrame.getGraphics());
                        break;
                    case KeyEvent.VK_LEFT:
                        //System.out.println(keyCode);
                        cube.rotate(0, 1, 0);
                        cubeFrame.paint(cubeFrame.getGraphics());
                        break;
                    case KeyEvent.VK_RIGHT:
                        //System.out.println(keyCode);
                        cube.rotate(0, -1, 0);
                        cubeFrame.paint(cubeFrame.getGraphics());
                        break;
                }
            }
        });*/

    }
}
