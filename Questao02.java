import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a temperatura:");
        double valorTemperatura = input.nextDouble();

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        char tipoTemperatura = input.next().charAt(0);
        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        char temperaturaDeConversao = input.next().charAt(0);


        if(tipoTemperatura == 'F' && temperaturaDeConversao == 'C'){
            double  fahrenheitParaCelsius = ( valorTemperatura - 32) * 5 / 9;
            System.out.printf("%.2f F = %.2f C",valorTemperatura,fahrenheitParaCelsius);


        }else if(tipoTemperatura == 'C' && temperaturaDeConversao == 'F'){
            double celsiusParaFahrenheit = (valorTemperatura * 9 / 5) + 32;
            System.out.printf("%.2f C = %.2f F",valorTemperatura,celsiusParaFahrenheit);


        }else if(tipoTemperatura == 'C' && temperaturaDeConversao == 'K'){
            double celsiusParaKelvis = 273.15 + valorTemperatura;
            System.out.printf("%.2f C = %.2f K",valorTemperatura,celsiusParaKelvis);


        } else if (tipoTemperatura == 'K' && temperaturaDeConversao == 'C') {
            double kelvinParaCelsius = valorTemperatura - 273.15;
            System.out.printf("%.2f K = %.2f C",valorTemperatura,kelvinParaCelsius);


        } else if (tipoTemperatura == 'F' && temperaturaDeConversao == 'K') {
            double  fahrenheitParaCelsius = ( valorTemperatura - 32) * 5 / 9;
            double celsiusParaKelvis = 273.15 + fahrenheitParaCelsius;
            System.out.printf("%.2f F = %.2f K",valorTemperatura,celsiusParaKelvis);


        } else if (tipoTemperatura == 'K' && temperaturaDeConversao == 'F') {
            double  kelvinParaCelsius = valorTemperatura - 273.15;
            double celsiusParaFahrenheit = (valorTemperatura * 9 / 5) + 32;
            System.out.printf("%.2f K = %.2f F",valorTemperatura,celsiusParaFahrenheit);


        } else {
            System.out.println("Unidades de temperatura não válidas.");
        }
        input.close();
    }
}
