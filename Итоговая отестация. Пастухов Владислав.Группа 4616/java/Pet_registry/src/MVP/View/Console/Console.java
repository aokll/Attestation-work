package MVP.View.Console;

import MVP.Presenter.Presenter;
import MVP.View.ClassMenu;
import PetRegistyPackage.ClassAnimal;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Console implements ICnsole{
    private Presenter presenter;
    private Scanner scanner;
    private ClassMenu classMenu;
    boolean flag = true;
    public Console() {
        presenter = new Presenter();
        this.scanner = new Scanner(System.in);
        classMenu = new ClassMenu(this);

    }

    public void start() throws ParseException, IOException {
        System.out.println("Привет");

        while (flag){
            System.out.println(classMenu.menu());
            operation();
        }
    }

    public void finish(){
        scanner.close();
        flag = false;
    }

    public void createPet() throws ParseException {
        System.out.println("Укажите название животного");
        String name = scanner.next();
        System.out.println("укажите класс к которому будет причислено животное" +
                "1 - Млекопитаещие;" +
                "2 - Пресмыкающиеся;" +
                "3 - Земноводные" +
                "4 - Птицы" +
                "5 - Рыб");
        ClassAnimal classAnimal = clAnimal();
        System.out.println("Укажите id животного");
        int id = scanner.nextInt();
        presenter.createPet(name,classAnimal,id);
    }

    public ClassAnimal clAnimal(){
        String clAnimal = scanner.next();
        if (clAnimal.equals("1")){
            return ClassAnimal.Млекопитающие;
        } else if (clAnimal.equals("2"))
            return ClassAnimal.Пресмыкающиеся;
        else if (clAnimal.equals("3"))
            return ClassAnimal.Земноводные;
        else if (clAnimal.equals("4"))
            return ClassAnimal.Птицы;
        else if (clAnimal.equals("5"))
            return ClassAnimal.Рыбы;
        return null;
    }

    public void operation() throws ParseException, IOException {

        classMenu.execute(tryingOutACommand());

    }
    public Integer tryingOutACommand(){
        int commandTestValue = 0;
        label:
        while (true) {
            String checkValueForOtherCharacters = null;
            checkValueForOtherCharacters = scanner.next();
            Pattern c = Pattern.compile(".*[A-Za-zА-Яа-я<>,./|}{()!&?~Ёё`].*");
            boolean b = checkValueForOtherCharacters.matches(c.pattern());
            if (b) {
                System.out.println("Должны быть только числа, попробуйте еще раз");
                continue label;
            }
            commandTestValue = Integer.parseInt(checkValueForOtherCharacters);
            if (commandTestValue <= 0 || commandTestValue > classMenu.getListOfCommands().size()){
                System.out.println("Таких вариантов нет, попробуйте еще раз");
                continue label;
            }
            break;
        }
        return commandTestValue;
    }

    @Override
    public void printListOfAnimals() {
        System.out.println("-----------список животных----------");
        presenter.printListOfAnimals();
        System.out.println("------------------------------------");
    }

    @Override
    public void printListOfCommands() {
        System.out.println("-----------список команд------------");
        presenter.printListOfCommands();
        System.out.println("------------------------------------");
    }

    @Override
    public void printFullTale() {
        System.out.println("-----------список животных и команд------------");
        presenter.printFullTale();
        System.out.println("------------------------------------");
    }

    @Override
    public void addCommands() {
        System.out.println("Введите id животного");
        int id = scanner.nextInt();
        System.out.println("Введите команда через запятую");
        String commands = scanner.next();
        presenter.addCommands(id,commands);
    }
}
