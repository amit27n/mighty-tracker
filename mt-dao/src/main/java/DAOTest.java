
import java.sql.SQLException;
import java.sql.Timestamp;

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
		ent.setDateCreated(new Timestamp(System.currentTimeMillis()));
		ent.setCreatedBy("Admin");
		System.out.println("Bean created");
		int result;
		try {
			result = entDAO.insertEntity(ent);
			if(result==0){
				System.out.println("Creating Entity Failed");
			}else{
			System.out.println("Record inserted successfully");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
