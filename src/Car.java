import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Car {
    private String model;

    @EqualsAndHashCode.Include
    private String brand;

    private int year;
    private double price;
    private String color;
    private int quantity;
}