package Test2;

public class Service {
    private Integer sum = 1000;

    public synchronized void add(int n){
        System.out.println("add");
        System.out.println("before:"+ sum);
        sum = sum + n;
        System.out.println("after:"+ sum);
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "...sum=" + sum);
    }
    public synchronized void reduce(int n){
        System.out.println("reduce");
        if(sum - n >=0 ){
            System.out.println("before:"+ sum);
            sum = sum - n;
            System.out.println("after:"+ sum);
        }
        else
            System.out.println("not enough");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "...sum=" + sum);
    }
}
