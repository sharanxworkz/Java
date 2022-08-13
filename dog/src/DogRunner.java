import java.time.LocalDate;

import com.xworkz.dog.dao.DogDAO;
import com.xworkz.dog.dao.DogDAOImpl;
import com.xworkz.dog.entity.DogEntity;

public class DogRunner {

	public static void main(String[] args) {
		DogEntity dogentity = new DogEntity();
		dogentity.setId(1);
		dogentity.setName("gowri");
		dogentity.setBreed("Labroder");
		dogentity.setCreatedBy("sharan");
		dogentity.setUpdatedBy("sharan");
		dogentity.setCreatedDate(LocalDate.now());
		dogentity.setUpdatedDate(LocalDate.now());
		dogentity.setAge(1);
		
		DogDAO dogdao = new DogDAOImpl();
		boolean save = dogdao.save(dogentity);
		System.out.println(save);
		
	DogEntity detail=	dogdao.findById(1);
	System.out.println(detail);
		dogdao.updateBreedById("germanshepherd", 1);
	}

}
