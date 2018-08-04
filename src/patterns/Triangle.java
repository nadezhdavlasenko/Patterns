package patterns;

public abstract class Triangle {
    public Triangle(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public Point getZ() {
        return z;
    }

    public void setZ(Point z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle that = (Triangle) o;
        return Objects.equals(x, that.x) &&
                Objects.equals(y, that.y) &&
                Objects.equals(z, that.z);

    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "AbstractTriangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

