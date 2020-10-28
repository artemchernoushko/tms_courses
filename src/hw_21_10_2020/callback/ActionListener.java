package hw_21_10_2020.callback;

import java.util.EventListener;

public interface ActionListener extends EventListener {
    void actionPerformed() throws InterruptedException;
}
