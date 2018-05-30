package Test2;

public class Main {
    public static void main(String argv[]){
        Service service = new Service();

        Client put = new Client(service, 100, 100, Client.ADD);
        Client get = new Client(service, 100, 50, Client.REDUCE);
        new Thread(put).start();
        new Thread(get).start();
    }
}
