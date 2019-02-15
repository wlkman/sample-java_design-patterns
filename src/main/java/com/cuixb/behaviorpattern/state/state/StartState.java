package com.cuixb.behaviorpattern.state.state;

import com.cuixb.behaviorpattern.state.Context;

public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){

        return "Start State";
    }
}
