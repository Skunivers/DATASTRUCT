    package lessons;

/**
 * 第一课：数组基础
 * 
 * 什么是数组？
 * 数组是存储相同类型数据的容器，就像一排连续的盒子，每个盒子有一个编号（索引）
 * 
 * 为什么需要数组？
 * 1. 存储多个相关的数据
 * 2. 通过索引快速访问数据
 * 3. 节省内存，连续存储
 */
public class Lesson01_Arrays {
    
    public static void main(String[] args) {
        System.out.println("=== 第一课：数组基础 ===\n");
        
        // 1. 创建数组的几种方式
        demonstrateArrayCreation();
        
        System.out.println();
        
        // 2. 数组的基本操作
        demonstrateBasicOperations();
        
        System.out.println();
        
        // 3. 遍历数组
        demonstrateArrayTraversal();
        
        System.out.println();
        
        // 4. 实际例子：学生成绩管理
        studentGradeExample();
        
        System.out.println();
        
        // 5. 互动练习
        interactiveExercise();
    }
    
    /**
     * 演示数组创建的不同方式
     */
    public static void demonstrateArrayCreation() {
        System.out.println("1. 数组创建方式：");
        
        // 方式1：声明后分配空间
        int[] numbers1 = new int[5];  // 创建一个能存5个整数的数组
        System.out.println("方式1 - 空数组长度: " + numbers1.length);
        
        // 方式2：创建时初始化
        int[] numbers2 = {10, 20, 30, 40, 50};
        System.out.println("方式2 - 初始化数组: " + java.util.Arrays.toString(numbers2));
        
        // 方式3：使用new关键字初始化
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};
        System.out.println("方式3 - new初始化: " + java.util.Arrays.toString(numbers3));
        
        // 字符串数组例子
        String[] fruits = {"苹果", "香蕉", "橙子"};
        System.out.println("字符串数组: " + java.util.Arrays.toString(fruits));
    }
    
    /**
     * 演示数组的基本操作
     */
    public static void demonstrateBasicOperations() {
        System.out.println("2. 数组基本操作：");
        
        int[] scores = new int[5];
        
        // 存储数据（赋值）
        scores[0] = 85;  // 第1个学生的成绩
        scores[1] = 92;  // 第2个学生的成绩
        scores[2] = 78;
        scores[3] = 96;
        scores[4] = 88;
        
        System.out.println("存储后的数组: " + java.util.Arrays.toString(scores));
        
        // 访问数据（读取）
        System.out.println("第1个学生成绩: " + scores[0]);
        System.out.println("第3个学生成绩: " + scores[2]);
        
        // 修改数据
        scores[1] = 95;  // 第2个学生成绩改为95
        System.out.println("修改后第2个学生成绩: " + scores[1]);
        
        // 获取数组长度
        System.out.println("数组长度: " + scores.length);
    }
    
    /**
     * 演示数组遍历的方法
     */
    public static void demonstrateArrayTraversal() {
        System.out.println("3. 数组遍历方法：");
        
        int[] numbers = {10, 25, 30, 45, 50};
        
        // 方法1：传统for循环
        System.out.print("传统for循环: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // 方法2：增强for循环（推荐）
        System.out.print("增强for循环: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // 方法3：while循环
        System.out.print("while循环: ");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();
    }
    
    /**
     * 实际例子：学生成绩管理系统
     */
    public static void studentGradeExample() {
        System.out.println("4. 实际例子 - 学生成绩管理：");
        
        // 5个学生的成绩
        int[] grades = {85, 92, 78, 96, 88};
        String[] names = {"张三", "李四", "王五", "赵六", "钱七"};
        
        // 显示所有学生成绩
        System.out.println("班级成绩单：");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + ": " + grades[i] + "分");
        }
        
        // 计算平均分
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.println("班级平均分: " + String.format("%.1f", average));
        
        // 找出最高分和最低分
        int max = grades[0];
        int min = grades[0];
        String topStudent = names[0];
        String lowStudent = names[0];
        
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                topStudent = names[i];
            }
            if (grades[i] < min) {
                min = grades[i];
                lowStudent = names[i];
            }
        }
        
        System.out.println("最高分: " + topStudent + " " + max + "分");
        System.out.println("最低分: " + lowStudent + " " + min + "分");
    }
    
    /**
     * 互动练习
     */
    public static void interactiveExercise() {
        System.out.println("5. 互动练习：");
        System.out.println("请试着运行这个程序，然后尝试修改以下内容：");
        System.out.println("a) 在studentGradeExample方法中，添加一个新学生的成绩");
        System.out.println("b) 修改demonstrateBasicOperations方法，添加一个新的分数");
        System.out.println("c) 在demonstrateArrayTraversal方法中，只打印大于30的数字");
        
        System.out.println("\n思考题：");
        System.out.println("1. 如果数组索引超出范围会发生什么？");
        System.out.println("2. 数组创建后，长度还能改变吗？");
        System.out.println("3. 如何检查一个值是否在数组中？");
        
        // 给出一个小挑战
        System.out.println("\n挑战题：");
        System.out.println("创建一个方法，输入一个数组，返回数组中第二大的数字");
        
        // 示例解答
        int[] testArray = {10, 5, 8, 20, 15};
        int secondLargest = findSecondLargest(testArray);
        System.out.println("数组 " + java.util.Arrays.toString(testArray) + 
                          " 中第二大的数是: " + secondLargest);
    }
    
    /**
     * 挑战题解答：找到数组中第二大的数字
     */
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("数组至少需要2个元素");
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // 之前的最大值变成第二大
                largest = num;           // 更新最大值
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;     // 更新第二大值
            }
        }
        
        return secondLargest;
    }
}