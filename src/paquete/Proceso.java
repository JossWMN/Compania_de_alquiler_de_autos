package paquete;

public class Proceso {
    int codAgen,codAut,numD;
    String agencia, modelo;
    double monto, montoT;
    public String[] marca ={"Toyota","Mitsubishi","Hyundai","Suzuki","Kia"};
    public int[] codigo ={1, 2, 3, 4, 5};
    public float[] tarifaD = {45, 40, 38, 37, 30};

    public void registro(int a, int b){
        a = a-1;
        switch (a){
            case 0:
                codAgen = 100;
                agencia = "Ricardo Perez S.A";
                codAut = codigo[a];
                numD = b;
                modelo = marca[a];
                monto = tarifaD[a] * b;
                montoT = monto + (monto * 0.07);
                break;

            case 1:
                codAgen = 200;
                agencia = "Excell Automotriz";
                codAut = codigo[a];
                numD = b;
                modelo = marca[a];
                monto = tarifaD[a] * b;
                montoT = monto + (monto * 0.07);
                break;

            case 2:
                codAgen = 300;
                agencia = "Petroautos";
                codAut = codigo[a];
                numD = b;
                modelo = marca[a];
                monto = tarifaD[a] * b;
                montoT = monto + (monto * 0.07);
                break;

            case 3:
                codAgen = 400;
                agencia = "Suzuki PanamÃ¡";
                codAut = codigo[a];
                numD = b;
                modelo = marca[a];
                monto = tarifaD[a] * b;
                montoT = monto + (monto * 0.07);
                break;

            case 4:
                codAgen = 500;
                agencia = "Grupo Silaba";
                codAut = codigo[a];
                numD = b;
                modelo = marca[a];
                monto = tarifaD[a] * b;
                montoT = monto + (monto * 0.07);
                break;
        }
    }

    public String obtenrModelo(){
        return modelo;
    }

    public double obtenerMonto(){
        return monto;
    }

    public double obtenerMontoTotal(){
        return montoT;
    }
}

