

public class PairSum {

    public int[] findPairSum(int[] transactions, int target) {
        int left = 0, right = transactions.length - 1;
        while (left < right) {
            int sum = transactions[left] + transactions[right];
            if (sum == target)
                return new int[] { transactions[left], transactions[right] };
            else if (sum < target)
                left++;
            else
                right--;
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        PairSum pairSum = new PairSum();
        int[] transactions = { 1, 2, 3, 4, 5 };
        int target = 7;
        int[] result = pairSum.findPairSum(transactions, target);
        if (result[0] != -1)
            System.out.println("Pair with sum " + target + ": " + result[0] + ", " + result[1]);
        else
            System.out.println("No pair found with sum " + target);
    }
}