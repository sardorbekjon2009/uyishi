import java.util.HashSet;
public class Main {
    public static void main(String[] args) {

        HashSet<Integer> sonlarSeti = new HashSet<>();

        sonlarSeti.add(10);
        sonlarSeti.add(20);
        sonlarSeti.add(30);
        sonlarSeti.add(20);
        sonlarSeti.add(40);
        sonlarSeti.add(30);

        System.out.println("Uyga topshiriqlar");
        for (int son : sonlarSeti) {
            System.out.println(son);
        }
    }
}
