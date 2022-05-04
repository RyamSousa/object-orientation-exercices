package main.question28;

public class Elevador {

    private int currentFloor;

    private int amountFloors;

    private int currentQuantityPeoples;

    private int capacityPeoples;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int atualFloor) {
        this.currentFloor = atualFloor;
    }

    public int getAmountFloors() {
        return amountFloors;
    }

    public void setAmountFloors(int amountFloors) {
        this.amountFloors = amountFloors;
    }

    public int getCapacityPeoples() {
        return capacityPeoples;
    }

    public void setCapacityPeoples(int capacityPeoples) {
        this.capacityPeoples = capacityPeoples;
    }

    public int getCurrentQuantityPeoples() {
        return currentQuantityPeoples;
    }

    public void setCurrentQuantityPeoples(int atualQuantityPeoples) {
        this.currentQuantityPeoples = atualQuantityPeoples;
    }

    public void inicialize(int capacityPeoples, int amountFloors){
        this.capacityPeoples = capacityPeoples;
        this.amountFloors= amountFloors;
    }

    public boolean enter(int addPeoples){
        if (this.currentQuantityPeoples <= this.capacityPeoples){
            int sumPeoples = this.currentQuantityPeoples + addPeoples;

            if (sumPeoples <= this.capacityPeoples){
                currentQuantityPeoples += addPeoples;
                return true;
            }
        }

        return false;
    }

    public boolean exit(int exitPeoples){
        if (this.currentQuantityPeoples > 0){
            int subPeoples = this.currentQuantityPeoples - exitPeoples;

            if (subPeoples >= 0){
                currentQuantityPeoples -= exitPeoples;
                return true;
            }
        }

        return false;
    }

    public boolean moveUp(){
        if (this.currentFloor <= this.amountFloors){
            currentFloor++;
            return true;
        }
        return false;
    }

    public boolean moveDown(){
        if (this.currentFloor >= 0){
            currentFloor--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "currentFloor=" + currentFloor +
                ", amountFloors=" + amountFloors +
                ", currentQuantityPeoples=" + currentQuantityPeoples +
                ", capacityPeoples=" + capacityPeoples +
                '}';
    }
}
