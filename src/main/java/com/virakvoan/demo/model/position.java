package com.virakvoan.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "position")
public class position {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="position_id")
        private Long posId;
    
    @Column(name="position_name")
    private String posName;
    
    @Column(name="description")
    private String desc;

	public Long getId() {
		return posId;
	}

	public void setId(Long posId) {
		this.posId = posId;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
}
