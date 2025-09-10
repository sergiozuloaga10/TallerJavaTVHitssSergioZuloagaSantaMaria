package genericos;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico<T extends Identificable> {
    private List<T> datos = new ArrayList<>();

    public void agregar(T elemento){
        datos.add(elemento);
    }

    public List<T> listar(){
        return datos;
    }

    public T buscarPorId(int id){
        return null;
    }

    public void eliminarPorId(int id){
        datos.remove(id);
    }


}
