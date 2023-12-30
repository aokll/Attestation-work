package MVP.View.Command;

import MVP.View.Console.Console;

import java.io.IOException;
import java.text.ParseException;

public class AddCommands extends CommandClass{
    public AddCommands(Console console) {
        super("Добавить команды созданным животным.", console);
    }

    @Override
    public void execute() throws ParseException, IOException {
        super.getConsole().addCommands();
    }
}
