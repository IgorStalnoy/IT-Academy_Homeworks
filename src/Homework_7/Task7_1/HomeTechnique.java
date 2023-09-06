package Homework_7.Task7_1;

import java.util.Objects;

public abstract class HomeTechnique {
    private final String type;
    private final int price;
    private final String model;
    private final double weight;
    boolean isConnectedToGrid = false;

    HomeTechnique(String model, double weight, int price, String type) {
        this.type = type;
        this.price = price;
        this.model = model;
        this.weight = weight;
    }

    public abstract void connectToPowerGrid();

    public abstract void disconnectFromPowerGrid();

    public static void sortHomeTechniqueDESC(String fieldName) {
        if (Objects.equals(fieldName, "price")) {
            if (Home.kitchenAppliancesCatalog.length > 0) {
                int maxPrice = Home.kitchenAppliancesCatalog[0].getPrice();
                int maxPosition = 0;
                for (int i = 0; i < Home.kitchenAppliancesCatalog.length - 1; i++) {
                    for (int k = i; k < Home.kitchenAppliancesCatalog.length; k++) {
                        if (Home.kitchenAppliancesCatalog[k].getPrice() > maxPrice) {
                            maxPosition = k;
                            maxPrice = Home.kitchenAppliancesCatalog[k].getPrice();
                        }
                    }
                    KitchenAppliances kitchenAppliances = Home.kitchenAppliancesCatalog[maxPosition];
                    Home.kitchenAppliancesCatalog[maxPosition] = Home.kitchenAppliancesCatalog[i];
                    Home.kitchenAppliancesCatalog[i] = kitchenAppliances;
                    if (Home.kitchenAppliancesCatalog.length > 0) {
                        maxPosition = i + 1;
                    }
                    maxPrice = Home.kitchenAppliancesCatalog[i + 1].getPrice();
                }
            }
            if (Home.livingRoomAppliancesCatalog.length > 0) {
                int maxPrice = Home.livingRoomAppliancesCatalog[0].getPrice();
                int maxPosition = 0;
                for (int i = 0; i < Home.livingRoomAppliancesCatalog.length - 1; i++) {
                    for (int k = i; k < Home.livingRoomAppliancesCatalog.length; k++) {
                        if (Home.livingRoomAppliancesCatalog[k].getPrice() > maxPrice) {
                            maxPosition = k;
                            maxPrice = Home.livingRoomAppliancesCatalog[k].getPrice();
                        }
                    }
                    LivingRoomAppliances livingRoomAppliances = Home.livingRoomAppliancesCatalog[maxPosition];
                    Home.livingRoomAppliancesCatalog[maxPosition] = Home.livingRoomAppliancesCatalog[i];
                    Home.livingRoomAppliancesCatalog[i] = livingRoomAppliances;
                    maxPosition = i + 1;
                    maxPrice = Home.livingRoomAppliancesCatalog[i + 1].getPrice();
                }
            }
            if (Home.sourcesOfElectricityCatalog.length > 0) {
                int maxPrice = Home.sourcesOfElectricityCatalog[0].getPrice();
                int maxPosition = 0;
                for (int i = 0; i < Home.sourcesOfElectricityCatalog.length - 1; i++) {
                    for (int k = i; k < Home.sourcesOfElectricityCatalog.length; k++) {
                        if (Home.sourcesOfElectricityCatalog[k].getPrice() > maxPrice) {
                            maxPosition = k;
                            maxPrice = Home.sourcesOfElectricityCatalog[k].getPrice();
                        }
                    }
                    SourcesOfElectricity sourcesOfElectricity = Home.sourcesOfElectricityCatalog[maxPosition];
                    Home.sourcesOfElectricityCatalog[maxPosition] = Home.sourcesOfElectricityCatalog[i];
                    Home.sourcesOfElectricityCatalog[i] = sourcesOfElectricity;
                    maxPosition = i + 1;
                    maxPrice = Home.sourcesOfElectricityCatalog[i + 1].getPrice();
                }
            }
        } else if (Objects.equals(fieldName, "weight")) {
            if (Home.kitchenAppliancesCatalog.length > 0) {
                double maxWeight = Home.kitchenAppliancesCatalog[0].getWeight();
                int maxPosition = 0;
                for (int i = 0; i < Home.kitchenAppliancesCatalog.length - 1; i++) {
                    for (int k = i; k < Home.kitchenAppliancesCatalog.length; k++) {
                        if (Home.kitchenAppliancesCatalog[k].getWeight() > maxWeight) {
                            maxPosition = k;
                            maxWeight = Home.kitchenAppliancesCatalog[k].getWeight();
                        }
                    }
                    KitchenAppliances kitchenAppliances = Home.kitchenAppliancesCatalog[maxPosition];
                    Home.kitchenAppliancesCatalog[maxPosition] = Home.kitchenAppliancesCatalog[i];
                    Home.kitchenAppliancesCatalog[i] = kitchenAppliances;
                    maxPosition = i + 1;
                    maxWeight = Home.kitchenAppliancesCatalog[i + 1].getWeight();
                }
            }
            if (Home.livingRoomAppliancesCatalog.length > 0) {
                double maxWeight = Home.livingRoomAppliancesCatalog[0].getWeight();
                int maxPosition = 0;
                for (int i = 0; i < Home.livingRoomAppliancesCatalog.length - 1; i++) {
                    for (int k = i; k < Home.livingRoomAppliancesCatalog.length; k++) {
                        if (Home.livingRoomAppliancesCatalog[k].getWeight() > maxWeight) {
                            maxPosition = k;
                            maxWeight = Home.livingRoomAppliancesCatalog[k].getWeight();
                        }
                    }
                    LivingRoomAppliances livingRoomAppliances = Home.livingRoomAppliancesCatalog[maxPosition];
                    Home.livingRoomAppliancesCatalog[maxPosition] = Home.livingRoomAppliancesCatalog[i];
                    Home.livingRoomAppliancesCatalog[i] = livingRoomAppliances;
                    maxPosition = i + 1;
                    maxWeight = Home.livingRoomAppliancesCatalog[i + 1].getWeight();
                }
            }
            if (Home.sourcesOfElectricityCatalog.length > 0) {
                double maxWeight = Home.sourcesOfElectricityCatalog[0].getWeight();
                int maxPosition = 0;
                for (int i = 0; i < Home.sourcesOfElectricityCatalog.length - 1; i++) {
                    for (int k = i; k < Home.sourcesOfElectricityCatalog.length; k++) {
                        if (Home.sourcesOfElectricityCatalog[k].getWeight() > maxWeight) {
                            maxPosition = k;
                            maxWeight = Home.sourcesOfElectricityCatalog[k].getWeight();
                        }
                    }
                    SourcesOfElectricity sourcesOfElectricity = Home.sourcesOfElectricityCatalog[maxPosition];
                    Home.sourcesOfElectricityCatalog[maxPosition] = Home.sourcesOfElectricityCatalog[i];
                    Home.sourcesOfElectricityCatalog[i] = sourcesOfElectricity;
                    maxPosition = i + 1;
                    maxWeight = Home.sourcesOfElectricityCatalog[i + 1].getWeight();
                }
            }
        } else if (Objects.equals(fieldName, "powerСonsumption")) {
            if (Home.kitchenAppliancesCatalog.length > 0) {
                int maxPowerConsumption = Home.kitchenAppliancesCatalog[0].getPowerConsumption();
                int maxPosition = 0;
                for (int i = 0; i < Home.kitchenAppliancesCatalog.length - 1; i++) {
                    for (int k = i; k < Home.kitchenAppliancesCatalog.length; k++) {
                        if (Home.kitchenAppliancesCatalog[k].getPowerConsumption() > maxPowerConsumption) {
                            maxPosition = k;
                            maxPowerConsumption = Home.kitchenAppliancesCatalog[k].getPowerConsumption();
                        }
                    }
                    KitchenAppliances kitchenAppliances = Home.kitchenAppliancesCatalog[maxPosition];
                    Home.kitchenAppliancesCatalog[maxPosition] = Home.kitchenAppliancesCatalog[i];
                    Home.kitchenAppliancesCatalog[i] = kitchenAppliances;
                    maxPosition = i + 1;
                    maxPowerConsumption = Home.kitchenAppliancesCatalog[i + 1].getPowerConsumption();
                }
            }
            if (Home.livingRoomAppliancesCatalog.length > 0) {
                int maxPowerConsumption = Home.livingRoomAppliancesCatalog[0].getPowerConsumption();
                int maxPosition = 0;
                for (int i = 0; i < Home.livingRoomAppliancesCatalog.length - 1; i++) {
                    for (int k = i; k < Home.livingRoomAppliancesCatalog.length; k++) {
                        if (Home.livingRoomAppliancesCatalog[k].getPowerConsumption() > maxPowerConsumption) {
                            maxPosition = k;
                            maxPowerConsumption = Home.livingRoomAppliancesCatalog[k].getPowerConsumption();
                        }
                    }
                    LivingRoomAppliances livingRoomAppliances = Home.livingRoomAppliancesCatalog[maxPosition];
                    Home.livingRoomAppliancesCatalog[maxPosition] = Home.livingRoomAppliancesCatalog[i];
                    Home.livingRoomAppliancesCatalog[i] = livingRoomAppliances;
                    maxPosition = i + 1;
                    maxPowerConsumption = Home.livingRoomAppliancesCatalog[i + 1].getPowerConsumption();
                }
            }
        } else if (Objects.equals(fieldName, "generatedPower")) {
            if (Home.sourcesOfElectricityCatalog.length > 0) {
                int maxGeneratedPower = Home.sourcesOfElectricityCatalog[0].getGeneratedPower();
                int maxPosition = 0;
                for (int i = 0; i < Home.sourcesOfElectricityCatalog.length - 1; i++) {
                    for (int k = i; k < Home.sourcesOfElectricityCatalog.length; k++) {
                        if (Home.sourcesOfElectricityCatalog[k].getGeneratedPower() > maxGeneratedPower) {
                            maxPosition = k;
                            maxGeneratedPower = Home.sourcesOfElectricityCatalog[k].getGeneratedPower();
                        }
                    }
                    SourcesOfElectricity sourcesOfElectricity = Home.sourcesOfElectricityCatalog[maxPosition];
                    Home.sourcesOfElectricityCatalog[maxPosition] = Home.sourcesOfElectricityCatalog[i];
                    Home.sourcesOfElectricityCatalog[i] = sourcesOfElectricity;
                    maxPosition = i + 1;
                    maxGeneratedPower = Home.sourcesOfElectricityCatalog[i + 1].getGeneratedPower();
                }
            }
        } else {
            System.out.println("Please enter a valid field name. Sorting by fields price, weight, powerConsumption, generatedPower is available\n");
        }
    }

    public static void searchByParameter(String fieldName, int min, int max) {
        HomeTechnique[] homeTechniquesIntermediateResult;
        HomeTechnique[] homeTechniquesSearchResult = new HomeTechnique[0];
        if (Objects.equals(fieldName, "price")) {
            for (int i = 0; i < Home.kitchenAppliancesCatalog.length; i++) {
                if (Home.kitchenAppliancesCatalog[i].getPrice() >= min && Home.kitchenAppliancesCatalog[i].getPrice() <= max) {
                    homeTechniquesIntermediateResult = new HomeTechnique[homeTechniquesSearchResult.length + 1];
                    System.arraycopy(homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult.length);
                    homeTechniquesIntermediateResult[homeTechniquesIntermediateResult.length - 1] = Home.kitchenAppliancesCatalog[i];
                    homeTechniquesSearchResult = new HomeTechnique[homeTechniquesIntermediateResult.length];
                    System.arraycopy(homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult.length);
                }
            }
            for (int i = 0; i < Home.livingRoomAppliancesCatalog.length; i++) {
                if (Home.livingRoomAppliancesCatalog[i].getPrice() >= min && Home.livingRoomAppliancesCatalog[i].getPrice() <= max) {
                    homeTechniquesIntermediateResult = new HomeTechnique[homeTechniquesSearchResult.length + 1];
                    System.arraycopy(homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult.length);
                    homeTechniquesIntermediateResult[homeTechniquesIntermediateResult.length - 1] = Home.livingRoomAppliancesCatalog[i];
                    homeTechniquesSearchResult = new HomeTechnique[homeTechniquesIntermediateResult.length];
                    System.arraycopy(homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult.length);
                }
            }
            for (int i = 0; i < Home.sourcesOfElectricityCatalog.length; i++) {
                if (Home.sourcesOfElectricityCatalog[i].getPrice() >= min && Home.sourcesOfElectricityCatalog[i].getPrice() <= max) {
                    homeTechniquesIntermediateResult = new HomeTechnique[homeTechniquesSearchResult.length + 1];
                    System.arraycopy(homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult.length);
                    homeTechniquesIntermediateResult[homeTechniquesIntermediateResult.length - 1] = Home.sourcesOfElectricityCatalog[i];
                    homeTechniquesSearchResult = new HomeTechnique[homeTechniquesIntermediateResult.length];
                    System.arraycopy(homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult.length);
                }
            }
        } else if (Objects.equals(fieldName, "weight")) {
            for (int i = 0; i < Home.kitchenAppliancesCatalog.length; i++) {
                if (Home.kitchenAppliancesCatalog[i].getWeight() >= min && Home.kitchenAppliancesCatalog[i].getWeight() <= max) {
                    homeTechniquesIntermediateResult = new HomeTechnique[homeTechniquesSearchResult.length + 1];
                    System.arraycopy(homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult.length);
                    homeTechniquesIntermediateResult[homeTechniquesIntermediateResult.length - 1] = Home.kitchenAppliancesCatalog[i];
                    homeTechniquesSearchResult = new HomeTechnique[homeTechniquesIntermediateResult.length];
                    System.arraycopy(homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult.length);
                }
            }
            for (int i = 0; i < Home.livingRoomAppliancesCatalog.length; i++) {
                if (Home.livingRoomAppliancesCatalog[i].getWeight() >= min && Home.livingRoomAppliancesCatalog[i].getWeight() <= max) {
                    homeTechniquesIntermediateResult = new HomeTechnique[homeTechniquesSearchResult.length + 1];
                    System.arraycopy(homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult.length);
                    homeTechniquesIntermediateResult[homeTechniquesIntermediateResult.length - 1] = Home.livingRoomAppliancesCatalog[i];
                    homeTechniquesSearchResult = new HomeTechnique[homeTechniquesIntermediateResult.length];
                    System.arraycopy(homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult.length);
                }
            }
            for (int i = 0; i < Home.sourcesOfElectricityCatalog.length; i++) {
                if (Home.sourcesOfElectricityCatalog[i].getWeight() >= min && Home.sourcesOfElectricityCatalog[i].getWeight() <= max) {
                    homeTechniquesIntermediateResult = new HomeTechnique[homeTechniquesSearchResult.length + 1];
                    System.arraycopy(homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult.length);
                    homeTechniquesIntermediateResult[homeTechniquesIntermediateResult.length - 1] = Home.sourcesOfElectricityCatalog[i];
                    homeTechniquesSearchResult = new HomeTechnique[homeTechniquesIntermediateResult.length];
                    System.arraycopy(homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult.length);
                }
            }
        } else if (Objects.equals(fieldName, "powerConsumption")) {
            for (int i = 0; i < Home.kitchenAppliancesCatalog.length; i++) {
                if (Home.kitchenAppliancesCatalog[i].getPowerConsumption() >= min && Home.kitchenAppliancesCatalog[i].getPowerConsumption() <= max) {
                    homeTechniquesIntermediateResult = new HomeTechnique[homeTechniquesSearchResult.length + 1];
                    System.arraycopy(homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult.length);
                    homeTechniquesIntermediateResult[homeTechniquesIntermediateResult.length - 1] = Home.kitchenAppliancesCatalog[i];
                    homeTechniquesSearchResult = new HomeTechnique[homeTechniquesIntermediateResult.length];
                    System.arraycopy(homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult.length);
                }
            }
            for (int i = 0; i < Home.livingRoomAppliancesCatalog.length; i++) {
                if (Home.livingRoomAppliancesCatalog[i].getPowerConsumption() >= min && Home.livingRoomAppliancesCatalog[i].getPowerConsumption() <= max) {
                    homeTechniquesIntermediateResult = new HomeTechnique[homeTechniquesSearchResult.length + 1];
                    System.arraycopy(homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult.length);
                    homeTechniquesIntermediateResult[homeTechniquesIntermediateResult.length - 1] = Home.livingRoomAppliancesCatalog[i];
                    homeTechniquesSearchResult = new HomeTechnique[homeTechniquesIntermediateResult.length];
                    System.arraycopy(homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult.length);
                }
            }
        } else if (Objects.equals(fieldName, "generatedPower")) {
            for (int i = 0; i < Home.sourcesOfElectricityCatalog.length; i++) {
                if (Home.sourcesOfElectricityCatalog[i].getGeneratedPower() >= min && Home.sourcesOfElectricityCatalog[i].getGeneratedPower() <= max) {
                    homeTechniquesIntermediateResult = new HomeTechnique[homeTechniquesSearchResult.length + 1];
                    System.arraycopy(homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult.length);
                    homeTechniquesIntermediateResult[homeTechniquesIntermediateResult.length - 1] = Home.sourcesOfElectricityCatalog[i];
                    homeTechniquesSearchResult = new HomeTechnique[homeTechniquesIntermediateResult.length];
                    System.arraycopy(homeTechniquesIntermediateResult, 0, homeTechniquesSearchResult, 0, homeTechniquesIntermediateResult.length);
                }
            }
        }
        if (Objects.equals(fieldName, "price") || Objects.equals(fieldName, "weight") || Objects.equals(fieldName, "powerConsumption") || Objects.equals(fieldName, "generatedPower")) {
            System.out.println("Found " + homeTechniquesSearchResult.length + " items matching your criteria.");
            for (HomeTechnique i : homeTechniquesSearchResult) {
                if (i instanceof KitchenAppliances) {
                    System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), ((KitchenAppliances) i).getPowerConsumption(), i.getWeight(),
                            i.getPrice());
                } else if (i instanceof LivingRoomAppliances) {
                    System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), ((LivingRoomAppliances) i).getPowerConsumption(), i.getWeight(),
                            i.getPrice());
                } else {
                    System.out.printf("Type : %s| Model : %s| Generated power : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), ((SourcesOfElectricity) i).getGeneratedPower(), i.getWeight(),
                            i.getPrice());
                }
            }
            System.out.println();
        } else {
            System.out.println("Please enter a valid field name. Searching the following fields is available :price, weight, powerConsumption, generatedPower is available.\n");
        }
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
