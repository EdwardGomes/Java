public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.getBrewMaster().setHasWorkToDo(true);
        smartKitchen.getIceBox().setHasWorkToDo(true);
        smartKitchen.getDishWasher().setHasWorkToDo(true);

        smartKitchen.getDishWasher().washDishes();
        smartKitchen.getIceBox().orderFood();
        smartKitchen.getBrewMaster().brewCoffee();

        smartKitchen.setKitchenState(false, false, true);
        smartKitchen.doKitchenWork();
    }
}
