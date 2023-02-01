package com.ex.gif.composite;

public class MainEntry {
    public static void main(String[] args) {

        Folder root = new Folder("root");
        root.add(new File("a.txt", 1000));
        root.add(new File("b.txt", 1001));

        Folder sub1 = new Folder("sub1");
        sub1.add(new File("sub1_a.txt", 1000));
        sub1.add(new File("sub1_b.txt", 1001));

        Folder sub2 = new Folder("sub2");
        sub2.add(new File("sub2_a.txt", 1000));
        sub2.add(new File("sub2_b.txt", 1001));

        root.add(sub1);
        root.add(sub2);

        root.list();
    }
}
