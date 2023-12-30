package MVP.View.Command;

import MVP.View.Console.Console;

import java.io.IOException;
import java.text.ParseException;

public class PrintListOfAnimals extends CommandClass{
    public PrintListOfAnimals(Console console) {
        super("Вывести список созданных животных", console);
    }

    @Override
    public void execute() throws ParseException, IOException {
        super.getConsole().printListOfAnimals();
    }
}
