package calculation;

public class calculation {

   private double pricenet;
   private double insurancehealth;
   private double isurancesocial;
   private double VatforPay;
   private double Vatpluspricenet;
   private final double VatinProcent = 0.23;
   private final double Incometax = 0.18;
   private double UZ = 319.94;
   private double US = 183.9;
   private double POZ,PD,MWynagrodzenie,HouersPrise;

   public double setPricenet(double Houers, double Prise)
   {
       HouersPrise = Houers * Prise;
       return HouersPrise;
   }

    public void setCalculate(double pricenet )
    {
        VatforPay = pricenet * VatinProcent;
        Vatpluspricenet = pricenet + VatforPay;
        POZ = pricenet - (UZ +US);
        PD = POZ * Incometax;
        MWynagrodzenie = POZ - PD;
    }

    public  double getHouersPrise()
    {
        return HouersPrise;
    }
    public double getCalculateVat ()
    {
        return VatforPay;
    }
    public double getCalculateVatpluspricenet()
    {
        return Vatpluspricenet;
    }
    public  double getPOZ()
    {
        return POZ;
    }
    public double getPD()
    {
        return  PD;
    }
    public  double getMWynagrodzenie()
    {
        return MWynagrodzenie;
    }
}
