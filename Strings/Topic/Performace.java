package Strings.Topic;

public class Performace {
    public static void main(String[] args) {
        String a = "";
        for(int i=0; i<26; i++) {
            char c = (char)('a'+i);
            a = a+c;
        }
        System.out.println(a);

        // ! So here the problem is that whenever I am adding something new or updating our string we are creating new object in string pool and it very time consuming and it makes-
        // ! Time Complexity O(n^2);
        // * So thats why we will use StringBuilder
    }
}
