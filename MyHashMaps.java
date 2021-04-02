import java.util.HashMap;

public class MyHashMaps {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);

    System.out.println("The size of the hashmap is " + capitalCities.size());
    System.out.println(capitalCities.remove("Germany"));
    System.out.println(" After removing Germany The size of the hashmap is " + capitalCities.size());

    System.out.println("The values are ");
    for (String i : capitalCities.values()) {
  System.out.println(i);
}
        
        System.out.println("The keys are ");
    for (String i : capitalCities.keySet()) {
  System.out.println(i);
}

        System.out.println("Printing both value and keyset using method keySet, The values are ");
    for (String i : capitalCities.keySet()) {
  System.out.println(i + " " +capitalCities.get(i));
}

  }
}