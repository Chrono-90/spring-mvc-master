package web.cars;

public class Cars {
    private String color;
    private String engine;
    private int dors;

    public Cars() {
    }

    public Cars(String color, String engine, int dors) {
        this.color = color;
        this.engine = engine;
        this.dors = dors;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", dors=" + dors +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDors() {
        return dors;
    }

    public void setDors(int dors) {
        this.dors = dors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cars cars = (Cars) o;

        if (dors != cars.dors) return false;
        if (color != null ? !color.equals(cars.color) : cars.color != null) return false;
        return engine != null ? engine.equals(cars.engine) : cars.engine == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + dors;
        return result;
    }
}
