package com.cuixb.behaviorpattern.visitor.computerPartVisitor;

import com.cuixb.behaviorpattern.visitor.computerPart.Computer;
import com.cuixb.behaviorpattern.visitor.computerPart.Keyboard;
import com.cuixb.behaviorpattern.visitor.computerPart.Monitor;
import com.cuixb.behaviorpattern.visitor.computerPart.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
