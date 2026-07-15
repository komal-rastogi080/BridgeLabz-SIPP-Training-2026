public class ServerCPUSpikeDetection {
    public int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int windowSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0;
        for (int end = 0; end < cpuLoad.length; end++) {
            windowSum += cpuLoad[end];
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= cpuLoad[start];
                start++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        ServerCPUSpikeDetection detector = new ServerCPUSpikeDetection();
        int[] cpuLoad = { 10, 20, 30, 40, 50 };
        int k = 3;
        int maxLoad = detector.maxSubarrayOfSizeK(cpuLoad, k);
        System.out.println("Maximum CPU load over " + k + " seconds: " + maxLoad);
    }

}

