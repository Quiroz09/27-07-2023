package house;

public class Main {
    public static void main(String[] args) {
        House house = new House(); //instancia
        house.setDireccion("Simon bolivar mz 9 cs 8");
        house.setNumeroDeAlcobas(2);
        house.setPropietario("Quiroz");
        System.out.println("la direccion es: "+house.getDireccion());
        System.out.println("las numeros de alcobas que tiene la casa son: "+house.getNumeroDeAlcobas());
        System.out.println("el propietario es: "+house.getPropietario());
    }
}
