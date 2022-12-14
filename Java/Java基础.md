# Java基础
## 数据类型
Java中有8种基本数据类型，括号中为引用类型。
- 数值型
    - 整数型：byte(Byte)、short(Short)、int(Integer)、long(Long)
    - 浮点型：float(Float)、double(Double)
- 字符型：char(Character)
- 布尔型：boolean(Boolean)

所占字节大小如下，64位、32位机所占字节相同。

|值类型|占用内存|取值范围|备注|
|:-:|:-:|:-:|:-:|
|byte|1字节|-128（-2^7）~ 127（2^7-1）|256个数字|
|short|2字节|-32768（-2^15）~ 32767（2^15 - 1）|6万五千多个数字|
|int|4字节|-2,147,483,648（-2^31）~ 2,147,483,647（2^31 - 1）|42亿多个数字|
|long|8字节|（-2^63）~ （2^63 -1）|超级多|

字节中的第一个位会拿来当符号标志位。  
每个值类型均有对应的引用类型，可相互复制，会自动进行拆箱与装箱操作。
> 自动拆箱、装箱是JDK5.0引入的

值类型存储在栈中。  
应用类型存储在堆中。  


## ArrayList实现
### modcount字段
```java
package com.milkwang.cupid.domain.po;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (Integer i : list) {
            list.add(10);
        }
    }
}
```
