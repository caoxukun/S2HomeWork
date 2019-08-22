package s2homework.huik;

public class Fish extends Animal {
    Fish(String weight, int age) {
        super.weight = weight;
        super.age = age;
    }
    @Override
    public void printInfo() {
        System.out.println("我是一条" + weight + "斤重的鱼！");
        System.out.println("今年" + age + "岁了！");
    }
}