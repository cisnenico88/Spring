
package CursoSpring.Clase1.Repository;

import CursoSpring.Clase1.Model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class EstrategiaDeMantenimientoDiaJueves implements GeneradorPlanAhorro{

    GeneradorPlanAhorroSQL gSQL;
    GeneradorPlanAhorroJSON gJASON;

    public EstrategiaDeMantenimientoDiaJueves(GeneradorPlanAhorroSQL gSQL, GeneradorPlanAhorroJSON gJASON) {
        this.gSQL = gSQL;
        this.gJASON = gJASON;
    }

    @Override
    public void generar(Usuario usuario) {
        System.out.println("Evaluar si es jueves");
        System.out.println("NO pegarle SQL");
        System.out.println("Grabar directamente JSON");
    }
    
}
