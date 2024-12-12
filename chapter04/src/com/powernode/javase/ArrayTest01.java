package com.powernode.javase;

/**
 * 1.数组是一种用于存储多个相同数据类型元素的容器
 * 2.例如一个整数型数组： int[] nums（变量名） = {100,200,300};
 * 3.例如一个字符串数组： String[] names = {"xiaohong","jack"};
 * 4.数组是一种引用数据类型，隐式继承Object，因此数组可以调用Object类中的方法。
 * 5.数组对象存储在堆内存中。
 *
 * 数组的特点：
 * 1.长度一旦确定不可变；
 * 2.数组中元素类型一致，占用空间大小相同；
 * 3.数组中每个元素的内存地址连续；
 * 4.每个元素都有索引，索引从0开始递增；
 * 5.以首元素的地址作为数组对象在堆内存的地址，因为后面地址都可计算得出
 *
 * 数组的优点：
 *查询效率极高→ 因为元素时连续的，空间大小又一致，只要知道下标就可以算出元素的内存地址，无论100个还是100w个，查询时间复杂度不变，都为O（1）
 * 数组的缺点：
 * 随机删除或者增加其中某一个元素时，后面需要位移，因为需要保证连续，所以随着元素增加，时间复杂度增加O（n）
 * 没有办法存储特别巨大的数据，因为堆内存可能没有一块太大的连续空间
 *
 * 静态初始化一维数组
 *  第一种方式：
 *      数据类型[] 变量名 = new 数据类型[]{元素1，元素2...... }
 *      比如 int[] arr = new int[]{1,2,3,....}
 *  第二种方式：
 *      数据类型[] 变量名 = new {元素1，元素2....}
 *      比如 int[] = {1,2,3,4....}
 *如果大家在创建数组的时候，提前知道数组中具体存储什么数据，用静态初始化
 *
 * 访问数组中的元素
 * nums[0].sout
 *
 * 修改数组中的元素
 * nums[0] = 1;
 *
 * 数组下标越界异常,没有的下标
 * ArrayIndexOutOfBoundsException
 *
 *访问最后一个元素：
 *nums[nums.length - 1]
 *
 * 遍历：(length是实际长度，不是下标)
 *  for(int i=0;i<citys.length;i++){
 *         System.out.println(citys[i]);
 *   }
 *
 *
 *→增强for循环
 *语法结构：
 *  for（元素数据类型 变量名 ： 数组名）{
 *  }
 *  这里的变量名代表数组中的每个元素
 *
 *  for each的优点：遍历代码简洁
 *  for each的缺点：没有下标，无法修改(如果需求中需要用到下标就不行)
 *
 * 如何动态初始化数组？
 *1.int[] arr = new int[4];
 *2.Object[] obj = new Object[5];
 *数组动态初始化的时候，确定长度，并且每个元素采用默认值。
 *
 */
public class ArrayTest01 {
    public static void main(String[] args) { //String[]是一个一维数组
        int[] arr = new int[]{100,200,300};
        String[] names = new String[]{"xiaohong","jack"};

        //省略new
        int[] nums = {1,2,3,4};
        String[] citys = {"beijing","shanghai"};

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal[] animals = {a1,a2,a3,new Animal()};

        //读nums中的一个元素
        System.out.println(nums[0]);

        //改一个元素
        nums[1]=10000;
        System.out.println(nums[1]);

        //下标越界异常
        //System.out.println(nums[4]);

        //访问最后一个元素
        System.out.println(nums[nums.length - 1]);

        //遍历：for循环
        for(int i=0;i<citys.length;i++){
            System.out.println(citys[i]);
        }

        //从后往前遍历：
        for(int i =citys.length-1;i>=0;i--){
            System.out.println(citys[i]);
        }
    }
}
