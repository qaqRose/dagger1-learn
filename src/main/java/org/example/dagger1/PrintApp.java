package org.example.dagger1;

import dagger.ObjectGraph;
import org.example.dagger1.module.PrintModule;

import javax.inject.Inject;

/**
 * 打印app
 * 提供打印服务
 */
public class PrintApp {
    @Inject Printer printer;
    @Inject PrintDriver printDriver;

    void print() {
        Connection connect = printDriver.connect();
        printer.print(connect);
    }

    public static void main(String[] args) {
        // 通过打印模块来构造一个依赖图
        ObjectGraph objectGraph = ObjectGraph.create(new PrintModule());
        PrintApp printApp = objectGraph.get(PrintApp.class);
        printApp.print();
    }
}
