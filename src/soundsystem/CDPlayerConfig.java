package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan:
 * 1.默认扫描和配置类相同的包以及该包的子包
 * 2.指定扫描的包@ComponentScan("soundsystem");
 * 3.@ComponentScan(basePackages="soundsystem");
 * 4.@ComponentScan(basePackages={"soundsystem","soundsystem2"});
 * 注意：2,3,4中的方法设置基础包是String类型的，安全性角度来说是不安全的，建议是采用组件的方式；
 * @ComponentScan(basePackagesClasses={soundsystem.calss,soundsystem2.class});
 */
@Configuration//通过Java代码定义了spring的装配规则，
@ComponentScan//在spring中启动组件扫描
public class CDPlayerConfig {

}
