import java.awt.*;// перенести, маштабиворать, повернуть
import java.awt.geom.Path2D;

import static javax.swing.text.StyleConstants.Orientation;

public class Facet {
    private R3Vector[] vectors;
    public Color color;

    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4) {
        color = Color.BLACK;
        vectors = new R3Vector[4];
        vectors[0] = v1;
        vectors[1] = v2;
        vectors[2] = v3;
        vectors[3] = v4;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //маштабинование
    public void scale(double k) {
        for (int i = 0; i < vectors.length; i++) {
            vectors[i].scale(k);

        }
    }

    //перенос
    public void translate(double dx, double dy, double dz){
        for (int i = 0; i < vectors.length; i++) {
            vectors[i].translate(dx, dy, dz);
        }
    }

    //поворот
    public void rotate(double ux, double uy, double uz){
        for (int i = 0; i < vectors.length; i++) {
            vectors[i].rotate(ux, uy, uz);
        }
    }

    public void ortDraw (Graphics g){
        Path2D p = new Path2D.Double();
        p.moveTo(vectors[0].getX(), vectors[0].getY());
        p.lineTo(vectors[1].getX(), vectors[1].getY());
        p.lineTo(vectors[2].getX(), vectors[2].getY());
        p.lineTo(vectors[3].getX(), vectors[3].getY());
        p.lineTo(vectors[0].getX(), vectors[0].getY());
        p.closePath();

        g.setColor(color);
        ((Graphics2D) g).draw(p);
        //((Graphics2D) g).fill(p);

    }
}
