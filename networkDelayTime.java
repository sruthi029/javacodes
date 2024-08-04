import java.util.*;

public class NetworkDelayTime {

    public static int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int w = time[2];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.get(u).add(new int[]{v, w});
        }
        Map<Integer, Integer> distances = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            distances.put(i, Integer.MAX_VALUE);
        }
        distances.put(K, 0);

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{K, 0});

        while (!pq.isEmpty()) {
            int[] node = pq.poll();
            int u = node[0];
            int distance = node[1];
            if (distance > distances.get(u)) {
                continue;
            }
            if (graph.containsKey(u)) {
                for (int[] edge : graph.get(u)) {
                    int v = edge[0];
                    int weight = edge[1];
                    int newDistance = distance + weight;
                    if (newDistance < distances.get(v)) {
                        distances.put(v, newDistance);
                        pq.offer(new int[]{v, newDistance});
                    }
                }
            }
        }

        // Find the maximum distance
        int maxDistance = 0;
        for (int distance : distances.values()) {
            maxDistance = Math.max(maxDistance, distance);
        }

        return maxDistance == Integer.MAX_VALUE ? -1 : maxDistance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] times = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                times[i][j] = scanner.nextInt();
            }
        }

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = networkDelayTime(times, N, K);
        System.out.println(result);
    }
}
