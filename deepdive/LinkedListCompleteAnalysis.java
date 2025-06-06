package deepdive;

/**
 * 深入探索系列第二章：链表的完整剖析
 * 
 * 链表：灵活性的化身，动态性的典型代表
 * 让我们深入理解链表的设计哲学和实现细节
 */
public class LinkedListCompleteAnalysis {
    
    public static void main(String[] args) {
        System.out.println("=== 链表：动态数据结构的典型代表 ===\n");
        
        // 1. 链表的设计哲学
        understandLinkedListPhilosphy();
        
        // 2. 单向链表的完整实现
        singleLinkedListImplementation();
        
        // 3. 双向链表的实现与优势
        doubleLinkedListImplementation();
        
        // 4. 循环链表的应用
        circularLinkedListApplications();
        
        // 5. 链表 vs 数组的深度对比
        linkedListVsArrayComparison();
        
        // 6. 链表的经典算法
        classicLinkedListAlgorithms();
        
        // 7. 实际应用场景
        realWorldApplications();
    }
    
    /**
     * 1. 链表的设计哲学
     */
    public static void understandLinkedListPhilosphy() {
        System.out.println("【设计哲学】为什么需要链表？\n");
        
        System.out.println("链表的核心思想：用指针连接分散的内存");
        System.out.println("├─ 问题：数组的固定大小限制");
        System.out.println("├─ 方案：动态分配，按需使用");
        System.out.println("└─ 代价：失去随机访问，增加空间开销\n");
        
        System.out.println("链表的内存模型：");
        System.out.println("┌───────────┐    ┌───────────┐    ┌───────────┐");
        System.out.println("│ data│next │────▶│ data│next │────▶│ data│null │");
        System.out.println("└───────────┘    └───────────┘    └───────────┘");
        System.out.println("节点1@0x1000     节点2@0x2000     节点3@0x3000");
        System.out.println();
        System.out.println("特点：");
        System.out.println("• 节点分散在内存各处");
        System.out.println("• 通过指针维持逻辑顺序");
        System.out.println("• 大小可以动态改变");
        System.out.println("• 插入删除位置灵活\n");
        
        System.out.println("链表的哲学对比：");
        System.out.println("数组哲学：集中式管理，空间换时间");
        System.out.println("链表哲学：分布式管理，时间换空间\n");
        
        System.out.println("这种对比体现了计算机科学的核心思想：");
        System.out.println("没有万能的数据结构，只有适合的选择！");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 2. 单向链表的完整实现
     */
    public static void singleLinkedListImplementation() {
        System.out.println("【完整实现】单向链表的每个细节\n");
        
        // 节点类定义
        class ListNode {
            int data;
            ListNode next;
            
            ListNode(int data) {
                this.data = data;
                this.next = null;
            }
            
            @Override
            public String toString() {
                return "Node(" + data + ")";
            }
        }
        
        // 单向链表实现
        class SinglyLinkedList {
            private ListNode head;
            private int size;
            
            public SinglyLinkedList() {
                head = null;
                size = 0;
            }
            
            // 在头部插入 - O(1)
            public void addFirst(int data) {
                ListNode newNode = new ListNode(data);
                newNode.next = head;
                head = newNode;
                size++;
                System.out.println("   头部插入 " + data + "，链表变为：" + this);
            }
            
            // 在尾部插入 - O(n)
            public void addLast(int data) {
                ListNode newNode = new ListNode(data);
                
                if (head == null) {
                    head = newNode;
                } else {
                    ListNode current = head;
                    // 遍历到最后一个节点
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = newNode;
                }
                size++;
                System.out.println("   尾部插入 " + data + "，链表变为：" + this);
            }
            
            // 在指定位置插入 - O(n)
            public void insert(int index, int data) {
                if (index < 0 || index > size) {
                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                
                if (index == 0) {
                    addFirst(data);
                    return;
                }
                
                ListNode newNode = new ListNode(data);
                ListNode current = head;
                
                // 移动到插入位置的前一个节点
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                
                newNode.next = current.next;
                current.next = newNode;
                size++;
                System.out.println("   在位置 " + index + " 插入 " + data + "，链表变为：" + this);
            }
            
            // 删除头部节点 - O(1)
            public Integer removeFirst() {
                if (head == null) return null;
                
                int data = head.data;
                head = head.next;
                size--;
                System.out.println("   删除头部节点 " + data + "，链表变为：" + this);
                return data;
            }
            
            // 删除指定位置节点 - O(n)
            public Integer remove(int index) {
                if (index < 0 || index >= size) {
                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                
                if (index == 0) {
                    return removeFirst();
                }
                
                ListNode current = head;
                // 移动到删除位置的前一个节点
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                
                int data = current.next.data;
                current.next = current.next.next;
                size--;
                System.out.println("   删除位置 " + index + " 的节点 " + data + "，链表变为：" + this);
                return data;
            }
            
            // 查找元素 - O(n)
            public int indexOf(int data) {
                ListNode current = head;
                int index = 0;
                
                while (current != null) {
                    if (current.data == data) {
                        return index;
                    }
                    current = current.next;
                    index++;
                }
                return -1;
            }
            
            // 获取指定位置的元素 - O(n)
            public Integer get(int index) {
                if (index < 0 || index >= size) {
                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                
                ListNode current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                return current.data;
            }
            
            public int size() {
                return size;
            }
            
            public boolean isEmpty() {
                return head == null;
            }
            
            @Override
            public String toString() {
                if (head == null) return "[]";
                
                StringBuilder sb = new StringBuilder("[");
                ListNode current = head;
                while (current != null) {
                    sb.append(current.data);
                    if (current.next != null) {
                        sb.append(" -> ");
                    }
                    current = current.next;
                }
                sb.append("]");
                return sb.toString();
            }
            
            // 可视化链表结构
            public void visualize() {
                System.out.println("   链表可视化：");
                if (head == null) {
                    System.out.println("   [空链表]");
                    return;
                }
                
                System.out.print("   head -> ");
                ListNode current = head;
                while (current != null) {
                    System.out.printf("┌──────┐");
                    if (current.next != null) {
                        System.out.print(" -> ");
                    }
                    current = current.next;
                }
                System.out.println(" -> null");
                
                System.out.print("           ");
                current = head;
                while (current != null) {
                    System.out.printf("│ %4d │", current.data);
                    if (current.next != null) {
                        System.out.print("    ");
                    }
                    current = current.next;
                }
                System.out.println();
                
                System.out.print("           ");
                current = head;
                while (current != null) {
                    System.out.printf("└──────┘");
                    if (current.next != null) {
                        System.out.print("    ");
                    }
                    current = current.next;
                }
                System.out.println();
            }
        }
        
        // 测试单向链表
        System.out.println("测试单向链表的各种操作：\n");
        
        SinglyLinkedList list = new SinglyLinkedList();
        
        System.out.println("1. 插入操作测试：");
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);
        list.insert(2, 25);
        
        System.out.println("\n2. 链表可视化：");
        list.visualize();
        
        System.out.println("\n3. 查找操作测试：");
        System.out.println("   查找元素 25 的位置：" + list.indexOf(25));
        System.out.println("   获取位置 3 的元素：" + list.get(3));
        
        System.out.println("\n4. 删除操作测试：");
        list.remove(2);
        list.removeFirst();
        
        System.out.println("\n5. 最终状态：");
        list.visualize();
        System.out.println("   大小：" + list.size());
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 3. 双向链表的实现与优势
     */
    public static void doubleLinkedListImplementation() {
        System.out.println("【进阶实现】双向链表的强大功能\n");
        
        // 双向链表节点
        class DoublyListNode {
            int data;
            DoublyListNode prev;
            DoublyListNode next;
            
            DoublyListNode(int data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
            
            @Override
            public String toString() {
                return "Node(" + data + ")";
            }
        }
        
        // 双向链表实现
        class DoublyLinkedList {
            private DoublyListNode head;
            private DoublyListNode tail;
            private int size;
            
            public DoublyLinkedList() {
                head = null;
                tail = null;
                size = 0;
            }
            
            // 在头部插入 - O(1)
            public void addFirst(int data) {
                DoublyListNode newNode = new DoublyListNode(data);
                
                if (head == null) {
                    head = tail = newNode;
                } else {
                    newNode.next = head;
                    head.prev = newNode;
                    head = newNode;
                }
                size++;
                System.out.println("   头部插入 " + data + "：" + this);
            }
            
            // 在尾部插入 - O(1)
            public void addLast(int data) {
                DoublyListNode newNode = new DoublyListNode(data);
                
                if (tail == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }
                size++;
                System.out.println("   尾部插入 " + data + "：" + this);
            }
            
            // 在指定位置插入 - O(n)，但可以从两端开始
            public void insert(int index, int data) {
                if (index < 0 || index > size) {
                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                
                if (index == 0) {
                    addFirst(data);
                    return;
                }
                
                if (index == size) {
                    addLast(data);
                    return;
                }
                
                DoublyListNode newNode = new DoublyListNode(data);
                DoublyListNode current;
                
                // 优化：从更近的一端开始遍历
                if (index <= size / 2) {
                    // 从头开始
                    current = head;
                    for (int i = 0; i < index; i++) {
                        current = current.next;
                    }
                } else {
                    // 从尾开始
                    current = tail;
                    for (int i = size - 1; i > index; i--) {
                        current = current.prev;
                    }
                }
                
                // 插入新节点
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
                size++;
                
                System.out.println("   在位置 " + index + " 插入 " + data + "：" + this);
            }
            
            // 删除头部节点 - O(1)
            public Integer removeFirst() {
                if (head == null) return null;
                
                int data = head.data;
                
                if (head == tail) {
                    head = tail = null;
                } else {
                    head = head.next;
                    head.prev = null;
                }
                
                size--;
                System.out.println("   删除头部节点 " + data + "：" + this);
                return data;
            }
            
            // 删除尾部节点 - O(1)
            public Integer removeLast() {
                if (tail == null) return null;
                
                int data = tail.data;
                
                if (head == tail) {
                    head = tail = null;
                } else {
                    tail = tail.prev;
                    tail.next = null;
                }
                
                size--;
                System.out.println("   删除尾部节点 " + data + "：" + this);
                return data;
            }
            
            // 正向遍历
            public void forwardTraversal() {
                System.out.print("   正向遍历：");
                DoublyListNode current = head;
                while (current != null) {
                    System.out.print(current.data);
                    if (current.next != null) {
                        System.out.print(" -> ");
                    }
                    current = current.next;
                }
                System.out.println();
            }
            
            // 反向遍历
            public void backwardTraversal() {
                System.out.print("   反向遍历：");
                DoublyListNode current = tail;
                while (current != null) {
                    System.out.print(current.data);
                    if (current.prev != null) {
                        System.out.print(" <- ");
                    }
                    current = current.prev;
                }
                System.out.println();
            }
            
            public int size() {
                return size;
            }
            
            @Override
            public String toString() {
                if (head == null) return "[]";
                
                StringBuilder sb = new StringBuilder("[");
                DoublyListNode current = head;
                while (current != null) {
                    sb.append(current.data);
                    if (current.next != null) {
                        sb.append(" <-> ");
                    }
                    current = current.next;
                }
                sb.append("]");
                return sb.toString();
            }
            
            // 可视化双向链表
            public void visualize() {
                System.out.println("   双向链表可视化：");
                if (head == null) {
                    System.out.println("   [空链表]");
                    return;
                }
                
                System.out.print("   head -> ");
                DoublyListNode current = head;
                while (current != null) {
                    System.out.printf("┌──────┐");
                    if (current.next != null) {
                        System.out.print(" <-> ");
                    }
                    current = current.next;
                }
                System.out.println(" <- tail");
                
                System.out.print("           ");
                current = head;
                while (current != null) {
                    System.out.printf("│ %4d │", current.data);
                    if (current.next != null) {
                        System.out.print("     ");
                    }
                    current = current.next;
                }
                System.out.println();
                
                System.out.print("           ");
                current = head;
                while (current != null) {
                    System.out.printf("└──────┘");
                    if (current.next != null) {
                        System.out.print("     ");
                    }
                    current = current.next;
                }
                System.out.println();
            }
        }
        
        // 测试双向链表
        System.out.println("测试双向链表的特有功能：\n");
        
        DoublyLinkedList dlist = new DoublyLinkedList();
        
        System.out.println("1. 双端插入操作：");
        dlist.addFirst(20);
        dlist.addLast(30);
        dlist.addFirst(10);
        dlist.addLast(40);
        dlist.insert(2, 25);
        
        System.out.println("\n2. 双向链表可视化：");
        dlist.visualize();
        
        System.out.println("\n3. 双向遍历测试：");
        dlist.forwardTraversal();
        dlist.backwardTraversal();
        
        System.out.println("\n4. 双端删除操作：");
        dlist.removeFirst();
        dlist.removeLast();
        
        System.out.println("\n5. 最终状态：");
        dlist.visualize();
        
        System.out.println("\n双向链表的优势：");
        System.out.println("• O(1) 时间删除尾节点");
        System.out.println("• 支持双向遍历");
        System.out.println("• 插入位置优化（从近端开始）");
        System.out.println("• 适合实现双端队列（Deque）");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 4. 循环链表的应用
     */
    public static void circularLinkedListApplications() {
        System.out.println("【特殊形式】循环链表的巧妙应用\n");
        
        // 循环链表节点
        class CircularListNode {
            int data;
            CircularListNode next;
            
            CircularListNode(int data) {
                this.data = data;
                this.next = this;  // 初始时指向自己
            }
        }
        
        // 约瑟夫环问题的解决
        class JosephusCircle {
            private CircularListNode head;
            private int size;
            
            public JosephusCircle(int n) {
                if (n <= 0) return;
                
                // 创建循环链表
                head = new CircularListNode(1);
                CircularListNode current = head;
                
                for (int i = 2; i <= n; i++) {
                    current.next = new CircularListNode(i);
                    current = current.next;
                }
                current.next = head;  // 形成环
                size = n;
            }
            
            // 约瑟夫环求解
            public int josephus(int k) {
                if (size == 0) return -1;
                
                CircularListNode current = head;
                CircularListNode prev = head;
                
                // 找到尾节点作为 prev
                while (prev.next != head) {
                    prev = prev.next;
                }
                
                System.out.println("   约瑟夫环过程（每隔" + (k-1) + "个人淘汰一个）：");
                
                while (size > 1) {
                    // 移动 k-1 步
                    for (int i = 1; i < k; i++) {
                        prev = current;
                        current = current.next;
                    }
                    
                    System.out.println("   淘汰：" + current.data);
                    
                    // 删除当前节点
                    prev.next = current.next;
                    if (current == head) {
                        head = current.next;
                    }
                    current = current.next;
                    size--;
                }
                
                System.out.println("   最后生存者：" + current.data);
                return current.data;
            }
            
            public void display() {
                if (size == 0) {
                    System.out.println("   空环");
                    return;
                }
                
                System.out.print("   当前环：");
                CircularListNode current = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(current.data);
                    if (i < size - 1) {
                        System.out.print(" -> ");
                    }
                    current = current.next;
                }
                System.out.println(" -> (回到" + head.data + ")");
            }
        }
        
        // 测试约瑟夫环
        System.out.println("约瑟夫环问题演示：");
        System.out.println("41个人围成圆圈，每隔2个人淘汰一个，求最后生存者位置");
        
        JosephusCircle circle = new JosephusCircle(7);  // 用7个人简化演示
        circle.display();
        
        int survivor = circle.josephus(3);
        System.out.println("   结果：位置 " + survivor + " 的人最后生存\n");
        
        // 循环链表的其他应用
        System.out.println("循环链表的其他应用场景：");
        System.out.println("1. 操作系统进程调度");
        System.out.println("   - 时间片轮转算法");
        System.out.println("   - 进程循环执行");
        System.out.println();
        System.out.println("2. 音乐播放器");
        System.out.println("   - 循环播放列表");
        System.out.println("   - 无缝衔接");
        System.out.println();
        System.out.println("3. 游戏开发");
        System.out.println("   - 玩家轮流行动");
        System.out.println("   - 回合制游戏");
        System.out.println();
        System.out.println("4. 缓存淘汰策略");
        System.out.println("   - Clock算法");
        System.out.println("   - 页面替换");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 5. 链表 vs 数组的深度对比
     */
    public static void linkedListVsArrayComparison() {
        System.out.println("【深度对比】链表 vs 数组：何时选择谁？\n");
        
        System.out.println("1. 时间复杂度对比：");
        System.out.println("┌─────────────────┬─────────┬─────────┐");
        System.out.println("│      操作       │  数组   │  链表   │");
        System.out.println("├─────────────────┼─────────┼─────────┤");
        System.out.println("│ 随机访问        │  O(1)   │  O(n)   │");
        System.out.println("│ 头部插入        │  O(n)   │  O(1)   │");
        System.out.println("│ 尾部插入        │  O(1)*  │  O(n)**│");
        System.out.println("│ 中间插入        │  O(n)   │  O(n)   │");
        System.out.println("│ 头部删除        │  O(n)   │  O(1)   │");
        System.out.println("│ 尾部删除        │  O(1)   │  O(n)**│");
        System.out.println("│ 中间删除        │  O(n)   │  O(n)   │");
        System.out.println("│ 查找元素        │  O(n)   │  O(n)   │");
        System.out.println("└─────────────────┴─────────┴─────────┘");
        System.out.println("* 动态数组偶尔需要扩容：摊销O(1)");
        System.out.println("** 单向链表；双向链表尾部操作是O(1)\n");
        
        System.out.println("2. 空间复杂度对比：");
        System.out.println("数组：");
        System.out.println("  存储开销 = n * element_size + 对象头");
        System.out.println("  额外开销极小，内存紧凑");
        System.out.println();
        System.out.println("链表：");
        System.out.println("  存储开销 = n * (element_size + pointer_size) + n * 对象头");
        System.out.println("  在64位系统中，每个节点额外需要8字节指针 + 16字节对象头");
        System.out.println("  如果存储int值，开销是 4 + 8 + 16 = 28字节/节点");
        System.out.println("  而数组只需要 4字节/元素");
        System.out.println("  链表的内存开销是数组的7倍！\n");
        
        // 性能测试
        System.out.println("3. 实际性能测试：");
        performanceComparison();
        
        System.out.println("4. 选择建议：");
        System.out.println("选择数组的场景：");
        System.out.println("• 需要频繁随机访问");
        System.out.println("• 内存使用要求严格");
        System.out.println("• 数据量大，性能敏感");
        System.out.println("• 数值计算、图像处理");
        System.out.println();
        System.out.println("选择链表的场景：");
        System.out.println("• 频繁在头部插入删除");
        System.out.println("• 数据大小难以预估");
        System.out.println("• 需要动态扩缩容");
        System.out.println("• 实现其他数据结构（栈、队列）");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 性能对比测试
     */
    private static void performanceComparison() {
        int n = 100000;
        
        // 数组插入测试
        long start = System.nanoTime();
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, i);  // 头部插入
        }
        long arrayTime = System.nanoTime() - start;
        
        // 链表插入测试
        start = System.nanoTime();
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.addFirst(i);  // 头部插入
        }
        long linkedTime = System.nanoTime() - start;
        
        System.out.println("   头部插入" + n + "个元素：");
        System.out.println("   ArrayList时间：" + (arrayTime / 1_000_000) + " ms");
        System.out.println("   LinkedList时间：" + (linkedTime / 1_000_000) + " ms");
        System.out.println("   LinkedList比ArrayList快 " + (arrayTime / linkedTime) + " 倍");
        System.out.println();
        
        // 随机访问测试
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        long arrayAccessTime = System.nanoTime() - start;
        
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        long linkedAccessTime = System.nanoTime() - start;
        
        System.out.println("   随机访问10000次：");
        System.out.println("   ArrayList时间：" + (arrayAccessTime / 1_000_000) + " ms");
        System.out.println("   LinkedList时间：" + (linkedAccessTime / 1_000_000) + " ms");
        System.out.println("   ArrayList比LinkedList快 " + (linkedAccessTime / arrayAccessTime) + " 倍");
    }
    
    // 简单节点定义
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    
    // 创建测试链表的辅助方法
    private static ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    
    // 打印链表
    private static void printList(ListNode head, String description) {
        System.out.print("   " + description + ": ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * 6. 链表的经典算法
     */
    public static void classicLinkedListAlgorithms() {
        System.out.println("【经典算法】链表相关的重要算法\n");
        
        System.out.println("1. 反转链表（迭代法）：");
        ListNode list1 = createList(new int[]{1, 2, 3, 4, 5});
        printList(list1, "原链表");
        
        // 反转链表
        ListNode prev = null;
        ListNode current = list1;
        
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        
        printList(prev, "反转后");
        System.out.println("   算法思路：三个指针，逐个调转方向\n");
        
        System.out.println("2. 检测环的存在（Floyd算法）：");
        
        // 创建有环链表
        ListNode list2 = createList(new int[]{1, 2, 3, 4, 5});
        ListNode temp = list2;
        while (temp.next != null) temp = temp.next;
        temp.next = list2.next.next; // 形成环：5 -> 3
        
        // Floyd检测算法
        ListNode slow = list2;
        ListNode fast = list2;
        boolean hasCycle = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        
        System.out.println("   链表：1 -> 2 -> 3 -> 4 -> 5 -> 3 (环)");
        System.out.println("   检测结果：" + (hasCycle ? "有环" : "无环"));
        System.out.println("   算法思路：快慢指针，如果有环必定相遇\n");
        
        System.out.println("3. 寻找链表中点：");
        ListNode list3 = createList(new int[]{1, 2, 3, 4, 5, 6});
        printList(list3, "链表");
        
        slow = list3;
        fast = list3;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        System.out.println("   链表中点：" + slow.val);
        System.out.println("   算法思路：快指针走两步，慢指针走一步\n");
        
        System.out.println("4. 合并两个有序链表：");
        ListNode list4 = createList(new int[]{1, 3, 5});
        ListNode list5 = createList(new int[]{2, 4, 6});
        printList(list4, "链表1");
        printList(list5, "链表2");
        
        // 合并算法
        ListNode dummy = new ListNode(0);
        ListNode current2 = dummy;
        ListNode l1 = list4, l2 = list5;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current2.next = l1;
                l1 = l1.next;
            } else {
                current2.next = l2;
                l2 = l2.next;
            }
            current2 = current2.next;
        }
        
        // 连接剩余部分
        current2.next = (l1 != null) ? l1 : l2;
        
        printList(dummy.next, "合并后");
        System.out.println("   算法思路：双指针，比较选择较小值\n");
        
        System.out.println("这些算法体现了链表操作的核心技巧：");
        System.out.println("• 指针操作的精确控制");
        System.out.println("• 快慢指针的巧妙应用");
        System.out.println("• 虚拟头节点简化边界处理");
        System.out.println("• 递归与迭代的灵活转换");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 7. 链表的实际应用场景
     */
    public static void realWorldApplications() {
        System.out.println("【实际应用】链表在现实世界中的使用\n");
        
        System.out.println("1. 实现撤销/重做功能");
        System.out.println("   文本编辑器、图像编辑软件的核心功能");
        
        // 简单的撤销/重做实现
        class UndoRedoSystem {
            private java.util.LinkedList<String> undoStack = new java.util.LinkedList<>();
            private java.util.LinkedList<String> redoStack = new java.util.LinkedList<>();
            private String currentState = "";
            
            public void execute(String action) {
                undoStack.addLast(currentState);
                currentState = action;
                redoStack.clear(); // 执行新操作清空重做栈
                System.out.println("   执行操作：" + action);
                showState();
            }
            
            public void undo() {
                if (!undoStack.isEmpty()) {
                    redoStack.addLast(currentState);
                    currentState = undoStack.removeLast();
                    System.out.println("   撤销操作");
                    showState();
                } else {
                    System.out.println("   无法撤销");
                }
            }
            
            public void redo() {
                if (!redoStack.isEmpty()) {
                    undoStack.addLast(currentState);
                    currentState = redoStack.removeLast();
                    System.out.println("   重做操作");
                    showState();
                } else {
                    System.out.println("   无法重做");
                }
            }
            
            private void showState() {
                System.out.println("   当前状态：" + currentState);
                System.out.println("   撤销栈大小：" + undoStack.size());
                System.out.println("   重做栈大小：" + redoStack.size());
                System.out.println();
            }
        }
        
        UndoRedoSystem editor = new UndoRedoSystem();
        editor.execute("输入Hello");
        editor.execute("输入World");
        editor.execute("删除World");
        editor.undo();
        editor.undo();
        editor.redo();
        
        System.out.println("2. LRU缓存实现");
        System.out.println("   最近最少使用缓存，广泛用于操作系统、数据库");
        
        // LRU缓存的核心思想展示
        System.out.println("   LRU缓存结构：");
        System.out.println("   HashMap + 双向链表");
        System.out.println("   ┌─────────────────────────────────────┐");
        System.out.println("   │          HashMap                    │");
        System.out.println("   │  key1 -> node1                     │");
        System.out.println("   │  key2 -> node2                     │");
        System.out.println("   │  key3 -> node3                     │");
        System.out.println("   └─────────────────────────────────────┘");
        System.out.println("            ↓");
        System.out.println("   head <-> node1 <-> node2 <-> node3 <-> tail");
        System.out.println("   (最新)                               (最旧)");
        System.out.println();
        System.out.println("   操作复杂度：");
        System.out.println("   • 访问：O(1) - HashMap查找 + 双向链表移动");
        System.out.println("   • 插入：O(1) - 头部插入");
        System.out.println("   • 删除：O(1) - 尾部删除\n");
        
        System.out.println("3. 操作系统进程管理");
        System.out.println("   进程控制块（PCB）通过链表组织");
        System.out.println("   • 就绪队列：等待执行的进程");
        System.out.println("   • 阻塞队列：等待I/O的进程");
        System.out.println("   • 完成队列：已完成的进程");
        System.out.println();
        System.out.println("   优势：");
        System.out.println("   • 动态数量：进程数量不固定");
        System.out.println("   • 高效调度：O(1)时间插入删除");
        System.out.println("   • 内存管理：按需分配，避免浪费\n");
        
        System.out.println("4. 音乐播放器播放列表");
        System.out.println("   双向链表实现前进/后退功能");
        System.out.println("   • 当前歌曲：链表中的当前节点");
        System.out.println("   • 下一首：current.next");
        System.out.println("   • 上一首：current.prev");
        System.out.println("   • 插入歌曲：O(1)时间");
        System.out.println("   • 删除歌曲：O(1)时间");
        System.out.println("   • 随机播放：打乱链表顺序\n");
        
        System.out.println("5. 区块链");
        System.out.println("   本质上是一个不可变的链表");
        System.out.println("   • 每个区块包含前一个区块的哈希");
        System.out.println("   • 形成链式结构");
        System.out.println("   • 保证数据完整性和不可篡改性");
        System.out.println();
        System.out.println("   Block结构：");
        System.out.println("   ┌─────────────────┐    ┌─────────────────┐");
        System.out.println("   │ 区块1           │    │ 区块2           │");
        System.out.println("   │ 数据           │    │ 数据           │");
        System.out.println("   │ 前块哈希: null │    │ 前块哈希: hash1│");
        System.out.println("   │ 当前哈希: hash1│────▶│ 当前哈希: hash2│");
        System.out.println("   └─────────────────┘    └─────────────────┘");
        
        System.out.println("\n【总结】链表的智慧");
        System.out.println("链表教会我们的不仅仅是数据结构，更是一种思维方式：");
        System.out.println("• 分布式思维：化整为零，各个击破");
        System.out.println("• 连接的力量：通过关系构建整体");
        System.out.println("• 动态适应：按需分配，灵活调整");
        System.out.println("• 权衡取舍：为灵活性付出访问效率的代价");
        System.out.println();
        System.out.println("这种思维方式在软件架构、系统设计、");
        System.out.println("甚至生活哲学中都有深刻的指导意义！");
    }
    
}