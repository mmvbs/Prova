abstract class veiculo {
    private String marca;
    private String modelo;

    public veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void acelerar();
    public abstract void frear();

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}