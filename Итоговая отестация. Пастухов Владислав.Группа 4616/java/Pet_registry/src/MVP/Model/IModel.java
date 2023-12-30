package MVP.Model;

import PetRegistyPackage.ClassAnimal;

import java.text.ParseException;

public interface IModel {
    void createPet(String animal, ClassAnimal classAnimal, int ID) throws ParseException;
    void printListOfAnimals();
    void printListOfCommands();
    void printFullTale();
    void addCommands(int id, String command);
}
