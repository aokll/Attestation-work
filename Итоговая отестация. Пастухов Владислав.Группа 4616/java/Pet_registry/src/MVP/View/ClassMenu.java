package MVP.View;

import MVP.View.Command.*;
import MVP.View.Console.Console;

import java.io.IOException;
import java.text.ParseException;

import java.util.ArrayList;
import java.util.List;

public class ClassMenu {
        private List<CommandClass> listOfCommands;

        public ClassMenu(Console console) {
            listOfCommands = new ArrayList<>();

            listOfCommands.add(new CreatePet(console));
            listOfCommands.add(new AddCommands(console));
            listOfCommands.add(new PrintListOfAnimals(console));
            listOfCommands.add(new PrintListOfCommands(console));
            listOfCommands.add(new PrintFullTale(console));
            listOfCommands.add(new Finish(console));

        }
        public String menu(){
            StringBuilder commandStatusBar = new StringBuilder();
            for (int i = 0; i < listOfCommands.size(); i++) {
                commandStatusBar.append(i+1).append(". ").append(listOfCommands.get(i).getDiscript()).append("\n");
            }
            return commandStatusBar.toString();
        }
        public void execute(int numberOfTheCommand) throws ParseException, IOException {
            CommandClass commandClass = listOfCommands.get(numberOfTheCommand - 1);
            commandClass.execute();
        }

        public List<CommandClass> getListOfCommands() {
            return listOfCommands;
        }
    }
