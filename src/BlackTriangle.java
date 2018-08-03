import java.util.Objects;

public class BlackTriangle extends Triangle {
    final String COLOR = "Black";

    public BlackTriangle(Point x, Point y, Point z) {
        super(x, y, z);
    }

    public String getCOLOR() {
        return COLOR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BlackTriangle that = (BlackTriangle) o;
        return Objects.equals(COLOR, that.COLOR);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), COLOR);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "COLOR='" + COLOR + '\'' +
                '}';
    }
}
