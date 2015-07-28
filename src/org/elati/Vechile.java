package org.elati;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vechile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vechileId;
	private String vechilleName;

	public int getVechileId() {
		return vechileId;
	}

	public void setVechileId(int vechileId) {
		this.vechileId = vechileId;
	}

	public String getVechilleName() {
		return vechilleName;
	}

	public void setVechilleName(String vechilleName) {
		this.vechilleName = vechilleName;
	}

}
