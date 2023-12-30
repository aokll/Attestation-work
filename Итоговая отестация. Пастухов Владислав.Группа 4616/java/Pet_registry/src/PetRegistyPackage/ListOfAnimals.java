package PetRegistyPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfAnimals {
    List<Pet> list;
    Map<Integer,Integer> middle;

    public ListOfAnimals() {

        list = new ArrayList<>();
        middle = new HashMap<>();
    }

    public List<Pet> getList() {
        return list;
    }

    public Map<Integer, Integer> getMiddle() {
        return middle;
    }

}
