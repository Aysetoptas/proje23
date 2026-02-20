package lb;

import java.util.Random;

public class SoftmaxLoadBalancer {
    private final Server[] servers;
    private final double tau;
    private final Random random;

    public SoftmaxLoadBalancer(int numServers, double tau) {
        this.servers = new Server[numServers];
        for (int i = 0; i < numServers; i++) {
            servers[i] = new Server(i);
        }
        this.tau = tau;
        this.random = new Random();
    }

    public Server selectServer() {
        double[] expValues = new double[servers.length];
        double sum = 0.0;
        for (int i = 0; i < servers.length; i++) {
            expValues[i] = Math.exp(servers[i].getReward() / tau);
            sum += expValues[i];
        }

        double r = random.nextDouble();
        double cumulative = 0.0;
        for (int i = 0; i < servers.length; i++) {
            cumulative += expValues[i] / sum;
            if (r < cumulative) {
                return servers[i];
            }
        }
        return servers[servers.length - 1];
    }

    public void update(Server server, double latency) {
        server.updateLatency(latency);
    }
}
