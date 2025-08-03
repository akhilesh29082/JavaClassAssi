public class ThreadCreation {
    public static void main(String[] args) {
        Thread avgThread = new Thread(()->{
            double sum =0;
            for(int i =0; i<10.0;i++){
                sum = sum+i;
            }

            double avg = sum/10;

            System.out.println("average is: "+avg);
        });

        Thread sqrThread = new Thread(()->{
            
            for(int i =0; i<10;i++){
               System.out.println("Square of "+i +" is "+i*i);
            }
        });

        try {
            avgThread.start();   // Start average thread
            avgThread.join();    // Wait until avgThread finishes

            sqrThread.start();  
            sqrThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted: " + e.getMessage());
        }
    }
}
