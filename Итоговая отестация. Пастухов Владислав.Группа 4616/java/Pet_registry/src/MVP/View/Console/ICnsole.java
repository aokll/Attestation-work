package MVP.View.Console;

import PetRegistyPackage.ClassAnimal;

import java.io.IOException;
import java.text.ParseException;

public interface ICnsole {
    void start() throws ParseException, IOException;
    void finish();
    void createPet() throws ParseException;
    ClassAnimal clAnimal();
    void operation() throws ParseException, IOException;
    Integer tryingOutACommand();
    void printListOfAnimals();
    void printFullTale();
    void addCommands();
    void printListOfCommands();

}
