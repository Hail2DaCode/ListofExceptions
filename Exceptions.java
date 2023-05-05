import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");
    myList.add("Brian Iovino");
    myList.add(4);
    System.out.println(myList);
    for (int i = 0; i < myList.size(); i++) { try {
        Integer castedValue = (Integer) myList.get(i);
        }
        catch (ClassCastException e) {
            String sentence = String.format("index:%d \nmessage: %s \nvalue: %s \n", i, e, myList.get(i));
            System.out.println(sentence);
        }
    }
    }
    

}