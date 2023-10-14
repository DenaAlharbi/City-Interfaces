public class City implements Comparable<City>, Cloneable {
    private String cityName;
    private int temperature;

    public City(String cn, int tm) {
        this.cityName = cn;
        this.temperature = tm;
    }

    @Override
    public int compareTo(City other) {
        return Integer.compare(this.temperature, other.temperature);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof City other)) {
            return false;
        }
        return this.cityName.equals(other.cityName) && this.temperature == other.temperature;
    }

    @Override
    public String toString() {
        return "City: " + cityName +
                " - temperature:" + temperature;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

