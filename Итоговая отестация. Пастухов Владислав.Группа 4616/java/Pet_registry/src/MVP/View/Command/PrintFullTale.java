package MVP.View.Command;

import MVP.View.Console.Console;

import java.io.IOException;
import java.text.ParseException;

public class PrintFullTale extends CommandClass{
    public PrintFullTale(Console console) {
        super("Вывести полную таблицу.", console);
    }

    @Override
    public void execute() throws ParseException, IOException {
        super.getConsole().printFullTale();
    }
}
