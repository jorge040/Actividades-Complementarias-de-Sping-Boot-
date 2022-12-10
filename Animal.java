import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Animal {

    public static void A() {

        List<Integer> id = new ArrayList<>();
        id.add(1000);
        id.add(2000);
        id.add(3000);
        id.add(4000);
        id.add(5000);
        id.add(6000);
        id.add(7000);
        id.add(8000);
        id.add(9000);
        id.add(10000);

        List<String> a = new ArrayList<>();
        a.add("leon");
        a.add("elefante");
        a.add("gato");
        a.add("venado");
        a.add("perro");
        a.add("perro");
        a.add("venado");
        a.add("gato");
        a.add("perro");
        a.add("lenon");

        List<Integer> num = new ArrayList<>();
        num.add((int) (Math.random() * 1000 + 1));
        num.add((int) (Math.random() * 1000 + 1));
        num.add((int) (Math.random() * 1000 + 1));
        num.add((int) (Math.random() * 1000 + 1));
        num.add((int) (Math.random() * 1000 + 1));
        num.add((int) (Math.random() * 1000 + 1));
        num.add((int) (Math.random() * 1000 + 1));
        num.add((int) (Math.random() * 1000 + 1));
        num.add((int) (Math.random() * 1000 + 1));
        num.add((int) (Math.random() * 1000 + 1));

        Collection.sort(num);

        for (Integer elemento : num) {
        }

        System.out.println("Animal -> iD" + a + id + "\n" + "Esperando ->" + num);

    }

    public static void main(String[] args) {

       A();
    }

}
