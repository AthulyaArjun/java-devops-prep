package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapFrequencyCounter_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if (ch == ' ') {
                continue;
            }
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        System.out.println("Character frequencies:");

        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" ---> "+entry.getValue());
        }

        sc.close();
    }
}
/*
map.getOrDefault(key, defaultValue)
If key exists in map:
    return its value

Else:
    return defaultValue
 */