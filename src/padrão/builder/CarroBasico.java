package padrão.builder;
public class CarroBasico extends BuilderCarro{
    
    @Override
    public void montarMotor(){
        System.out.println("Motor: 1.0");
    }
    @Override
    public void montarCambio(){
        System.out.println("Cambio: manual");
    }
    
}
