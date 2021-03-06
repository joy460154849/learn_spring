package soundsystem3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer{

	private CompactDisc cd;
	
	@Autowired
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play(){
		cd.play();
	}
}
