package s2homework;

public class Bird extends Animal {
    Bird(String color, int age) {
        super.color = color;
        super.age = age;
    }

    @Override
    public void printInfo() {
        System.out.println("我是一只" + color + "的鸟！");
        System.out.println("今年" + age + "岁了！\n");
    }
}