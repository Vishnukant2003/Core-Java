package Multi_Thread_02;

public class Demo2 {
    public static void main(String[] Args){
        class T1 implements Runnable{
            @Override
            public void run() {
                System.out.println("run -Tradional way");
            }
        }
        T1 t2 =new T1();
        t2.run();

        Runnable t3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run -Anonymous way");
            }
        };
        t3.run();
        Runnable t4 = ()->System.out.println("Lambda way");
        t4.run();
    }
}
