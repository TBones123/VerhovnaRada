package DZ;

public class Deputy extends Person {
    private String serName;
    private String name;
    private int age;
    private boolean bribe;
    private int sizeBribe;

    public Deputy(Double weight, Double growth, String serName, String name,
                  int age, boolean bribe) {
        super(weight, growth);
        this.serName = serName;
        this.name = name;
        this.age = age;
        this.bribe = bribe;
    }

    public Deputy(Double weight, Double growth) {
        super(weight, growth);
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribe() {
        return bribe;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    public int getSizeBribe() {
        return sizeBribe;
    }

    public int setSizeBribe(int sizeBribe) {
        this.sizeBribe = sizeBribe;
        return sizeBribe;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "serName='" + serName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                super.toString() + "} ";
    }

    public void bribe(int bribe) {
        if (this.bribe) {
            if (5000 <= bribe) {
                System.out.println("депутат попаля на взятке");
            } else {
                setSizeBribe(sizeBribe+bribe);
                System.out.println("Депутат взял взятку: " + bribe);
            }
        } else {
            System.out.println("депутат взяток не берет");
        }
    }
}



