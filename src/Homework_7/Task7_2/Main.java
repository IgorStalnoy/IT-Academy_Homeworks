package Homework_7.Task7_2;


/**
 * Парк общественного транспорта.
 * Определить иерархию различных видов ОТ.
 * Создать парк ОТ.
 * Рассчитать стоимость автопарка.
 * Провести сортировку машин парка по расходу топлива.
 * Найти автобус в компании, соответствующий заданному диапазону параметров.
 */
public class Main {
    public static void main(String[] args) {

        PublicTransportPark myPark = new PublicTransportPark();

        Bus bus1 = new Bus("MAZ-232", "Diesel", 900, 60, 25, 45000);
        Bus bus2 = new Bus("MAZ-4432", "Diesel", 1300, 72, 30, 65000);
        Bus bus3 = new Bus("MAZ-111", "Gasoline", 700, 62, 30, 27000);
        Bus bus4 = new Bus("Liaz-1234D", "Gasoline", 600, 48, 40, 16000);

        MiniBus miniBus1 = new MiniBus("Hyundai H350", "Diesel", 1100, 14, 15, 26000);
        MiniBus miniBus2 = new MiniBus("Mercedes-Benz Sprinter 316", "Diesel", 1300, 12, 13, 49000);
        MiniBus miniBus3 = new MiniBus("UAZ \"Buhanka\"", "Gasoline", 490, 8, 26, 1);

        Tram tram1 = new Tram("Stadler B85601M", "Electricity", 3000, 80, 90, 120000);
        Tram tram2 = new Tram("71-932 \"Neusky\"", "Electricity", 2000, 70, 120, 75300);

        SubwayTrain subwayTrain1 = new SubwayTrain("81-725.1/726.1/727.1 \"Balcic\"", "Electricity", 6000, 450, 160, 300000);
        SubwayTrain subwayTrain2 = new SubwayTrain("Stadler M110", "Electricity", 8000, 590, 180, 500000);

        myPark.addBusToPark(bus1);
        myPark.addBusToPark(bus2);
        myPark.addBusToPark(bus1);
        myPark.addBusToPark(bus3);
        myPark.addBusToPark(bus4);
        myPark.printBusPark();

        myPark.addMiniBusToPark(miniBus1);
        myPark.addMiniBusToPark(miniBus3);
        myPark.addMiniBusToPark(miniBus2);
        myPark.addMiniBusToPark(miniBus2);
        myPark.addMiniBusToPark(miniBus2);
        myPark.printMiniBusPark();

        myPark.addTramToPark(tram2);
        myPark.addTramToPark(tram2);
        myPark.addTramToPark(tram1);
        myPark.addTramToPark(tram1);
        myPark.addTramToPark(tram2);
        myPark.printTramBusPark();

        myPark.addSubwayTrainToPark(subwayTrain1);
        myPark.addSubwayTrainToPark(subwayTrain1);
        myPark.addSubwayTrainToPark(subwayTrain2);
        myPark.addSubwayTrainToPark(subwayTrain1);
        myPark.printSubwayTrainDepot();

        myPark.printAllPublicTransportPark();

        myPark.calculateCostOfTransportPark();

        myPark.sortPublicTransportByFuelConsumptionDESC();
        myPark.printAllPublicTransportPark();

        myPark.searchByParameter("gjkhdfjkghjk", 1, 50);
        myPark.searchByParameter("price", 1, 100000);
        myPark.searchByParameter("maxDistance", 1000, 2000);
        myPark.searchByParameter("maxNumberOfSeats", 1, 50);


    }
}
