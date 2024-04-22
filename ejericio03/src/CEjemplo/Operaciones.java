package CEjemplo;

import java.util.Arrays;

public class Operaciones {
    public float media(float[] numeros) {
        float suma = 0;
        for (float num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public float mediana(float[] numeros) {
        Arrays.sort(numeros);
        int n = numeros.length;
        if (n % 2 != 0) {
            return numeros[n / 2];
        } else {
            return (numeros[(n - 1) / 2] + numeros[n / 2]) / 2;
        }
    }

    public String moda(float[] numeros) {
    Arrays.sort(numeros);
    float moda = numeros[0];
    int maxCount = 0;
    int count = 1;

    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] == numeros[i - 1]) {
            count++;
        } else {
            if (count > maxCount) {
                moda = numeros[i - 1];
                maxCount = count;
            }
            count = 1;
        }
    }

    if (maxCount > 1) {
        return String.valueOf(moda);
    } else {
        return "No hay moda";
    }
}

    public float varianza(float[] numeros) {
        float media = media(numeros);
        float sumaCuadrados = 0;

        for (float num : numeros) {
            sumaCuadrados += (num - media) * (num - media);
        }

        return sumaCuadrados / numeros.length;
    }

    public float desviacionEstandar(float[] numeros) {
        return (float) Math.sqrt(varianza(numeros));
    }
}