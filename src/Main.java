public class Main {
    public static void main(String[] args) {

        Flower roza = new Flower(null, "Голандия", 35.59, 0);
        Flower hrizantema = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower gipsophil = new Flower(null, "Турция", 19.5, 10);

        System.out.println(roza);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsophil);

        Bouquet bouquet = new Bouquet(new Flower[]{roza,roza,roza,hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,gipsophil});
        System.out.println("Сумма букета " + bouquet.getCost());
        System.out.println("Букет стоит " + bouquet.getLifeSpan()+ " дня");

    }
}