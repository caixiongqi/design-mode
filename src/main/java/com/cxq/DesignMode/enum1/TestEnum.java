package com.cxq.DesignMode.enum1;

public class TestEnum {

    public static void main(String[] args) {
        String color = "绿色";

        switch (color) {
            case "红色":
                color = Color.RED.getName();
                break;
            case "绿色":
                color = String.valueOf(Color.GREEN.getId());
                break;
        }
        System.out.println(color);
    }
}
