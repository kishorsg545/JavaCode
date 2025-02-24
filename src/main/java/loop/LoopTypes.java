package loop;

public class LoopTypes
{

    /*1-Decision Making statements
if statements
-------------
        if(condition){
//code to be executed
}*/
    void myGrade()
    {
        String myGrade = "A+";
        if (myGrade.equals("A+")) {
            System.out.println("I am eligible for scholarship");
        }
    }
/*-----------
        if(condition){
//code if condition is true
}else{
//code if condition is false
}*/

void myGrade1()
{
    String myGrade = "A+";
    if (myGrade.equals("A+")) {
        System.out.println("I am eligible for scholarship");
    }else
    {
        System.out.println("I am not eligible for scholarship");
    }
}

/*------------
        if(condition1){
//code to be executed if condition1 is true
}else if(condition2){
//code to be executed if condition2 is true
}
else if(condition3){
//code to be executed if condition3 is true
}
...
        else{
//code to be executed if all the conditions are false
}*/

    void myGrade2()
    {
        String myGrade = "B+";
        String myGrade1 = "A";
        if (myGrade.equals("A+")) {
            System.out.println("I am eligible for scholarship");
        }else if(myGrade1.equals("A"))
        {
            System.out.println("I am eligible for scholarship2");
        }else
        {
            System.out.println("I am not eligible for scholarship");
        }
    }


/*--------------

        if(condition){
    //code to be executed
    if(condition){
        //code to be executed
    }*/

    void myGrade3()
    {
        String myGrade = "B+";
        String myGrade1 = "A";
        if (myGrade.equals("A+")) {
            System.out.println("I am eligible for scholarship");
            if(myGrade1.equals("A"))
            {
                System.out.println("I am eligible for scholarship2");
            }
        }
        else
        {
            System.out.println("I am not eligible for scholarship for students");
        }
    }

    /*-------------
            switch statement

    switch(expression){
        case value1:
            //code to be executed;
            break;  //optional
        case value2:
            //code to be executed;
            break;  //optional

......

        default:
            code to be executed if all cases are not matched;
    }*/
    void fruitCharges ()
    {
        String fruitName="apple";
        switch(fruitName)
        {
            case "apple":
                System.out.println("100 rupees per Kg");
                break;
            case "banana":
                System.out.println("20 rupees per Kg");
                break;
            case "orange":
                System.out.println("50 rupees per Kg");
                break;
            default:
                System.out.println("not available");
                break;
        }
    }


  /*  2-Loop statements
            ----------------
    do while loop
            ----------
    do{
//code to be executed / loop body
//update statement
    }while (condition);*/

    void myGrade4()
    {
        String myGrade = "B+";
        String myGrade1 = "A";
        do {
            System.out.println("I am not eligible for scholarship for students");

        }while(myGrade.equals("A+"));
        {
            System.out.println("I am eligible for scholarship for students");
        }

    }


  /*  while loop
            ----------
    while (condition){
//code to be executed
        Increment / decrement statement
    }*/
  void myGrade5()
  {
      String myGrade = "B+";
      String myGrade1 = "A";
      while(myGrade.equals("B+"))
      {
          System.out.println("I am eligible for scholarship for students testing");
          break;
      }

  }

  /*  ----------
    for loop
            -----
    for(initialization; condition; increment/decrement){
//statement or code to be executed
    }
    ----------
    for (initialization; termination; increment) {
        // Outer loop block
        for (initialization; termination; increment) {
            // Inner loop block
        }
    }*/

    void multiplicationTable()
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println("5*"+i+"="+5*i);
        }
    }


   /* -----------------
    for-each loop
            --------------------------------
    for(data_type variable : array_name){
//code to be executed
    }*/
    void multiplicationTable1()
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for (int i:arr)
        {
            int i1 = i * 6;
            System.out.println("6*"+i+"="+i1);
        }
    }

      /*----------------------
            3-Jump statements
    break statement
    continue statement:-continue causes the loop to skip the remaining code
    in the current iteration and immediately proceed to the next iteration.*/

    void evenNumber()
    {
       outer:
        for (int i=1;i<=10;i++) {
            inner:
            for (int j = 1; j <= 10; j++) {
                if (i % 2 != 0) {
                    continue outer;
                }
            }
            System.out.println("2*"+i+"="+2*i);
        }
    }


    public static void main(String[] args)
    {
        LoopTypes loop=new LoopTypes();
        loop.myGrade();
        loop.myGrade1();
        loop.myGrade2();
        loop.myGrade3();
        loop.fruitCharges();
        loop.myGrade4();
        loop.myGrade5();
        loop.multiplicationTable();
        loop.multiplicationTable1();
        loop.evenNumber();


    }

}
