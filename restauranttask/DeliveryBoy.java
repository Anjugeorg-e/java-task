package restauranttask;

public class DeliveryBoy {
    private String name;
    private int empID;

    public DeliveryBoy(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void deliverItem(Customer customer, Restaurant restaurant) {
        if (!customer.orderList.isEmpty()) {
            for (Order order : customer.orderList) {
                order.setOrderStatus("delivered");
            }
            for (Order item : restaurant.orders) {
                if (item.getOrderedItemList().contains(customer)) {
                    item.setOrderStatus("delivered");
                }
            }
        } else {
            System.out.println("No items available in cart!!");
        }
    }

    @Override
    public String toString() {
        return "DeliveryBoy [name=" + name + ", empID=" + empID + "]";
    }

}
