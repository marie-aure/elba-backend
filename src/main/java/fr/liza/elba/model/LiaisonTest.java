package fr.liza.elba.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
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

	public LiaisonTest(Test onetoone, List<Test> onetomany, Test manytoone) {
		super();
		this.onetoone = onetoone;
		this.onetomany = onetomany;
		this.manytoone = manytoone;
	}

	public LiaisonTest() {
	}

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

	@Override
	public String toString() {
		return "LiaisonTest [" + (id != null ? "id=" + id + ", " : "")
				+ (onetoone != null ? "onetoone=" + onetoone + ", " : "")
				+ (onetomany != null ? "onetomany=" + onetomany + ", " : "")
				+ (manytoone != null ? "manytoone=" + manytoone : "") + "]";
	}

}
