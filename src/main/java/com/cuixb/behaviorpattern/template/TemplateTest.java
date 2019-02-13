package com.cuixb.behaviorpattern.template;

import com.cuixb.behaviorpattern.template.game.Cricket;
import com.cuixb.behaviorpattern.template.game.Football;
import com.cuixb.behaviorpattern.template.game.Game;

/**
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
 */
public class TemplateTest {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
