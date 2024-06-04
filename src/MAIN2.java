import java.util.HashSet;
import java.util.Set;

public class MAIN2 {
    public static void main(String[] args) {

        Set<Integer> sonlarSeti = new HashSet<>();

        sonlarSeti.add(30);
        sonlarSeti.add(40);
        sonlarSeti.add(10);
        sonlarSeti.add(20);


        int elementlarSoni = sonlarSeti.size();


        System.out.println("Set ichidagi elementlar soni: " + elementlarSoni);
    }
}
