package com.cuixb.behaviorpattern.visitor.computerPartVisitor;

import com.cuixb.behaviorpattern.visitor.computerPart.Computer;
import com.cuixb.behaviorpattern.visitor.computerPart.Keyboard;
import com.cuixb.behaviorpattern.visitor.computerPart.Monitor;
import com.cuixb.behaviorpattern.visitor.computerPart.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
