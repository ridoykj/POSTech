package bd.postech.wo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "T_user_info")
@Data
public class Init {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Phone")
	private String phone;
	@Column(name = "Email")
	private String email;

}
