package DZ;

import java.util.*;

public class VerhovnaRada  {
    Map<String, List<Deputy>> verhovnaRadaList = new HashMap<>();

    public String create_fraction(String nameRada){
        List<Deputy> deputyList = new ArrayList<>();
        verhovnaRadaList.put(nameRada, deputyList);
        return nameRada;
    }
    public void remove_fraction (String nameFraction){
        Set<Map.Entry<String, List<Deputy>>> entries = verhovnaRadaList.entrySet();
        Iterator<Map.Entry<String, List<Deputy>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Deputy>> next = iterator.next();
            if (next.getKey().equals(nameFraction)){
                iterator.remove();
            }
        }
    }
}
