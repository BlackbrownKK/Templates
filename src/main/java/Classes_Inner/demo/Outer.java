package Classes_Inner.demo;

public class Outer {
    private int[] nums;
    Outer(int[] n) {
        nums = n;
    }

    public void analyze() {
        Inner inOb = new Inner();
        System.out.println("Min: " + inOb.getMin());
        System.out.println("Max: " + inOb.getMax());
        System.out.println("Avg: " + inOb.getAvg());
    }
    class Inner {
        public int getMin() {
            int min = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min)
                    min = nums[i];
            }
            return min;
        }
        public int getMax() {
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max)
                    max = nums[i];
            }
            return max;
        }
        public double getAvg() {
            double avg = 0.0;
            for (int element: nums) {
                avg += element;
            }
            return avg / nums.length;
        }
    }
}

