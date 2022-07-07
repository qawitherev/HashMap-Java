import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //create a hashmap
        /*HashMap<String, String> capitalCities = new HashMap<>();

        //adding items into the hashmap
        //using the put() method in the hashmap class
        //keys and values

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Malaysia", "Kuala Lumpur");
        capitalCities.put("Indonesia", "Nusantara");

        //System.out.println(capitalCities);

        //to access an item, use the get() method and refer to its key
        //System.out.println(capitalCities.get("England"));

        //to remove an item in the hashmap use the remove() method
        //capitalCities.remove("England");
        //System.out.println(capitalCities);

        //to find the hashmap size use the size() method
        //System.out.println(capitalCities.size());

        //loop through the hashmap use the for-each loop
        //keySet() to get the key, values() to get the value
        for (String i: capitalCities.keySet()
             ) {
            System.out.println(i + " is the capital of " + capitalCities.get(i));
        }*/

//        hashmap of people
        /*HashMap<String, Integer> people = new HashMap<>();

        people.put("Siti", 22);
        people.put("Ahmad", 12);
        people.put("Yahya", 32);
        people.put("Nur", 33);

        for (String person: people.keySet()
             ) {
            System.out.println(person + " is " + people.get(person) + " years old.");
        }*/

        Solution sol = new Solution();
        System.out.println(sol.fizzBuzz(10));
    }
}
