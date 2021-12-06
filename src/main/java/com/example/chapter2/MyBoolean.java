package com.example.chapter2;

/**
 * 规则：使用静态工厂方法代替构造器
 * 适用场景：为了达到创建对象的目的，除了可以使用公有的构造器之外，还可以使用静态工厂方法。
 * 例子：Boolean.valueOf(boolean b)
 */
public class MyBoolean {

    public static final MyBoolean TRUE = new MyBoolean(true);

    public static final MyBoolean FALSE = new MyBoolean(false);

    public final boolean value;

    public MyBoolean(boolean b) {
        this.value = b;
    }

    // 静态工厂方法
    public static MyBoolean valueOf(boolean b) {
        return (b ? TRUE : FALSE);
    }

    public static void main(String[] args) {
        MyBoolean value = MyBoolean.valueOf(true);
    }
}
