package MVP.View.Command;

import MVP.View.Console.Console;

import java.io.IOException;
import java.text.ParseException;

public class Finish extends CommandClass{
    public Finish(Console console) {
        super("Выход", console);
    }

    @Override
    public void execute() throws ParseException, IOException {
        super.getConsole().finish();
    }
}
