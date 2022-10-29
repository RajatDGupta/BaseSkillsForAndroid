package com.java_programming.pattern;

/**
 * Created by 1000292 on 15-10-2022
 * BFDL
 * PUNE.
 */

/**
 * https://medium.com/swlh/a-complete-guide-on-singleton-design-pattern-in-java-846c2f8df5fc
 */
class Singleton {

    private static volatile Singleton instance;
    private Singleton() {}
    
    public static Singleton getInstance(){
        if(instance != null)
        {
            return instance;
        }

        synchronized (Singleton.class) {
            if(instance == null)
            {
                instance = new Singleton();
            }
        }
        return instance;

    }

    public static void main(String[] args) {
          System.out.println( Singleton.getInstance());
    }
}


