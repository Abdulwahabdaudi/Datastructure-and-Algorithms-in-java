import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(5);
        list.addLast(6);
        list.addLast(8);
        list.addFirst(7);
        list.addFirst(9);
        list.reverse();
        
        
        // list.removeLast();
        // System.out.println(list.size());

        // var array = list.toArray();
        // System.out.println(Arrays.toString(array));
        // System.out.println(list.indexOf(0));
        // System.out.println(list.contain(5));
    }
}