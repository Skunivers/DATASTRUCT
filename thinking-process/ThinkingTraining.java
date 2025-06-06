package thinkingprocess;

/**
 * 思维训练练习
 * 
 * 这个文件包含专门设计的练习，帮助你培养问题解决的思维模式
 * 每个练习都要求你先思考，再实现，最后反思
 */
public class ThinkingTraining {
    
    public static void main(String[] args) {
        System.out.println("=== 思维训练练习 ===\n");
        
        System.out.println("💪 这些练习专注于培养你的问题解决思维");
        System.out.println("📝 每个练习都包含：思考→实现→反思 三个阶段");
        System.out.println("🎯 重点不是解决问题，而是培养思维过程\n");
        
        // 训练1：模式识别训练
        patternRecognitionTraining();
        
        System.out.println("\n" + "=".repeat(80) + "\n");
        
        // 训练2：方案设计训练
        solutionDesignTraining();
        
        System.out.println("\n" + "=".repeat(80) + "\n");
        
        // 训练3：复杂度分析训练
        complexityAnalysisTraining();
        
        System.out.println("\n" + "=".repeat(80) + "\n");
        
        // 训练4：综合思维训练
        comprehensiveThinkingTraining();
    }
    
    /**
     * 训练1：模式识别训练
     * 目标：快速识别问题类型和适用的解决方案
     */
    public static void patternRecognitionTraining() {
        System.out.println("🎯 训练1：模式识别训练");
        System.out.println();
        System.out.println("目标：看到问题描述后，立即识别问题类型和可能的解决方案");
        System.out.println();
        
        String[] problems = {
            "在一个有序数组中查找指定元素",
            "统计字符串中每个字符出现的次数", 
            "将数组中的元素按从小到大排序",
            "检查两个字符串是否互为字母异位词",
            "找出链表中环的起始位置",
            "计算二叉树的最大深度",
            "在二维网格中找到从起点到终点的最短路径",
            "判断一个数是否为质数",
            "合并两个有序链表",
            "找出数组中出现次数超过n/2的元素"
        };
        
        System.out.println("📋 练习说明：");
        System.out.println("对于下面每个问题，请在5秒内识别出：");
        System.out.println("1. 问题类型（搜索/排序/统计/图论等）");
        System.out.println("2. 可能的数据结构（数组/链表/树/图等）");
        System.out.println("3. 可能的算法（遍历/递归/分治/动态规划等）");
        System.out.println("4. 大致的时间复杂度");
        System.out.println();
        
        for (int i = 0; i < problems.length; i++) {
            System.out.println("问题 " + (i + 1) + "：" + problems[i]);
            System.out.println("   思考时间：5秒钟...");
            System.out.println("   你的答案：_______________");
            System.out.println();
        }
        
        System.out.println("📚 参考答案和分析：");
        System.out.println();
        analyzePatternRecognitionAnswers();
        
        System.out.println("🎓 训练要点：");
        System.out.println("• 看到关键词立即联想到对应的数据结构和算法");
        System.out.println("• 培养从问题描述中提取核心特征的能力");
        System.out.println("• 建立'问题模式→解决方案'的条件反射");
        System.out.println("• 重复练习直到识别过程自动化");
    }
    
    public static void analyzePatternRecognitionAnswers() {
        System.out.println("1. 在有序数组中查找 → 搜索问题 → 二分查找 → O(log n)");
        System.out.println("2. 统计字符出现次数 → 频次统计 → 哈希表 → O(n)");
        System.out.println("3. 数组排序 → 排序问题 → 快排/归并 → O(n log n)");
        System.out.println("4. 字母异位词 → 字符串比较 → 排序或哈希 → O(n log n) 或 O(n)");
        System.out.println("5. 链表环检测 → 链表问题 → 快慢指针 → O(n)");
        System.out.println("6. 二叉树深度 → 树遍历 → 递归DFS → O(n)");
        System.out.println("7. 网格最短路径 → 图搜索 → BFS/Dijkstra → O(V+E)");
        System.out.println("8. 质数判断 → 数学问题 → 试除法优化 → O(√n)");
        System.out.println("9. 合并有序链表 → 链表操作 → 双指针 → O(m+n)");
        System.out.println("10. 众数查找 → 统计问题 → 哈希表或摩尔投票 → O(n)");
    }
    
    /**
     * 训练2：方案设计训练
     * 目标：培养设计多种解决方案并选择最优方案的能力
     */
    public static void solutionDesignTraining() {
        System.out.println("🎯 训练2：方案设计训练");
        System.out.println();
        System.out.println("目标：对同一个问题设计多种解决方案，并分析优缺点");
        System.out.println();
        
        System.out.println("📋 训练题目：两数之和");
        System.out.println("给定一个整数数组和目标值，找出数组中两个数的索引，使它们的和等于目标值");
        System.out.println();
        
        System.out.println("🧠 思维训练步骤：");
        System.out.println();
        
        System.out.println("第1步：头脑风暴（用2分钟想出所有可能的方法）");
        System.out.println("方法清单：");
        System.out.println("□ 方法1：_______________");
        System.out.println("□ 方法2：_______________");
        System.out.println("□ 方法3：_______________");
        System.out.println("□ 方法4：_______________");
        System.out.println();
        
        System.out.println("第2步：详细分析每种方法");
        System.out.println("对每种方法分析：");
        System.out.println("• 基本思路");
        System.out.println("• 时间复杂度");
        System.out.println("• 空间复杂度");
        System.out.println("• 优点和缺点");
        System.out.println();
        
        System.out.println("第3步：选择最优方案");
        System.out.println("综合考虑各种因素，选择最适合的方案");
        System.out.println();
        
        System.out.println("📚 参考分析：");
        analyzeTwoSumSolutions();
        
        System.out.println("🎓 训练要点：");
        System.out.println("• 先发散思维，再收敛选择");
        System.out.println("• 每种方案都要分析时间空间复杂度");
        System.out.println("• 考虑实际约束条件（如内存限制）");
        System.out.println("• 理解为什么某个方案更优");
    }
    
    public static void analyzeTwoSumSolutions() {
        System.out.println("方法1：暴力枚举");
        System.out.println("• 思路：双重循环，检查每对数字");
        System.out.println("• 时间：O(n²)，空间：O(1)");
        System.out.println("• 优点：简单直观，空间效率高");
        System.out.println("• 缺点：时间复杂度高");
        System.out.println();
        
        System.out.println("方法2：排序+双指针");
        System.out.println("• 思路：排序后用双指针找目标和");
        System.out.println("• 时间：O(n log n)，空间：O(1)");
        System.out.println("• 优点：时间较好，空间最优");
        System.out.println("• 缺点：需要额外记录原始索引");
        System.out.println();
        
        System.out.println("方法3：哈希表");
        System.out.println("• 思路：遍历时查找complement");
        System.out.println("• 时间：O(n)，空间：O(n)");
        System.out.println("• 优点：时间最优，代码简洁");
        System.out.println("• 缺点：需要额外空间");
        System.out.println();
        
        System.out.println("✅ 最优选择：哈希表（在大多数情况下）");
        System.out.println("原因：时间复杂度最优，空间开销可接受");
    }
    
    /**
     * 训练3：复杂度分析训练
     * 目标：培养准确分析算法复杂度的能力
     */
    public static void complexityAnalysisTraining() {
        System.out.println("🎯 训练3：复杂度分析训练");
        System.out.println();
        System.out.println("目标：准确分析代码的时间和空间复杂度");
        System.out.println();
        
        System.out.println("📋 分析下面的代码片段：");
        System.out.println();
        
        String[] codeSnippets = {
            "for (int i = 0; i < n; i++) { System.out.println(i); }",
            "for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) { arr[i][j] = 0; } }",
            "for (int i = 0; i < n; i++) { for (int j = i; j < n; j++) { sum += arr[i][j]; } }",
            "while (n > 0) { n = n / 2; count++; }",
            "int[] temp = new int[n]; for (int i = 0; i < n; i++) { temp[i] = arr[i]; }"
        };
        
        System.out.println("对于每个代码片段，分析：");
        System.out.println("1. 基本操作执行了多少次？");
        System.out.println("2. 时间复杂度是多少？");
        System.out.println("3. 空间复杂度是多少？");
        System.out.println("4. 如何优化？");
        System.out.println();
        
        for (int i = 0; i < codeSnippets.length; i++) {
            System.out.println("代码片段 " + (i + 1) + "：");
            System.out.println("   " + codeSnippets[i]);
            System.out.println("   时间复杂度：___________");
            System.out.println("   空间复杂度：___________");
            System.out.println("   分析过程：___________");
            System.out.println();
        }
        
        System.out.println("📚 参考答案：");
        analyzeComplexityAnswers();
        
        System.out.println("🎓 分析技巧：");
        System.out.println("• 找出最内层的基本操作");
        System.out.println("• 计算基本操作的执行次数");
        System.out.println("• 用大O记号表示增长趋势");
        System.out.println("• 空间复杂度看额外使用的空间");
    }
    
    public static void analyzeComplexityAnswers() {
        System.out.println("1. 简单循环：时间O(n)，空间O(1)");
        System.out.println("2. 嵌套循环：时间O(n²)，空间O(1)");
        System.out.println("3. 三角形循环：时间O(n²)，空间O(1) - 约n²/2次操作");
        System.out.println("4. 对数循环：时间O(log n)，空间O(1) - 每次n减半");
        System.out.println("5. 数组复制：时间O(n)，空间O(n) - 创建了新数组");
    }
    
    /**
     * 训练4：综合思维训练
     * 目标：综合运用所有思维技能解决复杂问题
     */
    public static void comprehensiveThinkingTraining() {
        System.out.println("🎯 训练4：综合思维训练");
        System.out.println();
        System.out.println("目标：运用完整的思维流程解决复杂问题");
        System.out.println();
        
        System.out.println("📋 综合训练题：旋转数组");
        System.out.println("给定一个数组，将数组中的元素向右移动k个位置");
        System.out.println("例如：[1,2,3,4,5,6,7] 向右移动3位 → [5,6,7,1,2,3,4]");
        System.out.println();
        
        System.out.println("🧠 完整思维流程训练：");
        System.out.println();
        
        System.out.println("步骤1：问题理解（2分钟）");
        System.out.println("• 输入：___________");
        System.out.println("• 输出：___________");
        System.out.println("• 约束条件：___________");
        System.out.println("• 边界情况：___________");
        System.out.println();
        
        System.out.println("步骤2：模式识别（1分钟）");
        System.out.println("• 问题类型：___________");
        System.out.println("• 关键操作：___________");
        System.out.println("• 可能用到的技巧：___________");
        System.out.println();
        
        System.out.println("步骤3：方案设计（5分钟）");
        System.out.println("• 方案1：___________");
        System.out.println("  时间复杂度：_____ 空间复杂度：_____");
        System.out.println("• 方案2：___________");
        System.out.println("  时间复杂度：_____ 空间复杂度：_____");
        System.out.println("• 方案3：___________");
        System.out.println("  时间复杂度：_____ 空间复杂度：_____");
        System.out.println();
        
        System.out.println("步骤4：方案选择（1分钟）");
        System.out.println("• 选择的方案：___________");
        System.out.println("• 选择理由：___________");
        System.out.println();
        
        System.out.println("步骤5：实现细节（3分钟）");
        System.out.println("• 算法步骤：");
        System.out.println("  1. ___________");
        System.out.println("  2. ___________");
        System.out.println("  3. ___________");
        System.out.println();
        
        System.out.println("步骤6：测试设计（2分钟）");
        System.out.println("• 正常情况：___________");
        System.out.println("• 边界情况：___________");
        System.out.println("• 异常情况：___________");
        System.out.println();
        
        System.out.println("📚 参考解答：");
        provideRotateArraySolution();
        
        System.out.println("🎓 综合训练要点：");
        System.out.println("• 严格按照思维流程执行");
        System.out.println("• 每个步骤都要认真完成");
        System.out.println("• 重点是培养思维习惯，而非解题");
        System.out.println("• 多练习直到流程自然化");
        
        System.out.println();
        System.out.println("🚀 进阶挑战：");
        System.out.println("用同样的思维流程解决以下问题：");
        System.out.println("• 删除链表中的倒数第n个节点");
        System.out.println("• 寻找两个有序数组的中位数");
        System.out.println("• 最长公共子序列");
        System.out.println("• 岛屿数量（二维网格）");
    }
    
    public static void provideRotateArraySolution() {
        System.out.println("问题理解：");
        System.out.println("• 输入：整数数组 + 移动位数k");
        System.out.println("• 输出：旋转后的数组");
        System.out.println("• 约束：k可能大于数组长度");
        System.out.println();
        
        System.out.println("方案分析：");
        System.out.println("• 方案1：创建新数组 - 时间O(n)，空间O(n)");
        System.out.println("• 方案2：逐个移动 - 时间O(n×k)，空间O(1)");
        System.out.println("• 方案3：三次反转 - 时间O(n)，空间O(1) ← 最优");
        System.out.println();
        
        System.out.println("最优解法（三次反转）：");
        System.out.println("1. 反转整个数组");
        System.out.println("2. 反转前k个元素");
        System.out.println("3. 反转后n-k个元素");
        System.out.println();
        
        // 示例实现
        int[] example = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("示例：" + java.util.Arrays.toString(example) + " 右移" + k + "位");
        rotateArray(example, k);
        System.out.println("结果：" + java.util.Arrays.toString(example));
    }
    
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // 处理k > n的情况
        
        // 三次反转
        reverse(nums, 0, n - 1);      // 反转整个数组
        reverse(nums, 0, k - 1);      // 反转前k个
        reverse(nums, k, n - 1);      // 反转后n-k个
    }
    
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}