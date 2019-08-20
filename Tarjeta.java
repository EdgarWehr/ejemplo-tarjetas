public class Tarjeta
{
    private int saldo;
    
    public Tarjeta(int saldoInicial)
    {
        saldo = saldoInicial;
    }
    
    public void depositar(int unaCantidad)
    {
        if(unaCantidad >= 0){
            saldo = saldo + unaCantidad;
        }
    }
    
    public void retirar(int unaCantidad)
    {
        if(unaCantidad >= 0 && unaCantidad <= saldo)
        {
            saldo= saldo - unaCantidad;
        }
    }
    
    public int consultar()
    {
        return saldo;
    }
}
