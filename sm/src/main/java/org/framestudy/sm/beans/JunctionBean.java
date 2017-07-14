package org.framestudy.sm.beans;

import java.io.Serializable;

public class JunctionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long fkClassId;
	private Long fkTeacherId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFkClassId() {
		return fkClassId;
	}
	public void setFkClassId(Long fkClassId) {
		this.fkClassId = fkClassId;
	}
	public Long getFkTeacherId() {
		return fkTeacherId;
	}
	public void setFkTeacherId(Long fkTeacherId) {
		this.fkTeacherId = fkTeacherId;
	}
	@Override
	public String toString() {
		return "JunctionBean [id=" + id + ", fkClassId=" + fkClassId + ", fkTeacherId=" + fkTeacherId + "]";
	}
	public JunctionBean(Long id, Long fkClassId, Long fkTeacherId) {
		super();
		this.id = id;
		this.fkClassId = fkClassId;
		this.fkTeacherId = fkTeacherId;
	}
	public JunctionBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
