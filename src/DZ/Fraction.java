package DZ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fraction {
    List<Deputy> deputyList = new ArrayList<>();

    public Fraction() {
        this.fraction_seed();
    }

    public void fraction_seed() {
        deputyList.add(new Deputy(
                79.2,
                175.2,
                "Radushev",
                "Andrey",
                25,
                true));
        deputyList.add(new Deputy(
                75.1,
                170.2,
                "Radushev",
                "Anton",
                29,
                false));
    }

    public Deputy create(Double weight, Double growth, String serName,
                         String name, int age, boolean bribe) {
        Deputy deputy = new Deputy(weight, growth, serName, name, age, bribe);
        deputyList.add(deputy);
        return deputy;
    }

    public void remove(String nameDeputy) {
        Iterator<Deputy> iterator = deputyList.iterator();
        while (iterator.hasNext()) {
            Deputy next = iterator.next();
            if (next.getName().equals(nameDeputy)) {
                iterator.remove();
            }
        }
    }

    public void bribeDeputy(String nameDeputy, int bribe) {
        Iterator<Deputy> iterator = deputyList.iterator();
        while (iterator.hasNext()) {
            Deputy next = iterator.next();
            if (next.getName().equals(nameDeputy)) {
                next.bribe(bribe);
            }
        }
    }

    public void dellAlldeputy() {
        deputyList.clear();
    }
    public void allBribe(){
        Iterator<Deputy> iterator = deputyList.iterator();
        while (iterator.hasNext()) {
            Deputy next = iterator.next();
            if (next.isBribe()){
                System.out.println("Размер взяток: " + next.getSizeBribe()+" Имя депутата " + next.getName());
            }
        }
    }

}

