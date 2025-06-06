package deepdive;

import java.util.Arrays;

/**
 * 深入探索系列第一章：数组的完整剖析
 * 
 * 数组是最基础但也是最重要的数据结构，让我们彻底理解它！
 */
public class ArraysCompleteAnalysis {
    
    public static void main(String[] args) {
        System.out.println("=== 数组：看似简单却充满智慧的数据结构 ===\n");
        
        // 1. 数组的本质理解
        understandArrayEssence();
        
        // 2. 数组的内存模型
        arrayMemoryModel();
        
        // 3. 数组的操作详解
        arrayOperationsInDetail();
        
        // 4. 数组的优化技巧
        arrayOptimizationTechniques();
        
        // 5. 数组的实际应用
        realWorldApplications();
        
        // 6. 动态数组的实现
        dynamicArrayImplementation();
    }
    
    /**
     * 1. 数组的本质理解
     */
    public static void understandArrayEssence() {
        System.out.println("【深度理解】数组的本质\n");
        
        System.out.println("数组是什么？");
        System.out.println("├─ 物理层面：一段连续的内存空间");
        System.out.println("├─ 逻辑层面：相同类型元素的有序集合");
        System.out.println("└─ 访问方式：通过索引直接定位\n");
        
        System.out.println("为什么数组如此重要？");
        System.out.println("1. CPU缓存友好");
        System.out.println("   - 连续存储 → 空间局部性");
        System.out.println("   - 顺序访问 → 时间局部性");
        System.out.println("   - 预取优化 → CPU可以预测并提前加载数据\n");
        
        System.out.println("2. 随机访问O(1)");
        System.out.println("   - 地址计算：base_address + index * element_size");
        System.out.println("   - 一次计算，直接访问");
        System.out.println("   - 这是链表等结构无法比拟的优势\n");
        
        // 演示随机访问
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("示例：访问 arr[2]");
        System.out.println("假设 base_address = 1000, int大小 = 4字节");
        System.out.println("arr[2] 的地址 = 1000 + 2 * 4 = 1008");
        System.out.println("直接访问地址1008，获取值：" + arr[2]);
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 2. 数组的内存模型详解
     */
    public static void arrayMemoryModel() {
        System.out.println("【内存剖析】数组在内存中的真实样子\n");
        
        // 基本类型数组
        System.out.println("1. 基本类型数组（int[]）：");
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("   内存布局：");
        System.out.println("   ┌─────┬─────┬─────┬─────┬─────┐");
        System.out.println("   │  1  │  2  │  3  │  4  │  5  │");
        System.out.println("   └─────┴─────┴─────┴─────┴─────┘");
        System.out.println("   地址: 1000  1004  1008  1012  1016");
        System.out.println("   特点：值直接存储在数组中\n");
        
        // 引用类型数组
        System.out.println("2. 引用类型数组（String[]）：");
        String[] strArray = {"Hello", "World", "Java"};
        System.out.println("   内存布局：");
        System.out.println("   数组本身：");
        System.out.println("   ┌──────┬──────┬──────┐");
        System.out.println("   │ ref1 │ ref2 │ ref3 │  （存储的是引用/地址）");
        System.out.println("   └──────┴──────┴──────┘");
        System.out.println("     ↓      ↓      ↓");
        System.out.println("   \"Hello\" \"World\" \"Java\"  （实际对象在堆中）");
        System.out.println("   特点：数组存储引用，对象存储在别处\n");
        
        // 二维数组
        System.out.println("3. 二维数组（int[][]）：");
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("   内存布局：");
        System.out.println("   主数组：");
        System.out.println("   ┌──────┬──────┬──────┐");
        System.out.println("   │ arr0 │ arr1 │ arr2 │  （每个元素是一个数组的引用）");
        System.out.println("   └──────┴──────┴──────┘");
        System.out.println("     ↓      ↓      ↓");
        System.out.println("   [1,2,3] [4,5,6] [7,8,9]  （各个子数组）");
        System.out.println("   注意：Java中二维数组实际是\"数组的数组\"\n");
        
        // 内存开销分析
        System.out.println("4. 内存开销分析：");
        System.out.println("   int[] arr = new int[1000];");
        System.out.println("   内存占用 = 对象头(12-16字节) + 长度字段(4字节) + 1000*4字节");
        System.out.println("   总计约 = 4016-4020 字节");
        System.out.println("   效率极高，几乎没有额外开销！");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 3. 数组操作的详细分析
     */
    public static void arrayOperationsInDetail() {
        System.out.println("【操作详解】数组的各种操作及其复杂度分析\n");
        
        int[] arr = new int[10];
        Arrays.fill(arr, 0, 5, 1); // 前5个元素填充为1
        
        System.out.println("初始数组：" + Arrays.toString(arr));
        System.out.println();
        
        // 1. 访问操作
        System.out.println("1. 访问操作 - O(1)");
        System.out.println("   代码：int value = arr[3];");
        System.out.println("   过程：");
        System.out.println("   ① 计算地址：base + 3 * 4");
        System.out.println("   ② 直接读取该地址的值");
        System.out.println("   优势：无论数组多大，访问时间相同！\n");
        
        // 2. 修改操作
        System.out.println("2. 修改操作 - O(1)");
        arr[3] = 100;
        System.out.println("   代码：arr[3] = 100;");
        System.out.println("   过程：");
        System.out.println("   ① 计算地址：base + 3 * 4");
        System.out.println("   ② 将100写入该地址");
        System.out.println("   结果：" + Arrays.toString(arr) + "\n");
        
        // 3. 插入操作（在指定位置）
        System.out.println("3. 插入操作 - O(n)");
        System.out.println("   在位置2插入元素50：");
        System.out.println("   插入前：" + Arrays.toString(arr));
        
        // 手动实现插入
        int insertPos = 2;
        int insertValue = 50;
        // 找到第一个0的位置作为数组的实际长度
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i > 4) {
                length = i;
                break;
            }
        }
        if (length == 0) length = 5; // 如果没找到，使用5作为长度
        
        // 从后往前移动元素
        for (int i = length; i > insertPos; i--) {
            arr[i] = arr[i-1];
        }
        arr[insertPos] = insertValue;
        
        System.out.println("   插入后：" + Arrays.toString(arr));
        System.out.println("   过程：");
        System.out.println("   ① 从插入位置开始，所有元素后移");
        System.out.println("   ② 在空出的位置插入新元素");
        System.out.println("   ③ 最坏情况：插入到开头，移动n个元素\n");
        
        // 4. 删除操作
        System.out.println("4. 删除操作 - O(n)");
        System.out.println("   删除位置2的元素：");
        System.out.println("   删除前：" + Arrays.toString(arr));
        
        // 手动实现删除
        int deletePos = 2;
        for (int i = deletePos; i < length; i++) {
            arr[i] = arr[i+1];
        }
        arr[length] = 0; // 最后一个位置清零
        
        System.out.println("   删除后：" + Arrays.toString(arr));
        System.out.println("   过程：");
        System.out.println("   ① 从删除位置开始，所有元素前移");
        System.out.println("   ② 最后位置置为默认值");
        System.out.println("   ③ 最坏情况：删除第一个，移动n-1个元素\n");
        
        // 5. 查找操作
        System.out.println("5. 查找操作");
        System.out.println("   a) 线性查找 - O(n)");
        int target = 100;
        int foundIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("      查找" + target + "，找到位置：" + foundIndex);
        System.out.println("      最坏情况：遍历整个数组\n");
        
        System.out.println("   b) 二分查找 - O(log n)（需要有序数组）");
        int[] sortedArr = {1, 3, 5, 7, 9, 11, 13, 15};
        int searchTarget = 7;
        int left = 0, right = sortedArr.length - 1;
        int steps = 0;
        
        System.out.println("      有序数组：" + Arrays.toString(sortedArr));
        System.out.println("      查找目标：" + searchTarget);
        
        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;
            System.out.println("      第" + steps + "步：检查位置" + mid + "，值=" + sortedArr[mid]);
            
            if (sortedArr[mid] == searchTarget) {
                System.out.println("      找到！位置：" + mid);
                break;
            } else if (sortedArr[mid] < searchTarget) {
                left = mid + 1;
                System.out.println("      目标在右半部分，调整left=" + left);
            } else {
                right = mid - 1;
                System.out.println("      目标在左半部分，调整right=" + right);
            }
        }
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 4. 数组的优化技巧
     */
    public static void arrayOptimizationTechniques() {
        System.out.println("【性能优化】数组使用的高级技巧\n");
        
        System.out.println("1. 预分配策略");
        System.out.println("   问题：频繁扩容导致性能下降");
        System.out.println("   解决：预估大小，一次分配");
        System.out.println("   ```java");
        System.out.println("   // 不好的做法");
        System.out.println("   List<Integer> list = new ArrayList<>(); // 默认容量10");
        System.out.println("   for (int i = 0; i < 1000; i++) {");
        System.out.println("       list.add(i); // 会触发多次扩容");
        System.out.println("   }");
        System.out.println("   ");
        System.out.println("   // 好的做法");
        System.out.println("   List<Integer> list = new ArrayList<>(1000); // 预分配");
        System.out.println("   for (int i = 0; i < 1000; i++) {");
        System.out.println("       list.add(i); // 不会扩容");
        System.out.println("   }");
        System.out.println("   ```\n");
        
        System.out.println("2. 循环展开");
        System.out.println("   优化循环性能，减少判断次数：");
        
        // 普通循环
        long start = System.nanoTime();
        int[] arr1 = new int[1000000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        long normalTime = System.nanoTime() - start;
        
        // 循环展开
        start = System.nanoTime();
        int[] arr2 = new int[1000000];
        int i = 0;
        for (; i < arr2.length - 3; i += 4) {
            arr2[i] = i;
            arr2[i+1] = i+1;
            arr2[i+2] = i+2;
            arr2[i+3] = i+3;
        }
        for (; i < arr2.length; i++) {
            arr2[i] = i;
        }
        long unrolledTime = System.nanoTime() - start;
        
        System.out.println("   普通循环时间：" + normalTime + " ns");
        System.out.println("   展开循环时间：" + unrolledTime + " ns");
        System.out.println("   性能提升：" + ((normalTime - unrolledTime) * 100.0 / normalTime) + "%\n");
        
        System.out.println("3. 缓存友好的访问模式");
        System.out.println("   二维数组的行优先 vs 列优先：");
        
        int size = 1000;
        int[][] matrix = new int[size][size];
        
        // 行优先（缓存友好）
        start = System.nanoTime();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = row + col;
            }
        }
        long rowMajorTime = System.nanoTime() - start;
        
        // 列优先（缓存不友好）
        start = System.nanoTime();
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = row + col;
            }
        }
        long colMajorTime = System.nanoTime() - start;
        
        System.out.println("   行优先访问时间：" + rowMajorTime + " ns");
        System.out.println("   列优先访问时间：" + colMajorTime + " ns");
        System.out.println("   性能差异：列优先慢 " + (colMajorTime * 1.0 / rowMajorTime) + " 倍");
        System.out.println("   原因：行优先访问符合内存连续性，缓存命中率高\n");
        
        System.out.println("4. 避免数组越界检查");
        System.out.println("   Java会自动检查数组越界，但有时可以优化：");
        System.out.println("   ```java");
        System.out.println("   // 方法1：确保索引有效");
        System.out.println("   if (index >= 0 && index < array.length) {");
        System.out.println("       return array[index];");
        System.out.println("   }");
        System.out.println("   ");
        System.out.println("   // 方法2：使用位运算（当长度是2的幂）");
        System.out.println("   int index = hash & (array.length - 1); // 自动限制范围");
        System.out.println("   ```");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 5. 数组的实际应用场景
     */
    public static void realWorldApplications() {
        System.out.println("【实战应用】数组在实际项目中的应用\n");
        
        System.out.println("1. 环形缓冲区（Ring Buffer）");
        System.out.println("   用途：高性能队列，避免内存分配");
        
        // 简单的环形缓冲区实现
        class RingBuffer {
            private int[] buffer;
            private int head = 0;
            private int tail = 0;
            private int size = 0;
            
            public RingBuffer(int capacity) {
                buffer = new int[capacity];
            }
            
            public void add(int value) {
                buffer[tail] = value;
                tail = (tail + 1) % buffer.length;
                if (size < buffer.length) {
                    size++;
                } else {
                    head = (head + 1) % buffer.length;
                }
            }
            
            public Integer remove() {
                if (size == 0) return null;
                int value = buffer[head];
                head = (head + 1) % buffer.length;
                size--;
                return value;
            }
            
            public void display() {
                System.out.print("   Buffer: [");
                for (int i = 0; i < buffer.length; i++) {
                    if (i == head && i == tail && size == 0) {
                        System.out.print("H/T");
                    } else if (i == head) {
                        System.out.print("H");
                    } else if (i == tail) {
                        System.out.print("T");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(":" + buffer[i]);
                    if (i < buffer.length - 1) System.out.print(", ");
                }
                System.out.println("]");
            }
        }
        
        RingBuffer rb = new RingBuffer(5);
        System.out.println("   操作演示：");
        rb.display();
        
        for (int i = 1; i <= 3; i++) {
            rb.add(i * 10);
            System.out.println("   添加 " + (i * 10) + ":");
            rb.display();
        }
        
        rb.remove();
        System.out.println("   移除一个元素:");
        rb.display();
        
        for (int i = 4; i <= 7; i++) {
            rb.add(i * 10);
            System.out.println("   添加 " + (i * 10) + ":");
            rb.display();
        }
        System.out.println();
        
        System.out.println("2. 位图（BitMap）");
        System.out.println("   用途：海量数据去重、布隆过滤器基础");
        
        // 简单的位图实现
        class BitMap {
            private byte[] bits;
            private int size;
            
            public BitMap(int maxValue) {
                size = (maxValue + 7) / 8; // 向上取整
                bits = new byte[size];
            }
            
            public void set(int num) {
                int byteIndex = num / 8;
                int bitIndex = num % 8;
                bits[byteIndex] |= (1 << bitIndex);
            }
            
            public boolean contains(int num) {
                int byteIndex = num / 8;
                int bitIndex = num % 8;
                return (bits[byteIndex] & (1 << bitIndex)) != 0;
            }
            
            public void displayStats() {
                int setBits = 0;
                for (byte b : bits) {
                    setBits += Integer.bitCount(b & 0xFF);
                }
                System.out.println("   内存使用：" + size + " 字节");
                System.out.println("   可表示范围：0-" + (size * 8 - 1));
                System.out.println("   已设置位数：" + setBits);
            }
        }
        
        BitMap bitmap = new BitMap(1000);
        int[] numbers = {1, 5, 10, 100, 500, 999};
        
        System.out.println("   添加数字：" + Arrays.toString(numbers));
        for (int num : numbers) {
            bitmap.set(num);
        }
        
        bitmap.displayStats();
        
        System.out.println("   查询测试：");
        int[] testNums = {1, 2, 100, 1000};
        for (int num : testNums) {
            System.out.println("   " + num + " 存在？" + bitmap.contains(num));
        }
        System.out.println();
        
        System.out.println("3. 稀疏数组（Sparse Array）");
        System.out.println("   用途：压缩存储大量重复元素的数组");
        
        // 展示稀疏数组的概念
        int[][] sparseMatrix = {
            {0, 0, 3, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 4, 0, 0, 0},
            {0, 0, 0, 5, 0},
            {0, 0, 0, 0, 0}
        };
        
        System.out.println("   原始矩阵：");
        for (int[] row : sparseMatrix) {
            System.out.println("   " + Arrays.toString(row));
        }
        
        System.out.println("\n   稀疏数组表示：");
        System.out.println("   [行, 列, 值]");
        System.out.println("   [5,  5,  3]  <- 矩阵大小和非零元素个数");
        System.out.println("   [0,  2,  3]  <- 第一个非零元素");
        System.out.println("   [2,  1,  4]  <- 第二个非零元素");
        System.out.println("   [3,  3,  5]  <- 第三个非零元素");
        System.out.println("\n   空间节省：从25个int压缩到12个int");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
    }
    
    /**
     * 6. 动态数组的实现
     */
    public static void dynamicArrayImplementation() {
        System.out.println("【深度实现】自己实现一个动态数组\n");
        
        System.out.println("让我们实现一个简化版的ArrayList：\n");
        
        // 动态数组实现
        class DynamicArray<T> {
            private Object[] elements;
            private int size = 0;
            private static final int DEFAULT_CAPACITY = 10;
            
            public DynamicArray() {
                elements = new Object[DEFAULT_CAPACITY];
            }
            
            public void add(T element) {
                ensureCapacity();
                elements[size++] = element;
            }
            
            @SuppressWarnings("unchecked")
            public T get(int index) {
                if (index < 0 || index >= size) {
                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                return (T) elements[index];
            }
            
            public void set(int index, T element) {
                if (index < 0 || index >= size) {
                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                elements[index] = element;
            }
            
            public void insert(int index, T element) {
                if (index < 0 || index > size) {
                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                ensureCapacity();
                
                // 移动元素
                System.arraycopy(elements, index, elements, index + 1, size - index);
                elements[index] = element;
                size++;
            }
            
            public T remove(int index) {
                if (index < 0 || index >= size) {
                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                
                @SuppressWarnings("unchecked")
                T oldValue = (T) elements[index];
                
                // 移动元素
                int numMoved = size - index - 1;
                if (numMoved > 0) {
                    System.arraycopy(elements, index + 1, elements, index, numMoved);
                }
                
                elements[--size] = null; // 帮助GC
                return oldValue;
            }
            
            private void ensureCapacity() {
                if (size == elements.length) {
                    // 扩容策略：增长50%
                    int newCapacity = elements.length + (elements.length >> 1);
                    elements = Arrays.copyOf(elements, newCapacity);
                    System.out.println("   [扩容] 从 " + (size) + " 扩展到 " + newCapacity);
                }
            }
            
            public int size() {
                return size;
            }
            
            public int capacity() {
                return elements.length;
            }
            
            @Override
            public String toString() {
                if (size == 0) return "[]";
                
                StringBuilder sb = new StringBuilder("[");
                for (int i = 0; i < size; i++) {
                    sb.append(elements[i]);
                    if (i < size - 1) sb.append(", ");
                }
                sb.append("]");
                return sb.toString();
            }
        }
        
        // 测试动态数组
        System.out.println("测试我们的动态数组：");
        DynamicArray<Integer> dynArr = new DynamicArray<>();
        
        System.out.println("1. 添加元素测试：");
        for (int i = 1; i <= 15; i++) {
            dynArr.add(i * 10);
            if (i % 5 == 0) {
                System.out.println("   添加" + i + "个元素后：" + dynArr);
                System.out.println("   大小：" + dynArr.size() + "，容量：" + dynArr.capacity());
            }
        }
        
        System.out.println("\n2. 插入元素测试：");
        System.out.println("   插入前：" + dynArr);
        dynArr.insert(5, 999);
        System.out.println("   在位置5插入999后：" + dynArr);
        
        System.out.println("\n3. 删除元素测试：");
        Integer removed = dynArr.remove(5);
        System.out.println("   删除位置5的元素(" + removed + ")后：" + dynArr);
        
        System.out.println("\n4. 性能分析：");
        System.out.println("   添加 n 个元素的时间复杂度：");
        System.out.println("   - 平均情况：O(1) - 摊销分析");
        System.out.println("   - 最坏情况：O(n) - 需要扩容时");
        System.out.println("   ");
        System.out.println("   扩容次数：O(log n)");
        System.out.println("   总复制次数：n + n/2 + n/4 + ... ≈ 2n");
        System.out.println("   平均每个元素被复制：2次");
        
        System.out.println("\n【总结】数组的精髓");
        System.out.println("├─ 简单但不简陋：连续内存带来的高效");
        System.out.println("├─ 权衡的艺术：空间连续性 vs 插入删除效率");
        System.out.println("├─ CPU友好：缓存局部性的完美体现");
        System.out.println("└─ 基石地位：其他数据结构的构建基础");
        
        System.out.println("\n记住：选择数据结构就是选择取舍！");
        System.out.println("数组牺牲了动态性，换来了访问效率。");
        System.out.println("这种取舍，正是计算机科学的精髓所在。");
    }
}