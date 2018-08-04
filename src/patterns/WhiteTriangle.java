package patterns;

public class WhiteTriangle {
    final String COLOR="White";

    public WhiteTriangle(Point x, Point y, Point z, String color) {
        super(x, y, z);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WhiteTriangle that = (WhiteTriangle) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                '}';
    }
}
