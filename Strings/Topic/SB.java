package Strings.Topic;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("javed");
        for(int i=0; i<26; i++) {
            char c = (char)('a'+i);
            builder.append(c);
        }
        System.out.println(builder.toString());
    }
}
