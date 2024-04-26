class Main{
    public static void main(String[] args){
        carro c = new carro("Fiat", "Uno", 4, 2010);
        System.out.println("quantidade de portas: " + c.getPortas());
        System.out.println("ano: " + c.getAno());
        System.out.println("marca: " + c.getMarca());
        System.out.println("modelo: " + c.getModelo());
        c.setModelo("Palio: ");
        System.out.println("modelo novo modelo: " + c.getModelo());
        c.acelerar();
        c.frear();
    }
}