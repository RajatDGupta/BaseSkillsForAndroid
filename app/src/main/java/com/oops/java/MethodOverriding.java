package com.oops.java;

import com.solidprinciple.B;

/**
 * Created by 1000292 on 16-12-2022
 * BFDL
 * PUNE.
 */


class A {
    private String a="";
     private void method()
    {
        System.out.println("Hello");
    }
}

public class MethodOverriding extends A {

     void method()
    {
        System.out.println("Hello");
    }

    public static void main(String args[])
    {
        MethodOverriding b = new MethodOverriding();
        b.method();
    }
}


/*
*    Parent           child
*
*    Public           Public
*    protected        Public,Protected
*    Default          Public,Protected,Default
*    private          Public,Protected,Default,Private
* */