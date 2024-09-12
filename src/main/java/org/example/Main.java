package org.example;

import another.other;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        other o=new other("satwik");
        System.out.println(o.a);
        o.action();
        System.out.println(o.name);
        other.subclass r = new other.subclass();
        r.display();
    }
}