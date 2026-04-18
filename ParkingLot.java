class ParkingLot {
    int capacity=5, filled=0;
    void park(){
        if(filled<capacity){
            filled++;
            System.out.println("Car parked");
        } else System.out.println("Full");
    }
    void leave(){
        if(filled>0){
            filled--;
            System.out.println("Car left");
        }
    }
    public static void main(String[] args){
        ParkingLot p=new ParkingLot();
        p.park(); p.park(); p.leave();
    }
}