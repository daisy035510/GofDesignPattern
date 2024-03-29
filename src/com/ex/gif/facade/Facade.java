package com.ex.gif.facade;

public class Facade {

    private Dbms dbms = new Dbms();
    private Cache cache = new Cache();

    public void run(String name) {
        Row row = cache.get(name);
        if(row == null) {
            row = dbms.query(name);
            if(row != null) {
                cache.put(row);
            }
        }

        if(row != null) {
            Message message = new Message(row);

            System.out.println(message.makeName());
            System.out.println(message.makeEmail());
            System.out.println(message.makeBirthday());
        } else {
            System.out.println(name + " does not exist");
        }

    }
}
