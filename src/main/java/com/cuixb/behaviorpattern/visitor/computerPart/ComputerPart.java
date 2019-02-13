package com.cuixb.behaviorpattern.visitor.computerPart;

import com.cuixb.behaviorpattern.visitor.computerPartVisitor.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
