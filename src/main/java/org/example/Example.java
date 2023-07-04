package org.example;

import javax.inject.Inject;

/**
 * @author qiuxq
 * @date 2023/6/30
 */
public class Example {
//    @Inject
    private Dependency dependency;

    @Inject
    public Example(Dependency dependency) {
        this.dependency = dependency;
        // 构造方法注入
    }

//    @Inject
//    public void setDependency(Dependency dependency) {
//        // 方法注入
//        this.dependency = dependency;
//    }

    public void printfDependency() {
        System.out.println("print " + dependency);
    }
}