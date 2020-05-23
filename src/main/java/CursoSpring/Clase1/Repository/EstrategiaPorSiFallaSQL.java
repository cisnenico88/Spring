
package CursoSpring.Clase1.Repository;

import CursoSpring.Clase1.Model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class EstrategiaPorSiFallaSQL implements GeneradorPlanAhorro{

    
    GeneradorPlanAhorroSQL gSQL;
    GeneradorPlanAhorroJSON gJASON;

    public EstrategiaPorSiFallaSQL(GeneradorPlanAhorroSQL gSQL, GeneradorPlanAhorroJSON gJASON) {
        this.gSQL = gSQL;
        this.gJASON = gJASON;
    }
    
    @Override
    public void generar(Usuario usuario) {
        
        try {
            gSQL.generar(usuario);
            return;
        }
        catch (Exception ex){
            System.out.println("CUIDADO QUE FALLO LA BASE SQL");
        }
        gJASON.generar(usuario);
    }
    
}
