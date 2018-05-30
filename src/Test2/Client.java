package Test2;

public class Client implements Runnable{
    static final String ADD = "add";
    static final String REDUCE = "reduce";

    private Service service;
    private int time;
    private int money;
    private String type;
    public Client(Service service, int time, int money, String type){
        this.service = service;
        this.time = time;
        this.money = money;
        this.type = type;
    }

    @Override
    public void run() {
        for (int i=0;i<this.time;i++){
            if(this.type == ADD)
                service.add(this.money);

            else if(this.type == REDUCE)
                service.reduce(this.money);
            else
                System.out.println("not exits");
        }
    }
}
