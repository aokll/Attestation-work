package MVP.View;
import MVP.View.Console.Console;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws ParseException, IOException {
        Console console = new Console();
        console.start();
        /*map.put(1,1);
        map.put(2,5);
        map.put(12,23);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);*/

    }
}
