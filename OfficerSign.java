public class OfficerSign implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("File submitted for signature");
            Thread.sleep(3000);
            System.out.println("Signature received");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
