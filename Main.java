public class Main {
    public static void main(String[] args) {
  UC4
        String names;

        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
      
 UC3
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");

        System.out.println("Hello App UC1");
 main
 main
    }
}