import java.io.*;

import paquete.*;

public class Main {
    public static void main(String[] args) {
        int i = 0, dias = 0;
        char resp = 's';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Proceso obj = new Proceso();
        while (resp == 's') {
            try {
                do {
                    System.out.println("1.Toyora 2.Mitsubishi 3.Hyundai 4.Suzuki 5.Kia");
                    System.out.println("Ingrese el numero del modelo que desea alquilar");
                    i = Integer.parseInt(br.readLine());
                }while (i <= 0);
            } catch (IOException e) {
                System.out.println("Error de entrada/salida: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
            try {
                do {
                    System.out.println("Por cuantos dias lo alquilara?");
                    dias = Integer.parseInt(br.readLine());
                }while (dias <= 0);
            } catch (IOException e) {
                System.out.println("Error de entrada/salida: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }

            obj.registro(i, dias);
            System.out.println("Modelo: " + obj.obtenrModelo() + "\nMonto por modelo:" + obj.obtenerMonto() + "\nMonto total por agencia: " + obj.obtenerMontoTotal());
            try {
                System.out.println("desea hacerlo nuevamente? (s/n)");
                resp = br.readLine().charAt(0);
            } catch (IOException e) {
                System.out.println("Error de entrada/salida: " + e.getMessage());
            }
        }
    }
}