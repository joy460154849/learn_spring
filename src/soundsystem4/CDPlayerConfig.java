package soundsystem4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration//通过Java代码定义了spring的装配规则，
/**
 *通过该方式，可以把配置分开，分开配置 
 */
@Import(CDConfig.class)
/**
 *加载配置文件，这样xml中的配置的bean和JavaConfig中配置bean同时被加载进来
 */
@ImportResource("classpath:spring.xml")
public class CDPlayerConfig {

	
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
}
