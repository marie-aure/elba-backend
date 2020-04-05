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
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String label;
	private String re;


	@OneToOne(mappedBy="onetoone")
	private LiaisonTest onetoonebis;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private LiaisonTest onetomanybis;
	
	@OneToMany(mappedBy="manytoone", fetch=FetchType.EAGER)
	private List<LiaisonTest> manytoonebis;
	
	public Test(String label, String re, LiaisonTest onetoonebis, LiaisonTest onetomanybis,
			List<LiaisonTest> manytoonebis) {
		super();
		this.label = label;
		this.re = re;
		this.onetoonebis = onetoonebis;
		this.onetomanybis = onetomanybis;
		this.manytoonebis = manytoonebis;
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
				+ (re != null ? "re=" + re + ", " : "")
				+ (onetoonebis != null ? "onetoonebis=" + onetoonebis + ", " : "")
				+ (onetomanybis != null ? "onetomanybis=" + onetomanybis + ", " : "")
				+ (manytoonebis != null ? "manytoonebis=" + manytoonebis : "") + "]";
	}

}
