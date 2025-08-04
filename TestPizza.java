public class TestPizza {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza();

        myPizza.addTopping("ชีส");
        myPizza.addTopping("เห็ด");
        myPizza.addTopping("เปปเปอโรนี");
        myPizza.addTopping("มะกอกดำ");

        System.out.println("จำนวนเครื่องปรุง: " + myPizza.getTotalToppings());
        System.out.println("ราคาพิซซ่า: " + myPizza.getPrice() + " บาท");

        myPizza.printAllTopping();
    }
}