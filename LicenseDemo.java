public class LicenseDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("---License procedure started---");
        MedicalTest medical = new MedicalTest();
        Thread t1 = new Thread(medical);
        t1.start();
        t1.join();

        TestDrive testDrive = new TestDrive();
        Thread t2 = new Thread(testDrive);
        t2.start();
        t2.join();

        OfficerSign sign = new OfficerSign();
        Thread t3 = new Thread(sign);
        t3.start();
        t3.join();

        System.out.println("---License procedure is done---");
    }
}
