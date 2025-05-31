/**
 * 数组练习题
 * 
 * 这个文件包含了一系列数组相关的练习题，从简单到稍微复杂
 * 每个练习都有详细的说明和示例
 */
public class ArrayExercises {
    
    public static void main(String[] args) {
        System.out.println("=== 数组练习题 ===\n");
        
        // 运行所有练习的测试
        testExercise1();
        testExercise2();
        testExercise3();
        testExercise4();
        testExercise5();
    }
    
    // ==================== 练习1：基础操作 ====================
    /**
     * 练习1：创建数组并进行基本操作
     * 要求：
     * 1. 创建一个长度为10的整数数组
     * 2. 用1到10的数字填充数组
     * 3. 打印数组内容
     * 4. 计算数组所有元素的和
     */
    public static int[] exercise1_CreateAndFillArray() {
        // TODO: 在这里完成你的代码
        // 提示：使用for循环来填充数组

        
        
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;  // 填充1到10
        }
        return arr;
    }
    
    public static int exercise1_SumArray(int[] arr) {
        // TODO: 计算数组所有元素的和
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    public static void testExercise1() {
        System.out.println("练习1：基础操作");
        int[] arr = exercise1_CreateAndFillArray();
        System.out.println("创建的数组: " + java.util.Arrays.toString(arr));
        int sum = exercise1_SumArray(arr);
        System.out.println("数组元素和: " + sum);
        System.out.println("期望结果: 55 " + (sum == 55 ? "✓" : "✗"));
        System.out.println();
    }
    
    // ==================== 练习2：查找操作 ====================
    /**
     * 练习2：在数组中查找元素
     * 要求：
     * 1. 查找指定元素在数组中的位置（索引）
     * 2. 如果找到返回索引，找不到返回-1
     */
    public static int exercise2_FindElement(int[] arr, int target) {
        // TODO: 在这里完成你的代码
        // 提示：遍历数组，比较每个元素与target
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;  // 未找到
    }
    
    public static void testExercise2() {
        System.out.println("练习2：查找操作");
        int[] arr = {10, 25, 30, 45, 50, 25};
        
        int index1 = exercise2_FindElement(arr, 30);
        System.out.println("查找30的位置: " + index1 + " (期望: 2) " + (index1 == 2 ? "✓" : "✗"));
        
        int index2 = exercise2_FindElement(arr, 100);
        System.out.println("查找100的位置: " + index2 + " (期望: -1) " + (index2 == -1 ? "✓" : "✗"));
        System.out.println();
    }
    
    // ==================== 练习3：统计操作 ====================
    /**
     * 练习3：统计数组中的最大值、最小值
     * 要求：
     * 1. 找到数组中的最大值
     * 2. 找到数组中的最小值
     * 3. 统计大于平均值的元素个数
     */
    public static int exercise3_FindMax(int[] arr) {
        // TODO: 找到数组中的最大值
        if (arr.length == 0) return 0;
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int exercise3_FindMin(int[] arr) {
        // TODO: 找到数组中的最小值
        if (arr.length == 0) return 0;
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static int exercise3_CountAboveAverage(int[] arr) {
        // TODO: 统计大于平均值的元素个数
        if (arr.length == 0) return 0;
        
        // 计算平均值
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        
        // 统计大于平均值的元素
        int count = 0;
        for (int num : arr) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }
    
    public static void testExercise3() {
        System.out.println("练习3：统计操作");
        int[] arr = {85, 92, 78, 96, 88, 75, 90};
        
        int max = exercise3_FindMax(arr);
        System.out.println("最大值: " + max + " (期望: 96) " + (max == 96 ? "✓" : "✗"));
        
        int min = exercise3_FindMin(arr);
        System.out.println("最小值: " + min + " (期望: 75) " + (min == 75 ? "✓" : "✗"));
        
        int count = exercise3_CountAboveAverage(arr);
        System.out.println("大于平均值的元素个数: " + count + " (期望: 4) " + (count == 4 ? "✓" : "✗"));
        System.out.println();
    }
    
    // ==================== 练习4：数组操作 ====================
    /**
     * 练习4：数组反转
     * 要求：将数组中的元素顺序反转
     * 例如：[1,2,3,4,5] 变成 [5,4,3,2,1]
     */
    public static void exercise4_ReverseArray(int[] arr) {
        // TODO: 反转数组
        // 提示：使用两个指针，一个从开头，一个从结尾，交换元素
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // 交换元素
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
    
    public static void testExercise4() {
        System.out.println("练习4：数组反转");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("原数组: " + java.util.Arrays.toString(arr));
        
        exercise4_ReverseArray(arr);
        System.out.println("反转后: " + java.util.Arrays.toString(arr));
        
        int[] expected = {5, 4, 3, 2, 1};
        boolean correct = java.util.Arrays.equals(arr, expected);
        System.out.println("结果正确: " + (correct ? "✓" : "✗"));
        System.out.println();
    }
    
    // ==================== 练习5：挑战题 ====================
    /**
     * 练习5：去除数组中的重复元素
     * 要求：
     * 1. 创建一个新数组，包含原数组中不重复的元素
     * 2. 保持元素第一次出现的顺序
     * 例如：[1,2,2,3,1,4] 变成 [1,2,3,4]
     */
    public static int[] exercise5_RemoveDuplicates(int[] arr) {
        // TODO: 这是一个挑战题，需要你思考如何实现
        // 提示：你可能需要先计算去重后的数组长度
        
        if (arr.length == 0) return new int[0];
        
        // 先计算去重后的长度
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // 检查当前元素之前是否已经出现过
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueCount++;
            }
        }
        
        // 创建新数组并填充不重复的元素
        int[] result = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = arr[i];
            }
        }
        
        return result;
    }
    
    public static void testExercise5() {
        System.out.println("练习5：去除重复元素（挑战题）");
        int[] arr = {1, 2, 2, 3, 1, 4, 3, 5};
        System.out.println("原数组: " + java.util.Arrays.toString(arr));
        
        int[] result = exercise5_RemoveDuplicates(arr);
        System.out.println("去重后: " + java.util.Arrays.toString(result));
        
        int[] expected = {1, 2, 3, 4, 5};
        boolean correct = java.util.Arrays.equals(result, expected);
        System.out.println("结果正确: " + (correct ? "✓" : "✗"));
        System.out.println();
    }
    
    // ==================== 自由练习区域 ====================
    /**
     * 在这里你可以尝试自己的想法！
     * 一些建议的练习：
     * 1. 实现数组排序（冒泡排序）
     * 2. 合并两个有序数组
     * 3. 旋转数组（左移或右移k位）
     * 4. 找到数组中的众数（出现次数最多的元素）
     */
    
    public static void yourOwnExercise() {
        System.out.println("在这里尝试你自己的练习！");
        // TODO: 在这里写你的代码
    }
}