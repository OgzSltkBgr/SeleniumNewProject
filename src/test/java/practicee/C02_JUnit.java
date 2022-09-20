package practicee;

import org.junit.BeforeClass;
import org.junit.Test;

public class C02_JUnit {

    @BeforeClass
    public void setUp(){
        System.out.println("Before Class");
    }
    @Test
    public void test01(){
        System.out.println("Test 01");
    }
    @Test
    public void test02(){
        System.out.println("Test 02");
    }
    @Test
    public void test03(){
        System.out.println("Test 03");
    }
}
