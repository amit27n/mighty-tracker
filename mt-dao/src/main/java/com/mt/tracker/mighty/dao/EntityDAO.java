package com.mt.tracker.mighty.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mt.tracker.mighty.bean.Entity;

public class EntityDAO {
	
		private static final String SQL_INSERT="Insert into Entity Values (?,?,?,?,?,?)";
	
		private DAOFactory daoFactory;

		public EntityDAO(DAOFactory daoFactory) {
			
			this.daoFactory = daoFactory;
		}
		Connection conn=null;
		public int insertEntity(Entity entity) throws SQLException{
			int affectedRows=0;
			try {
				conn=daoFactory.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(SQL_INSERT);
				pstmt.setInt(1, entity.getEntityId());
				pstmt.setString(2, entity.getEntityName());
				pstmt.setString(3, entity.getEntityDesc());
				pstmt.setString(4, entity.getEntityType());
				pstmt.setTimestamp(5, entity.getDateCreated());;
				pstmt.setString(6, entity.getCreatedBy());
				
				affectedRows=pstmt.executeUpdate();
				
				
			} catch (SQLException e) {
				if(conn!=null){
					try {
						conn.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				throw e;
			}
			return affectedRows;
			
		}
}
