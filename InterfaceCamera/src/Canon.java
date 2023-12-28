public class Canon extends SpecifiAtions {

    public void Camera(){
        super.Specifications();
        System.out.println("Canon Camera.");

    }
    @Override
    public void Company() {
        System.out.println("Company: Canon");
    }

    @Override
    public void Product() {
        System.out.println("Product: Camera");

    }

    @Override
    void model() {
        System.out.println("Model : CANON55");

    }

    @Override
    void design() {
        System.out.println( "Design : Classic");

    }
}
