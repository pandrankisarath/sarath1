public class Client {

    public static void main(String[] args) {
        String Customerchoice = "Biriyani";
        System.out.println("User Choice: " + Customerchoice);
        FoodTemplate food = new BiriYani();
        food.getFood();
        System.out.println("HotelLocation:" + food.gethotellocation());
        System.out.println("Flavour: " + food.getReciepe());
        System.out.println("**************************");

        String Clientchoice = "Lolipops";
        System.out.println("User Choice: " + Clientchoice);
        FoodTemplate fd = new LoliPops();
        fd.getFood();
        System.out.println("HotelLocation:" + food.gethotellocation());
        System.out.println("Flavour: " + food.getReciepe());
        System.out.println("**************************");


    }


}
