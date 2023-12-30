package PetRegistyPackage;

import java.util.HashMap;
import java.util.Map;

public class ListMapOfAnimals {
    private Map<Integer,String> map;

    public ListMapOfAnimals() {
        map = new HashMap<>();
    }

    public Map<Integer, String> getMap() {
        return map;
    }
}
