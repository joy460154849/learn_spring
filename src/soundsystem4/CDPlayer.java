package soundsystem4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

	@Autowired
	private CompactDisc cd;
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
}
