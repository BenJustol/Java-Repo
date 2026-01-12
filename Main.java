import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO FROM MAIN");

        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(10);
        numbers.add(11);
        numbers.add(12);

        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}