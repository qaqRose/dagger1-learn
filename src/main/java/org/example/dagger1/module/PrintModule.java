package org.example.dagger1.module;

import dagger.Module;
import dagger.Provides;
import org.example.dagger1.PrintApp;
import org.example.dagger1.PrintDriver;
import org.example.dagger1.Printer;

import javax.inject.Singleton;

/**
 * 打印模块
 */
@Module(injects = PrintApp.class, library = true)  // <1> injects表示注入类型， library表示可在外部依赖
public class PrintModule {

    @Provides       // <2> 方法注解，方法的返回值可用于满足依赖
    @Singleton      // 单例， 在所有注入的地方dagger都不会重新创建
    Printer providerPrinter() {
        return new ZebraPrinter();
    }

    @Provides
    PrintDriver providerDriver() {
        return new ZebraPrintDriver();
    }

}
