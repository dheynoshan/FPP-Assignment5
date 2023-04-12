package problem5;

public class Main {
    public static void main(String[] args) {
        Computer[] comp = {
                new Computer("Dell", "Intel", 32, 4.7),
        new Computer("Dell", "Intel", 32, 4.7),
        new Computer("Lenovo", "Intel", 32, 4.7)
        };
        for (Computer co: comp) {
            System.out.print(co.toString());
            System.out.println("\n===============");
        }
        System.out.println("computer1 equals to computer2: " + comp[0].equals(comp[1]));
        System.out.println("computer2 equals to computer3: " + comp[1].equals(comp[2]));
        System.out.println("computer1 equals to computer3: " + comp[0].equals(comp[2]));
    }
}
