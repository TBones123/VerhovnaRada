package DZ;

public class Person  {
    private Double weight;
    private Double growth;

    public Person(Double weight, Double growth) {
        this.weight = weight;
        this.growth = growth;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getGrowth() {
        return growth;
    }

    public void setGrowth(Double growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        return " weight= " + weight +
                ", growth= " + growth;
    }
}
