package fr.liza.elba.model;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class LiaisonTest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	private Test onetoone;

	@OneToMany(mappedBy = "onetomanybis", fetch = FetchType.EAGER)
	private List<Test> onetomany;

	@ManyToOne(fetch = FetchType.EAGER)
	private Test manytoone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Test getOnetoone() {
		return onetoone;
	}

	public void setOnetoone(Test onetoone) {
		this.onetoone = onetoone;
	}

	public List<Test> getOnetomany() {
		return onetomany;
	}

	public void setOnetomany(List<Test> onetomany) {
		this.onetomany = onetomany;
	}

	public Test getManytoone() {
		return manytoone;
	}

	public void setManytoone(Test manytoone) {
		this.manytoone = manytoone;
	}

}
