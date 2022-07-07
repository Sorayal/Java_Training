package example_buildpattern_optional;

import example_buildpattern.Address;

public class App {
    public static void main(String[] args) {
        Address address = new Address.Builder()
                .protocol("HTTPS").url("www.gmx.de").port(80).build();
        System.out.println(address.getPort());

        Address newAdress = new Address.Builder().build();
    }
}
