//package Multi_Thread_02;
//
//public class Demo4 {
//    public static void main (String [ ] args){
//        class Worker extends Thread{
//            @Override
//            public void run() {
//                super.run();
//                System.out.println("run method implementation");
//                System.out.println("Who is executing the main method : "+ Thread.currentThread().getName());
//            }
//
//        }
//        Worker worker =new Worker();
//        Worker.setName("abc");
//        worker.start();
//    }
//}
