package MVP.View.Command;

import MVP.View.Console.Console;

import java.io.IOException;
import java.text.ParseException;

public class PrintListOfCommands extends CommandClass{
    public PrintListOfCommands(Console console) {
        super("Посмотреть команды которые соответствую ID животных.", console);
    }

    @Override
    public void execute() throws ParseException, IOException {
        super.getConsole().printListOfCommands();
    }
}
