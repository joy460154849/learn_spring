package soundsystem4;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	/**
	 * @Autowired:声明自动装配，让spring自动满足bean依赖的一种方法
	 * 			换句话来说，就是通过@Autowired来实例化并且会传入一个一可设置的bean 
	 * 			为了避免没有找到该bean，一般写明是否必要
	 *  @Autowired(required=false),spring在实现自动装配的时候，若没有匹配的bean，spring会让这个bean处于未匹配状态
	 *  若有多个bean可匹配的请求，spring会抛出异常
	 *  @Autowired 同@       Inject
	 */
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private SgtPeppers player;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
	}
	
	@Test
	public void play(){
		player.play();
	}

}
