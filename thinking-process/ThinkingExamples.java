/**
 * 思维过程实战案例
 * 
 * 这个文件通过具体的问题，完整展示我的思维过程
 * 让你看到从问题到解决方案的每一个思考步骤
 */
public class ThinkingExamples {
    
    public static void main(String[] args) {
        System.out.println("=== 思维过程实战案例 ===\n");
        
        // 案例1：简单问题的思维过程
        System.out.println("📚 案例1：找出数组中的最大值");
        demonstrateCase1_FindMax();
        
        System.out.println("\n" + "=".repeat(80) + "\n");
        
        // 案例2：中等问题的思维过程
        System.out.println("📚 案例2：判断字符串是否为回文");
        demonstrateCase2_Palindrome();
        
        System.out.println("\n" + "=".repeat(80) + "\n");
        
        // 案例3：复杂问题的思维过程
        System.out.println("📚 案例3：找出数组中的重复数字");
        demonstrateCase3_FindDuplicates();
        
        System.out.println("\n" + "=".repeat(80) + "\n");
        
        // 案例4：一题多解的思维过程
        System.out.println("📚 案例4：数组求和的不同方法");
        demonstrateCase4_ArraySum();
    }
    
    /**
     * 案例1：找出数组中的最大值
     * 展示简单问题的标准思维流程
     */
    public static void demonstrateCase1_FindMax() {
        System.out.println("🎯 问题：给定一个整数数组，找出其中的最大值");
        System.out.println();
        
        System.out.println("🧠 我的完整思维过程：");
        System.out.println();
        
        System.out.println("⚡ 第1步：问题理解与分类");
        System.out.println("   • 输入：整数数组");
        System.out.println("   • 输出：一个整数（最大值）");
        System.out.println("   • 关键词识别：'最大值' → 这是一个最值问题");
        System.out.println("   • 问题分类：搜索类问题 → 最值子类");
        System.out.println();
        
        System.out.println("⚡ 第2步：约束条件分析");
        System.out.println("   • 数组是否为空？需要处理边界情况");
        System.out.println("   • 数组是否有序？题目没说，假设无序");
        System.out.println("   • 时间复杂度要求？没有特殊要求，O(n)可接受");
        System.out.println("   • 空间复杂度要求？没有特殊要求，O(1)最佳");
        System.out.println();
        
        System.out.println("⚡ 第3步：解决方案设计");
        System.out.println("   方案思考过程：");
        System.out.println("   • 最值问题 → 需要遍历所有元素进行比较");
        System.out.println("   • 维护一个变量存储当前最大值");
        System.out.println("   • 遍历数组，每次与当前最大值比较并更新");
        System.out.println();
        System.out.println("   具体算法：");
        System.out.println("   1. 初始化max为数组第一个元素");
        System.out.println("   2. 从第二个元素开始遍历");
        System.out.println("   3. 如果当前元素大于max，更新max");
        System.out.println("   4. 返回max");
        System.out.println();
        
        System.out.println("⚡ 第4步：复杂度分析");
        System.out.println("   • 时间复杂度：O(n) - 需要遍历所有元素");
        System.out.println("   • 空间复杂度：O(1) - 只用了一个额外变量");
        System.out.println("   • 这是最优解，无法再优化");
        System.out.println();
        
        System.out.println("⚡ 第5步：边界情况考虑");
        System.out.println("   • 空数组：抛出异常或返回特殊值");
        System.out.println("   • 单元素数组：直接返回该元素");
        System.out.println("   • 所有元素相同：返回任意一个");
        System.out.println("   • 负数数组：算法仍然有效");
        System.out.println();
        
        System.out.println("💻 实现代码：");
        int[] testArray = {3, 1, 4, 1, 5, 9, 2, 6};
        int result = findMaxWithThinking(testArray);
        System.out.println("   数组：" + java.util.Arrays.toString(testArray));
        System.out.println("   最大值：" + result);
        System.out.println();
        
        System.out.println("🎓 学习要点：");
        System.out.println("   • 最值问题的标准模式：初始化→遍历→比较→更新");
        System.out.println("   • 这个模式可以应用到找最小值、第二大值等变体");
        System.out.println("   • 时间复杂度O(n)是不可避免的，因为必须看所有元素");
    }
    
    public static int findMaxWithThinking(int[] arr) {
        // 边界检查
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }
        
        // 初始化最大值为第一个元素
        int max = arr[0];
        
        // 从第二个元素开始遍历
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // 更新最大值
            }
        }
        
        return max;
    }
    
    /**
     * 案例2：判断字符串是否为回文
     * 展示字符串问题的思维过程
     */
    public static void demonstrateCase2_Palindrome() {
        System.out.println("🎯 问题：判断一个字符串是否为回文（正着读和倒着读一样）");
        System.out.println();
        
        System.out.println("🧠 我的完整思维过程：");
        System.out.println();
        
        System.out.println("⚡ 第1步：问题理解与分类");
        System.out.println("   • 输入：字符串");
        System.out.println("   • 输出：布尔值（是否为回文）");
        System.out.println("   • 关键词识别：'正着读和倒着读一样' → 对称性问题");
        System.out.println("   • 问题分类：字符串处理 → 对称判断子类");
        System.out.println();
        
        System.out.println("⚡ 第2步：解决方案设计思考");
        System.out.println("   我的大脑快速闪过几种方案：");
        System.out.println();
        System.out.println("   方案A：反转字符串后比较");
        System.out.println("   • 思路：创建反转字符串，与原字符串比较");
        System.out.println("   • 时间：O(n)，空间：O(n)");
        System.out.println("   • 优点：思路直观，易于理解");
        System.out.println("   • 缺点：需要额外空间");
        System.out.println();
        System.out.println("   方案B：双指针对比");
        System.out.println("   • 思路：左右指针向中间移动，逐一比较字符");
        System.out.println("   • 时间：O(n)，空间：O(1)");
        System.out.println("   • 优点：空间效率高，提前退出");
        System.out.println("   • 缺点：需要仔细处理指针边界");
        System.out.println();
        System.out.println("   方案C：递归分治");
        System.out.println("   • 思路：比较首尾字符，递归处理中间部分");
        System.out.println("   • 时间：O(n)，空间：O(n) [递归栈]");
        System.out.println("   • 优点：代码简洁");
        System.out.println("   • 缺点：递归开销，可能栈溢出");
        System.out.println();
        
        System.out.println("⚡ 第3步：方案选择逻辑");
        System.out.println("   选择方案B（双指针）的原因：");
        System.out.println("   • 时间复杂度最优：O(n)");
        System.out.println("   • 空间复杂度最优：O(1)");
        System.out.println("   • 可以提前退出：发现不匹配立即返回false");
        System.out.println("   • 这是回文问题的经典解法");
        System.out.println();
        
        System.out.println("⚡ 第4步：实现细节思考");
        System.out.println("   • 初始化：left = 0, right = length - 1");
        System.out.println("   • 循环条件：left < right（当指针相遇时停止）");
        System.out.println("   • 比较逻辑：如果不相等立即返回false");
        System.out.println("   • 指针移动：left++, right--");
        System.out.println("   • 退出条件：所有比较都相等返回true");
        System.out.println();
        
        System.out.println("💻 实现代码：");
        String[] testCases = {"racecar", "hello", "level", "a", ""};
        for (String test : testCases) {
            boolean result = isPalindromeWithThinking(test);
            System.out.println("   \"" + test + "\" → " + result);
        }
        System.out.println();
        
        System.out.println("🎓 学习要点：");
        System.out.println("   • 对称性问题常用双指针技术");
        System.out.println("   • 双指针是空间优化的经典技巧");
        System.out.println("   • 提前退出可以优化平均时间复杂度");
        System.out.println("   • 这个模式可以应用到数组回文、链表回文等");
    }
    
    public static boolean isPalindromeWithThinking(String s) {
        if (s == null || s.length() <= 1) {
            return true;  // 空字符串或单字符都是回文
        }
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;  // 发现不匹配，立即返回
            }
            left++;
            right--;
        }
        
        return true;  // 所有字符都匹配
    }
    
    /**
     * 案例3：找出数组中的重复数字
     * 展示复杂问题的多方案思维过程
     */
    public static void demonstrateCase3_FindDuplicates() {
        System.out.println("🎯 问题：找出数组中所有重复的数字");
        System.out.println();
        
        System.out.println("🧠 我的完整思维过程：");
        System.out.println();
        
        System.out.println("⚡ 第1步：问题深入分析");
        System.out.println("   • 关键词：'重复' → 频次统计问题");
        System.out.println("   • 需要明确：返回重复的数字，还是重复的次数？");
        System.out.println("   • 假设：返回所有出现次数>1的数字");
        System.out.println("   • 输出格式：数组/列表");
        System.out.println();
        
        System.out.println("⚡ 第2步：多方案快速评估");
        System.out.println();
        System.out.println("   我的大脑同时考虑了以下方案：");
        System.out.println();
        System.out.println("   方案A：暴力嵌套循环");
        System.out.println("   • 对每个元素，遍历剩余数组统计出现次数");
        System.out.println("   • 时间：O(n²)，空间：O(1)");
        System.out.println("   • 判断：太慢，但空间效率高");
        System.out.println();
        System.out.println("   方案B：哈希表统计");
        System.out.println("   • 第一遍遍历：统计每个数字的出现次数");
        System.out.println("   • 第二遍遍历：收集出现次数>1的数字");
        System.out.println("   • 时间：O(n)，空间：O(n)");
        System.out.println("   • 判断：时间最优，空间可接受");
        System.out.println();
        System.out.println("   方案C：排序后扫描");
        System.out.println("   • 先排序，然后扫描相邻元素");
        System.out.println("   • 时间：O(n log n)，空间：O(1)");
        System.out.println("   • 判断：时间不如哈希表，但空间更优");
        System.out.println();
        System.out.println("   方案D：特殊技巧（如果数字范围已知）");
        System.out.println("   • 使用数组索引标记");
        System.out.println("   • 时间：O(n)，空间：O(1)");
        System.out.println("   • 判断：最优，但有限制条件");
        System.out.println();
        
        System.out.println("⚡ 第3步：最终决策");
        System.out.println("   选择方案B（哈希表）：");
        System.out.println("   • 通用性最好，适用于所有情况");
        System.out.println("   • 时间复杂度最优");
        System.out.println("   • 代码清晰易懂");
        System.out.println("   • 可以轻松扩展（如返回出现次数）");
        System.out.println();
        
        System.out.println("💻 实现代码：");
        int[] testArray = {1, 2, 3, 2, 4, 3, 5, 1};
        java.util.List<Integer> result = findDuplicatesWithThinking(testArray);
        System.out.println("   数组：" + java.util.Arrays.toString(testArray));
        System.out.println("   重复数字：" + result);
        System.out.println();
        
        System.out.println("🎓 学习要点：");
        System.out.println("   • 频次统计问题首选哈希表");
        System.out.println("   • 时间空间的权衡要根据具体需求");
        System.out.println("   • 排序+扫描是空间受限时的好选择");
        System.out.println("   • 特殊条件下可能有更优解");
    }
    
    public static java.util.List<Integer> findDuplicatesWithThinking(int[] arr) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        java.util.Map<Integer, Integer> countMap = new java.util.HashMap<>();
        
        // 第一遍：统计频次
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // 第二遍：收集重复元素
        for (java.util.Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
    
    /**
     * 案例4：数组求和的不同方法
     * 展示一题多解的思维扩展
     */
    public static void demonstrateCase4_ArraySum() {
        System.out.println("🎯 问题：计算数组所有元素的和");
        System.out.println();
        
        System.out.println("🧠 一题多解的思维扩展：");
        System.out.println();
        System.out.println("这个看似简单的问题，实际上可以用多种方法解决。");
        System.out.println("让我展示如何从不同角度思考同一个问题：");
        System.out.println();
        
        int[] testArray = {1, 2, 3, 4, 5};
        System.out.println("测试数组：" + java.util.Arrays.toString(testArray));
        System.out.println();
        
        System.out.println("💡 方法1：传统循环（最直观）");
        System.out.println("   思路：逐个累加，最基础的方法");
        System.out.println("   时间：O(n)，空间：O(1)");
        int sum1 = arraySum_Traditional(testArray);
        System.out.println("   结果：" + sum1);
        System.out.println();
        
        System.out.println("💡 方法2：增强for循环（更简洁）");
        System.out.println("   思路：利用Java语法糖，代码更清晰");
        System.out.println("   时间：O(n)，空间：O(1)");
        int sum2 = arraySum_Enhanced(testArray);
        System.out.println("   结果：" + sum2);
        System.out.println();
        
        System.out.println("💡 方法3：递归（分治思想）");
        System.out.println("   思路：sum(arr) = arr[0] + sum(arr[1:])");
        System.out.println("   时间：O(n)，空间：O(n) [递归栈]");
        int sum3 = arraySum_Recursive(testArray, 0);
        System.out.println("   结果：" + sum3);
        System.out.println();
        
        System.out.println("💡 方法4：分治算法（并行潜力）");
        System.out.println("   思路：分成两半分别求和，再合并");
        System.out.println("   时间：O(n)，空间：O(log n)");
        int sum4 = arraySum_DivideConquer(testArray, 0, testArray.length - 1);
        System.out.println("   结果：" + sum4);
        System.out.println();
        
        System.out.println("💡 方法5：数学公式（特殊情况）");
        System.out.println("   思路：如果是连续数字，可用求和公式");
        System.out.println("   时间：O(1)，空间：O(1)");
        System.out.println("   注意：只适用于特定情况");
        System.out.println();
        
        System.out.println("🎓 思维启发：");
        System.out.println("   • 同一个问题可以有多种解法");
        System.out.println("   • 每种解法都有其适用场景");
        System.out.println("   • 简单问题是学习算法思想的好载体");
        System.out.println("   • 递归和分治为复杂问题奠定基础");
        System.out.println("   • 要培养'多角度思考'的习惯");
    }
    
    // 方法1：传统循环
    public static int arraySum_Traditional(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    // 方法2：增强for循环
    public static int arraySum_Enhanced(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    // 方法3：递归
    public static int arraySum_Recursive(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;  // 递归基础情况
        }
        return arr[index] + arraySum_Recursive(arr, index + 1);
    }
    
    // 方法4：分治
    public static int arraySum_DivideConquer(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];  // 只有一个元素
        }
        
        int mid = left + (right - left) / 2;
        int leftSum = arraySum_DivideConquer(arr, left, mid);
        int rightSum = arraySum_DivideConquer(arr, mid + 1, right);
        
        return leftSum + rightSum;
    }
}