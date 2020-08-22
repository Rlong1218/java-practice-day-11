import java.util.List;

// Given a list of integers, return a list where each integer is multiplied with itself.

public class Squares {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

}
