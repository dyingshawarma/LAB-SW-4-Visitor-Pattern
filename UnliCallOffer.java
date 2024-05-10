public class UnliCallOffer extends Promo {
    @Override
    public String showAllowance(Telco telco, double promoPrice) {
        return "";
    }

    @Override
    public String showUnliCallsTextOffer(Telco telco, boolean unliCallText) {
        return telco.getTelcoName() + " unlimited calls and text package: " + (unliCallText ? "Available" : "Not Available");
    }
}
