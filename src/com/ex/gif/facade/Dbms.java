package com.ex.gif.facade;

import java.util.HashMap;

public class Dbms {

    private HashMap<String,Row> db = new HashMap<>();

    public Dbms() {
        db.put("jane", new Row("Jane", "1990-12-14", "a@gmail.com"));
        db.put("robert", new Row("Robert", "1991-01-24", "b@gmail.com"));
        db.put("dorosh", new Row("Dorosh", "1977-03-18", "c@gmail.com"));
    }

    public Row query(String name) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        return db.get(name.toLowerCase());
    }

}
