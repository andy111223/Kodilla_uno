package com.kodilla.library;

import org.springframework.stereotype.Repository;

@Repository
public class LibraryDbController {

    public void saveData(){
        System.out.println("+------- - - -  -  -   -    -\n| Saving data to the database.\n");
    }
    public void loadData() {
        System.out.println("+------- - - -  -  -   -    -\n| Loading data from the database.\n");
    }
}
