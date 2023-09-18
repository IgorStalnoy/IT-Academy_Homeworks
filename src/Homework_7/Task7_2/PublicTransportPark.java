package Homework_7.Task7_2;

import Homework_7.Task7_2.PublicTransport.*;

import java.util.Objects;

public class PublicTransportPark {
    private Bus[] busPark = new Bus[0];
    private MiniBus[] miniBusPark = new MiniBus[0];
    private Trolleybus[] trolleybusPark = new Trolleybus[0];
    private SubwayTrain[] subwayTrainDepot = new SubwayTrain[0];

    public void addBusToPark(Bus addedBus) {
        Bus[] temp = new Bus[this.busPark.length + 1];
        if (this.busPark.length != 0) {
            System.arraycopy(this.busPark, 0, temp, 0, this.busPark.length);
        }
        temp[temp.length - 1] = addedBus;
        this.busPark = temp;
    }

    public void addMiniBusToPark(MiniBus addedMiniBus) {
        MiniBus[] temp = new MiniBus[this.miniBusPark.length + 1];
        if (this.miniBusPark.length != 0) {
            System.arraycopy(this.miniBusPark, 0, temp, 0, this.miniBusPark.length);
        }
        temp[temp.length - 1] = addedMiniBus;
        this.miniBusPark = temp;
    }

    public void addTrolleybusToPark(Trolleybus addedTrolleybus) {
        Trolleybus[] temp = new Trolleybus[this.trolleybusPark.length + 1];
        if (this.trolleybusPark.length != 0) {
            System.arraycopy(this.trolleybusPark, 0, temp, 0, this.trolleybusPark.length);
        }
        temp[temp.length - 1] = addedTrolleybus;
        this.trolleybusPark = temp;
    }

    public void addSubwayTrainToPark(SubwayTrain addedSubwayTrain) {
        SubwayTrain[] temp = new SubwayTrain[this.subwayTrainDepot.length + 1];
        if (this.subwayTrainDepot.length != 0) {
            System.arraycopy(this.subwayTrainDepot, 0, temp, 0, this.subwayTrainDepot.length);
        }
        temp[temp.length - 1] = addedSubwayTrain;
        this.subwayTrainDepot = temp;
    }

    public void printBusPark() {
        System.out.println("Your bus park contains " + busPark.length + " buses");
        for (Bus i : busPark) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    public void printMiniBusPark() {
        System.out.println("Your mini bus park contains " + miniBusPark.length + " mini buses");
        for (MiniBus i : miniBusPark) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    public void printTrolleybusBusPark() {
        System.out.println("Your tram park contains " + trolleybusPark.length + " trams");
        for (Trolleybus i : trolleybusPark) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    public void printSubwayTrainDepot() {
        System.out.println("Your subway train depot contains " + subwayTrainDepot.length + " trains");
        for (SubwayTrain i : subwayTrainDepot) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    public void printAllPublicTransportPark() {
        int allTransportCount = busPark.length + miniBusPark.length + trolleybusPark.length + subwayTrainDepot.length;
        System.out.println("Your public transport park contains " + allTransportCount + " vehicles");
        printBusPark();
        printMiniBusPark();
        printTrolleybusBusPark();
        printSubwayTrainDepot();
    }

    public void calculateCostOfTransportPark() {
        int allTransportCost = 0;
        for (Bus i : busPark) {
            allTransportCost = allTransportCost + i.getPrice();
        }
        for (MiniBus i : miniBusPark) {
            allTransportCost = allTransportCost + i.getPrice();
        }
        for (Trolleybus i : trolleybusPark) {
            allTransportCost = allTransportCost + i.getPrice();
        }
        for (SubwayTrain i : subwayTrainDepot) {
            allTransportCost = allTransportCost + i.getPrice();
        }
        System.out.println("Total cost of the park : " + allTransportCost + "$\n");
    }

    public void averageBusesExhaustLevel() {
        int count = 0;
        int sum = 0;
        for (Bus i : busPark) {
            count++;
            sum = sum + i.getExhaustGasLevel();
        }
        System.out.println("Average buses exhaust gas level in your park is " + (double) sum / count + "%\n");
    }

    public void totalVolumeOfDriversCoinBox() {
        int totalVolume = 0;
        for (MiniBus i : miniBusPark) {
            totalVolume = totalVolume + i.getVolumeOfDriversCoinBox();
        }
        System.out.println("Total volume of drivers coin box is " + totalVolume + "cm3\n");
    }

    public void totalLengthOfTrolleybusHornsInPark() {
        int totalLength = 0;
        for (Trolleybus i : trolleybusPark) {
            totalLength = totalLength + i.getHornLength();
        }
        System.out.println("Total length of trolleybus horns in park " + totalLength + "m\n");
    }

    public void totalTrainLength() {
        int totalLength = 0;
        for (SubwayTrain i : subwayTrainDepot) {
            totalLength = totalLength + i.getTrainLength();
        }
        System.out.println("Total length of subway train park " + totalLength + "m\n");
    }

    public void sortPublicTransportByFuelConsumptionDESC() {
        if (busPark.length > 0) {
            Bus temp;
            for (int i = 0; i < busPark.length - 1; i++) {
                int maxConsumption = busPark[i].getGasolineConsumption();
                int maxPosition = i;
                for (int k = i; k < busPark.length; k++) {
                    if (busPark[k].getGasolineConsumption() > maxConsumption) {
                        maxConsumption = busPark[k].getGasolineConsumption();
                        maxPosition = k;
                    }
                }
                temp = busPark[maxPosition];
                busPark[maxPosition] = busPark[i];
                busPark[i] = temp;
            }
        }
        if (miniBusPark.length > 0) {
            MiniBus temp;
            for (int i = 0; i < miniBusPark.length - 1; i++) {
                int maxConsumption = miniBusPark[i].getGasolineConsumption();
                int maxPosition = i;
                for (int k = i; k < miniBusPark.length; k++) {
                    if (miniBusPark[k].getGasolineConsumption() > maxConsumption) {
                        maxConsumption = miniBusPark[k].getGasolineConsumption();
                        maxPosition = k;
                    }
                }
                temp = miniBusPark[maxPosition];
                miniBusPark[maxPosition] = miniBusPark[i];
                miniBusPark[i] = temp;
            }
        }
        if (trolleybusPark.length > 0) {
            Trolleybus temp;
            for (int i = 0; i < trolleybusPark.length - 1; i++) {
                int maxConsumption = trolleybusPark[i].getEnergyConsumption();
                int maxPosition = i;
                for (int k = i; k < trolleybusPark.length; k++) {
                    if (trolleybusPark[k].getEnergyConsumption() > maxConsumption) {
                        maxConsumption = trolleybusPark[k].getEnergyConsumption();
                        maxPosition = k;
                    }
                }
                temp = trolleybusPark[maxPosition];
                trolleybusPark[maxPosition] = trolleybusPark[i];
                trolleybusPark[i] = temp;
            }
        }
        if (subwayTrainDepot.length > 0) {
            SubwayTrain temp;
            for (int i = 0; i < subwayTrainDepot.length - 1; i++) {
                int maxConsumption = subwayTrainDepot[i].getEnergyConsumption();
                int maxPosition = i;
                for (int k = i; k < subwayTrainDepot.length; k++) {
                    if (subwayTrainDepot[k].getEnergyConsumption() > maxConsumption) {
                        maxConsumption = subwayTrainDepot[k].getEnergyConsumption();
                        maxPosition = k;
                    }
                }
                temp = subwayTrainDepot[maxPosition];
                subwayTrainDepot[maxPosition] = subwayTrainDepot[i];
                subwayTrainDepot[i] = temp;
            }
        }
    }

    public void searchByParameter(String fieldName, int min, int max) {
        PublicTransport[] temp;
        PublicTransport[] publicTransportSearchResult = new PublicTransport[0];
        if (Objects.equals(fieldName, "price")) {
            for (Bus bus : busPark) {
                if (bus.getPrice() >= min && bus.getPrice() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = bus;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
            for (MiniBus miniBus : miniBusPark) {
                if (miniBus.getPrice() >= min && miniBus.getPrice() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = miniBus;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
            for (Trolleybus trolleybus : trolleybusPark) {
                if (trolleybus.getPrice() >= min && trolleybus.getPrice() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = trolleybus;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
            for (SubwayTrain subwayTrain : subwayTrainDepot) {
                if (subwayTrain.getPrice() >= min && subwayTrain.getPrice() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = subwayTrain;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
        }
        if (Objects.equals(fieldName, "maxDistance")) {
            for (Bus bus : busPark) {
                if (bus.getMaxDistance() >= min && bus.getMaxDistance() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = bus;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
            for (MiniBus miniBus : miniBusPark) {
                if (miniBus.getMaxDistance() >= min && miniBus.getMaxDistance() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = miniBus;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
            for (Trolleybus trolleybus : trolleybusPark) {
                if (trolleybus.getMaxDistance() >= min && trolleybus.getMaxDistance() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = trolleybus;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
            for (SubwayTrain subwayTrain : subwayTrainDepot) {
                if (subwayTrain.getMaxDistance() >= min && subwayTrain.getMaxDistance() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = subwayTrain;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
        }
        if (Objects.equals(fieldName, "maxNumberOfSeats")) {
            for (Bus bus : busPark) {
                if (bus.getMaxNumberOfSeats() >= min && bus.getMaxNumberOfSeats() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = bus;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
            for (MiniBus miniBus : miniBusPark) {
                if (miniBus.getMaxNumberOfSeats() >= min && miniBus.getMaxNumberOfSeats() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = miniBus;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
            for (Trolleybus trolleybus : trolleybusPark) {
                if (trolleybus.getMaxNumberOfSeats() >= min && trolleybus.getMaxNumberOfSeats() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = trolleybus;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
            for (SubwayTrain subwayTrain : subwayTrainDepot) {
                if (subwayTrain.getMaxNumberOfSeats() >= min && subwayTrain.getMaxNumberOfSeats() <= max) {
                    temp = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, temp, 0, publicTransportSearchResult.length);
                    temp[temp.length - 1] = subwayTrain;
                    publicTransportSearchResult = new PublicTransport[temp.length];
                    System.arraycopy(temp, 0, publicTransportSearchResult, 0, temp.length);
                }
            }
        }
        if (Objects.equals(fieldName, "price") || Objects.equals(fieldName, "maxDistance") || Objects.equals(fieldName, "maxNumberOfSeats")) {
            System.out.println("Found " + publicTransportSearchResult.length + " items matching your criteria." + " Search by field \"" +
                    fieldName + "\", between " + min + " and " + max);
            for (PublicTransport i : publicTransportSearchResult) {
                System.out.println(i.toString());
            }
            System.out.println();
        } else {
            System.out.println("Please enter a valid field name. Searching the following fields is available :price, maxDistance, maxNumberOfSeats, is available.\n");
        }
    }
}
