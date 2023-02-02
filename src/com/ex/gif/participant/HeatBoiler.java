package com.ex.gif.participant;

public class HeatBoiler extends Participant{

    private boolean bOff = true;

    public HeatBoiler(Mediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        if(bOff == true) {
            bOff = false;
            mediator.participantChanged(this);
        }
    }

    public void turnOff() {

        if(bOff == false) {
            bOff = true;
            mediator.participantChanged(this);
        }
    }

    public boolean isRunning() {
        return !bOff;
    }

    @Override
    public String toString() {
        if(bOff) return "# 보일러 꺼짐 :" ;
        else return "# 보일러 켜짐 : ";
    }
}
