package Homework_7.Task7_1;

import Homework_7.Task7_1.HomeAppliances.Generators;
import Homework_7.Task7_1.HomeAppliances.HomeAppliances;
import Homework_7.Task7_1.HomeAppliances.KitchenAppliances;
import Homework_7.Task7_1.HomeAppliances.LivingRoomAppliances;

import java.util.Objects;

public class Home {

    private int homeBudget;
    private int maxNetworkLoad = 0;
    private int usedNetworkLoad = 0;
    private KitchenAppliances[] kitchenAppliancesList = new KitchenAppliances[0];
    private LivingRoomAppliances[] livingRoomAppliancesList = new LivingRoomAppliances[0];
    private Generators[] generatorsList = new Generators[0];

    public Home(int homeBudget) {
        this.homeBudget = homeBudget;
    }

    public void buyKitchenAppliance(KitchenAppliances kitchenAppliances) {
        if (isExist(kitchenAppliances)) {
            System.out.println("You can't have 2 things that are the same\n");
        } else {
            if (homeBudget - kitchenAppliances.getPrice() < 0) {
                System.out.println("Sorry, you don't have enough money to buy this\n");
            } else {
                KitchenAppliances[] newKitchenAppliancesCatalog = new KitchenAppliances[kitchenAppliancesList.length + 1];
                if (kitchenAppliancesList.length != 0) {
                    System.arraycopy(kitchenAppliancesList, 0, newKitchenAppliancesCatalog, 0, kitchenAppliancesList.length);
                }
                kitchenAppliancesList = newKitchenAppliancesCatalog;
                kitchenAppliancesList[kitchenAppliancesList.length - 1] = kitchenAppliances;
                homeBudget = homeBudget - kitchenAppliances.getPrice();
                kitchenAppliances.setBelongsToHouse(this);
                System.out.println("Kitchen appliance " + kitchenAppliances.getType() + " " + kitchenAppliances.getModel() + "was successfully bought. You have $" +
                        homeBudget + " left on your balance\n");
            }
        }
    }

    public void buyLivingRoomAppliance(LivingRoomAppliances livingRoomAppliances) {
        if (isExist(livingRoomAppliances)) {
            System.out.println("You can't have 2 things that are the same\n");
        } else {
            if (homeBudget - livingRoomAppliances.getPrice() < 0) {
                System.out.println("Sorry, you don't have enough money to buy this\n");
            } else {
                LivingRoomAppliances[] newLivingRoomAppliancesCatalog = new LivingRoomAppliances[livingRoomAppliancesList.length + 1];
                if (livingRoomAppliancesList.length != 0) {
                    System.arraycopy(livingRoomAppliancesList, 0, newLivingRoomAppliancesCatalog, 0, livingRoomAppliancesList.length);
                }
                livingRoomAppliancesList = newLivingRoomAppliancesCatalog;
                livingRoomAppliancesList[livingRoomAppliancesList.length - 1] = livingRoomAppliances;
                homeBudget = homeBudget - livingRoomAppliances.getPrice();
                livingRoomAppliances.setBelongsToHouse(this);
                System.out.println("Living room appliance " + livingRoomAppliances.getType() + " " + livingRoomAppliances.getModel() + "was successfully bought. " +
                        "You have $" + homeBudget + " left on your balance\n");
            }
        }
    }

    public void buySourceOfElectricity(Generators generators) {
        if (isExist(generators)) {
            System.out.println("You can't have 2 things that are the same\n");
        } else {
            if (homeBudget - generators.getPrice() < 0) {
                System.out.println("Sorry, you don't have enough money to buy this\n");
            } else {
                Generators[] newGeneratorsCatalog = new Generators[generatorsList.length + 1];
                if (generatorsList.length != 0) {
                    System.arraycopy(generatorsList, 0, newGeneratorsCatalog, 0, generatorsList.length);
                }
                generatorsList = newGeneratorsCatalog;
                generatorsList[generatorsList.length - 1] = generators;
                homeBudget = homeBudget - generators.getPrice();
                generators.setBelongsToHouse(this);
                System.out.println("Source of electricity " + generators.getType() + " " + generators.getModel() + "appliance was successfully " +
                        "bought. You have $" + homeBudget + " left on your balance. Don't forget to connect the generator to your power grid.\n");
            }
        }
    }

    public void printKitchenAppliancesList() {
        System.out.println("You have " + kitchenAppliancesList.length + " kitchen appliance items :");
        for (KitchenAppliances i : kitchenAppliancesList) {
            System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), i.getPowerConsumption(), i.getWeight(),
                    i.getPrice());
        }
        System.out.println();
    }

    public void printLivingRoomAppliancesList() {
        System.out.println("You have " + livingRoomAppliancesList.length + " living room appliances items :");
        for (LivingRoomAppliances i : livingRoomAppliancesList) {
            System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), i.getPowerConsumption(), i.getWeight(),
                    i.getPrice());
        }
        System.out.println();
    }

    public void printGeneratorsList() {
        System.out.println("You have " + generatorsList.length + " sources of electricity items :");
        for (Generators i : generatorsList) {
            System.out.printf("Type : %s| Model : %s| Generated power : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), i.getGeneratedPower(), i.getWeight(),
                    i.getPrice());
        }
        System.out.println();
    }

    public void printAllHomeAppliancesList() {
        int itemsTotal = kitchenAppliancesList.length + livingRoomAppliancesList.length + generatorsList.length;
        System.out.println("You have " + itemsTotal + " home appliances items total:");
        printKitchenAppliancesList();
        printLivingRoomAppliancesList();
        printGeneratorsList();
    }

    public void sortHomeAppliancesDESC(String fieldName) {
        if (Objects.equals(fieldName, "price")) {
            if (kitchenAppliancesList.length > 0) {
                int maxPrice = kitchenAppliancesList[0].getPrice();
                int maxPosition = 0;
                for (int i = 0; i < kitchenAppliancesList.length - 1; i++) {
                    for (int k = i; k < kitchenAppliancesList.length; k++) {
                        if (kitchenAppliancesList[k].getPrice() > maxPrice) {
                            maxPosition = k;
                            maxPrice = kitchenAppliancesList[k].getPrice();
                        }
                    }
                    KitchenAppliances kitchenAppliances = kitchenAppliancesList[maxPosition];
                    kitchenAppliancesList[maxPosition] = kitchenAppliancesList[i];
                    kitchenAppliancesList[i] = kitchenAppliances;
                    if (kitchenAppliancesList.length > 0) {
                        maxPosition = i + 1;
                    }
                    maxPrice = kitchenAppliancesList[i + 1].getPrice();
                }
            }
            if (livingRoomAppliancesList.length > 0) {
                int maxPrice = livingRoomAppliancesList[0].getPrice();
                int maxPosition = 0;
                for (int i = 0; i < livingRoomAppliancesList.length - 1; i++) {
                    for (int k = i; k < livingRoomAppliancesList.length; k++) {
                        if (livingRoomAppliancesList[k].getPrice() > maxPrice) {
                            maxPosition = k;
                            maxPrice = livingRoomAppliancesList[k].getPrice();
                        }
                    }
                    LivingRoomAppliances livingRoomAppliances = livingRoomAppliancesList[maxPosition];
                    livingRoomAppliancesList[maxPosition] = livingRoomAppliancesList[i];
                    livingRoomAppliancesList[i] = livingRoomAppliances;
                    maxPosition = i + 1;
                    maxPrice = livingRoomAppliancesList[i + 1].getPrice();
                }
            }
            if (generatorsList.length > 0) {
                int maxPrice = generatorsList[0].getPrice();
                int maxPosition = 0;
                for (int i = 0; i < generatorsList.length - 1; i++) {
                    for (int k = i; k < generatorsList.length; k++) {
                        if (generatorsList[k].getPrice() > maxPrice) {
                            maxPosition = k;
                            maxPrice = generatorsList[k].getPrice();
                        }
                    }
                    Generators generators = generatorsList[maxPosition];
                    generatorsList[maxPosition] = generatorsList[i];
                    generatorsList[i] = generators;
                    maxPosition = i + 1;
                    maxPrice = generatorsList[i + 1].getPrice();
                }
            }
        } else if (Objects.equals(fieldName, "weight")) {
            if (kitchenAppliancesList.length > 0) {
                double maxWeight = kitchenAppliancesList[0].getWeight();
                int maxPosition = 0;
                for (int i = 0; i < kitchenAppliancesList.length - 1; i++) {
                    for (int k = i; k < kitchenAppliancesList.length; k++) {
                        if (kitchenAppliancesList[k].getWeight() > maxWeight) {
                            maxPosition = k;
                            maxWeight = kitchenAppliancesList[k].getWeight();
                        }
                    }
                    KitchenAppliances kitchenAppliances = kitchenAppliancesList[maxPosition];
                    kitchenAppliancesList[maxPosition] = kitchenAppliancesList[i];
                    kitchenAppliancesList[i] = kitchenAppliances;
                    maxPosition = i + 1;
                    maxWeight = kitchenAppliancesList[i + 1].getWeight();
                }
            }
            if (livingRoomAppliancesList.length > 0) {
                double maxWeight = livingRoomAppliancesList[0].getWeight();
                int maxPosition = 0;
                for (int i = 0; i < livingRoomAppliancesList.length - 1; i++) {
                    for (int k = i; k < livingRoomAppliancesList.length; k++) {
                        if (livingRoomAppliancesList[k].getWeight() > maxWeight) {
                            maxPosition = k;
                            maxWeight = livingRoomAppliancesList[k].getWeight();
                        }
                    }
                    LivingRoomAppliances livingRoomAppliances = livingRoomAppliancesList[maxPosition];
                    livingRoomAppliancesList[maxPosition] = livingRoomAppliancesList[i];
                    livingRoomAppliancesList[i] = livingRoomAppliances;
                    maxPosition = i + 1;
                    maxWeight = livingRoomAppliancesList[i + 1].getWeight();
                }
            }
            if (generatorsList.length > 0) {
                double maxWeight = generatorsList[0].getWeight();
                int maxPosition = 0;
                for (int i = 0; i < generatorsList.length - 1; i++) {
                    for (int k = i; k < generatorsList.length; k++) {
                        if (generatorsList[k].getWeight() > maxWeight) {
                            maxPosition = k;
                            maxWeight = generatorsList[k].getWeight();
                        }
                    }
                    Generators generators = generatorsList[maxPosition];
                    generatorsList[maxPosition] = generatorsList[i];
                    generatorsList[i] = generators;
                    maxPosition = i + 1;
                    maxWeight = generatorsList[i + 1].getWeight();
                }
            }
        } else if (Objects.equals(fieldName, "powerСonsumption")) {
            if (kitchenAppliancesList.length > 0) {
                int maxPowerConsumption = kitchenAppliancesList[0].getPowerConsumption();
                int maxPosition = 0;
                for (int i = 0; i < kitchenAppliancesList.length - 1; i++) {
                    for (int k = i; k < kitchenAppliancesList.length; k++) {
                        if (kitchenAppliancesList[k].getPowerConsumption() > maxPowerConsumption) {
                            maxPosition = k;
                            maxPowerConsumption = kitchenAppliancesList[k].getPowerConsumption();
                        }
                    }
                    KitchenAppliances kitchenAppliances = kitchenAppliancesList[maxPosition];
                    kitchenAppliancesList[maxPosition] = kitchenAppliancesList[i];
                    kitchenAppliancesList[i] = kitchenAppliances;
                    maxPosition = i + 1;
                    maxPowerConsumption = kitchenAppliancesList[i + 1].getPowerConsumption();
                }
            }
            if (livingRoomAppliancesList.length > 0) {
                int maxPowerConsumption = livingRoomAppliancesList[0].getPowerConsumption();
                int maxPosition = 0;
                for (int i = 0; i < livingRoomAppliancesList.length - 1; i++) {
                    for (int k = i; k < livingRoomAppliancesList.length; k++) {
                        if (livingRoomAppliancesList[k].getPowerConsumption() > maxPowerConsumption) {
                            maxPosition = k;
                            maxPowerConsumption = livingRoomAppliancesList[k].getPowerConsumption();
                        }
                    }
                    LivingRoomAppliances livingRoomAppliances = livingRoomAppliancesList[maxPosition];
                    livingRoomAppliancesList[maxPosition] = livingRoomAppliancesList[i];
                    livingRoomAppliancesList[i] = livingRoomAppliances;
                    maxPosition = i + 1;
                    maxPowerConsumption = livingRoomAppliancesList[i + 1].getPowerConsumption();
                }
            }
        } else if (Objects.equals(fieldName, "generatedPower")) {
            if (generatorsList.length > 0) {
                int maxGeneratedPower = generatorsList[0].getGeneratedPower();
                int maxPosition = 0;
                for (int i = 0; i < generatorsList.length - 1; i++) {
                    for (int k = i; k < generatorsList.length; k++) {
                        if (generatorsList[k].getGeneratedPower() > maxGeneratedPower) {
                            maxPosition = k;
                            maxGeneratedPower = generatorsList[k].getGeneratedPower();
                        }
                    }
                    Generators generators = generatorsList[maxPosition];
                    generatorsList[maxPosition] = generatorsList[i];
                    generatorsList[i] = generators;
                    maxPosition = i + 1;
                    maxGeneratedPower = generatorsList[i + 1].getGeneratedPower();
                }
            }
        } else {
            System.out.println("Please enter a valid field name. Sorting by fields price, weight, powerConsumption, generatedPower is available\n");
        }
    }

    private boolean isExist(HomeAppliances homeAppliances) {
        if (homeAppliances instanceof KitchenAppliances) {
            for (KitchenAppliances appliances : kitchenAppliancesList) {
                if (homeAppliances == appliances) {
                    return true;
                }
            }
        } else if (homeAppliances instanceof LivingRoomAppliances) {
            for (LivingRoomAppliances appliances : livingRoomAppliancesList) {
                if (homeAppliances == appliances) {
                    return true;
                }
            }
        } else {
            for (Generators appliances : generatorsList) {
                if (homeAppliances == appliances) {
                    return true;
                }
            }
        }
        return false;
    }

    public void searchByParameter(String fieldName, int min, int max) {
        HomeAppliances[] temp;
        HomeAppliances[] homeAppliancesSearchResult = new HomeAppliances[0];
        if (Objects.equals(fieldName, "price")) {
            for (KitchenAppliances kitchenAppliances : kitchenAppliancesList) {
                if (kitchenAppliances.getPrice() >= min && kitchenAppliances.getPrice() <= max) {
                    temp = new HomeAppliances[homeAppliancesSearchResult.length + 1];
                    System.arraycopy(homeAppliancesSearchResult, 0, temp, 0, homeAppliancesSearchResult.length);
                    temp[temp.length - 1] = kitchenAppliances;
                    homeAppliancesSearchResult = new HomeAppliances[temp.length];
                    System.arraycopy(temp, 0, homeAppliancesSearchResult, 0, temp.length);
                }
            }
            for (LivingRoomAppliances livingRoomAppliances : livingRoomAppliancesList) {
                if (livingRoomAppliances.getPrice() >= min && livingRoomAppliances.getPrice() <= max) {
                    temp = new HomeAppliances[homeAppliancesSearchResult.length + 1];
                    System.arraycopy(homeAppliancesSearchResult, 0, temp, 0, homeAppliancesSearchResult.length);
                    temp[temp.length - 1] = livingRoomAppliances;
                    homeAppliancesSearchResult = new HomeAppliances[temp.length];
                    System.arraycopy(temp, 0, homeAppliancesSearchResult, 0, temp.length);
                }
            }
            for (Generators generators : generatorsList) {
                if (generators.getPrice() >= min && generators.getPrice() <= max) {
                    temp = new HomeAppliances[homeAppliancesSearchResult.length + 1];
                    System.arraycopy(homeAppliancesSearchResult, 0, temp, 0, homeAppliancesSearchResult.length);
                    temp[temp.length - 1] = generators;
                    homeAppliancesSearchResult = new HomeAppliances[temp.length];
                    System.arraycopy(temp, 0, homeAppliancesSearchResult, 0, temp.length);
                }
            }
        } else if (Objects.equals(fieldName, "weight")) {
            for (KitchenAppliances kitchenAppliances : kitchenAppliancesList) {
                if (kitchenAppliances.getWeight() >= min && kitchenAppliances.getWeight() <= max) {
                    temp = new HomeAppliances[homeAppliancesSearchResult.length + 1];
                    System.arraycopy(homeAppliancesSearchResult, 0, temp, 0, homeAppliancesSearchResult.length);
                    temp[temp.length - 1] = kitchenAppliances;
                    homeAppliancesSearchResult = new HomeAppliances[temp.length];
                    System.arraycopy(temp, 0, homeAppliancesSearchResult, 0, temp.length);
                }
            }
            for (LivingRoomAppliances livingRoomAppliances : livingRoomAppliancesList) {
                if (livingRoomAppliances.getWeight() >= min && livingRoomAppliances.getWeight() <= max) {
                    temp = new HomeAppliances[homeAppliancesSearchResult.length + 1];
                    System.arraycopy(homeAppliancesSearchResult, 0, temp, 0, homeAppliancesSearchResult.length);
                    temp[temp.length - 1] = livingRoomAppliances;
                    homeAppliancesSearchResult = new HomeAppliances[temp.length];
                    System.arraycopy(temp, 0, homeAppliancesSearchResult, 0, temp.length);
                }
            }
            for (Generators generators : generatorsList) {
                if (generators.getWeight() >= min && generators.getWeight() <= max) {
                    temp = new HomeAppliances[homeAppliancesSearchResult.length + 1];
                    System.arraycopy(homeAppliancesSearchResult, 0, temp, 0, homeAppliancesSearchResult.length);
                    temp[temp.length - 1] = generators;
                    homeAppliancesSearchResult = new HomeAppliances[temp.length];
                    System.arraycopy(temp, 0, homeAppliancesSearchResult, 0, temp.length);
                }
            }
        } else if (Objects.equals(fieldName, "powerConsumption")) {
            for (KitchenAppliances kitchenAppliances : kitchenAppliancesList) {
                if (kitchenAppliances.getPowerConsumption() >= min && kitchenAppliances.getPowerConsumption() <= max) {
                    temp = new HomeAppliances[homeAppliancesSearchResult.length + 1];
                    System.arraycopy(homeAppliancesSearchResult, 0, temp, 0, homeAppliancesSearchResult.length);
                    temp[temp.length - 1] = kitchenAppliances;
                    homeAppliancesSearchResult = new HomeAppliances[temp.length];
                    System.arraycopy(temp, 0, homeAppliancesSearchResult, 0, temp.length);
                }
            }
            for (LivingRoomAppliances livingRoomAppliances : livingRoomAppliancesList) {
                if (livingRoomAppliances.getPowerConsumption() >= min && livingRoomAppliances.getPowerConsumption() <= max) {
                    temp = new HomeAppliances[homeAppliancesSearchResult.length + 1];
                    System.arraycopy(homeAppliancesSearchResult, 0, temp, 0, homeAppliancesSearchResult.length);
                    temp[temp.length - 1] = livingRoomAppliances;
                    homeAppliancesSearchResult = new HomeAppliances[temp.length];
                    System.arraycopy(temp, 0, homeAppliancesSearchResult, 0, temp.length);
                }
            }
        } else if (Objects.equals(fieldName, "generatedPower")) {
            for (Generators generators : generatorsList) {
                if (generators.getGeneratedPower() >= min && generators.getGeneratedPower() <= max) {
                    temp = new HomeAppliances[homeAppliancesSearchResult.length + 1];
                    System.arraycopy(homeAppliancesSearchResult, 0, temp, 0, homeAppliancesSearchResult.length);
                    temp[temp.length - 1] = generators;
                    homeAppliancesSearchResult = new HomeAppliances[temp.length];
                    System.arraycopy(temp, 0, homeAppliancesSearchResult, 0, temp.length);
                }
            }
        }
        if (Objects.equals(fieldName, "price") || Objects.equals(fieldName, "weight") || Objects.equals(fieldName, "powerConsumption") || Objects.equals(fieldName, "generatedPower")) {
            System.out.println("Found " + homeAppliancesSearchResult.length + " items matching your criteria.");
            for (HomeAppliances i : homeAppliancesSearchResult) {
                if (i instanceof KitchenAppliances) {
                    System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), ((KitchenAppliances) i).getPowerConsumption(), i.getWeight(),
                            i.getPrice());
                } else if (i instanceof LivingRoomAppliances) {
                    System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), ((LivingRoomAppliances) i).getPowerConsumption(), i.getWeight(),
                            i.getPrice());
                } else {
                    System.out.printf("Type : %s| Model : %s| Generated power : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), ((Generators) i).getGeneratedPower(), i.getWeight(),
                            i.getPrice());
                }
            }
            System.out.println();
        } else {
            System.out.println("Please enter a valid field name. Searching the following fields is available :price, weight, powerConsumption, generatedPower is available.\n");
        }
    }

    public void countOfNotCookingAppliances() {
        int count = 0;
        for (KitchenAppliances i : kitchenAppliancesList) {
            if (!i.isUsedForCookingFood()) {
                count++;
            }
        }
        System.out.println("You have " + count + " kitchenAppliances, that not helps cooking food");
    }

    public void averageAttractivenessOfLivingRoomAppliances() {
        int count = 0;
        int sum = 0;
        for (LivingRoomAppliances i : livingRoomAppliancesList) {
            sum = sum + i.getAttractivenessInInterior();
            count++;
        }
        System.out.println("Your living room appliances is on average " + (double) sum / count + " points attractive for the interior");
    }

    public void printUsedNetworkLoad() {
        System.out.println("Current network load : " + usedNetworkLoad + "kw");
    }

    public void printMaxNetworkLoad() {
        System.out.println("Available network load : " + maxNetworkLoad + "kw");
    }

    public void energyOverload() {
        for (Generators generators : generatorsList) {
            generators.setConnectedToGrid(false);
        }
        generatorsList = new Generators[0];
        homeBudget = homeBudget - 1000;
        maxNetworkLoad = 0;
        System.out.println("You have caused a network congestion. All your generators have exploded. Damage caused by the explosion amounted to $1,000.\n");
    }

    public int getMaxNetworkLoad() {
        return maxNetworkLoad;
    }

    public int getUsedNetworkLoad() {
        return usedNetworkLoad;
    }

    public void setMaxNetworkLoad(int maxNetworkLoad) {
        this.maxNetworkLoad = this.maxNetworkLoad + maxNetworkLoad;
    }

    public void setUsedNetworkLoad(int usedNetworkLoad) {
        this.usedNetworkLoad = this.usedNetworkLoad + usedNetworkLoad;
    }

}



