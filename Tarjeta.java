class Tarjeta
{
    int saldo;
    
    void depositar(int unaCantidad)
    {
        saldo = saldo + unaCantidad;
    }
    
    void retirar(int unaCantidad)
    {
        if(unaCantidad >= 0 && unaCantidad <= saldo)
        {
            saldo= saldo - unaCantidad;
        }
    }
    
    int consultar()
    {
        return saldo;
    }
}
