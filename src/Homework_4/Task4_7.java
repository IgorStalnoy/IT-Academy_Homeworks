package Homework_4;

public class Task4_7 {
    //В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с
    // номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в
    // билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много сувениров
    // потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
    public static void main(String[] args) {

        int counterHappyTickets = 0;
        int firstHalf, secondHalf;

        for (int i = 1; i <= 999999; i++) {
            int sum1 = 0, sum2 = 0;
            firstHalf = i / 1000;
            secondHalf = i % 1000;
            while (firstHalf != 0 || secondHalf != 0) {
                sum1 = sum1 + firstHalf % 10;
                firstHalf = firstHalf / 10;
                sum2 = sum2 + secondHalf % 10;
                secondHalf = secondHalf / 10;
            }
            if (sum1 == sum2) {
                counterHappyTickets++;
            }
        }

        System.out.println("There are " + counterHappyTickets + " lucky tickets in a roll");

    }
}
