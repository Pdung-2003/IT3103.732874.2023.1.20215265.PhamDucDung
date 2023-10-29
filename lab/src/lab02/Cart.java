package lab02;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0; // to show quantity in the cart
    // Method to add a DigitalVideoDisc to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else System.out.println("The cart is almost full");
    }
    // Method to remove a DigitalVideoDisc to the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false; // Sử dụng biến boolean để theo dõi xem đĩa đã được tìm thấy hay không
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null && itemsOrdered[i].equals(disc)) {
                found = true; // Đặt giá trị found thành true khi tìm thấy đĩa
                itemsOrdered[i] = itemsOrdered[qtyOrdered - 1]; // Di chuyển đĩa cuối cùng lên vị trí của đĩa cần xóa
                itemsOrdered[qtyOrdered - 1] = null; // Gán giá trị null cho phần tử cuối cùng
                qtyOrdered--; // Giảm số lượng đĩa trong danh sách
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc was not found in the cart.");
        }
    }
    // Method to calculate totalcost of the items in the cart
    public float totalCost() {
        float sum = 0.0f;
        for(int i = 0; i < qtyOrdered; i++) {
                sum += itemsOrdered[i].getCost();
        }
        return Float.parseFloat(String.format("%.2f", sum));
    }

}
