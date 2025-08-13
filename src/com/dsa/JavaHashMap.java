package com.dsa;

import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate Key // NOT ALLOWED
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
        String kenyasCapital = capitalCities.get("Kenya");
        System.out.println(kenyasCapital);
        capitalCities.remove("Uganda");
        System.out.println(capitalCities);

        for (String country : capitalCities.keySet()) {
            System.out.println(country);
        }
        for (String capital : capitalCities.values()) {
            System.out.println(capital);
        }

    }
}
