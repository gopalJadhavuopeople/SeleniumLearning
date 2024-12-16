package TestNgLearning;

import org.testng.annotations.Test;

public class Test2 {

    @Test(groups = {"Sanity"})
    public void test2MethodA(){
        System.out.println("Test2 Method A"+ Thread.currentThread().getId());
    }
    @Test(groups = {"regression"})
    public void test2MethodB(){
        System.out.println("Test2 Method B"+ Thread.currentThread().getId());
    }
}
