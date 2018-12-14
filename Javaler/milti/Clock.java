package Javaler.milti;

class Clock implements Runnable {
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tik");

            if (!ClockManager.isClockRun)
                return;
        }
    }
}

class ClockManager {
    public static boolean isClockRun = true;

    public static void main(String[] args) {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isClockRun = false;
    }

}