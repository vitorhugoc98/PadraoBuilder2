
package padrão.builder;

public class CarroIntermediario extends BuilderCarro{
    @Override
    public void montarMotor(){
        System.out.println("Motor: 1.6");
    }
    @Override
    public void montarCambio(){
        System.out.println("Cambio: automático");
    }
    
    @Override
    public void montarArCondicionado(){
        System.out.println("Ar condicionado: comum");
    }
}
