## 二分查找
### 二分查找基础知识
二分查找是计算机科学中最基本、最有用的算法之一。 它描述了在有序集合中搜索特定值的过程。

> ### 二分查找中使用的术语
> * 目标 Target —— 要查找的值
> * 索引 Index —— 要查找的当前位置
> * 左、右指示符 Left，Right —— 用来维持查找空间的指标
> * 中间指示符 Mid —— 用来应用条件来确定我们应该向左查找还是向右查找的索引
>
> 二分查找原理  
> 二分查找是一种在每次比较之后将查找空间一分为二的算法。每次需要查找集合中的索引或元素时，都应该考虑二分查找。如果集合是无序的，我们可以总是在应用二分查找之前先对其进行排序  

![二分查找](https://images2018.cnblogs.com/blog/1281268/201805/1281268-20180509063436446-1450605939.png)

[引用来源](https://www.jianshu.com/p/b72c80fdb240)

### 二分法模板
```java
class Solution{
    public int binarySearchTemplate(int[] arr, int target){
        if(arr == null && arr.length <= 0){
            return  -1;
        }
        
        int left = 0;
        int right = arr.length - 1;
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] < target){
                left = mid;
            } else {
                right = mid;
            }
        }
        
        if(arr[left] == target){ 
            return  left;   
        }
        if(arr[right] == target){
            return  right;
        }
        
        return -1;
    }
}
```

### 练习题
* [寻找旋转排序数组中的最小值](FindMinimum.java)
* [在排序数组中查找元素的第一个和最后一个位置](FindFirstAndLast.java)
* [找到 K 个最接近的元素]()