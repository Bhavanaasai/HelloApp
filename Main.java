public class Main {
    public static void main(String[] args) {
 UC5
        String result;

  UC4
        String names;
 main

        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder sb = new StringBuilder();

            for (String name : args) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(name);
            }

            result = sb.toString();
        }

 UC5
        System.out.println("Hello, " + result + "!");

        System.out.println("Hello, " + names + "!");
      
 UC3
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");

        System.out.println("Hello App UC1");
 main
 main
 main
    }
}