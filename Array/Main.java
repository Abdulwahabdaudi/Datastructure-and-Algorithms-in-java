/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Array result = new Array(4);
        result.add(10);
        result.add(20);
        result.add(30);
        result.add(40);
        result.add(50);

        result.removeAt(4);

        result.show();

        System.out.println(result.indexOf(0));

    }
}