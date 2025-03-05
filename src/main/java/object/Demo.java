package object;

import java.util.Objects;

public class Demo implements Cloneable
{

    private String name;
    private int age;
    private char gender;
    private int aadharNumber;

    public Demo(String name, int age, char gender, int aadharNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.aadharNumber = aadharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

/*
    @Override
    public int hashCode()
    {
        return Objects.hash(name,age,gender,aadharNumber);
    }

    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(o == null ||(getClass() !=o.getClass()))
        {
            return false;
        }
        Demo demo=(Demo)o;

        return age==demo.getAge() && gender==demo.getGender()&& aadharNumber==demo.getAadharNumber()
                && Objects.equals(name,demo.getName());
    }
*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return age == demo.age && gender == demo.gender && aadharNumber == demo.aadharNumber && Objects.equals(name, demo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, aadharNumber);
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", aadharNumber=" + aadharNumber +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
