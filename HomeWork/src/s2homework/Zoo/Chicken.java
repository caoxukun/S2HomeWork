package s2homework.Zoo;

public class Chicken extends Animal1 {

    /**
     * 无参构造方法
     */
    public Chicken() {
        super();
    }

    /**
     * 带参构造方法
     * @param name 姓名
     * @param strain 品种
     */
    public Chicken(String name, String strain) {
        super(name, strain);
    }

    /**
     * 重写父类print()方法
     */
    @Override
    public void print() {
        System.out.println("我叫"+super.getName()+",是一只"+super.getStrain()+"\n我喜欢吃虫子！\n我会打鸣！\n");
    }

}
