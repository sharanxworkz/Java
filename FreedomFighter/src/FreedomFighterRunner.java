import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfighter.dao.FreedomFighterDAO;
import com.xworkz.freedomfighter.dao.FreedomFighterDAOImpl;
import com.xworkz.freedomfighter.entity.FreedomFighterEntity;

public class FreedomFighterRunner {
	public static void main(String[] args) {
		FreedomFighterEntity freedomfighterentity = new FreedomFighterEntity("sharan", "sharan", LocalDate.now(), LocalDate.now(), 1, "sangoli rayanna", "chittur", LocalDate.now());
		FreedomFighterEntity freedomfighterentity1 = new FreedomFighterEntity("sharan", "sharan", LocalDate.now(), LocalDate.now(), 2, "umapathy", "chikmaglur", LocalDate.now());

		List<FreedomFighterEntity> list =new ArrayList<FreedomFighterEntity>();
		list.add(freedomfighterentity);
		list.add(freedomfighterentity1);
		FreedomFighterDAO dao = new FreedomFighterDAOImpl();
		boolean lists = dao.saveAll(list);
		System.out.println(lists);
		
		
	}
}
	
		

