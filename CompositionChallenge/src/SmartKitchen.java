public class SmartKitchen {

    private final CoffeeMaker brewMaster;
    private final Refrigerator iceBox;
    private final DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean brewCoffee, boolean orderFood
            , boolean washDishes) {
        brewMaster.setHasWorkToDo(brewCoffee);
        iceBox.setHasWorkToDo(orderFood);
        dishWasher.setHasWorkToDo(washDishes);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.washDishes();
    }
}
