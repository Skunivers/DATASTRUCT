/**
 * 数据结构与算法学习路径
 * 
 * 这是你的完整学习路径，建议按顺序学习
 * 每完成一个阶段，可以在这里做标记
 */
public class LearningPath {
    
    public static void main(String[] args) {
        System.out.println("=== 数据结构与算法学习路径 ===\n");
        
        printLearningPath();
        System.out.println();
        printCurrentStatus();
    }
    
    public static void printLearningPath() {
        System.out.println("📚 完整学习路径：");
        System.out.println();
        
        // 第一阶段：基础数据结构
        System.out.println("🎯 第一阶段：基础数据结构（2-3周）");
        System.out.println("   ✅ 第1课：数组基础与操作");
        System.out.println("   📋 第2课：字符串处理");
        System.out.println("   📋 第3课：链表入门");
        System.out.println("   📋 第4课：栈和队列");
        System.out.println("   📋 第5课：基础算法（排序与查找）");
        System.out.println();
        
        // 第二阶段：中级数据结构
        System.out.println("🎯 第二阶段：中级数据结构（3-4周）");
        System.out.println("   📋 第6课：树的基础概念");
        System.out.println("   📋 第7课：二叉树遍历");
        System.out.println("   📋 第8课：二叉搜索树");
        System.out.println("   📋 第9课：堆和优先队列");
        System.out.println("   📋 第10课：哈希表原理");
        System.out.println();
        
        // 第三阶段：高级数据结构
        System.out.println("🎯 第三阶段：高级数据结构（4-5周）");
        System.out.println("   📋 第11课：图的表示和遍历");
        System.out.println("   📋 第12课：图的算法（最短路径）");
        System.out.println("   📋 第13课：动态规划入门");
        System.out.println("   📋 第14课：贪心算法");
        System.out.println("   📋 第15课：分治算法");
        System.out.println();
        
        // 第四阶段：实际应用
        System.out.println("🎯 第四阶段：实际应用（3-4周）");
        System.out.println("   📋 第16课：字符串算法");
        System.out.println("   📋 第17课：数学算法");
        System.out.println("   📋 第18课：位运算技巧");
        System.out.println("   📋 第19课：系统设计基础");
        System.out.println("   📋 第20课：综合项目实战");
        System.out.println();
    }
    
    public static void printCurrentStatus() {
        System.out.println("📊 当前学习状态：");
        System.out.println();
        System.out.println("✅ 已完成：");
        System.out.println("   • 第1课：数组基础与操作");
        System.out.println("     - 文件：lessons/Lesson01_Arrays.java");
        System.out.println("     - 练习：exercises/ArrayExercises.java");
        System.out.println();
        
        System.out.println("🎯 建议下一步：");
        System.out.println("   1. 运行并理解第1课的代码");
        System.out.println("   2. 完成ArrayExercises.java中的练习题");
        System.out.println("   3. 尝试修改和扩展代码");
        System.out.println("   4. 准备学习第2课：字符串处理");
        System.out.println();
        
        System.out.println("💡 学习建议：");
        System.out.println("   • 每天学习1-2小时");
        System.out.println("   • 理论与实践相结合");
        System.out.println("   • 多写代码，多做练习");
        System.out.println("   • 遇到问题及时提问");
        System.out.println("   • 定期复习已学内容");
        System.out.println();
        
        System.out.println("🔧 如何运行代码：");
        System.out.println("   1. 编译：javac lessons/Lesson01_Arrays.java");
        System.out.println("   2. 运行：java -cp . lessons.Lesson01_Arrays");
        System.out.println("   3. 练习：javac exercises/ArrayExercises.java");
        System.out.println("   4. 运行练习：java -cp . exercises.ArrayExercises");
    }
    
    /**
     * 学习进度记录方法
     * 每完成一课，可以调用这个方法更新进度
     */
    public static void markLessonCompleted(int lessonNumber, String lessonName) {
        System.out.println("🎉 恭喜！你已完成第" + lessonNumber + "课：" + lessonName);
        System.out.println("   继续保持，向下一个目标进发！");
    }
    
    /**
     * 获取学习建议
     */
    public static void getStudyTips() {
        System.out.println("📝 学习小贴士：");
        System.out.println();
        System.out.println("1. 理解比记忆更重要");
        System.out.println("   不要死记硬背代码，要理解每行代码的作用");
        System.out.println();
        System.out.println("2. 画图帮助理解");
        System.out.println("   数据结构和算法最好用图来理解");
        System.out.println();
        System.out.println("3. 从简单开始");
        System.out.println("   每个概念都从最简单的例子开始学习");
        System.out.println();
        System.out.println("4. 多写多练");
        System.out.println("   纸上得来终觉浅，绝知此事要躬行");
        System.out.println();
        System.out.println("5. 总结归纳");
        System.out.println("   学完每个主题后，总结核心要点");
    }
}