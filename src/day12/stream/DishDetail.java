package day12.stream;

public class DishDetail {

    private final String dishName;
    private final String type; // 육류, 어류, 기타

    public DishDetail(Dish dish) {
        this.dishName = dish.getName();
        this.type = dish.getType().getDesc();
    }

    public String getDishName() {
        return dishName;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "dishName='" + dishName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
