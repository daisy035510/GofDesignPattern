package com.ex.observerPattern;

public class Application {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(Button button) {
                System.out.println(button  + " is clicked");
            }
        });
        btn.onClick();
    }
}

class ButtonClick implements Button.OnClickListener {

    @Override
    public void onClick(Button button) {
        System.out.println("Button is clicked");
    }
}
