public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void washDishes() {
        if(hasWorkToDo) {
            System.out.println("Washing dishes...");
            hasWorkToDo = false;
        }
    }
}
