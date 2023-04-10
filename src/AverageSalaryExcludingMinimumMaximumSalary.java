import java.util.Arrays;

/*
 *   https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
public class AverageSalaryExcludingMinimumMaximumSalary {
    public static void main(String[] args) {
        System.out.println(average(new int[]{4000, 3000, 1000, 2000}));
        System.out.println(average(new int[]{1000, 2000, 3000}));
    }

    public static double average(int[] salary) {
        double avgResult = 0;
        Arrays.sort(salary);
        for (int i = 1; i < salary.length - 1; i++) {
            avgResult += salary[i];
        }
        return avgResult / (salary.length - 2);
    }
}
