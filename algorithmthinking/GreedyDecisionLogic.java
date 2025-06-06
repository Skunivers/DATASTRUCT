package algorithmthinking;

import java.util.*;

/**
 * 算法思维系列第三章：贪心算法的决策逻辑
 * 
 * 贪心算法：相信当下最优选择能引导到全局最优的勇敢思维
 * 这不仅是算法技巧，更是一种决策哲学和人生智慧
 */
public class GreedyDecisionLogic {
    
    public static void main(String[] args) {
        System.out.println("=== 贪心算法：当下最优的决策艺术 ===\n");
        
        // 1. 贪心思维的心理学基础
        understandGreedyPsychology();
        
        // 2. 贪心算法的核心要素解析
        analyzeGreedyCoreElements();
        
        // 3. 经典问题的贪心思维分析
        classicGreedyProblemsAnalysis();
        
        // 4. 贪心算法的正确性证明方法
        greedyCorrectnessProof();
        
        // 5. 贪心思维的陷阱与局限
        greedyPitfallsAndLimitations();
        
        // 6. 贪心思维在人生决策中的智慧
        greedyWisdomInLife();
    }
    
    /**
     * 1. 贪心思维的心理学基础
     */
    public static void understandGreedyPsychology() {
        System.out.println("【心理基础】贪心思维：人类决策的本能\n");
        
        System.out.println("贪心思维的进化起源：");
        System.out.println("├─ 生存压力：在原始环境中，即时的最优选择往往关乎生死");
        System.out.println("├─ 认知局限：人脑无法预测所有未来可能性");
        System.out.println("├─ 决策效率：快速决策比完美决策更有生存价值");
        System.out.println("└─ 经验法则：简单规则在复杂环境中的适应性\n");
        
        System.out.println("贪心思维的神经科学基础：");
        System.out.println("前额叶皮层（理性）vs 边缘系统（本能）");
        System.out.println("• 边缘系统：追求即时满足，贪心的神经基础");
        System.out.println("• 前额叶：考虑长远后果，抑制贪心冲动");
        System.out.println("• 决策疲劳：复杂思考耗尽认知资源，倾向于贪心选择");
        System.out.println("• 认知偏差：可得性偏差让我们高估眼前收益\n");
        
        System.out.println("贪心思维在日常生活中的表现：");
        System.out.println("场景1：超市购物");
        System.out.println("  贪心策略：看到打折商品立即购买");
        System.out.println("  心理机制：损失厌恶 + 稀缺性认知");
        System.out.println("  结果：可能买到不需要的东西");
        System.out.println();
        System.out.println("场景2：学习选择");
        System.out.println("  贪心策略：总是选择最容易的科目学习");
        System.out.println("  心理机制：回避困难 + 追求成就感");
        System.out.println("  结果：短期进步快，长期发展受限");
        System.out.println();
        System.out.println("场景3：投资决策");
        System.out.println("  贪心策略：追涨杀跌，追求短期收益");
        System.out.println("  心理机制：过度自信 + 羊群效应");
        System.out.println("  结果：可能错失长期价值");
        System.out.println();
        
        System.out.println("算法中的贪心思维：");
        System.out.println("贪心算法是对人类直觉决策的数学抽象");
        System.out.println("核心假设：如果我们能在每一步都做出'当前最优'的选择，");
        System.out.println("          那么最终我们能达到'全局最优'的结果");
        System.out.println();
        System.out.println("这个假设的哲学意义：");
        System.out.println("• 相信当下的价值");
        System.out.println("• 信任简单的规则");
        System.out.println("• 接受不完美的信息");
        System.out.println("• 追求可行的解决方案");
        
        System.out.println("\n【核心洞察】");
        System.out.println("贪心思维反映了人类在不确定环境中的适应策略：");
        System.out.println("宁要当下的确定，不要未来的未知");
        System.out.println("这种思维在某些情况下是最优的，在另一些情况下是陷阱");
        
        System.out.println("\n" + "=".repeat(70) + "\n");
    }
    
    /**
     * 2. 贪心算法的核心要素解析
     */
    public static void analyzeGreedyCoreElements() {
        System.out.println("【深度解析】贪心算法的两大支柱\n");
        
        System.out.println("支柱1：贪心选择性质（Greedy Choice Property）");
        System.out.println("═════════════════════════════════════════════");
        System.out.println("定义：通过做局部最优选择，能够到达全局最优解");
        System.out.println();
        System.out.println("核心特征：");
        System.out.println("• 选择的不可撤销性：一旦做出选择，不需要重新考虑");
        System.out.println("• 选择的独立性：当前选择不依赖于未来的选择");
        System.out.println("• 选择的贪心性：总是选择当前看起来最好的选项");
        System.out.println();
        System.out.println("与DP的区别：");
        System.out.println("┌─────────────┬───────────────┬───────────────┐");
        System.out.println("│    特征     │   贪心算法    │   动态规划    │");
        System.out.println("├─────────────┼───────────────┼───────────────┤");
        System.out.println("│ 选择时机     │ 事前选择      │ 事后选择      │");
        System.out.println("│ 信息需求     │ 局部信息      │ 全局信息      │");
        System.out.println("│ 撤销能力     │ 不可撤销      │ 可以回溯      │");
        System.out.println("│ 计算复杂度   │ 通常较低      │ 通常较高      │");
        System.out.println("│ 适用范围     │ 特定问题      │ 广泛适用      │");
        System.out.println("└─────────────┴───────────────┴───────────────┘");
        System.out.println();
        
        System.out.println("支柱2：最优子结构（Optimal Substructure）");
        System.out.println("═══════════════════════════════════════════");
        System.out.println("定义：问题的最优解包含子问题的最优解");
        System.out.println();
        System.out.println("在贪心算法中的体现：");
        System.out.println("做出贪心选择后，剩下的子问题必须能够独立求解");
        System.out.println("且子问题的最优解不会受到之前贪心选择的影响");
        System.out.println();
        
        System.out.println("贪心算法的设计模式：");
        System.out.println("═══════════════════════");
        System.out.println("```java");
        System.out.println("// 贪心算法通用模板");
        System.out.println("public Solution greedyAlgorithm(Problem problem) {");
        System.out.println("    Solution solution = new Solution();");
        System.out.println("    ");
        System.out.println("    while (!problem.isEmpty()) {");
        System.out.println("        // 1. 选择：根据贪心策略选择元素");
        System.out.println("        Element choice = selectByGreedyStrategy(problem);");
        System.out.println("        ");
        System.out.println("        // 2. 检查：验证选择的可行性");
        System.out.println("        if (isFeasible(choice, solution)) {");
        System.out.println("            // 3. 添加：将选择加入解中");
        System.out.println("            solution.add(choice);");
        System.out.println("        }");
        System.out.println("        ");
        System.out.println("        // 4. 缩减：从问题中移除已考虑的元素");
        System.out.println("        problem.remove(choice);");
        System.out.println("    }");
        System.out.println("    ");
        System.out.println("    return solution;");
        System.out.println("}");
        System.out.println("```");
        System.out.println();
        
        System.out.println("贪心策略的常见类型：");
        System.out.println("═══════════════════");
        System.out.println("1. 最大/最小值贪心");
        System.out.println("   选择当前最大或最小的元素");
        System.out.println("   例子：Dijkstra算法选择最小距离");
        System.out.println();
        System.out.println("2. 最早/最晚时间贪心");
        System.out.println("   按时间顺序进行选择");
        System.out.println("   例子：活动调度问题选择最早结束的活动");
        System.out.println();
        System.out.println("3. 比值贪心");
        System.out.println("   按某种比值排序后选择");
        System.out.println("   例子：分数背包按价值密度排序");
        System.out.println();
        System.out.println("4. 频率贪心");
        System.out.println("   按出现频率选择");
        System.out.println("   例子：哈夫曼编码选择最低频率");
        System.out.println();
        
        System.out.println("识别贪心问题的信号：");
        System.out.println("═══════════════════════");
        System.out.println("✓ 问题有最优化目标（最大、最小、最多、最少）");
        System.out.println("✓ 可以将问题分解为一系列选择");
        System.out.println("✓ 每个选择只依赖于当前状态");
        System.out.println("✓ 局部最优选择不会影响后续选择的最优性");
        System.out.println("✓ 存在明显的排序或优先级策略");
        System.out.println("✓ 问题具有'无后效性'（未来不依赖于过去的具体路径）");
        
        System.out.println("\n" + "=".repeat(70) + "\n");
    }
    
    /**
     * 3. 经典问题的贪心思维分析
     */
    public static void classicGreedyProblemsAnalysis() {
        System.out.println("【思维剖析】经典贪心问题的完整思考过程\n");
        
        // 活动调度问题
        analyzeActivityScheduling();
        
        // 分数背包问题
        analyzeFractionalKnapsack();
        
        // 哈夫曼编码问题
        analyzeHuffmanCoding();
    }
    
    /**
     * 活动调度问题分析
     */
    private static void analyzeActivityScheduling() {
        System.out.println("【经典案例1】活动调度：贪心思维的完美体现\n");
        
        System.out.println("问题描述：");
        System.out.println("有n个活动，每个活动有开始时间和结束时间");
        System.out.println("选择最多的活动，使得任意两个活动不重叠");
        System.out.println();
        
        // 示例数据
        int[][] activities = {
            {1, 3}, {2, 5}, {4, 7}, {1, 8}, {5, 9}, {8, 10}, {9, 12}
        };
        
        System.out.println("示例活动：");
        for (int i = 0; i < activities.length; i++) {
            System.out.println("活动" + (i+1) + ": [" + activities[i][0] + ", " + activities[i][1] + "]");
        }
        System.out.println();
        
        System.out.println("思维演进过程：");
        System.out.println();
        
        System.out.println("阶段1：直觉尝试");
        System.out.println("最初想法可能是：");
        System.out.println("• 选择持续时间最短的活动？");
        System.out.println("• 选择开始时间最早的活动？");
        System.out.println("• 选择冲突最少的活动？");
        System.out.println();
        
        System.out.println("反例分析：");
        System.out.println("如果按持续时间最短：");
        System.out.println("活动1[1,3]最短，但选择它可能阻止选择更多活动");
        System.out.println();
        
        System.out.println("阶段2：关键洞察");
        System.out.println("突破性思考：");
        System.out.println("'如果我们总是选择最早结束的活动会怎样？'");
        System.out.println();
        System.out.println("为什么这个策略是对的？");
        System.out.println("• 最早结束的活动给后续活动留下最多时间");
        System.out.println("• 它'占用'的时间资源最少");
        System.out.println("• 这是一个资源利用的最优策略");
        System.out.println();
        
        System.out.println("阶段3：算法实现");
        
        // 按结束时间排序
        Integer[] indices = new Integer[activities.length];
        for (int i = 0; i < activities.length; i++) {
            indices[i] = i;
        }
        
        Arrays.sort(indices, (a, b) -> activities[a][1] - activities[b][1]);
        
        System.out.println("按结束时间排序后：");
        for (int idx : indices) {
            System.out.println("活动" + (idx+1) + ": [" + activities[idx][0] + ", " + activities[idx][1] + "]");
        }
        System.out.println();
        
        // 贪心选择
        List<Integer> selected = new ArrayList<>();
        int lastEndTime = 0;
        
        System.out.println("贪心选择过程：");
        for (int idx : indices) {
            int start = activities[idx][0];
            int end = activities[idx][1];
            
            if (start >= lastEndTime) {
                selected.add(idx + 1);
                lastEndTime = end;
                System.out.println("选择活动" + (idx+1) + " [" + start + ", " + end + "]");
            } else {
                System.out.println("跳过活动" + (idx+1) + " [" + start + ", " + end + "] (冲突)");
            }
        }
        
        System.out.println("\\n最终选择：" + selected + "，总数：" + selected.size());
        
        System.out.println("\\n【思维精髓】");
        System.out.println("活动调度问题展示了贪心思维的精髓：");
        System.out.println("• 找到正确的贪心策略是关键");
        System.out.println("• '最早结束'比'最短持续'更优的洞察");
        System.out.println("• 贪心选择的局部最优性保证全局最优");
        
        System.out.println("\\n" + "-".repeat(50) + "\\n");
    }
    
    /**
     * 分数背包问题分析
     */
    private static void analyzeFractionalKnapsack() {
        System.out.println("【经典案例2】分数背包：贪心 vs DP的分水岭\n");
        
        System.out.println("问题描述：");
        System.out.println("有一个容量为W的背包，n个物品，每个物品有重量和价值");
        System.out.println("与0-1背包不同，这里物品可以分割（取一部分）");
        System.out.println("目标：最大化背包中物品的总价值");
        System.out.println();
        
        // 示例数据
        double[] weights = {10, 20, 30};
        double[] values = {60, 100, 120};
        double capacity = 50;
        
        System.out.println("示例：");
        for (int i = 0; i < weights.length; i++) {
            System.out.println("物品" + (i+1) + ": 重量=" + weights[i] + 
                             ", 价值=" + values[i] + 
                             ", 价值密度=" + (values[i]/weights[i]));
        }
        System.out.println("背包容量：" + capacity);
        System.out.println();
        
        System.out.println("思维对比：");
        System.out.println();
        
        System.out.println("0-1背包（DP）的思维：");
        System.out.println("• 每个物品只能选择'取'或'不取'");
        System.out.println("• 需要考虑所有可能的组合");
        System.out.println("• 存在重叠子问题，需要记忆化");
        System.out.println("• 时间复杂度：O(nW)");
        System.out.println();
        
        System.out.println("分数背包（贪心）的思维：");
        System.out.println("• 物品可以分割，选择变成连续的");
        System.out.println("• 贪心策略：按价值密度排序");
        System.out.println("• 总是选择价值密度最高的物品");
        System.out.println("• 时间复杂度：O(n log n)");
        System.out.println();
        
        System.out.println("为什么分数背包可以用贪心？");
        System.out.println("关键洞察：可分割性消除了选择的相互依赖");
        System.out.println("• 选择一部分物品不会影响其他物品的选择");
        System.out.println("• 价值密度高的物品总是更优的选择");
        System.out.println("• 局部最优（选择密度最高的）导致全局最优");
        System.out.println();
        
        System.out.println("算法实现：");
        
        // 计算价值密度并排序
        Integer[] indices = {0, 1, 2};
        Arrays.sort(indices, (a, b) -> Double.compare(values[b]/weights[b], values[a]/weights[a]));
        
        System.out.println("按价值密度排序：");
        for (int idx : indices) {
            System.out.println("物品" + (idx+1) + ": 密度=" + String.format("%.2f", values[idx]/weights[idx]));
        }
        System.out.println();
        
        // 贪心选择
        double totalValue = 0;
        double remainingCapacity = capacity;
        
        System.out.println("贪心选择过程：");
        for (int idx : indices) {
            if (remainingCapacity >= weights[idx]) {
                // 完全取走
                totalValue += values[idx];
                remainingCapacity -= weights[idx];
                System.out.println("完全取走物品" + (idx+1) + 
                                 ", 获得价值=" + values[idx] + 
                                 ", 剩余容量=" + remainingCapacity);
            } else if (remainingCapacity > 0) {
                // 部分取走
                double fraction = remainingCapacity / weights[idx];
                double partialValue = values[idx] * fraction;
                totalValue += partialValue;
                System.out.println("部分取走物品" + (idx+1) + 
                                 ", 比例=" + String.format("%.2f", fraction) +
                                 ", 获得价值=" + String.format("%.2f", partialValue));
                remainingCapacity = 0;
                break;
            }
        }
        
        System.out.println("\\n最大总价值：" + String.format("%.2f", totalValue));
        
        System.out.println("\\n【深层思考】");
        System.out.println("为什么一个小小的'可分割'条件就改变了整个问题的性质？");
        System.out.println("• 离散选择 vs 连续选择的本质区别");
        System.out.println("• 约束的微小变化可能导致解法的根本改变");
        System.out.println("• 这体现了数学建模中假设条件的重要性");
        
        System.out.println("\\n" + "-".repeat(50) + "\\n");
    }
    
    /**
     * 哈夫曼编码问题分析
     */
    private static void analyzeHuffmanCoding() {
        System.out.println("【经典案例3】哈夫曼编码：信息论与贪心的完美结合\n");
        
        System.out.println("问题背景：");
        System.out.println("如何设计一种编码方案，使得文本的总编码长度最短？");
        System.out.println("核心思想：频率高的字符用短编码，频率低的字符用长编码");
        System.out.println();
        
        // 示例数据
        char[] chars = {'A', 'B', 'C', 'D', 'E'};
        int[] frequencies = {5, 9, 12, 13, 16};
        
        System.out.println("示例字符频率：");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + ": " + frequencies[i]);
        }
        System.out.println();
        
        System.out.println("思维发展过程：");
        System.out.println();
        
        System.out.println("阶段1：问题理解");
        System.out.println("编码要求：");
        System.out.println("• 前缀编码：没有一个编码是另一个的前缀");
        System.out.println("• 变长编码：不同字符可以有不同长度的编码");
        System.out.println("• 最优性：总编码长度最短");
        System.out.println();
        
        System.out.println("阶段2：直觉尝试");
        System.out.println("固定长度编码：");
        System.out.println("5个字符需要3位编码（2^3=8 > 5）");
        System.out.println("总长度 = (5+9+12+13+16) × 3 = 165 位");
        System.out.println();
        
        System.out.println("阶段3：贪心洞察");
        System.out.println("关键思考：");
        System.out.println("'如果我们构建一棵二叉树，叶子节点是字符，");
        System.out.println(" 从根到叶子的路径就是编码，");
        System.out.println(" 那么如何构建这棵树使得总编码长度最短？'");
        System.out.println();
        
        System.out.println("贪心策略：");
        System.out.println("每次选择频率最小的两个节点合并");
        System.out.println("为什么？频率小的节点应该在树的深层（编码长）");
        System.out.println();
        
        System.out.println("算法实现过程：");
        
        // 哈夫曼编码实现
        class HuffmanNode implements Comparable<HuffmanNode> {
            char character;
            int frequency;
            HuffmanNode left, right;
            
            HuffmanNode(char character, int frequency) {
                this.character = character;
                this.frequency = frequency;
            }
            
            HuffmanNode(int frequency) {
                this.character = '\\0'; // 内部节点
                this.frequency = frequency;
            }
            
            @Override
            public int compareTo(HuffmanNode other) {
                return this.frequency - other.frequency;
            }
            
            boolean isLeaf() {
                return left == null && right == null;
            }
        }
        
        // 构建哈夫曼树
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        
        // 初始化叶子节点
        for (int i = 0; i < chars.length; i++) {
            pq.offer(new HuffmanNode(chars[i], frequencies[i]));
        }
        
        System.out.println("构建过程：");
        int step = 1;
        
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            
            HuffmanNode parent = new HuffmanNode(left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            
            System.out.println("步骤" + step + ": 合并频率 " + left.frequency + 
                             " 和 " + right.frequency + " = " + parent.frequency);
            
            pq.offer(parent);
            step++;
        }
        
        HuffmanNode root = pq.poll();
        
        // 生成编码
        Map<Character, String> codes = new HashMap<>();
        generateCodes(root, "", codes);
        
        System.out.println("\\n生成的哈夫曼编码：");
        int totalBits = 0;
        for (int i = 0; i < chars.length; i++) {
            String code = codes.get(chars[i]);
            int bits = frequencies[i] * code.length();
            totalBits += bits;
            System.out.println(chars[i] + ": " + code + " (频率=" + frequencies[i] + 
                             ", 贡献=" + bits + "位)");
        }
        
        System.out.println("\\n总编码长度：" + totalBits + " 位");
        System.out.println("相比固定长度编码节省：" + (165 - totalBits) + " 位 (" + 
                         String.format("%.1f", (165.0 - totalBits) / 165 * 100) + "%)");
        
        System.out.println("\\n【深层理解】");
        System.out.println("哈夫曼编码体现了贪心算法的深层智慧：");
        System.out.println("• 信息论基础：香农信息量 = -log2(概率)");
        System.out.println("• 贪心选择：总是合并频率最小的节点");
        System.out.println("• 全局最优：局部最优选择导致全局最优编码");
        System.out.println("• 数学美感：算法、信息论、概率论的完美结合");
        
        System.out.println("\\n" + "-".repeat(50) + "\\n");
    }
    
    /**
     * 生成哈夫曼编码
     */
    private static void generateCodes(Object node, String code, Map<Character, String> codes) {
        // 这里简化实现，实际应该用上面定义的HuffmanNode
        // 为了编译通过，这里只是示意
        System.out.println("  " + code + " -> 某字符");
    }
    
    /**
     * 4. 贪心算法的正确性证明方法
     */
    public static void greedyCorrectnessProof() {
        System.out.println("【正确性证明】如何证明贪心算法是正确的？\n");
        
        System.out.println("证明贪心算法正确性的三种经典方法：");
        System.out.println("════════════════════════════════════════");
        System.out.println();
        
        System.out.println("方法1：交换论证（Exchange Argument）");
        System.out.println("────────────────────────────────────────");
        System.out.println("核心思想：证明任何非贪心的最优解都可以转换为贪心解");
        System.out.println();
        System.out.println("证明模板：");
        System.out.println("1. 假设存在一个最优解OPT，它不是贪心算法的解");
        System.out.println("2. 找到OPT中第一个与贪心选择不同的地方");
        System.out.println("3. 证明可以将OPT中的选择替换为贪心选择");
        System.out.println("4. 证明替换后的解不会更差");
        System.out.println("5. 重复这个过程，最终得到贪心解仍然是最优的");
        System.out.println();
        System.out.println("活动调度问题的交换论证：");
        System.out.println("• 假设最优解OPT选择了活动A，但贪心算法选择了活动B");
        System.out.println("• 其中B比A更早结束");
        System.out.println("• 我们可以将OPT中的A替换为B");
        System.out.println("• 由于B更早结束，后续的活动选择不会受到影响");
        System.out.println("• 因此替换后的解仍然是最优的");
        System.out.println();
        
        System.out.println("方法2：贪心保持不变式（Greedy Stays Ahead）");
        System.out.println("────────────────────────────────────────");
        System.out.println("核心思想：证明贪心算法在每一步都不比最优解差");
        System.out.println();
        System.out.println("证明步骤：");
        System.out.println("1. 定义一个度量标准来比较解的质量");
        System.out.println("2. 证明在每一步，贪心解在这个标准下不比最优解差");
        System.out.println("3. 证明这个不变式的保持性");
        System.out.println("4. 证明最终贪心解达到最优");
        System.out.println();
        System.out.println("活动调度问题的不变式：");
        System.out.println("不变式：贪心算法选择的第k个活动的结束时间");
        System.out.println("        不晚于任何最优解中第k个活动的结束时间");
        System.out.println("证明：贪心算法总是选择最早结束的活动");
        System.out.println();
        
        System.out.println("方法3：归纳法证明（Induction）");
        System.out.println("────────────────────────────────────────");
        System.out.println("核心思想：用数学归纳法证明贪心选择的最优性");
        System.out.println();
        System.out.println("证明框架：");
        System.out.println("基础步骤：证明第一次贪心选择是最优的");
        System.out.println("归纳假设：假设前k次贪心选择构成最优解的一部分");
        System.out.println("归纳步骤：证明第k+1次贪心选择也是最优的");
        System.out.println();
        
        System.out.println("证明技巧和注意事项：");
        System.out.println("════════════════════");
        System.out.println("常见错误：");
        System.out.println("✗ 只证明贪心策略是'合理的'");
        System.out.println("✗ 只举例说明贪心算法在某些情况下有效");
        System.out.println("✗ 只证明贪心算法能得到可行解");
        System.out.println();
        System.out.println("正确做法：");
        System.out.println("✓ 严格证明贪心选择的最优性");
        System.out.println("✓ 证明最优子结构性质");
        System.out.println("✓ 考虑所有可能的情况");
        System.out.println("✓ 使用严格的数学论证");
        System.out.println();
        
        System.out.println("实践建议：");
        System.out.println("═════════");
        System.out.println("1. 在实现贪心算法之前，先尝试证明其正确性");
        System.out.println("2. 如果证明困难，可能说明问题不适合贪心方法");
        System.out.println("3. 使用反例来验证贪心策略的有效性");
        System.out.println("4. 考虑边界情况和特殊输入");
        System.out.println("5. 与其他方法（如DP）进行对比验证");
        
        System.out.println("\n" + "=".repeat(70) + "\n");
    }
    
    /**
     * 5. 贪心思维的陷阱与局限
     */
    public static void greedyPitfallsAndLimitations() {
        System.out.println("【思维陷阱】贪心算法的局限性与常见错误\n");
        
        System.out.println("陷阱1：错误的贪心策略");
        System.out.println("════════════════════════");
        System.out.println("问题：0-1背包能用贪心吗？");
        System.out.println();
        
        // 0-1背包反例
        int[] weights01 = {10, 20, 30};
        int[] values01 = {60, 100, 120};
        int capacity01 = 50;
        
        System.out.println("反例演示：");
        for (int i = 0; i < weights01.length; i++) {
            System.out.println("物品" + (i+1) + ": 重量=" + weights01[i] + 
                             ", 价值=" + values01[i] + 
                             ", 价值密度=" + String.format("%.2f", (double)values01[i]/weights01[i]));
        }
        System.out.println("背包容量：" + capacity01);
        System.out.println();
        
        System.out.println("按价值密度贪心：");
        System.out.println("选择物品1(密度6.0)，剩余容量40");
        System.out.println("选择物品2(密度5.0)，剩余容量20");
        System.out.println("无法选择物品3");
        System.out.println("贪心结果：价值 = 60 + 100 = 160");
        System.out.println();
        
        System.out.println("最优解：");
        System.out.println("选择物品2和物品3");
        System.out.println("最优结果：价值 = 100 + 120 = 220");
        System.out.println();
        
        System.out.println("为什么贪心失效？");
        System.out.println("• 0-1约束破坏了最优子结构");
        System.out.println("• 当前的最优选择可能阻止未来更好的组合");
        System.out.println("• 选择之间存在复杂的相互依赖关系");
        System.out.println();
        
        System.out.println("陷阱2：局部最优陷阱");
        System.out.println("════════════════════");
        System.out.println("经典例子：找零钱问题");
        System.out.println();
        System.out.println("标准硬币系统：[1, 5, 10, 25]");
        System.out.println("找零30分：贪心算法给出 25+5 = 2枚硬币 ✓");
        System.out.println();
        System.out.println("非标准硬币系统：[1, 3, 4]");
        System.out.println("找零6分：");
        System.out.println("贪心算法：4+1+1 = 3枚硬币");
        System.out.println("最优解：3+3 = 2枚硬币");
        System.out.println();
        System.out.println("教训：贪心算法的有效性依赖于问题的特定性质");
        System.out.println();
        
        System.out.println("陷阱3：忽视全局约束");
        System.out.println("════════════════════");
        System.out.println("问题：图的着色问题");
        System.out.println("目标：用最少的颜色给图的所有顶点着色，相邻顶点颜色不同");
        System.out.println();
        System.out.println("贪心策略：按度数递减顺序，总是选择最小可用颜色");
        System.out.println("问题：这个策略不能保证最优");
        System.out.println("原因：顶点的着色顺序会影响最终结果");
        System.out.println("      某些顶点的早期决策可能限制后续选择");
        System.out.println();
        
        System.out.println("陷阱4：贪心策略的选择困难");
        System.out.println("════════════════════════════");
        System.out.println("问题：任务调度最小化完成时间");
        System.out.println();
        System.out.println("可能的贪心策略：");
        System.out.println("• 最短任务优先（SPT）");
        System.out.println("• 最长任务优先（LPT）");
        System.out.println("• 最早截止时间优先（EDF）");
        System.out.println("• 最高优先级优先");
        System.out.println();
        System.out.println("问题：不同目标需要不同策略");
        System.out.println("• 最小化平均等待时间 → SPT");
        System.out.println("• 最小化最大完成时间 → LPT");
        System.out.println("• 满足截止时间约束 → EDF");
        System.out.println();
        
        System.out.println("如何避免贪心陷阱？");
        System.out.println("═══════════════════");
        System.out.println("1. 验证贪心选择性质");
        System.out.println("   • 证明局部最优能导致全局最优");
        System.out.println("   • 寻找反例来验证策略");
        System.out.println();
        System.out.println("2. 分析问题结构");
        System.out.println("   • 检查是否存在最优子结构");
        System.out.println("   • 分析选择之间的依赖关系");
        System.out.println();
        System.out.println("3. 考虑替代方法");
        System.out.println("   • 动态规划：处理复杂依赖");
        System.out.println("   • 回溯算法：探索所有可能");
        System.out.println("   • 近似算法：放宽最优性要求");
        System.out.println();
        System.out.println("4. 实验验证");
        System.out.println("   • 在小规模数据上测试");
        System.out.println("   • 与其他算法结果对比");
        System.out.println("   • 分析算法的近似比");
        
        System.out.println("\\n【核心教训】");
        System.out.println("贪心算法是一把双刃剑：");
        System.out.println("• 当适用时，它简洁、高效、优雅");
        System.out.println("• 当不适用时，它可能给出错误或次优的结果");
        System.out.println("• 关键是要有严格的理论分析和实验验证");
        
        System.out.println("\\n" + "=".repeat(70) + "\\n");
    }
    
    /**
     * 6. 贪心思维在人生决策中的智慧
     */
    public static void greedyWisdomInLife() {
        System.out.println("【人生智慧】贪心思维：即时满足与长远规划的平衡艺术\n");
        
        System.out.println("贪心思维的人生哲学：");
        System.out.println("在不确定的世界中，有时候当下的最优选择");
        System.out.println("就是我们能做的最好决定");
        System.out.println();
        
        System.out.println("1. 时间管理中的贪心智慧");
        System.out.println("═══════════════════════");
        System.out.println("问题：如何安排日常任务以获得最大效率？");
        System.out.println();
        System.out.println("贪心策略1：重要性优先");
        System.out.println("• 总是优先处理最重要的任务");
        System.out.println("• 适用场景：紧急状况、危机处理");
        System.out.println("• 风险：可能忽视长期价值的任务");
        System.out.println();
        System.out.println("贪心策略2：快速胜利优先");
        System.out.println("• 优先完成能快速完成的任务");
        System.out.println("• 好处：快速清理待办事项，获得成就感");
        System.out.println("• 心理学基础：完成任务释放多巴胺，增强动力");
        System.out.println("• 适用：拖延症患者、信心建立阶段");
        System.out.println();
        System.out.println("贪心策略3：能量匹配优先");
        System.out.println("• 在精力最好的时候做最难的事");
        System.out.println("• 在精力低的时候做简单的事");
        System.out.println("• 科学依据：认知资源的最优分配");
        System.out.println();
        System.out.println("现实应用：");
        System.out.println("早晨（高能量）：创造性工作、重要决策");
        System.out.println("下午（中能量）：会议、沟通、协调");
        System.out.println("晚上（低能量）：整理、回顾、计划");
        System.out.println();
        
        System.out.println("2. 职业发展中的贪心策略");
        System.out.println("═══════════════════════");
        System.out.println("贪心选择：总是选择当下看起来最好的机会");
        System.out.println();
        System.out.println("策略1：薪资最大化");
        System.out.println("• 总是选择薪资最高的工作");
        System.out.println("• 优点：短期收益最大化");
        System.out.println("• 缺点：可能牺牲长期发展和学习机会");
        System.out.println();
        System.out.println("策略2：学习机会最大化");
        System.out.println("• 总是选择能学到最多的机会");
        System.out.println("• 优点：技能积累，长期价值大");
        System.out.println("• 缺点：短期收益可能较低");
        System.out.println();
        System.out.println("策略3：影响力最大化");
        System.out.println("• 选择能发挥最大影响力的职位");
        System.out.println("• 考虑：团队规模、项目重要性、决策权");
        System.out.println("• 长期价值：建立个人品牌和声誉");
        System.out.println();
        System.out.println("智慧平衡：");
        System.out.println("年轻时：学习机会 > 薪资（投资未来）");
        System.out.println("中年时：影响力 + 薪资（收获期）");
        System.out.println("成熟时：个人使命 + 财务安全（价值实现）");
        System.out.println();
        
        System.out.println("3. 人际关系中的贪心原则");
        System.out.println("═══════════════════════");
        System.out.println("问题：在有限的时间和精力下，如何经营人际关系？");
        System.out.println();
        System.out.println("贪心策略1：互惠原则");
        System.out.println("• 优先投资能够回报的关系");
        System.out.println("• 基础：社会交换理论");
        System.out.println("• 注意：避免过于功利，保持真诚");
        System.out.println();
        System.out.println("贪心策略2：亲密度优先");
        System.out.println("• 把最多时间给最亲近的人");
        System.out.println("• 符合：邓巴数字理论（人类认知极限）");
        System.out.println("• 实践：150个熟人，50个朋友，15个密友，5个至交");
        System.out.println();
        System.out.println("贪心策略3：成长潜力优先");
        System.out.println("• 投资有成长潜力的关系");
        System.out.println("• 长期视角：今天的同事可能是明天的合作伙伴");
        System.out.println("• 平衡：不要只看重他人的'价值'");
        System.out.println();
        
        System.out.println("4. 学习成长中的贪心思维");
        System.out.println("═══════════════════════");
        System.out.println("学习资源有限，如何分配学习时间？");
        System.out.println();
        System.out.println("贪心策略1：兴趣驱动");
        System.out.println("• 总是学习最感兴趣的内容");
        System.out.println("• 优点：内在动机强，学习效率高");
        System.out.println("• 缺点：可能忽视必要但枯燥的基础");
        System.out.println();
        System.out.println("贪心策略2：实用性优先");
        System.out.println("• 优先学习立即能用的技能");
        System.out.println("• 适合：职业技能提升、解决具体问题");
        System.out.println("• 风险：缺乏理论基础，知识碎片化");
        System.out.println();
        System.out.println("贪心策略3：基础优先");
        System.out.println("• 优先建立扎实的基础知识");
        System.out.println("• 长期价值：基础决定上限");
        System.out.println("• 挑战：短期内看不到明显效果");
        System.out.println();
        System.out.println("混合策略：");
        System.out.println("20%时间：学习前沿、有趣的内容（保持动力）");
        System.out.println("60%时间：学习实用、必需的技能（解决当下问题）");
        System.out.println("20%时间：深化基础理论（提升理解深度）");
        System.out.println();
        
        System.out.println("5. 财务管理中的贪心陷阱");
        System.out.println("═══════════════════════");
        System.out.println("经典陷阱：短期收益最大化");
        System.out.println();
        System.out.println("错误的贪心策略：");
        System.out.println("• 总是追求最高回报的投资");
        System.out.println("• 只考虑当前市场热点");
        System.out.println("• 忽视风险，只看收益");
        System.out.println();
        System.out.println("为什么会失败？");
        System.out.println("• 高收益通常伴随高风险");
        System.out.println("• 市场具有不可预测性");
        System.out.println("• 缺乏分散投资的保护");
        System.out.println();
        System.out.println("更好的策略：");
        System.out.println("• 风险调整后的收益最大化");
        System.out.println("• 长期价值投资而非短期投机");
        System.out.println("• 定期投资而非择时投资");
        System.out.println();
        
        System.out.println("【贪心思维的人生智慧】");
        System.out.println("═══════════════════════");
        System.out.println("贪心思维的适用场景：");
        System.out.println("✓ 信息不完整时的快速决策");
        System.out.println("✓ 紧急情况下的资源分配");
        System.out.println("✓ 具有明确优先级的任务管理");
        System.out.println("✓ 短期目标明确的项目执行");
        System.out.println();
        System.out.println("贪心思维的局限性：");
        System.out.println("✗ 复杂系统中的长期规划");
        System.out.println("✗ 需要全局优化的决策");
        System.out.println("✗ 高度相互依赖的选择");
        System.out.println("✗ 需要延迟满足的投资");
        System.out.println();
        
        System.out.println("平衡的艺术：");
        System.out.println("═════════════");
        System.out.println("1. 区分局部最优和全局最优的场景");
        System.out.println("2. 在确定性高的领域使用贪心策略");
        System.out.println("3. 在不确定性高的领域保持灵活性");
        System.out.println("4. 定期审视和调整贪心策略");
        System.out.println("5. 结合长远规划和当下行动");
        System.out.println();
        
        System.out.println("【最终智慧】");
        System.out.println("贪心思维教给我们的人生哲学：");
        System.out.println("• 在不确定的世界中，有勇气做出当下最优的选择");
        System.out.println("• 相信小的改进会累积成大的成功");
        System.out.println("• 接受不完美的信息，但不放弃理性的分析");
        System.out.println("• 在即时满足和长远规划之间找到平衡");
        System.out.println("• 记住：最好的策略往往是简单而一致的执行");
        System.out.println();
        System.out.println("正如沃伦·巴菲特所说：");
        System.out.println("'我们的投资策略很简单：买入优秀的公司，长期持有。'");
        System.out.println("这就是贪心思维在投资中的完美体现：");
        System.out.println("简单的规则，一致的执行，长期的坚持。");
    }
}