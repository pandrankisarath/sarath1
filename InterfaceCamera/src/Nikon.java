public class Nikon extends SpecifiAtions{
    public void Camera(){
        super.Specifications();
        System.out.println("Nikon Camera.");
    }
    @Override
    public void Company() {
        System.out.println("Company: Nikon");
    }

    @Override
    public void Product() {
        System.out.println("Product: Camera");

    }

    @Override
    void model() {
        System.out.println("Model : Nikon300series");

    }

    @Override
    void design() {
        System.out.println("Design : RuggedOutdoor.");
    }
}
