import lombok.*;

@ToString
@Getter
@Setter
//EqualsAndHashCode aby wyświetlic "true" musi miec okreslone na jakiej podstawie ma porownac
@EqualsAndHashCode(of = {"brand"})
@AllArgsConstructor

public class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}
