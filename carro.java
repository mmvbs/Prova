class carro extends veiculo{
    private int portas;
    private int ano;
    
    public carro(String marca, String modelo, int portas, int ano) {
        super(marca, modelo);
        this.portas = portas;
        this.ano = ano;
    }
    
    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }
    
    @Override
    public void frear() {
        System.out.println("Freando o carro");
    }
    
    public int getPortas() {
        return portas;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
}