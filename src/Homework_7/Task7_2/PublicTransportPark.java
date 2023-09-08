package Homework_7.Task7_2;

import java.util.Objects;

public class PublicTransportPark {
    private Bus[] busPark = new Bus[0];
    private MiniBus[] miniBusPark = new MiniBus[0];
    private Tram[] tramPark = new Tram[0];
    private SubwayTrain[] subwayTrainDepot = new SubwayTrain[0];

    public void addBusToPark(Bus addedBus) {
        Bus[] intermediateArray = new Bus[this.busPark.length + 1];
        if (this.busPark.length != 0) {
            System.arraycopy(this.busPark, 0, intermediateArray, 0, this.busPark.length);
        }
        intermediateArray[intermediateArray.length - 1] = addedBus;
        this.busPark = intermediateArray;
    }

    public void addMiniBusToPark(MiniBus addedMiniBus) {
        MiniBus[] intermediateArray = new MiniBus[this.miniBusPark.length + 1];
        if (this.miniBusPark.length != 0) {
            System.arraycopy(this.miniBusPark, 0, intermediateArray, 0, this.miniBusPark.length);
        }
        intermediateArray[intermediateArray.length - 1] = addedMiniBus;
        this.miniBusPark = intermediateArray;
    }

    public void addTramToPark(Tram addedTram) {
        Tram[] intermediateArray = new Tram[this.tramPark.length + 1];
        if (this.tramPark.length != 0) {
            System.arraycopy(this.tramPark, 0, intermediateArray, 0, this.tramPark.length);
        }
        intermediateArray[intermediateArray.length - 1] = addedTram;
        this.tramPark = intermediateArray;
    }

    public void addSubwayTrainToPark(SubwayTrain addedSubwayTrain) {
        SubwayTrain[] intermediateArray = new SubwayTrain[this.subwayTrainDepot.length + 1];
        if (this.subwayTrainDepot.length != 0) {
            System.arraycopy(this.subwayTrainDepot, 0, intermediateArray, 0, this.subwayTrainDepot.length);
        }
        intermediateArray[intermediateArray.length - 1] = addedSubwayTrain;
        this.subwayTrainDepot = intermediateArray;
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

    public void printTramBusPark() {
        System.out.println("Your tram park contains " + tramPark.length + " trams");
        for (Tram i : tramPark) {
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
        int allTransportCount = busPark.length + miniBusPark.length + tramPark.length + subwayTrainDepot.length;
        System.out.println("Your public transport park contains " + allTransportCount + " vehicles");
        printBusPark();
        printMiniBusPark();
        printTramBusPark();
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
        for (Tram i : tramPark) {
            allTransportCost = allTransportCost + i.getPrice();
        }
        for (SubwayTrain i : subwayTrainDepot) {
            allTransportCost = allTransportCost + i.getPrice();
        }
        System.out.println("Total cost of the park : " + allTransportCost + "$\n");
    }

    public void sortPublicTransportByFuelConsumptionDESC() {
        if (busPark.length > 0) {
            Bus buffer;
            for (int i = 0; i < busPark.length - 1; i++) {
                int maxConsumption = busPark[i].getGasolineConsumption();
                int maxPosition = i;
                for (int k = i; k < busPark.length; k++) {
                    if (busPark[k].getGasolineConsumption() > maxConsumption) {
                        maxConsumption = busPark[k].getGasolineConsumption();
                        maxPosition = k;
                    }
                }
                buffer = busPark[maxPosition];
                busPark[maxPosition] = busPark[i];
                busPark[i] = buffer;
            }
        }
        if (miniBusPark.length > 0) {
            MiniBus buffer;
            for (int i = 0; i < miniBusPark.length - 1; i++) {
                int maxConsumption = miniBusPark[i].getGasolineConsumption();
                int maxPosition = i;
                for (int k = i; k < miniBusPark.length; k++) {
                    if (miniBusPark[k].getGasolineConsumption() > maxConsumption) {
                        maxConsumption = miniBusPark[k].getGasolineConsumption();
                        maxPosition = k;
                    }
                }
                buffer = miniBusPark[maxPosition];
                miniBusPark[maxPosition] = miniBusPark[i];
                miniBusPark[i] = buffer;
            }
        }
        if (tramPark.length > 0) {
            Tram buffer;
            for (int i = 0; i < tramPark.length - 1; i++) {
                int maxConsumption = tramPark[i].getEnergyConsumption();
                int maxPosition = i;
                for (int k = i; k < tramPark.length; k++) {
                    if (tramPark[k].getEnergyConsumption() > maxConsumption) {
                        maxConsumption = tramPark[k].getEnergyConsumption();
                        maxPosition = k;
                    }
                }
                buffer = tramPark[maxPosition];
                tramPark[maxPosition] = tramPark[i];
                tramPark[i] = buffer;
            }
        }
        if (subwayTrainDepot.length > 0) {
            SubwayTrain buffer;
            for (int i = 0; i < subwayTrainDepot.length - 1; i++) {
                int maxConsumption = subwayTrainDepot[i].getEnergyConsumption();
                int maxPosition = i;
                for (int k = i; k < subwayTrainDepot.length; k++) {
                    if (subwayTrainDepot[k].getEnergyConsumption() > maxConsumption) {
                        maxConsumption = subwayTrainDepot[k].getEnergyConsumption();
                        maxPosition = k;
                    }
                }
                buffer = subwayTrainDepot[maxPosition];
                subwayTrainDepot[maxPosition] = subwayTrainDepot[i];
                subwayTrainDepot[i] = buffer;
            }
        }
    }

    public void searchByParameter(String fieldName, int min, int max) {
        PublicTransport[] publicTransportIntermediateResult;
        PublicTransport[] publicTransportSearchResult = new PublicTransport[0];
        if (Objects.equals(fieldName, "price")) {
            for (Bus bus : busPark) {
                if (bus.getPrice() >= min && bus.getPrice() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = bus;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
            for (MiniBus miniBus : miniBusPark) {
                if (miniBus.getPrice() >= min && miniBus.getPrice() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = miniBus;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
            for (Tram tram : tramPark) {
                if (tram.getPrice() >= min && tram.getPrice() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = tram;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
            for (SubwayTrain subwayTrain : subwayTrainDepot) {
                if (subwayTrain.getPrice() >= min && subwayTrain.getPrice() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = subwayTrain;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
        }
        if (Objects.equals(fieldName, "maxDistance")) {
            for (Bus bus : busPark) {
                if (bus.getMaxDistance() >= min && bus.getMaxDistance() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = bus;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
            for (MiniBus miniBus : miniBusPark) {
                if (miniBus.getMaxDistance() >= min && miniBus.getMaxDistance() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = miniBus;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
            for (Tram tram : tramPark) {
                if (tram.getMaxDistance() >= min && tram.getMaxDistance() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = tram;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
            for (SubwayTrain subwayTrain : subwayTrainDepot) {
                if (subwayTrain.getMaxDistance() >= min && subwayTrain.getMaxDistance() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = subwayTrain;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
        }
        if (Objects.equals(fieldName, "maxNumberOfSeats")) {
            for (Bus bus : busPark) {
                if (bus.getMaxNumberOfSeats() >= min && bus.getMaxNumberOfSeats() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = bus;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
            for (MiniBus miniBus : miniBusPark) {
                if (miniBus.getMaxNumberOfSeats() >= min && miniBus.getMaxNumberOfSeats() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = miniBus;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
            for (Tram tram : tramPark) {
                if (tram.getMaxNumberOfSeats() >= min && tram.getMaxNumberOfSeats() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = tram;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
                }
            }
            for (SubwayTrain subwayTrain : subwayTrainDepot) {
                if (subwayTrain.getMaxNumberOfSeats() >= min && subwayTrain.getMaxNumberOfSeats() <= max) {
                    publicTransportIntermediateResult = new PublicTransport[publicTransportSearchResult.length + 1];
                    System.arraycopy(publicTransportSearchResult, 0, publicTransportIntermediateResult, 0, publicTransportSearchResult.length);
                    publicTransportIntermediateResult[publicTransportIntermediateResult.length - 1] = subwayTrain;
                    publicTransportSearchResult = new PublicTransport[publicTransportIntermediateResult.length];
                    System.arraycopy(publicTransportIntermediateResult, 0, publicTransportSearchResult, 0, publicTransportIntermediateResult.length);
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
