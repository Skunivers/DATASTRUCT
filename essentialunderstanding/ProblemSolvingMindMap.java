package essentialunderstanding;
/**
 * 第二课：从问题到解决方案的思维导图
 * 
 * 让我们建立一个系统的思维框架，帮助你在遇到问题时知道该用什么
 */
public class ProblemSolvingMindMap {
    
    public static void main(String[] args) {
        System.out.println("=== 从问题到解决方案的思维导图 ===\n");
        
        // 展示完整的思维流程
        showThinkingProcess();
        
        // 常见问题类型映射
        commonProblemPatterns();
        
        // 实战案例分析
        realWorldExamples();
        
        // 练习：培养模式识别能力
        practicePatternRecognition();
    }
    
    /**
     * 展示解决问题的思维流程
     */
    public static void showThinkingProcess() {
        System.out.println("【思维流程图】如何从问题到解决方案\n");
        
        System.out.println("第1步：理解问题本质");
        System.out.println("├─ 输入是什么？（数据类型、数据量、数据特征）");
        System.out.println("├─ 输出是什么？（期望结果、格式要求）");
        System.out.println("├─ 约束是什么？（时间限制、空间限制、其他限制）");
        System.out.println("└─ 核心操作是什么？（查找、排序、计算、转换）");
        System.out.println();
        
        System.out.println("第2步：识别问题模式");
        System.out.println("├─ 数据关系模式");
        System.out.println("│  ├─ 线性关系 → 考虑数组、链表、栈、队列");
        System.out.println("│  ├─ 层次关系 → 考虑树、堆");
        System.out.println("│  ├─ 网络关系 → 考虑图");
        System.out.println("│  └─ 映射关系 → 考虑哈希表");
        System.out.println("│");
        System.out.println("├─ 操作需求模式");
        System.out.println("│  ├─ 频繁查找 → 优化查找效率");
        System.out.println("│  ├─ 频繁修改 → 优化修改效率");
        System.out.println("│  ├─ 保持顺序 → 考虑有序结构");
        System.out.println("│  └─ 优先处理 → 考虑优先队列");
        System.out.println("│");
        System.out.println("└─ 算法思路模式");
        System.out.println("   ├─ 需要比较 → 排序、查找算法");
        System.out.println("   ├─ 需要优化 → 贪心、动态规划");
        System.out.println("   ├─ 需要遍历 → DFS、BFS");
        System.out.println("   └─ 需要分解 → 分治、递归");
        System.out.println();
        
        System.out.println("第3步：选择合适方案");
        System.out.println("├─ 评估时间复杂度");
        System.out.println("├─ 评估空间复杂度");
        System.out.println("├─ 考虑实现难度");
        System.out.println("└─ 权衡利弊得失");
        System.out.println();
        
        System.out.println("第4步：实现与优化");
        System.out.println("├─ 先实现基础版本");
        System.out.println("├─ 测试边界情况");
        System.out.println("├─ 分析性能瓶颈");
        System.out.println("└─ 逐步优化改进");
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * 常见问题模式及其解决方案映射
     */
    public static void commonProblemPatterns() {
        System.out.println("【模式识别】常见问题 → 数据结构/算法 映射\n");
        
        System.out.println("1. 查找类问题");
        System.out.println("   ├─ 无序数据查找");
        System.out.println("   │  └─ 方案：哈希表 O(1) 或 遍历 O(n)");
        System.out.println("   ├─ 有序数据查找");
        System.out.println("   │  └─ 方案：二分查找 O(logn)");
        System.out.println("   └─ 范围查找/最值查找");
        System.out.println("      └─ 方案：线段树、堆、BST");
        System.out.println();
        
        System.out.println("2. 排序类问题");
        System.out.println("   ├─ 完全排序");
        System.out.println("   │  ├─ 小数据量：插入排序 O(n²)");
        System.out.println("   │  └─ 大数据量：快排/归并 O(nlogn)");
        System.out.println("   └─ 部分排序（Top K）");
        System.out.println("      └─ 方案：堆 O(nlogk)");
        System.out.println();
        
        System.out.println("3. 动态维护类问题");
        System.out.println("   ├─ 先进先出");
        System.out.println("   │  └─ 方案：队列");
        System.out.println("   ├─ 后进先出");
        System.out.println("   │  └─ 方案：栈");
        System.out.println("   └─ 优先级处理");
        System.out.println("      └─ 方案：优先队列（堆）");
        System.out.println();
        
        System.out.println("4. 路径/连通类问题");
        System.out.println("   ├─ 最短路径");
        System.out.println("   │  └─ 方案：Dijkstra、BFS");
        System.out.println("   ├─ 所有路径");
        System.out.println("   │  └─ 方案：DFS、回溯");
        System.out.println("   └─ 连通性判断");
        System.out.println("      └─ 方案：并查集、DFS/BFS");
        System.out.println();
        
        System.out.println("5. 优化类问题");
        System.out.println("   ├─ 最优子结构");
        System.out.println("   │  └─ 方案：动态规划");
        System.out.println("   ├─ 局部最优");
        System.out.println("   │  └─ 方案：贪心算法");
        System.out.println("   └─ 组合优化");
        System.out.println("      └─ 方案：回溯、分支限界");
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * 实战案例：展示完整的思维过程
     */
    public static void realWorldExamples() {
        System.out.println("【实战案例】看看真实问题如何分析\n");
        
        // 案例1：设计一个音乐播放器
        System.out.println("案例1：设计音乐播放器的核心数据结构");
        System.out.println();
        System.out.println("问题分析：");
        System.out.println("• 需求1：播放列表（顺序播放）");
        System.out.println("  → 线性关系 → 使用数组或链表");
        System.out.println("• 需求2：播放历史（最近播放）");
        System.out.println("  → 后进先出 + 限制大小 → 使用栈或双端队列");
        System.out.println("• 需求3：快速搜索歌曲");
        System.out.println("  → 快速查找 → 使用哈希表（歌名→歌曲信息）");
        System.out.println("• 需求4：随机播放");
        System.out.println("  → 随机访问 → 使用数组 + 随机数");
        System.out.println();
        System.out.println("最终方案：");
        System.out.println("class MusicPlayer {");
        System.out.println("    ArrayList<Song> playlist;        // 播放列表");
        System.out.println("    Deque<Song> history;            // 播放历史");
        System.out.println("    HashMap<String, Song> songMap;   // 快速搜索");
        System.out.println("    int currentIndex;               // 当前播放位置");
        System.out.println("}");
        System.out.println();
        
        // 案例2：社交网络好友推荐
        System.out.println("案例2：社交网络的好友推荐系统");
        System.out.println();
        System.out.println("问题分析：");
        System.out.println("• 核心：用户之间的关系");
        System.out.println("  → 多对多关系 → 使用图结构");
        System.out.println("• 推荐逻辑：共同好友多的人");
        System.out.println("  → 需要遍历二度关系 → BFS遍历");
        System.out.println("• 性能要求：快速获取好友列表");
        System.out.println("  → 邻接表表示图");
        System.out.println();
        System.out.println("解决方案：");
        System.out.println("class SocialNetwork {");
        System.out.println("    // 邻接表：用户ID → 好友列表");
        System.out.println("    HashMap<Integer, HashSet<Integer>> friendsMap;");
        System.out.println("    ");
        System.out.println("    // BFS找出二度好友并按共同好友数排序");
        System.out.println("    List<Integer> recommendFriends(int userId) {");
        System.out.println("        // 使用BFS遍历二度关系");
        System.out.println("        // 统计共同好友数");
        System.out.println("        // 排序返回推荐列表");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * 练习：培养模式识别能力
     */
    public static void practicePatternRecognition() {
        System.out.println("【实践练习】培养你的模式识别能力\n");
        
        System.out.println("练习1：快速识别问题类型");
        System.out.println("看到这些关键词，你应该想到什么？");
        System.out.println();
        System.out.println("• \"查找第K大的元素\" → 堆/快速选择");
        System.out.println("• \"判断是否有环\" → 快慢指针/图遍历");
        System.out.println("• \"最长/最短路径\" → 动态规划/图算法");
        System.out.println("• \"括号匹配\" → 栈");
        System.out.println("• \"滑动窗口\" → 双指针/队列");
        System.out.println("• \"区间操作\" → 线段树/树状数组");
        System.out.println();
        
        System.out.println("练习2：场景分析练习");
        System.out.println("试着分析这些场景需要什么数据结构：");
        System.out.println();
        System.out.println("场景A：设计一个任务调度器");
        System.out.println("提示：任务有优先级，需要按优先级执行");
        System.out.println("答案：优先队列（最小堆）");
        System.out.println();
        System.out.println("场景B：实现撤销/重做功能");
        System.out.println("提示：需要记录操作历史，可以回退和前进");
        System.out.println("答案：两个栈（撤销栈 + 重做栈）");
        System.out.println();
        System.out.println("场景C：实现自动补全功能");
        System.out.println("提示：输入前缀，快速找到所有匹配的词");
        System.out.println("答案：前缀树（Trie）");
        System.out.println();
        
        System.out.println("【记住】");
        System.out.println("模式识别能力 = 大量练习 + 总结反思");
        System.out.println("每解决一个问题，都要问自己：");
        System.out.println("1. 这个问题的本质特征是什么？");
        System.out.println("2. 为什么选择这个数据结构/算法？");
        System.out.println("3. 还有其他解决方案吗？优缺点是什么？");
        System.out.println("4. 下次遇到类似问题，我能快速识别吗？");
        System.out.println();
        System.out.println("坚持这样思考，你的直觉就会越来越准！");
    }
}