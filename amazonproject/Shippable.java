package amazonproject;

public class Shippable implements ShippableInterface {

    int trackingNumber;
    private Product product;
    private String shippedProductStatus;

    public Shippable() {

    }

    public Shippable(int trackingNumber, Product product, String shippedProductStatus) {
        this.trackingNumber = trackingNumber;
        this.product = product;
        this.shippedProductStatus = shippedProductStatus;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getShippedProductStatus() {
        return shippedProductStatus;
    }

    public void setShippedProductStatus(String shippedProductStatus) {
        this.shippedProductStatus = shippedProductStatus;
    }

    @Override
    public void generateTrackingNumberForTheOrder(User user) {
        for (int i = 0; i < user.orderList.size(); i++) {
            Shippable newshippableProduct = new Shippable(this.getRandomNumber(), user.orderList.get(i), "shipped");
            System.out.println(newshippableProduct);

        }
    }

    public int getRandomNumber() {
        double num = Math.random();
        int myRandInt = (int) (num * 100 + 1);
        return myRandInt;
    }

    @Override
    public String toString() {
        return "Shippable [trackingNumber=" + trackingNumber + ", product=" + product + ", shippedProductStatus="
                + shippedProductStatus + "]";
    }

}
