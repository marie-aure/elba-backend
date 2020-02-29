package fr.liza.elba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public String label;
	public String re;

	public Test(String label, String re) {
		super();
		this.label = label;
		this.re = re;
	}

	public Test() {
	}

	public String getLabel() {
		return label;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getRe() {
		return re;
	}

	public void setRe(String re) {
		this.re = re;
	}

	@Override
	public String toString() {
		return "Test [" + (id != null ? "id=" + id + ", " : "") + (label != null ? "label=" + label + ", " : "")
				+ (re != null ? "re=" + re : "") + "]";
	}

}
