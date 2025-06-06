package algorithm_thinking;

/**
 * 回溯算法：搜索策略的艺术
 * 
 * 探索回溯思维的本质：
 * - 从人类解决问题的试错过程理解回溯
 * - 搜索空间的系统性探索
 * - 剪枝的智慧与效率提升
 * - 回溯在人生决策中的应用
 */
public class BacktrackingSearchStrategy {
    
    public static void main(String[] args) {
        BacktrackingSearchStrategy strategy = new BacktrackingSearchStrategy();
        
        System.out.println("====== 回溯算法：搜索策略的艺术 ======\n");
        
        // 1. 回溯思维的起源
        strategy.understandBacktrackingOrigin();
        
        // 2. 回溯的核心要素
        strategy.analyzeBacktrackingElements();
        
        // 3. 经典问题深度剖析
        strategy.deepDiveClassicProblems();
        
        // 4. 剪枝策略的智慧
        strategy.explorePruningStrategies();
        
        // 5. 回溯与人生决策
        strategy.applyToLifeDecisions();
    }
    
    /**
     * 1. 理解回溯思维的起源
     */
    private void understandBacktrackingOrigin() {
        System.out.println("一、回溯思维的起源\n");
        
        System.out.println("1. 从迷宫问题看回溯本质：");
        System.out.println("想象你在一个迷宫中寻找出口...");
        System.out.println();
        
        // 可视化迷宫探索过程
        visualizeMazeExploration();
        
        System.out.println("\n2. 人类解决问题的自然方式：");
        System.out.println("- 尝试一条路径");
        System.out.println("- 遇到死路就退回");
        System.out.println("- 标记已经走过的路");
        System.out.println("- 尝试其他可能的路径");
        System.out.println();
        
        System.out.println("3. 回溯的哲学内涵：");
        System.out.println("『知错能改，善莫大焉』");
        System.out.println("- 承认错误不是失败，而是通向成功的必经之路");
        System.out.println("- 及时止损比一条路走到黑更有智慧");
        System.out.println("- 系统性试错比随机尝试更高效");
        System.out.println();
    }
    
    /**
     * 可视化迷宫探索过程
     */
    private void visualizeMazeExploration() {
        char[][] maze = {
            {'S', '□', '□', '■', '□'},
            {'□', '■', '□', '■', '□'},
            {'□', '■', '□', '□', '□'},
            {'□', '□', '■', '■', '□'},
            {'■', '□', '□', '□', 'E'}
        };
        
        System.out.println("迷宫布局（S:起点 E:终点 ■:墙 □:可走）：");
        printMaze(maze);
        
        System.out.println("\n探索过程：");
        // 简化的探索过程展示
        System.out.println("步骤1: 从S出发，向右探索");
        System.out.println("步骤2: 继续向右，遇到墙");
        System.out.println("步骤3: 回溯到上一个位置，尝试向下");
        System.out.println("步骤4: 继续探索...");
        System.out.println("（这就是回溯的核心思想）");
    }
    
    private void printMaze(char[][] maze) {
        for (char[] row : maze) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * 2. 分析回溯的核心要素
     */
    private void analyzeBacktrackingElements() {
        System.out.println("\n二、回溯算法的核心要素\n");
        
        System.out.println("1. 搜索空间（Solution Space）：");
        System.out.println("- 所有可能解的集合");
        System.out.println("- 通常用树结构表示");
        System.out.println("- 每个节点代表一个部分解");
        System.out.println();
        
        System.out.println("2. 约束条件（Constraints）：");
        System.out.println("- 可行解必须满足的条件");
        System.out.println("- 用于判断是否继续探索");
        System.out.println("- 违反约束立即回溯");
        System.out.println();
        
        System.out.println("3. 目标条件（Goal）：");
        System.out.println("- 判断是否找到解");
        System.out.println("- 可能是找到一个解");
        System.out.println("- 也可能是找到所有解");
        System.out.println();
        
        System.out.println("4. 回溯机制：");
        System.out.println("```");
        System.out.println("function backtrack(state) {");
        System.out.println("    if (是目标状态) {");
        System.out.println("        记录解;");
        System.out.println("        return;");
        System.out.println("    }");
        System.out.println("    ");
        System.out.println("    for (每个可能的选择) {");
        System.out.println("        if (选择满足约束) {");
        System.out.println("            做出选择;");
        System.out.println("            backtrack(新状态);");
        System.out.println("            撤销选择;  // 这是关键！");
        System.out.println("        }");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("```");
        System.out.println();
    }
    
    /**
     * 3. 经典问题深度剖析
     */
    private void deepDiveClassicProblems() {
        System.out.println("\n三、经典回溯问题深度剖析\n");
        
        // 3.1 N皇后问题
        analyzeNQueens();
        
        // 3.2 数独问题
        analyzeSudoku();
        
        // 3.3 组合总和问题
        analyzeCombinationSum();
    }
    
    /**
     * 分析N皇后问题
     */
    private void analyzeNQueens() {
        System.out.println("1. N皇后问题：");
        System.out.println("问题：在N×N棋盘上放置N个皇后，使得它们互不攻击");
        System.out.println();
        
        System.out.println("思考过程：");
        System.out.println("- 皇后可以攻击同行、同列、同对角线的棋子");
        System.out.println("- 每行必须且只能放一个皇后");
        System.out.println("- 按行遍历，每行尝试所有列");
        System.out.println();
        
        // 4皇后问题完整实现
        System.out.println("4皇后问题解法：");
        List<List<String>> solutions = solveNQueens(4);
        System.out.println("找到 " + solutions.size() + " 个解：");
        for (int i = 0; i < solutions.size(); i++) {
            System.out.println("\n解 " + (i + 1) + ":");
            for (String row : solutions.get(i)) {
                System.out.println(row);
            }
        }
        System.out.println();
        
        System.out.println("关键洞察：");
        System.out.println("- 逐行放置自然避免了行冲突");
        System.out.println("- 记录已占用的列避免列冲突");
        System.out.println("- 用数学关系判断对角线冲突");
        System.out.println("- 一旦冲突立即回溯，不浪费时间");
        System.out.println();
    }
    
    /**
     * N皇后问题解法
     */
    private List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        backtrackQueens(board, 0, results);
        return results;
    }
    
    private void backtrackQueens(char[][] board, int row, List<List<String>> results) {
        if (row == board.length) {
            results.add(constructBoard(board));
            return;
        }
        
        for (int col = 0; col < board.length; col++) {
            if (isValidQueenPosition(board, row, col)) {
                board[row][col] = 'Q';
                backtrackQueens(board, row + 1, results);
                board[row][col] = '.';  // 回溯
            }
        }
    }
    
    private boolean isValidQueenPosition(char[][] board, int row, int col) {
        // 检查列
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }
        
        // 检查左上对角线
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        
        // 检查右上对角线
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        
        return true;
    }
    
    private List<String> constructBoard(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }
    
    /**
     * 分析数独问题
     */
    private void analyzeSudoku() {
        System.out.println("\n2. 数独问题：");
        System.out.println("问题：填充9×9网格，满足每行、每列、每个3×3子网格都包含1-9");
        System.out.println();
        
        System.out.println("思考过程：");
        System.out.println("- 找到一个空格");
        System.out.println("- 尝试1-9每个数字");
        System.out.println("- 检查是否违反规则");
        System.out.println("- 违反则尝试下一个数字");
        System.out.println("- 所有数字都不行则回溯");
        System.out.println();
        
        // 简化的数独示例
        int[][] sudoku = {
            {5,3,0, 0,7,0, 0,0,0},
            {6,0,0, 1,9,5, 0,0,0},
            {0,9,8, 0,0,0, 0,6,0},
            
            {8,0,0, 0,6,0, 0,0,3},
            {4,0,0, 8,0,3, 0,0,1},
            {7,0,0, 0,2,0, 0,0,6},
            
            {0,6,0, 0,0,0, 2,8,0},
            {0,0,0, 4,1,9, 0,0,5},
            {0,0,0, 0,8,0, 0,7,9}
        };
        
        System.out.println("数独谜题（0表示空格）：");
        printSudoku(sudoku);
        
        System.out.println("\n解题策略：");
        System.out.println("- 优先填充可选数字最少的格子");
        System.out.println("- 维护每行/列/宫的已用数字集合");
        System.out.println("- 使用位运算加速验证");
        System.out.println();
    }
    
    private void printSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * 分析组合总和问题
     */
    private void analyzeCombinationSum() {
        System.out.println("\n3. 组合总和问题：");
        System.out.println("问题：找出所有和为目标值的数字组合");
        System.out.println();
        
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        
        System.out.println("示例：candidates = [2,3,6,7], target = 7");
        System.out.println();
        
        System.out.println("思考过程：");
        System.out.println("- 对每个数字，我们有两种选择：用或不用");
        System.out.println("- 如果用，可能用多次（无限硬币问题）");
        System.out.println("- 当前和超过目标时回溯");
        System.out.println("- 当前和等于目标时记录解");
        System.out.println();
        
        List<List<Integer>> combinations = combinationSum(candidates, target);
        System.out.println("所有解：");
        for (List<Integer> combo : combinations) {
            System.out.println(combo);
        }
        System.out.println();
        
        System.out.println("优化技巧：");
        System.out.println("- 排序后可以更早剪枝");
        System.out.println("- 避免重复要注意搜索顺序");
        System.out.println("- 记录起始位置防止重复组合");
        System.out.println();
    }
    
    private List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);  // 排序便于剪枝
        backtrackCombination(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }
    
    private void backtrackCombination(int[] candidates, int remain, int start, 
                                      List<Integer> current, List<List<Integer>> results) {
        if (remain == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) break;  // 剪枝
            
            current.add(candidates[i]);
            // 注意这里还是传入i，允许重复使用
            backtrackCombination(candidates, remain - candidates[i], i, current, results);
            current.remove(current.size() - 1);  // 回溯
        }
    }
    
    /**
     * 4. 探索剪枝策略
     */
    private void explorePruningStrategies() {
        System.out.println("\n四、剪枝策略的智慧\n");
        
        System.out.println("1. 可行性剪枝（Feasibility Pruning）：");
        System.out.println("- 提前判断当前路径不可能产生可行解");
        System.out.println("- 例：数独中某个数字已经违反规则");
        System.out.println("- 效果：避免无效的深层搜索");
        System.out.println();
        
        System.out.println("2. 最优性剪枝（Optimality Pruning）：");
        System.out.println("- 当前路径即使成功也不会比已知解更优");
        System.out.println("- 例：旅行商问题中当前路径已超过最短路径");
        System.out.println("- 效果：快速收敛到最优解");
        System.out.println();
        
        System.out.println("3. 对称性剪枝（Symmetry Breaking）：");
        System.out.println("- 识别等价的搜索路径");
        System.out.println("- 例：N皇后中的旋转对称解");
        System.out.println("- 效果：大幅减少搜索空间");
        System.out.println();
        
        System.out.println("4. 启发式剪枝（Heuristic Pruning）：");
        System.out.println("- 基于经验判断某些路径价值较低");
        System.out.println("- 例：先尝试最可能成功的分支");
        System.out.println("- 效果：更快找到解（但可能错过最优解）");
        System.out.println();
        
        // 剪枝效果对比
        demonstratePruningEffect();
    }
    
    /**
     * 演示剪枝效果
     */
    private void demonstratePruningEffect() {
        System.out.println("剪枝效果演示（8皇后问题）：");
        
        // 无剪枝版本（仅作说明，不实际运行）
        System.out.println("- 无剪枝：需要探索 8^8 = 16,777,216 种可能");
        
        // 基础剪枝
        System.out.println("- 基础剪枝：逐行放置，每行最多8个位置");
        System.out.println("  最坏情况：8! = 40,320 种可能");
        
        // 高效剪枝
        System.out.println("- 高效剪枝：提前检测冲突");
        System.out.println("  实际探索：约 15,720 个节点");
        
        System.out.println("\n剪枝带来的性能提升：超过1000倍！");
        System.out.println();
    }
    
    /**
     * 5. 回溯思维在人生决策中的应用
     */
    private void applyToLifeDecisions() {
        System.out.println("\n五、回溯思维与人生智慧\n");
        
        System.out.println("1. 职业发展路径：");
        System.out.println("情境：选择职业方向");
        System.out.println("```");
        System.out.println("起点：大学毕业");
        System.out.println("├─ 选择1：直接工作");
        System.out.println("│   ├─ 大公司（尝试后发现不适合）");
        System.out.println("│   │   └─ 回溯：重新找工作");
        System.out.println("│   └─ 创业公司（找到适合的环境）");
        System.out.println("└─ 选择2：继续深造");
        System.out.println("    ├─ 硕士（完成）");
        System.out.println("    └─ 博士（中途发现不适合）");
        System.out.println("        └─ 回溯：硕士毕业后工作");
        System.out.println("```");
        System.out.println();
        
        System.out.println("2. 项目管理决策：");
        System.out.println("- 制定项目计划（搜索空间）");
        System.out.println("- 设置里程碑（约束条件）");
        System.out.println("- 定期评审进展");
        System.out.println("- 发现问题及时调整方向（回溯）");
        System.out.println("- 不要因为沉没成本而坚持错误方向");
        System.out.println();
        
        System.out.println("3. 学习新技能：");
        System.out.println("- 尝试不同的学习方法");
        System.out.println("- 某个方法效果不好就换一种");
        System.out.println("- 记录哪些方法已经尝试过");
        System.out.println("- 找到最适合自己的学习路径");
        System.out.println();
        
        System.out.println("4. 人际关系处理：");
        System.out.println("- 尝试不同的沟通方式");
        System.out.println("- 观察对方的反应");
        System.out.println("- 调整策略直到找到有效方式");
        System.out.println("- 记住什么方式对什么人有效");
        System.out.println();
        
        System.out.println("5. 回溯思维的人生哲学：");
        System.out.println("『试错是成长的阶梯』");
        System.out.println("- 勇于尝试，不怕失败");
        System.out.println("- 及时止损，灵活调整");
        System.out.println("- 系统记录，避免重复错误");
        System.out.println("- 坚持探索，终会找到出路");
        System.out.println();
        
        System.out.println("关键感悟：");
        System.out.println("- 人生不是单行道，可以回头重来");
        System.out.println("- 每次回溯都带来宝贵经验");
        System.out.println("- 系统性试错比盲目坚持更明智");
        System.out.println("- 成功往往来自于多次失败后的坚持");
        System.out.println();
    }
    
    // 需要的导入
    private static class ArrayList<T> extends java.util.ArrayList<T> {}
    private static class List<T> extends ArrayList<T> {}
    private static class Arrays {
        public static void sort(int[] arr) {
            java.util.Arrays.sort(arr);
        }
    }
}