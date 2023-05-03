public class TestDrive implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Test drive started");
            Thread.sleep(3000);
            System.out.println("Test drive completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
