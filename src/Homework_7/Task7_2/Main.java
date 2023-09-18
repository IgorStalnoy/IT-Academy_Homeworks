package Homework_7.Task7_2;


import Homework_7.Task7_2.PublicTransport.Bus;
import Homework_7.Task7_2.PublicTransport.MiniBus;
import Homework_7.Task7_2.PublicTransport.SubwayTrain;
import Homework_7.Task7_2.PublicTransport.Trolleybus;

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

        Bus bus1 = new Bus("MAZ-232", "Diesel", 900, 60, 25, 45000, 10);
        Bus bus2 = new Bus("MAZ-4432", "Diesel", 1300, 72, 30, 65000, 15);
        Bus bus3 = new Bus("MAZ-111", "Gasoline", 700, 62, 30, 27000,11);
        Bus bus4 = new Bus("Liaz-1234D", "Gasoline", 600, 48, 40, 16000,45);

        MiniBus miniBus1 = new MiniBus("Hyundai H350", "Diesel", 1100, 14, 15, 26000,5);
        MiniBus miniBus2 = new MiniBus("Mercedes-Benz Sprinter 316", "Diesel", 1300, 12, 13, 49000,10);
        MiniBus miniBus3 = new MiniBus("UAZ \"Buhanka\"", "Gasoline", 490, 8, 26, 1, 15);

        Trolleybus trolleybus1 = new Trolleybus("Stadler B85601M", "Electricity", 3000, 80, 90, 120000, 5);
        Trolleybus trolleybus2 = new Trolleybus("71-932 \"Neusky\"", "Electricity", 2000, 70, 120, 75300, 7);

        SubwayTrain subwayTrain1 = new SubwayTrain("81-725.1/726.1/727.1 \"Balcic\"", "Electricity", 6000, 450, 160, 300000, 20);
        SubwayTrain subwayTrain2 = new SubwayTrain("Stadler M110", "Electricity", 8000, 590, 180, 500000,24);

        myPark.addBusToPark(bus1);
        myPark.addBusToPark(bus2);
        myPark.addBusToPark(bus1);
        myPark.addBusToPark(bus3);
        myPark.addBusToPark(bus4);
        myPark.printBusPark();
        myPark.averageBusesExhaustLevel();

        myPark.addMiniBusToPark(miniBus1);
        myPark.addMiniBusToPark(miniBus3);
        myPark.addMiniBusToPark(miniBus2);
        myPark.addMiniBusToPark(miniBus2);
        myPark.addMiniBusToPark(miniBus2);
        myPark.printMiniBusPark();
        myPark.totalVolumeOfDriversCoinBox();

        myPark.addTrolleybusToPark(trolleybus2);
        myPark.addTrolleybusToPark(trolleybus2);
        myPark.addTrolleybusToPark(trolleybus1);
        myPark.addTrolleybusToPark(trolleybus1);
        myPark.addTrolleybusToPark(trolleybus2);
        myPark.printTrolleybusBusPark();
        myPark.totalLengthOfTrolleybusHornsInPark();

        myPark.addSubwayTrainToPark(subwayTrain1);
        myPark.addSubwayTrainToPark(subwayTrain1);
        myPark.addSubwayTrainToPark(subwayTrain2);
        myPark.addSubwayTrainToPark(subwayTrain1);
        myPark.printSubwayTrainDepot();
        myPark.totalTrainLength();

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
