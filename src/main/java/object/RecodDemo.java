package object;

import java.lang.reflect.RecordComponent;

public class RecodDemo {
    public static void main(String[] args) {
        PersonRecord p = new PersonRecord("Raj", "Testing");

        System.out.println(p.name());
        System.out.println(p);

        Class personClass = p.getClass();
        System.out.println(personClass.isRecord());
        RecordComponent[] recordComponents = personClass.getRecordComponents();
        for (RecordComponent r: recordComponents) {
            System.out.println(r.toString());
        }
    }
}
