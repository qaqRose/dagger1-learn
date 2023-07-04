package org.example;

import dagger.ObjectGraph;

/**
 * @author qiuxq
 * @date 2023/6/30
 */
public class Main {
    public static void main(String[] args) {

        ObjectGraph objectGraph = ObjectGraph.create(new ExampleModule());
        Example example = objectGraph.get(Example.class);
        example.printfDependency();
    }
}