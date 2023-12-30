package MVP.View.Command;

import MVP.View.Console.Console;

import java.io.IOException;
import java.text.ParseException;

public abstract class CommandClass{
    private String discript;
    private Console console;

    public CommandClass(String discript, Console console) {
        this.discript = discript;
        this.console = console;
    }

    Console getConsole() {
        return console;
    }
    public String getDiscript() {
        return discript;
    }
    public abstract void execute() throws ParseException, IOException;
}
