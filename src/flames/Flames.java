
package flames;

import static flames.Home.partnerName;
import static flames.Home.yourName;

public class Flames {
    public static String calculatedResult = null;
    
    public static void calculateflames() {
        
        String name1 = partnerName;
        String name2 = yourName;

        String s1 = name1;
        String s2 = name2;
        for (int i = 0; i < name1.length(); i++) {
            for (int j = 0; j < name2.length(); j++) {
                if (name1.charAt(i) == name2.charAt(j)) {
                name1 = name1.replaceFirst(String.valueOf(name1.charAt(i)), "#");
                name2 = name2.replaceFirst(String.valueOf(name2.charAt(j)), "#");
                }
            }
        }
        String result = name1 + name2;
        result = result.replaceAll("#", "");
        int resultLength = result.length();
        String baseInput = "flames";
        char relationIs = 0;
        int temp = 0;
        if (resultLength > 0) {
            temp = resultLength % baseInput.length();
        }
        if (temp == 0 && resultLength >= 6) {
            relationIs = 's';
        } else {
            int count = temp - 1;
            if (count >= 0) {
                relationIs = baseInput.charAt(count);
            }
        }
        if(relationIs == 'f'){
            calculatedResult = "F R I E N D S";
        }else if(relationIs == 'l'){
            calculatedResult = "L O V E R S";
        }else if(relationIs == 'a'){
            calculatedResult = "A D M I R E R S";
        }else if(relationIs == 'm'){
            calculatedResult = "M A R R I E D";
        }else if(relationIs == 'e'){
            calculatedResult = "E N E M I E S";
        }else if(relationIs == 's'){
            calculatedResult = "S O U L M A T E S";
        }
    }       
}

