package day12.stream;

public class SimpleDish {

    private final String name;
    private final int calories;


    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories();
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}

