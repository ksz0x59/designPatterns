package adapter;

import adapter.api.APIAdapter;
import adapter.api.LibraryAPIv2;
import adapter.api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {


        /* LibraryAPI api = new LibraryAPIImpl();

        User user = new User("Paweł", "Cwik", "32131212");

        BookConnector connector = new BookConnector(user, api);

        connector.checkAviability("Harry Potter i Zakon Feniksa"); */

        User user = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
        BookConnector connector = new BookConnector(user, apiAdapter);
        connector.checkAviability("Harry Potter i Zakon Feniksa");


    }
}

