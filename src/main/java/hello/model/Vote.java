package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vote {

	@Id
	@GeneratedValue
	private Long id;
	private String party;
    private Integer pollingStationCode;
	
	public Vote() {}
	
	public Vote(String party, Integer pollingStationCode) {
		super();
		this.party = party;
		this.pollingStationCode = pollingStationCode;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public Integer getColegio() {
		return pollingStationCode;
	}
	public void setColegio(Integer colegio) {
		this.pollingStationCode = colegio;
	}
}
