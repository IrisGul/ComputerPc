public class ComputerPc
{
    private String hersteller;
    private boolean laptop;
    private int preis;
    private int mhz;
    
    public ComputerPc(String hersteller, boolean laptop, int preis, int mhz)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(mhz);
    }
    public ComputerPc(String hersteller, boolean laptop, int preis)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(2000);
    }
    public ComputerPc(String hersteller, boolean laptop)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(899);
        setMhz(2000);
    }
    public ComputerPc(String hersteller, int preis)
    {
        setHersteller(hersteller);
        setPreis(preis);
        setLaptop(true);
        setMhz(2000);
    }
    public ComputerPc()
    {
        setHersteller("Lenovo");
        setLaptop(true);
        setPreis(899);
        setMhz(2000);
    }
    public String getHersteller()
    {
        return hersteller;
    }
    public boolean getLaptop()
    {
        return laptop;
    }
    public int getPreis()
    {
        return preis;
    }
    public int getMhz()
    {
        return mhz;
    }
    public void setHersteller(String hersteller)
    {
        this.hersteller=hersteller;
    }
    public void setLaptop(boolean laptop)
    {
        this.laptop=laptop;
    }
    public void setPreis(int preis)
    {
        this.preis=preis;
    }
    // wert muss zwieschen 1000 und 4000 liegen
    public void setMhz(int mhz)
    {   
        if((mhz>=1000) && (mhz<=4000))
        {
              this.mhz=mhz;
        }
        else
        {
            System.out.println("Fehler: der Wert mhz muss zwieschen 1000 und 4000 sein!");
             this.mhz=2000;
        }
       
    }
    public void printComputerPc()
    {   if(laptop==true)
        {
            System.out.println(hersteller+ " (laptop) - " + preis + " Euro");
        }
        else
        {
            System.out.println(hersteller+ " (PC) - " + preis + " Euro");
        }
    }

}
