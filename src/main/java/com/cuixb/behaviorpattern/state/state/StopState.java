package com.cuixb.behaviorpattern.state.state;

import com.cuixb.behaviorpattern.state.Context;

public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
