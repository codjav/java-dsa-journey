package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Samiullah";
        char target = 'l';

        // System.out.println(search(name, target));
        System.out.println(search1(name, target));
    }

    // Method 1 -
    static int search(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    // Method 2 -
    static int search1(String str, char target) {
        if (str.length() ==0) {
            return -1;
        }

        for (char i : str.toCharArray()) {
            if (i == target) {
                return str.indexOf(i);
            }
        }
        return -1;
    }
}
