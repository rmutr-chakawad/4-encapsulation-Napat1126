public class Pizza {
    private static final int maxtopping = 10;
    private String[] toppings;
    private int totalToppings;

    public Pizza() {
        toppings = new String[maxtopping];
        totalToppings = 0;
    }

    public void addTopping(String topping) {
        if (totalToppings < maxtopping) {
            toppings[totalToppings] = topping;
            totalToppings++;
        } else {
            System.out.println("เพิ่มไม่ได้เลย (ครบ " + maxtopping + " รายการแล้ว)");
        }
    }

    public int getTotalToppings() {
        return totalToppings;
    }

    public int getPrice() {
        return 100 + (totalToppings * 10);
    }

    public void printAllTopping() {
        if (totalToppings == 0) {
            System.out.println("ไม่มีหน้าเลย บนพิซซ่า");
        } else {
            System.out.println("รายการเครื่องปรุง:");
            for (int i = 0; i < totalToppings; i++) {
                System.out.println("- " + toppings[i]);
            }
        }
    }
}