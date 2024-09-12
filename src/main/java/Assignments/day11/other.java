package Assignments.day11;

import com.sun.jdi.event.ThreadStartEvent;

public class other {
    public void waitandprint() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("wait and print method");
    }
}
