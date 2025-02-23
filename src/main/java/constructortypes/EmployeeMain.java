package constructortypes;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        Employee employeeInfo=new Employee("Ram","Raja",30,'M');
        Employee employeeInfo1=new Employee("Rani","Vasudev",30,'F');
        Employee deafultConstructor=new Employee();

        employeeInfo.getAge();
        employeeInfo.getGender();

        employeeInfo1.getAge();
        employeeInfo1.getGender();

        deafultConstructor.getAge();
        deafultConstructor.getGender();

    }
}
