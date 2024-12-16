package TestNgLearning;

import org.testng.annotations.Test;

public class Test1 {

    @Test(groups = {"Sanity","regression"})
    public void test1MethodA(){
        System.out.println("Executing test1MethodA on thread: " + Thread.currentThread().getId());
    }
    @Test(groups = {"regression"})
    public void test1MethodB(){
        System.out.println("Test1 Method B"+ Thread.currentThread().getId());
    }
}


