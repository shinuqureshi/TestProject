package com.test;
import static org.junit.Assert.*;


import com.company.Main;

public class TestClass {

     Main main = new Main() ;

    // for creating test case we need to import junit

    public static  void add_test(int firstNumber ,int secondNumber)
    {
        int result =0;
        //assertEquals(output ,Main.add(firstNumber , secondNumber));
        assertEquals(4 ,Main.add(2 , 2));


    }


}
