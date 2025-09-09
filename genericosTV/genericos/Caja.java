package genericos;

public class Caja<T> {
    private T valor;

    public void set(T valor){
        this.valor = valor;
    }

    public T get(){
        return valor;
    }

    

}
