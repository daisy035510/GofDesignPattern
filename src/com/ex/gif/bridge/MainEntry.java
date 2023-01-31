package com.ex.gif.bridge;

public class MainEntry {
    public static void main(String[] args) {

        var title = "복원된 지구";
        var author = "김형준";
        String[] content = {
                "a",
                "b",
                "c"
        };

        Draft draft = new Draft(title, author, content);
        Display display1 = new SimpleDisplay();
//        draft.print(display1);

        Display display2 = new CaptionDisplay();
//        draft.print(display2);

       Publication pub = new Publication(title, author, content, "gkgk", 1000);
       pub.print(display1);
    }
}
