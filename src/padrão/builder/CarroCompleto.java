package padrão.builder;
public class CarroCompleto extends BuilderCarro{
    @Override
    public void montarMotor(){
        System.out.println("Motor: 2.0");
    }
    @Override
    public void montarCambio(){
        System.out.println("Cambio: automático");
    }
    
    @Override
    public void montarArCondicionado(){
        System.out.println("Ar condicionado: dual zone");
    }
}
