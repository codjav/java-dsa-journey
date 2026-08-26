package Strings.Topic;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // * Pool memory is just a memory inside heap memory also known as string pool where string objects are stored

        // * name and a are in pool memory inside heap so a and name are pointing to same object Mohammad Javed Ali
        // * When we change like name = "Ali" a new object is created and old object like Mohammad Javed Ali is not changed

        String name = "Mohammad Javed Ali";
        String a = "Mohammad Javed Ali";
        System.out.println(a==name);
        System.out.println(a.equals(name));
        
        // * Not in String pool inside heap memory so both naem are outside pool and there are two naem object created for both b and c separately

        String b = new String("naem");
        String c = new String("naem");
        System.out.println(c==b); 
        System.out.println(b.equals(c));

        // Methods
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.strip());
        System.out.println(name.indexOf("J"));
    }
}
