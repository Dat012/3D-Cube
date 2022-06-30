import javax.swing.*;
import java.awt.*;

//набор граней
public class Cube {
    private Facet[] facets = new Facet[6];

    public Cube() {

        //дальняя грань в плосткости XY
        facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(0,1,0),
                new R3Vector(1,1,0), new R3Vector(1, 0,0));
        facets[0].setColor(Color.ORANGE);

        //ближняя грань
        facets[1] = new Facet(new R3Vector(1,1,1), new R3Vector(0,1,1),
                              new R3Vector(0,0,1), new R3Vector(1, 0,1));
        facets[1].setColor(Color.BLUE);

        //верхняя грань
        facets[2] = new Facet(new R3Vector(1,1,1), new R3Vector(1,1,0),
                              new R3Vector(0,1,0), new R3Vector(0, 1,1));
        facets[2].setColor(Color.RED);

        //нижняя грань
        facets[3] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0),
                              new R3Vector(1,0,1), new R3Vector(0,0,1));
        facets[3].setColor(Color.YELLOW);

        //боковая лево
        facets[4] = new Facet(new R3Vector(0,0,0), new R3Vector(0,0,1),
                              new R3Vector(0,1,1), new R3Vector(0,1,0));
        facets[4].setColor(Color.GREEN);

        //боковая право
        facets[5] = new Facet(new R3Vector(1,1,1), new R3Vector(1,0,1),
                              new R3Vector(1,0,0), new R3Vector(1,1,0));
        facets[5].setColor(Color.PINK);
    }

    //маштабинование
    public void scale(double k) {
        for (int i = 0; i < facets.length; i++) {
            facets[i].scale(k);

        }
    }

    //перенос
    public void translate(double dx, double dy, double dz){
        for (int i = 0; i < 6; i++) {
            facets[i].translate(dx, dy, dz);
        }
    }

    //поворот
    public void rotate(double ux, double uy, double uz){
        for (int i = 0; i < 6; i++) {
            facets[i].rotate(ux, uy, uz);
        }
    }


    public void ortDraw (Graphics g){
        for (int i = 0; i < 6; i++) {
            facets[i].ortDraw(g);
        }

    }
}
