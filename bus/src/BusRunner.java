import java.time.LocalDate;

import com.xworkz.bus.dao.BusDAO;
import com.xworkz.bus.dao.BusDAOImpl;
import com.xworkz.bus.entity.BusEntity;

public class BusRunner {
	public static void main(String[] args) {
		
		BusEntity busentity = new BusEntity();
		busentity.setId(1);
		busentity.setLocation("bhatkal");
		busentity.setCreatedDate(LocalDate.now());
		busentity.setUpdatedDate(LocalDate.now());
		busentity.setCreatedBy("sharan");
		busentity.setUpdatedBy("sharan");
		busentity.setColor("red");
		busentity.setPrice(50000D);
		busentity.setSeats(20D);
		
		BusEntity busentity1 = new BusEntity(2, "bangalore", LocalDate.now(), LocalDate.now(), "SHARAN", "SHARAN", "GREEN", 20000D, 30D);
		
		BusDAO busdao = new BusDAOImpl();
		
		
	//	boolean saved = busdao.save(busentity);
	//	boolean save = busdao.save(busentity1);
	//	System.out.println(saved);
	//	System.out.println(save);
		
	//	BusEntity detail = busdao.findById(1);
	//	System.out.println(detail);
		BusEntity info = busdao.findById(2);
		System.out.println(info);
		
	//	busdao.updateNameAndLocationById("white", "mangalore", 1);
	//	busdao.deleteById(2);
	}

}
