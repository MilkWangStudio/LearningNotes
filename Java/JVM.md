# JVM
## 类加载器
一个Java类到最后被我们使用，需要经过编译、加载的过程，才能变成一个Class对象。  
类加载器就是负责加载过程的，JVM启动时会自动创建三种类加载器：  
- 启动类加载器（Bootstrap ClassLoader）：Java核心类库加载
- 扩展类加载器（Extension ClassLoader）：Java ext目录下的jar包和类文件
- 应用类加载器（Application ClassLoader）：当前应用ClassPath下的所有Jar包和类文件

除了以上三种外，我们还可以创建自定义的类加载器。  

### 双亲委派
ClassLoader里的loadClass方法实现了该逻辑。  
当前ClassLoader加载类时，会首先调用父级加载器的加载方法，一直到启动类加载器，当前加载器差不倒时，才会逐层执行子级加载器方法。  
- 避免核心类被修改
- 避免Class重复加载

在双亲委派的基础上，可能会出现BootstrapClassLoader 需要读取应用类加载器的情况，比如java.lang.Driver的数据库驱动，具体实现都是不同厂商自己做的。  

### 如何破坏双亲委派
- 继承ClassLoader类，重写laodClass方法，在方法中自定义要使用的类加载器
- 设置当前线程的ContextClassLoader
