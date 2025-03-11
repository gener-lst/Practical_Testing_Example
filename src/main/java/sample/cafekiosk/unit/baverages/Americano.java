package sample.cafekiosk.unit.baverages;

import lombok.Getter;

@Getter
public class Americano implements Beverage {
    @Override
    public String getName() {
        return "아메리카노";
    }

    @Override
    public int getPrice() {
    return 4000 ;
    }
}
