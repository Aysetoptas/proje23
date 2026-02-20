package lb;

public class Server {
    private final int id;
    private double averageLatency;
    private int requestCount;

    public Server(int id) {
        this.id = id;
        this.averageLatency = 100.0; // başlangıç için varsayılan değer
        this.requestCount = 0;
    }

    public int getId() {
        return id;
    }

    public double getAverageLatency() {
        return averageLatency;
    }

    public void updateLatency(double latency) {
        requestCount++;
        averageLatency += (latency - averageLatency) / requestCount;
    }

    public double getReward() {
        return 1.0 / averageLatency;
    }
}
