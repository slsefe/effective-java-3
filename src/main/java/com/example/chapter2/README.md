# 第二章 创建和销毁对象

## 1. 用静态工厂方法代替构造器

### 使用场景

当一个类需要多个带有相同签名的构造器时，就是用静态工厂方法代替构造器，并且仔细地选择名称以突出静态工厂方法之间的区别。

### 优点

- 静态工厂方法有名称
- 在每次调用静态工厂方法的时候，不需要创建一个新的对象

### 缺点

类如果不含有public或protected的构造器，就不能被子类化。

### 静态工厂方法的一些惯用名称

```
1. from：类型转换方法，单个参数
Date date = Date.from(instant);
2. of：聚合方法，接收多个参数，将他们组合起来
Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);
3. valueOf：替代方法
Boolean value = Boolean.valueOf(true);
4. instance 或 getInstance
5. create 或 newInstance
```


## 2. 当构造器参数过多时使用builder

### 构造器和静态工厂方法的局限性

当构造器需要很多可选参数时，通常的做法是先创建一个只含有必须参数的构造器，再为可选的构造器逐一生成构造器。这样写出来的代码繁琐。

代码见Student.java

## 3. 用私有构造器或者枚举类型强化Singleton属性



