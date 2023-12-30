package MVP.Model;

import PetRegistyPackage.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model implements IModel{
    ListOfAnimals listOfAnimals;
    ListMapOfAnimals listMapOfAnimals;
    FullTable fullTable;
    private int n = 0;

    public Model() {
        listOfAnimals = new ListOfAnimals();
        listMapOfAnimals = new ListMapOfAnimals();
        fullTable = new FullTable();
    }

    @Override
    public void createPet(String animal, ClassAnimal classAnimal, int ID) throws ParseException {
        listOfAnimals.getList().add(new Pet(animal,classAnimal,ID));
        listOfAnimals.getMiddle().put(n,ID);
        n++;
    }

    @Override
    public void printListOfAnimals() {
        for (Pet p : listOfAnimals.getList()) {
            System.out.println("[Животное: "+ p.getAnimal() + "]"
                    + " [Класс: " + p.getClassAnimal() + "]"
                    + " [ID: " +p.getID() + "]");
        }
    }

    @Override
    public void printListOfCommands() {
        for (Map.Entry<Integer, String> entry : listMapOfAnimals.getMap().entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("[ID: " + key + "]" + ", [Команды: " + value + "]");
        }
    }

    @Override
    public void addCommands(int id, String command) {
        listMapOfAnimals.getMap().put(id,command);
    }

    @Override
    public void printFullTale() {
        for (Map.Entry<String, String> entry : makeFullTable().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            fullTable.getResMap().put(key,value);
        }
        for (Map.Entry<String, String> entry : fullTable.getResMap().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }

    private Map<String,String> makeFullTable(){
        Map<String,String> localmap = new HashMap<>();
            String command = null;
            String pet = null;
                String str = null;

        for (Map.Entry<Integer, Integer> entry : listOfAnimals.getMiddle().entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            for (int i = 0; i < listOfAnimals.getList().size(); i++) {
                if (i == key)
                {
                    pet = "[ID - " + listOfAnimals.getList().get(i).getID() + "]" + " [Класс - " +
                            listOfAnimals.getList().get(i).getClassAnimal() + "]" + " [Название животного - " +
                            listOfAnimals.getList().get(i).getAnimal() + "] ";
                    break;
                }
            }

            for (Map.Entry<Integer, String> entry1 : listMapOfAnimals.getMap().entrySet()){
                boolean bool;
                Integer key1 = entry1.getKey();
                String value1 = entry1.getValue();
                if(value == key1){
                    command = "[" + "Он знает следующие команды - " + value1 + "]";
                    str = command;
                    break;
                }
            }
            localmap.put(pet,str);
            str = null;
        }
    return localmap;

    }


}
