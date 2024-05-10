public class UsagePromo extends Promo {
    @Override
    public String showAllowance(Telco telco, double promoPrice) {
        return telco.getTelcoName() + " Data Usage Offer and price: " + promoPrice;
    }

    @Override
    public String showUnliCallsTextOffer(Telco telco, boolean unliCallText) {
        return "";
    }
}
