package com.cxq.DesignMode.factory.setion1;

public class Nwzr {

    public static void main(String[] args) {
        AbstractHumanFactory YinYangLu = new HumanFactory();

        System.out.println("--白色人种--");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("--黄色人种--");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
