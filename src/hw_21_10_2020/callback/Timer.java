package hw_21_10_2020.callback;

public class Timer implements ActionListener {
    @Override
    public void actionPerformed() throws InterruptedException {
        int n = 0;
        while (true) {
            System.out.println("Time "+ n);
            n += 10;
            Thread.sleep(10 * 1000);
        }
    }
}
