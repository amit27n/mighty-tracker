package com.mt.tracker.mighty.test;
import static org.junit.Assert.*;

import java.sql.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.mt.tracker.mighty.bean.Entity;
import com.mt.tracker.mighty.dao.DAOFactory;
import com.mt.tracker.mighty.dao.EntityDAO;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class DAOTest {

	Entity e=null;
	int eid;
	String ename=null;
	String edesc=null;
	String etype=null;
	Timestamp time;
	String createdby=null;
	EntityDAO entDAO=null;
	int affectedRows=0;
	
	@Test
	public void testInsertNewEntity() throws SQLException{
		
		DAOFactory db=DAOFactory.getInstance();
		
		entDAO=db.getEntityDAO();
		e=getEntityRecord(102,"K.K. Hospital","KK womens and Child care Hospital in Healthcare",null,new Timestamp(System.currentTimeMillis()),"Admin");
		affectedRows=entDAO.insertEntity(e);
		assertEquals(affectedRows,1);
		
	}
	
	@Test(expected = SQLIntegrityConstraintViolationException.class)
	public void testInsertEntityExists() throws SQLException{
		
		DAOFactory db=DAOFactory.getInstance();
		
		entDAO=db.getEntityDAO();
		e=getEntityRecord(101,"Changi Hospital","Changi general Hospital in Healthcaresector",null,new Timestamp(System.currentTimeMillis()),"Admin");
		affectedRows=entDAO.insertEntity(e);
	
		
	}

	@Test(expected = SQLDataException.class)
	public void testInsertEntityFails() throws SQLException{
		
		DAOFactory db=DAOFactory.getInstance();
		
		entDAO=db.getEntityDAO();
		e=getEntityRecord(9726273,"Changi Hospital","Changi general Hospital in Healthcaresector",null,new Timestamp(System.currentTimeMillis()),"Admin");
		affectedRows=entDAO.insertEntity(e);
		
		
	}
	private Entity getEntityRecord(int id, String name, String desc, String type, Timestamp t,
			String created) {
		Entity ent=new Entity();
		ent.setEntityId(id);
		ent.setEntityName(name);
		ent.setEntityDesc(desc);
		ent.setEntityType(type);
		ent.setDateCreated(new Timestamp(t.getTime()));
		ent.setCreatedBy(created);
		System.out.println("Java Bean created");
		return ent;
	}

	

}
