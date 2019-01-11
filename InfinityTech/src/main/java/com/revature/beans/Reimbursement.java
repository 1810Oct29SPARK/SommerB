package com.revature.beans;

public class Reimbursement {
	private int id;
	private int amount;
	private String description;
	private String status;
	private int eId;
	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", amount=" + amount + ", description=" + description + ", status=" + status
				+ ", eId=" + eId + "]";
	}
	public Reimbursement(int id, int amount, String description, String status, int eId) {
		super();
		this.id = id;
		this.amount = amount;
		this.description = description;
		this.status = status;
		this.eId = eId;
	}
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + eId;
		result = prime * result + id;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		if (amount != other.amount)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (eId != other.eId)
			return false;
		if (id != other.id)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
}
