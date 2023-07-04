package org.example.dagger1.module;

import org.example.dagger1.Connection;
import org.example.dagger1.Printer;

/**
 * 斑马打印机
 */
public class ZebraPrinter implements Printer {
    @Override
    public void print(Connection connect) {
        if(connect.connected) {
            System.out.println("开始打印");
        } else {
            throw new RuntimeException("打印机未连接");
        }
    }
}
