package org.example;

import dagger.Module;
import dagger.Provides;

/**
 * @author qiuxq
 * @date 2023/6/30
 */
@Module(injects = Example.class, library = true)
public class ExampleModule {

    @Provides
    Dependency provideDependency() {
        return new Dependency();
    }
}
