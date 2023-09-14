package javaBasics.e34;

public class App {
    public static void main(String[] args) {
        var name = "heXlet";
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name);
    }
}
