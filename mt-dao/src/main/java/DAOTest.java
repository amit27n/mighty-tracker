import java.sql.Date;

import com.mt.tracker.mighty.bean.Entity;
import com.mt.tracker.mighty.dao.DAOFactory;
import com.mt.tracker.mighty.dao.EntityDAO;

public class DAOTest {

	public static void main(String[] args) {
		
		
		DAOFactory db=DAOFactory.getInstance();
		
		EntityDAO entDAO=db.getEntityDAO();
		
		//Create Bean
		
		Entity ent=new Entity();
		ent.setEntityId(101);
		ent.setEntityName("Changi Hospital");
		ent.setEntityDesc("Changi general Hospital in Healthcaresector");
		ent.setEntityType(null);
		ent.setDateCreated(new Date(27, 7, 16));
		ent.setCreatedBy("Admin");
		System.out.println("Bean created");
		entDAO.insertEntity(ent);
		System.out.println("Record inserted successfully");
		
	}

}
