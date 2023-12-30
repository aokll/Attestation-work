package MVP.Presenter;

import MVP.Model.Model;
import PetRegistyPackage.ClassAnimal;

import java.text.ParseException;
import java.util.Map;

public class Presenter {
    Model model;

    public Presenter() {
        model = new Model();
    }

   public void createPet(String animal, ClassAnimal classAnimal,int ID) throws ParseException {
        model.createPet(animal,classAnimal,ID);
   }
    public void printListOfAnimals(){
        model.printListOfAnimals();
    }
    public void printListOfCommands() {
        model.printListOfCommands();
    }
    public void printFullTale(){
        model.printFullTale();
    }
    public void addCommands(int id, String command) {
        model.addCommands(id,command);
    }
}
