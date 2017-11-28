package soundsystem2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//通过Java代码定义了spring的装配规则，
public class CDPlayerConfig {

	/**
	 * 声明简单的Bean
	 *@Bean：告诉spring这个方法返回一个对象，该对象要注册为spring应用上下文中的bean。bean默认ID是方法名即 sgtPeppers
	 *		更改bean id @Bean(name="xxxx")
	 */
	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
	/**
	 *实现注入（装配）
	 */
	@Bean
	public CDPlayer cdPlayer(){
		return new CDPlayer(sgtPeppers());
	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
}
