package week6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class States {
    public static void main(String[] args) {

        Map<String, String> stateAbbreviations = new TreeMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);

        // how about looking up abbreviation for states?

        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        for (String abbreviation: stateAbbreviations.values()) {
            System.out.println(abbreviation);
        }

        // one way - loop over key-value pairs until value is found

        String searchAbbreviation = "MI";

        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)) {
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        Map<String, String> abbreviationStateName = new HashMap<>();

        for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationStateName.put(abbreviation, state);
        }

        System.out.println(stateAbbreviations);
        System.out.println(abbreviationStateName);

        System.out.println("There are " + stateAbbreviations.size() + " state listed");

    }
}
