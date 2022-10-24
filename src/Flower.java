import java.util.Objects;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    Flower(String flowerColor, String country, double cost, int lifeSpan){
        this.flowerColor = defaultValid(flowerColor, "Белый");
        this.country = defaultValid(country, "Россия");
        if (cost == 0 || cost == -1){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
        if (lifeSpan == -1){
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    private String defaultValid (String valid, String defaul){
        if (valid == null || valid.isBlank()){
            return defaul;
        } else {
            return valid;
        }
    }

    @Override
    public String toString() {
        return "Цвет цветка  " + flowerColor +
                ", страна происхождения " + country +
                ", стоимость " + cost +
                ", срок хранения " + lifeSpan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.cost, cost) == 0 && lifeSpan == flower.lifeSpan && Objects.equals(flowerColor, flower.flowerColor) && Objects.equals(country, flower.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerColor, country, cost, lifeSpan);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = defaultValid(flowerColor, "Белый");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = defaultValid(country, "Россия");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost == 0 || cost == -1){
            this.cost = 0;
        }else {
            this.cost = cost;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan == -1){
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }


}
