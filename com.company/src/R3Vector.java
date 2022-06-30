public class R3Vector {// описывеем только коне так как начало в начале координат
    private double x, y, z;

    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }



    //маштабинование
    public void scale(double k) {
        x *= k;
        y *= k;
        z *= k;
    }

    //перенос
    public void translate(double dx, double dy, double dz){
        x += dx;
        y += dy;
        z += dz;
    }

    //поворот
    public void rotate(double ux, double uy, double uz){
        rotateX(ux);
        rotateY(uy);
        rotateZ(uz);
    }

    private void rotateZ(double u) {
        u = Math.toRadians(u);

        double tX = x;

        x = x * Math.cos(u) - y * Math.sin(u);
        y = tX * Math.sin(u) + y * Math.cos(u);
    }

    private void rotateX(double u) {
        //u = Math.toRadians(u);

        double tx = x;

        x = x * Math.cos(u) + z * Math.sin(u);
        z = z * Math.cos(u) - tx * Math.sin(u);
    }

    private void rotateY(double u) {
        //u = Math.toRadians(u);

        double tY = y;

        y = y * Math.cos(u) + z * Math.sin(u);
        z = z * Math.cos(u) - tY * Math.sin(u);
    }

    public R3Vector vect(R3Vector a, R3Vector b){
        return new R3Vector(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x);
    }

    public static R3Vector shiftInsert(R3Vector begin, R3Vector and){
        return new R3Vector(and.x - begin.x, and.y - begin.y, and.z - begin.z);
    }
}
