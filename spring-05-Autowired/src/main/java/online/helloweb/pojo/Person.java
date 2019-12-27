package online.helloweb.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jack
 * @date 2019/11/1 0001
 */
public class Person {
    @Autowired
    private Cat cat2;
    @Autowired
    private Dog dog2;
    private String name;

    public Cat getCat2() {
        return cat2;
    }

    public void setCat2(Cat cat2) {
        this.cat2 = cat2;
    }

    public Dog getDog2() {
        return dog2;
    }

    public void setDog2(Dog dog2) {
        this.dog2 = dog2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat2=" + cat2 +
                ", dog2=" + dog2 +
                ", name='" + name + '\'' +
                '}';
    }
}
