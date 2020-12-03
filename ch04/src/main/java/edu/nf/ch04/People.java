package edu.nf.ch04;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */
public class People {


    //先执行构造方法
    public People()
    {
        System.out.println("构造方法");
    }

    public void init()
    {
        System.out.println("初始化Bean");
    }


    public void destory()
    {
        System.out.println("结束Bean");
    }

    public void say()
    {
        System.out.println("Hello world");
    }

}
