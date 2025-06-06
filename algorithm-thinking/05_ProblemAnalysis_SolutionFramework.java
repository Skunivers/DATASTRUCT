package algorithm_thinking;

/**
 * 问题分析与解决框架：算法思维的系统方法论
 * 
 * 本章综合前面所有算法思维模式，
 * 构建一个完整的问题分析与解决框架，
 * 帮助你面对任何算法问题都能有条不紊地思考和解决。
 */
public class ProblemAnalysisSolutionFramework {
    
    public static void main(String[] args) {
        ProblemAnalysisSolutionFramework framework = new ProblemAnalysisSolutionFramework();
        
        System.out.println("====== 问题分析与解决的系统框架 ======\n");
        
        // 1. 问题理解阶段
        framework.understandingPhase();
        
        // 2. 模式识别阶段
        framework.patternRecognitionPhase();
        
        // 3. 算法设计阶段
        framework.algorithmDesignPhase();
        
        // 4. 实现优化阶段
        framework.implementationOptimizationPhase();
        
        // 5. 实战案例分析
        framework.practicalCaseStudy();
        
        // 6. 思维模式总结
        framework.thinkingPatternsSummary();
    }
    
    /**
     * 1. 问题理解阶段：深入理解问题的本质
     */
    private void understandingPhase() {
        System.out.println("一、问题理解阶段：看透问题的本质\n");
        
        System.out.println("1. 问题分解技巧（IDEA法则）：");
        System.out.println("- I (Input): 输入是什么？格式、范围、特殊情况");
        System.out.println("- D (Desired output): 期望输出是什么？格式要求");
        System.out.println("- E (Examples): 通过例子理解问题");
        System.out.println("- A (Assumptions): 可以做哪些假设？");
        System.out.println();
        
        System.out.println("2. 问题抽象化：");
        System.out.println("去除表面细节，找到核心结构：");
        System.out.println("- 「找到数组中和为K的两个数」→ 两数之和问题");
        System.out.println("- 「计算到达终点的最短路径」→ 图的最短路径");
        System.out.println("- 「分配任务使总时间最短」→ 调度优化问题");
        System.out.println();
        
        System.out.println("3. 边界条件思考：");
        System.out.println("- 空输入：数组为空、字符串为空");
        System.out.println("- 单元素：只有一个元素的情况");
        System.out.println("- 极端值：最大值、最小值、溢出");
        System.out.println("- 特殊结构：有序、重复、循环");
        System.out.println();
        
        // 示例：两数之和问题的完整分析
        demonstrateProblemAnalysis();
    }
    
    /**
     * 演示问题分析过程
     */
    private void demonstrateProblemAnalysis() {
        System.out.println("实例演示 - 两数之和问题：");
        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("│ 问题：给定数组和目标值，找两个数使其和等于目标值 │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.println();
        
        System.out.println("IDEA分析：");
        System.out.println("I - 输入：整数数组 nums，目标值 target");
        System.out.println("D - 输出：两个数的索引 [i, j]");
        System.out.println("E - 例子：nums=[2,7,11,15], target=9 → [0,1]");
        System.out.println("A - 假设：恰好有一个解，同一元素不能用两次");
        System.out.println();
        
        System.out.println("深入思考：");
        System.out.println("- 暴力解法：双重循环 O(n²)");
        System.out.println("- 优化思路：a + b = target → b = target - a");
        System.out.println("- 关键洞察：查找 target - a 是否存在");
        System.out.println("- 数据结构：哈希表实现 O(1) 查找");
        System.out.println();
    }
    
    /**
     * 2. 模式识别阶段：识别问题类型和适用算法
     */
    private void patternRecognitionPhase() {
        System.out.println("\n二、模式识别阶段：找到问题的算法模式\n");
        
        System.out.println("1. 常见问题模式分类：");
        System.out.println();
        
        System.out.println("【搜索类问题】");
        System.out.println("- 线性搜索：在序列中查找");
        System.out.println("- 二分搜索：有序序列快速查找");
        System.out.println("- 深度/广度搜索：图和树的遍历");
        System.out.println("- 回溯搜索：组合、排列、子集");
        System.out.println();
        
        System.out.println("【优化类问题】");
        System.out.println("- 贪心优化：局部最优导向全局");
        System.out.println("- 动态规划：重叠子问题的优化");
        System.out.println("- 分治优化：大问题分解求解");
        System.out.println();
        
        System.out.println("【结构类问题】");
        System.out.println("- 数组/字符串：滑动窗口、双指针");
        System.out.println("- 链表：快慢指针、反转、合并");
        System.out.println("- 树：递归遍历、层次遍历");
        System.out.println("- 图：最短路径、连通性、拓扑排序");
        System.out.println();
        
        System.out.println("2. 模式识别关键词：");
        identifyKeywords();
        
        System.out.println("\n3. 算法选择决策树：");
        showAlgorithmDecisionTree();
    }
    
    /**
     * 识别问题中的关键词
     */
    private void identifyKeywords() {
        System.out.println("┌─────────────┬─────────────────────┐");
        System.out.println("│   关键词     │    可能的算法模式      │");
        System.out.println("├─────────────┼─────────────────────┤");
        System.out.println("│ 最大/最小    │ 动态规划、贪心        │");
        System.out.println("│ 最短路径     │ BFS、Dijkstra、DP    │");
        System.out.println("│ 所有可能     │ 回溯、DFS            │");
        System.out.println("│ 是否存在     │ DFS、BFS、哈希表      │");
        System.out.println("│ 计数        │ 动态规划、组合数学     │");
        System.out.println("│ 前K个       │ 堆、快速选择          │");
        System.out.println("│ 子数组/子串  │ 滑动窗口、动态规划     │");
        System.out.println("│ 有序        │ 二分搜索、双指针      │");
        System.out.println("└─────────────┴─────────────────────┘");
    }
    
    /**
     * 展示算法选择决策树
     */
    private void showAlgorithmDecisionTree() {
        System.out.println("问题");
        System.out.println("├─ 需要搜索？");
        System.out.println("│   ├─ 有序？ → 二分搜索");
        System.out.println("│   ├─ 图/树？ → DFS/BFS");
        System.out.println("│   └─ 组合？ → 回溯");
        System.out.println("├─ 需要优化？");
        System.out.println("│   ├─ 有重叠子问题？ → 动态规划");
        System.out.println("│   ├─ 可以分解？ → 分治");
        System.out.println("│   └─ 局部最优=全局最优？ → 贪心");
        System.out.println("└─ 需要处理序列？");
        System.out.println("    ├─ 固定大小窗口？ → 滑动窗口");
        System.out.println("    └─ 两端处理？ → 双指针");
    }
    
    /**
     * 3. 算法设计阶段：设计解决方案
     */
    private void algorithmDesignPhase() {
        System.out.println("\n\n三、算法设计阶段：构建解决方案\n");
        
        System.out.println("1. 从简单到复杂的设计原则：");
        System.out.println("Step 1: 先实现暴力解法，确保理解正确");
        System.out.println("Step 2: 分析暴力解法的瓶颈");
        System.out.println("Step 3: 寻找优化机会");
        System.out.println("Step 4: 设计优化算法");
        System.out.println("Step 5: 验证正确性");
        System.out.println();
        
        System.out.println("2. 算法设计模板：");
        System.out.println();
        
        System.out.println("【分治模板】");
        System.out.println("```");
        System.out.println("function divideConquer(problem) {");
        System.out.println("    if (problem is small enough) {");
        System.out.println("        return direct solution");
        System.out.println("    }");
        System.out.println("    subproblems = divide(problem)");
        System.out.println("    solutions = map(divideConquer, subproblems)");
        System.out.println("    return combine(solutions)");
        System.out.println("}");
        System.out.println("```");
        System.out.println();
        
        System.out.println("【动态规划模板】");
        System.out.println("```");
        System.out.println("1. 定义状态：dp[i] 表示什么？");
        System.out.println("2. 状态转移：dp[i] 如何从之前状态得出？");
        System.out.println("3. 初始状态：dp[0] = ?");
        System.out.println("4. 计算顺序：确保依赖的状态已计算");
        System.out.println("5. 返回结果：通常是 dp[n]");
        System.out.println("```");
        System.out.println();
        
        System.out.println("3. 复杂度分析框架：");
        analyzeComplexity();
    }
    
    /**
     * 复杂度分析方法
     */
    private void analyzeComplexity() {
        System.out.println("时间复杂度分析：");
        System.out.println("- 计算基本操作的执行次数");
        System.out.println("- 找出随输入规模变化的部分");
        System.out.println("- 关注最高次项，忽略常数");
        System.out.println();
        
        System.out.println("空间复杂度分析：");
        System.out.println("- 计算额外使用的空间");
        System.out.println("- 注意递归调用栈");
        System.out.println("- 原地算法 vs 额外空间");
        System.out.println();
        
        System.out.println("常见复杂度从优到劣：");
        System.out.println("O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ) < O(n!)");
        System.out.println();
    }
    
    /**
     * 4. 实现与优化阶段
     */
    private void implementationOptimizationPhase() {
        System.out.println("\n四、实现与优化阶段：代码实现的艺术\n");
        
        System.out.println("1. 代码实现原则：");
        System.out.println("- 清晰第一，性能第二");
        System.out.println("- 先正确，后优化");
        System.out.println("- 边写边测试");
        System.out.println("- 处理边界情况");
        System.out.println();
        
        System.out.println("2. 常见优化技巧：");
        System.out.println();
        
        System.out.println("【时间优化】");
        System.out.println("- 预计算：空间换时间");
        System.out.println("- 缓存：记忆化搜索");
        System.out.println("- 剪枝：减少无效计算");
        System.out.println("- 并行：利用多核处理");
        System.out.println();
        
        System.out.println("【空间优化】");
        System.out.println("- 滚动数组：降低DP空间");
        System.out.println("- 原地修改：避免额外数组");
        System.out.println("- 位运算：压缩状态表示");
        System.out.println();
        
        System.out.println("3. 调试技巧：");
        System.out.println("- 打印中间状态");
        System.out.println("- 使用小数据集");
        System.out.println("- 分步骤验证");
        System.out.println("- 画图辅助理解");
        System.out.println();
    }
    
    /**
     * 5. 实战案例分析：最长递增子序列
     */
    private void practicalCaseStudy() {
        System.out.println("\n五、实战案例：最长递增子序列（LIS）\n");
        
        System.out.println("问题：找出数组中最长的递增子序列的长度");
        System.out.println("输入：[10, 9, 2, 5, 3, 7, 101, 18]");
        System.out.println("输出：4 （子序列 [2, 3, 7, 101]）");
        System.out.println();
        
        // 第一步：问题理解
        System.out.println("Step 1 - 问题理解：");
        System.out.println("- 子序列不需要连续");
        System.out.println("- 严格递增（不能相等）");
        System.out.println("- 求长度，不是具体序列");
        System.out.println();
        
        // 第二步：模式识别
        System.out.println("Step 2 - 模式识别：");
        System.out.println("- 关键词：「最长」→ 优化问题");
        System.out.println("- 子问题：以第i个元素结尾的LIS");
        System.out.println("- 重叠子问题：需要多次计算");
        System.out.println("- 结论：动态规划");
        System.out.println();
        
        // 第三步：算法设计
        System.out.println("Step 3 - 算法设计：");
        System.out.println("- 状态定义：dp[i] = 以nums[i]结尾的LIS长度");
        System.out.println("- 状态转移：dp[i] = max(dp[j] + 1) for j < i and nums[j] < nums[i]");
        System.out.println("- 初始状态：dp[i] = 1 （至少包含自己）");
        System.out.println("- 最终答案：max(dp[i])");
        System.out.println();
        
        // 第四步：代码实现
        System.out.println("Step 4 - 代码实现：");
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        
        // 方法1：动态规划 O(n²)
        int lis1 = lengthOfLIS_DP(nums);
        System.out.println("动态规划解法：" + lis1);
        
        // 方法2：二分搜索优化 O(n log n)
        int lis2 = lengthOfLIS_BinarySearch(nums);
        System.out.println("二分搜索优化：" + lis2);
        System.out.println();
        
        // 第五步：复杂度分析
        System.out.println("Step 5 - 复杂度分析：");
        System.out.println("DP解法：时间O(n²)，空间O(n)");
        System.out.println("二分优化：时间O(n log n)，空间O(n)");
        System.out.println();
    }
    
    /**
     * LIS - 动态规划解法
     */
    private int lengthOfLIS_DP(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        int[] dp = new int[n];
        java.util.Arrays.fill(dp, 1);
        
        int maxLen = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        
        // 展示DP数组
        System.out.print("DP数组：");
        for (int val : dp) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        return maxLen;
    }
    
    /**
     * LIS - 二分搜索优化
     */
    private int lengthOfLIS_BinarySearch(int[] nums) {
        java.util.List<Integer> tails = new java.util.ArrayList<>();
        
        for (int num : nums) {
            int left = 0, right = tails.size();
            
            // 二分搜索找到第一个大于等于num的位置
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            
            // 更新或添加
            if (left == tails.size()) {
                tails.add(num);
            } else {
                tails.set(left, num);
            }
        }
        
        System.out.print("Tails数组：" + tails);
        System.out.println();
        
        return tails.size();
    }
    
    /**
     * 6. 算法思维模式总结
     */
    private void thinkingPatternsSummary() {
        System.out.println("\n六、算法思维模式总结：融会贯通\n");
        
        System.out.println("1. 核心思维模式对比：");
        System.out.println("┌────────────┬────────────────┬─────────────────┐");
        System.out.println("│  算法类型   │    核心思想      │    适用场景       │");
        System.out.println("├────────────┼────────────────┼─────────────────┤");
        System.out.println("│ 分治       │ 分解问题        │ 可独立解决的子问题  │");
        System.out.println("│ 动态规划    │ 记忆化重用      │ 重叠子问题+最优子结构│");
        System.out.println("│ 贪心       │ 局部最优        │ 贪心选择性质成立    │");
        System.out.println("│ 回溯       │ 试错+撤销       │ 搜索所有可能解     │");
        System.out.println("└────────────┴────────────────┴─────────────────┘");
        System.out.println();
        
        System.out.println("2. 问题解决的元认知：");
        System.out.println("- 理解问题比解决问题更重要");
        System.out.println("- 模式识别需要大量练习积累");
        System.out.println("- 从简单解法逐步优化");
        System.out.println("- 正确性永远优先于效率");
        System.out.println();
        
        System.out.println("3. 持续提升的方法：");
        System.out.println("- 每天一道算法题");
        System.out.println("- 同一题目多种解法");
        System.out.println("- 总结归纳相似问题");
        System.out.println("- 教授他人加深理解");
        System.out.println();
        
        System.out.println("4. 算法与人生：");
        System.out.println("算法思维不仅仅是编程技巧，");
        System.out.println("更是一种系统化解决问题的方法论。");
        System.out.println();
        System.out.println("- 分治教会我们化繁为简");
        System.out.println("- 动态规划让我们避免重复努力");
        System.out.println("- 贪心提醒我们把握当下");
        System.out.println("- 回溯告诉我们勇于纠错");
        System.out.println();
        
        System.out.println("记住：");
        System.out.println("『算法的本质是有序的思考』");
        System.out.println("当你掌握了这些思维模式，");
        System.out.println("你就拥有了解决复杂问题的钥匙。");
        System.out.println();
        
        System.out.println("最后的建议：");
        System.out.println("1. 建立自己的问题-算法映射表");
        System.out.println("2. 形成个人的解题检查清单");
        System.out.println("3. 保持好奇心和探索欲");
        System.out.println("4. 享受思考的过程");
        System.out.println();
        
        System.out.println("祝你在算法学习的道路上越走越远！");
        System.out.println("Remember: It's not about being smart,");
        System.out.println("it's about thinking smart!");
        System.out.println();
    }
}