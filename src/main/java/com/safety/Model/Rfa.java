package com.safety.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="rfa")
public class Rfa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rfaId;
	
	private int incidentId;
	
	@NotEmpty(message="reason field should not be empty..")
	@Column(name="reason",nullable = false)
	private String reason;
	
	@NotEmpty(message="action field should not be empty..")
	@Column(name="action",nullable = false)
	private String action;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rfa_Id", referencedColumnName = "rfaId")
	private Action actions;
	
	
	public int getRfaId() {
		return rfaId;
	}

	public void setRfaId(int rfaId) {
		this.rfaId = rfaId;
	}

	public int getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Rfa [rfaId=" + rfaId + ", incidentId=" + incidentId + ", reason=" + reason + ", action=" + action + "]";
	}
	

	
	
}
