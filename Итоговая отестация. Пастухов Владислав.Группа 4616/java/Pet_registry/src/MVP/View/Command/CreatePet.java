package MVP.View.Command;

import MVP.View.Console.Console;

import java.text.ParseException;

public class CreatePet extends CommandClass{
    public CreatePet(Console console) {
        super("Создание животного", console);
    }

    @Override
    public void execute() throws ParseException {
        super.getConsole().createPet();
    }
}
