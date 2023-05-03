public class MedicalTest implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Medical test starts");
            Thread.sleep(3000);
            System.out.println("Medical test completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
