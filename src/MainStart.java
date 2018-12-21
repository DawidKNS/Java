import calculation.*;
import java.util.Scanner;
public class MainStart
{
    public static  void main (String arg[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilość przepracowanych godzin: ");
        String HouersS = input.nextLine();
        double Houers =Integer.parseInt(HouersS);
        System.out.println("Podaj stwakę godzinową netto: ");
        String PriseS = input.nextLine();
        double Prise =Integer.parseInt(PriseS);

        double pricenetto;
        calculation calculation = new calculation();
        pricenetto = calculation.setPricenet(Houers,Prise);
        calculation.setCalculate(pricenetto);


        double VatforPey = calculation.getCalculateVat();
        double VatPlusPrice = calculation.getCalculateVatpluspricenet();
        double PD = calculation.getPD();
        double POZ = calculation.getPOZ();
        double Mwynagrodzenie = calculation.getMWynagrodzenie();

        System.out.println("Vat do zapłaty: " + VatforPey
                            +"\n" + "Vat Plus Kwota Netto: " + VatPlusPrice
                            + "\n" + "Po Odliczeniu ZUS: "+ POZ
                            + "\n" + "Podatek Dochodowy: " + PD
                            + "\n" + "Wynagrodzenie: " + Mwynagrodzenie);
    }
}
