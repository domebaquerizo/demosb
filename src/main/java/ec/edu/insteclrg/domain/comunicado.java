package ec.edu.insteclrg.domain;

import jakarta.persistence.*;
import lombok.Getter;
@Getter
public class comunicado {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(updatable = false, nullable = false)
	    private Long id;
	    @Column(nullable = false)
	    private String fecha;
	    @Column(nullable = false)
	    private String comunicado;
	    
	   
}
