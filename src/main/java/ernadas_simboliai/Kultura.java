package ernadas_simboliai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RequestParam;

@Entity
public class Kultura {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Integer id; 	

	private String pav;
	private String pradzia;	
	private String pabaiga;
	private Double plotas_teritorijos;
	private Integer skaicius_artefaktu;
	private String aprasymas;
	private Integer elementai_egzistuoja_dabar;	
	
	public Kultura() {
		super();
		this.pav = "Nežinoma kultūra";
		this.pradzia = "0";
		this.pabaiga = "";
		this.plotas_teritorijos = 1000.0;
		this.skaicius_artefaktu = 1;
		this.aprasymas = "Tuščias default'inis įrašas";
		this.elementai_egzistuoja_dabar = 0;
	}	
	
	public Kultura(Integer id, String pav, String pradzia, String pabaiga, Double plotas_teritorijos,
			Integer skaicius_artefaktu, String aprasymas, Integer elementai_egzistuoja_dabar) {
		super();
		this.id = id;
		this.pav = pav;
		this.pradzia = pradzia;
		this.pabaiga = pabaiga;
		this.plotas_teritorijos = plotas_teritorijos;
		this.skaicius_artefaktu = skaicius_artefaktu;
		this.aprasymas = aprasymas;
		this.elementai_egzistuoja_dabar = elementai_egzistuoja_dabar;
	}	
	
	public Kultura(String id, String pav, String pradzia, String pabaiga, String plotas_teritorijos,
			String skaicius_artefaktu, String aprasymas, String elementai_egzistuoja_dabar) {
		
		super();

		this.pav = pav;
		this.pradzia = pradzia;
		this.pabaiga = pabaiga;

		this.aprasymas = aprasymas;
		
		try {
		
				this.id = Integer.parseInt (id ) );		
				this.plotas_teritorijos = Double.parseDouble( plotas_teritorijos );
				this.skaicius_artefaktu = skaicius_artefaktu;		
				this.elementai_egzistuoja_dabar = elementai_egzistuoja_dabar;
		
		} catch ( Exception e ) {
			
			
			
		}
	
		
	}	
	

}
