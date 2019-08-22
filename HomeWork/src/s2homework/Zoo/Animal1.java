package s2homework.Zoo;

public abstract class Animal1 {

    private String name; //姓名

    private String strain; //品种

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    /**
     * 无参构造方法
     */
    public Animal1() {
        super();
    }

    /**
     * 有参构造方法
     * @param name 姓名
     * @param strain 品种
     */
    public Animal1(String name, String strain) {
        super();
        this.name = name;
        this.strain = strain;
    }

    public abstract void print();
}
