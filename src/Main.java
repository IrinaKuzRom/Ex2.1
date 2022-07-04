public class Main {
    public static void main(String[] args) {

        int a = 20;   // количество рублей для одной бонусной милли
        int cost = 2345;// стоимость билета
      
        int bonus;
        bonus = cost / a; // Рассчёт количества бонусных милль, используя
        // значения заведённых переменных.
       
        System.out.println("За купленный билет вам начислено: " + bonus + " бесплатные мили за перелёты");
    }
}
