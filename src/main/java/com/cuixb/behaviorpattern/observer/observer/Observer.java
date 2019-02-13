package com.cuixb.behaviorpattern.observer.observer;

import com.cuixb.behaviorpattern.observer.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
