import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Actiuvidad_dos {
    

    public static void Numeros(){
        List<String> num = new ArrayList<String>();
        num.add("b");
        num.add("a");
        num.add("e");
        num.add("d");
        num.add("c");

        Collection.sort(num);

        for (String elemento : num) {
            System.out.println(elemento);
            
        }
   

    }

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add( (int)(Math.random()*100 + 1));
        num.add( (int)(Math.random()*100 + 1));
        num.add( (int)(Math.random()*100 + 1));
        num.add( (int)(Math.random()*100 + 1));
        num.add( (int)(Math.random()*100 + 1));
        
        Collection.sort(num);

        for (Integer elemento:num) {
            System.out.println(elemento);
        }
        
    }
}
