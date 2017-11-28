package soundsystem2;

import org.springframework.stereotype.Component;

/**
 *@Component:
 *1.表明该类会作为组件类，
 *2.并告诉spring要为这个类创建bean，这个bean的ID默认是类名（该类名的第一个字母小写），若改名，则@Component("xxx")或者
 *	@Named("xxxx")
 *
 *
 */
@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt.Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	@Override
	public void play() {
		System.out.println("Playing "+title+" by "+artist);
	}

}
