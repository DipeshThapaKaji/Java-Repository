import java.util.Comparator;
/**
 *Dipesh Thapa  
 * CSCI 295
 * HW 12 - Part Number Comparator
 */
public class PartNumberComparator implements Comparator<String> {

    @Override
    public int compare(String Part1, String Part2) {
        String item1 = getCategory(Part1) + removeSymbols(Part1);

        String item2 = getCategory(Part2) + removeSymbols(Part2);

        return item1.compareTo(item2);

    }

    private static String getCategory(String a) {
        
        int category1 = 0;
        int category2 = 0;
        int category3 = 0;
        
        String category = "";
        String symbols = "# $ %";

        for (int index = 0; index < a.length(); index++) {
            if (symbols.contains(a.substring(index, index + 1))) {
                category = a.substring(index, index + 1);
                switch (category) {
                    case "#":
                        category1++;
                        break;
                    case "$":
                        category2++;
                        break;
                    case "%":
                        category3++;
                        break;
                    default:
                        break;
                }

            }
        }

        if (category1 + category2 + category3 == 0) {

            category = "Z";
        } else if (category1 > 0 && category2 == 0 && category3 == 0) {
            category = "#";
        } else if (category1 == 0 && category2 > 0 && category3 == 0) {
            category = "$";
        } else if (category1 == 0 && category2 == 0 && category3 > 0) {
            category = "%";
        } else {
            category = "M";
        }

        return category;

    }

    private static String removeSymbols(String a) {
        a = a.replace("#", "");
        a = a.replace("$", "");
        a = a.replace("%", "");

        return a;
    }

}
