public class HelloWorld {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();

            // Enhanced for-loop
            for (String name : args) {
                names.append(name).append(", ");
            }

            // Remove last comma and space
            names.setLength(names.length() - 2);

            System.out.println("Hello " + names.toString());
        }
    }
}