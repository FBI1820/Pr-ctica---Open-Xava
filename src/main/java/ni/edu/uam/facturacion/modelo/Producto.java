package ni.edu.uam.facturacion.modelo;
import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity @Getter @Setter
public class Producto {
    @Id @Column(length=6)
        int numero;

        @Column(length=60) @Required
        String descripcion;
}
