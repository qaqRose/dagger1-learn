package org.example.dagger1.module;

import org.example.dagger1.Connection;
import org.example.dagger1.PrintDriver;

/**
 * 斑马打印机驱动
 */
public class ZebraPrintDriver implements PrintDriver {
    @Override
    public Connection connect() {
        // 随机失败
        if(System.currentTimeMillis() % 2 > 0) {
            System.out.println("打印机连接失败");
            return new Connection(false);
        }
        System.out.println("打印机连接成功");
        return new Connection(true);
    }
}
