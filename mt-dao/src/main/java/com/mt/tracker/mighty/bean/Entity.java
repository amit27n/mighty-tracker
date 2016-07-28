package com.mt.tracker.mighty.bean;


import java.sql.Timestamp;

public class Entity {
	
		public Entity() {
		
	}
		private int EntityId;
		private String EntityName;
		private String EntityDesc;
		private String EntityType;
		private Timestamp DateCreated;
		private String CreatedBy;
		
		public int getEntityId() {
			return EntityId;
		}
		public void setEntityId(int entityId) {
			EntityId = entityId;
		}
		public String getEntityName() {
			return EntityName;
		}
		public void setEntityName(String entityName) {
			EntityName = entityName;
		}
		public String getEntityDesc() {
			return EntityDesc;
		}
		public void setEntityDesc(String entityDesc) {
			EntityDesc = entityDesc;
		}
		public String getEntityType() {
			return EntityType;
		}
		public void setEntityType(String entityType) {
			EntityType = entityType;
		}
		public Timestamp getDateCreated() {
			return DateCreated;
		}
		public void setDateCreated(Timestamp dateCreated) {
			DateCreated = dateCreated;
		}
		public String getCreatedBy() {
			return CreatedBy;
		}
		public void setCreatedBy(String createdBy) {
			CreatedBy = createdBy;
		}
		
		
		
}
