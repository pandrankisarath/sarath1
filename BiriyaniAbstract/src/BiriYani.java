public class BiriYani extends FoodTemplate {

    @Override
    public void Price() {
        System.out.println("RS180/-");
    }

    @Override
    public void Quantity() {
        System.out.println("1kg");
    }

    @Override
    public void Addon() {
        System.out.println("specialChickenCurry");
    }
}
