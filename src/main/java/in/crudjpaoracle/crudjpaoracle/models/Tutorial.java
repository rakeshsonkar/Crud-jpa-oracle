package in.crudjpaoracle.crudjpaoracle.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "CURD")
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "published")
	private boolean published;
	public Tutorial() {
		
	}
	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
	
}
