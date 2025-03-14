package enumeration;

import java.util.EnumSet;

public class EnumSetDemo
{
    public static void main(String[] args) {
        EnumSet<Day> days = EnumSet.allOf(Day.class);
        for(Day day:days)
        {
            System.out.println(day);
        }

        EnumSet<Day> days1 = EnumSet.of(Day.MONDAY,Day.SUNDAY);
        for(Day day:days1)
        {
            System.out.println(day);
        }

        EnumSet<Grades> grades = EnumSet.range(Grades.A,Grades.B);
        for(Grades grade:grades)
        {
            System.out.println(grade);
        }
        EnumSet<Grades> grades1 = EnumSet.complementOf(grades);
        for(Grades grade:grades1)
        {
            System.out.println(grade);
        }
    }
}
