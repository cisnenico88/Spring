
package CursoSpring.Clase1.Repository;

import CursoSpring.Clase1.Model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class GeneradorPlanAhorroSQL implements GeneradorPlanAhorro{
    
    private int i;
    
    @Override
    public void generar(Usuario usuario) {
        if (i==0){
            System.out.println("INSERT USUARIO EN USUARIO");
            i++;
            return;
        }
        throw new RuntimeException("No se puede insertar");
    }
    
}
