package lb;

public class Main {
    public static void main(String[] args) {
        SoftmaxLoadBalancer lb = new SoftmaxLoadBalancer(3, 2.0); // tau değerini artırdık

        for (int t = 0; t < 20; t++) {
            Server server = lb.selectServer();
            double latency = 50 + Math.random() * 150;
            lb.update(server, latency);
            System.out.printf("Request %d: Server %d, Latency=%.2f%n",
                    t, server.getId(), latency);
        }
    }
}
