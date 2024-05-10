public abstract class Telco {
    protected double dataAllowance;
    protected double price;
    protected String telcoName;
    protected boolean unliCallText;

    public Telco(double dataAllowance, double price, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.price = price;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public double getTelcoDataAllowance() {
        return dataAllowance;
    }

    public double getProm
