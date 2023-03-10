package com.ex.gif.participant;

public class Window extends Participant{

    private boolean bClosed = true;

    public Window(Mediator mediator) {
        super(mediator);
    }

    public void open() {
        if(bClosed == true) {
            bClosed = false;
            mediator.participantChanged(this);
        }
    }

    public void close() {

        if(bClosed == false) {
            bClosed = true;
            mediator.participantChanged(this);
        }
    }

    public boolean isbClosed() {
        return bClosed;
    }

    @Override
    public String toString() {
        if(bClosed) return "# 창 닫힘 :" ;
        else return "# 창 열림: ";
    }
}
