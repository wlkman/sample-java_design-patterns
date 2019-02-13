package com.cuixb.behaviorpattern.visitor.computerPart;

import com.cuixb.behaviorpattern.visitor.computerPartVisitor.ComputerPartVisitor;

public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
