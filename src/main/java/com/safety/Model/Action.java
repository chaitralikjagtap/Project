package com.safety.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="actions")
public class Action {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int actionId;
	
	@NotEmpty(message="actionInfo should not be empty..")
	@Column(name="actionInfo",nullable = false)
	private String actionInfo;
	
	@NotEmpty(message="status field should not be empty..")
	@Column(name="status",nullable = false)
	private String status;

	
	@OneToOne(mappedBy = "actions")
	private Rfa rfa;
	
	
	public Rfa getRfa() {
		return rfa;
	}

	public void setRfa(Rfa rfa) {
		this.rfa = rfa;
	}

	public int getActionId() {
		return actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	

	public String getActionInfo() {
		return actionInfo;
	}

	public void setActionInfo(String actionInfo) {
		this.actionInfo = actionInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Action [actionId=" + actionId + ", actionInfo=" + actionInfo + ", status=" + status + ", rfa=" + rfa
				+ "]";
	}

	

	
	
}
