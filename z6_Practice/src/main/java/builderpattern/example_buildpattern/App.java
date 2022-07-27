package builderpattern.example_buildpattern;

public class App {
    public static void main(String[] args) {
        Address address = new Address.Builder()
                .protocol("HTTPS").url("www.gmx.de").port(80).build();
        System.out.println(address.getPort());
    }
}
