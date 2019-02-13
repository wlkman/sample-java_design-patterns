package com.cuixb.behaviorpattern.visitor.computerPart;

import com.cuixb.behaviorpattern.visitor.computerPartVisitor.ComputerPartVisitor;

public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}