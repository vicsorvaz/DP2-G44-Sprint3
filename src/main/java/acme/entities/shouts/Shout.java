package acme.entities.shouts;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Shout extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	protected Date				moment;

	@Size(min = 5, max = 25, message = "Min 5 characters, max 25")
	protected String			author;

	@Size(max = 100, message = "Max 100 characters")
	@NotBlank
	protected String			text;
	
	@URL
	protected String			info;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
