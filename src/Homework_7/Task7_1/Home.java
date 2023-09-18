package Homework_7.Task7_1;

import Homework_7.Task7_1.HomeAppliances.Generator;
import Homework_7.Task7_1.HomeAppliances.HomeAppliance;
import Homework_7.Task7_1.HomeAppliances.KitchenAppliance;
import Homework_7.Task7_1.HomeAppliances.LivingRoomAppliance;

import java.util.Objects;

public class Home {

    private int homeBudget;
    private int maxNetworkLoad = 0;
    private int usedNetworkLoad = 0;
    private KitchenAppliance[] kitchenApplianceList = new KitchenAppliance[0];
    private LivingRoomAppliance[] livingRoomApplianceList = new LivingRoomAppliance[0];
    private Generator[] generatorList = new Generator[0];

    public Home(int homeBudget) {
        this.homeBudget = homeBudget;
    }

    public void buyKitchenAppliance(KitchenAppliance kitchenAppliance) {
        if (isExist(kitchenAppliance)) {
            System.out.println("You can't have 2 things that are the same\n");
        } else {
            if (homeBudget - kitchenAppliance.getPrice() < 0) {
                System.out.println("Sorry, you don't have enough money to buy this\n");
            } else {
                KitchenAppliance[] newKitchenApplianceCatalog = new KitchenAppliance[kitchenApplianceList.length + 1];
                if (kitchenApplianceList.length != 0) {
                    System.arraycopy(kitchenApplianceList, 0, newKitchenApplianceCatalog, 0, kitchenApplianceList.length);
                }
                kitchenApplianceList = newKitchenApplianceCatalog;
                kitchenApplianceList[kitchenApplianceList.length - 1] = kitchenAppliance;
                homeBudget = homeBudget - kitchenAppliance.getPrice();
                kitchenAppliance.setBelongsToHouse(this);
                System.out.println("Kitchen appliance " + kitchenAppliance.getType() + " " + kitchenAppliance.getModel() + "was successfully bought. You have $" +
                        homeBudget + " left on your balance\n");
            }
        }
    }

    public void buyLivingRoomAppliance(LivingRoomAppliance livingRoomAppliance) {
        if (isExist(livingRoomAppliance)) {
            System.out.println("You can't have 2 things that are the same\n");
        } else {
            if (homeBudget - livingRoomAppliance.getPrice() < 0) {
                System.out.println("Sorry, you don't have enough money to buy this\n");
            } else {
                LivingRoomAppliance[] newLivingRoomApplianceCatalog = new LivingRoomAppliance[livingRoomApplianceList.length + 1];
                if (livingRoomApplianceList.length != 0) {
                    System.arraycopy(livingRoomApplianceList, 0, newLivingRoomApplianceCatalog, 0, livingRoomApplianceList.length);
                }
                livingRoomApplianceList = newLivingRoomApplianceCatalog;
                livingRoomApplianceList[livingRoomApplianceList.length - 1] = livingRoomAppliance;
                homeBudget = homeBudget - livingRoomAppliance.getPrice();
                livingRoomAppliance.setBelongsToHouse(this);
                System.out.println("Living room appliance " + livingRoomAppliance.getType() + " " + livingRoomAppliance.getModel() + "was successfully bought. " +
                        "You have $" + homeBudget + " left on your balance\n");
            }
        }
    }

    public void buySourceOfElectricity(Generator generator) {
        if (isExist(generator)) {
            System.out.println("You can't have 2 things that are the same\n");
        } else {
            if (homeBudget - generator.getPrice() < 0) {
                System.out.println("Sorry, you don't have enough money to buy this\n");
            } else {
                Generator[] newGeneratorCatalog = new Generator[generatorList.length + 1];
                if (generatorList.length != 0) {
                    System.arraycopy(generatorList, 0, newGeneratorCatalog, 0, generatorList.length);
                }
                generatorList = newGeneratorCatalog;
                generatorList[generatorList.length - 1] = generator;
                homeBudget = homeBudget - generator.getPrice();
                generator.setBelongsToHouse(this);
                System.out.println("Source of electricity " + generator.getType() + " " + generator.getModel() + "appliance was successfully " +
                        "bought. You have $" + homeBudget + " left on your balance. Don't forget to connect the generator to your power grid.\n");
            }
        }
    }

    public void printKitchenAppliancesList() {
        System.out.println("You have " + kitchenApplianceList.length + " kitchen appliance items :");
        for (KitchenAppliance i : kitchenApplianceList) {
            System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), i.getPowerConsumption(), i.getWeight(),
                    i.getPrice());
        }
        System.out.println();
    }

    public void printLivingRoomAppliancesList() {
        System.out.println("You have " + livingRoomApplianceList.length + " living room appliances items :");
        for (LivingRoomAppliance i : livingRoomApplianceList) {
            System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), i.getPowerConsumption(), i.getWeight(),
                    i.getPrice());
        }
        System.out.println();
    }

    public void printGeneratorsList() {
        System.out.println("You have " + generatorList.length + " sources of electricity items :");
        for (Generator i : generatorList) {
            System.out.printf("Type : %s| Model : %s| Generated power : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), i.getGeneratedPower(), i.getWeight(),
                    i.getPrice());
        }
        System.out.println();
    }

    public void printAllHomeAppliancesList() {
        int itemsTotal = kitchenApplianceList.length + livingRoomApplianceList.length + generatorList.length;
        System.out.println("You have " + itemsTotal + " home appliances items total:");
        printKitchenAppliancesList();
        printLivingRoomAppliancesList();
        printGeneratorsList();
    }

    public void sortHomeAppliancesDESC(String fieldName) {
        if (Objects.equals(fieldName, "price")) {
            if (kitchenApplianceList.length > 0) {
                int maxPrice = kitchenApplianceList[0].getPrice();
                int maxPosition = 0;
                for (int i = 0; i < kitchenApplianceList.length - 1; i++) {
                    for (int k = i; k < kitchenApplianceList.length; k++) {
                        if (kitchenApplianceList[k].getPrice() > maxPrice) {
                            maxPosition = k;
                            maxPrice = kitchenApplianceList[k].getPrice();
                        }
                    }
                    KitchenAppliance kitchenAppliance = kitchenApplianceList[maxPosition];
                    kitchenApplianceList[maxPosition] = kitchenApplianceList[i];
                    kitchenApplianceList[i] = kitchenAppliance;
                    if (kitchenApplianceList.length > 0) {
                        maxPosition = i + 1;
                    }
                    maxPrice = kitchenApplianceList[i + 1].getPrice();
                }
            }
            if (livingRoomApplianceList.length > 0) {
                int maxPrice = livingRoomApplianceList[0].getPrice();
                int maxPosition = 0;
                for (int i = 0; i < livingRoomApplianceList.length - 1; i++) {
                    for (int k = i; k < livingRoomApplianceList.length; k++) {
                        if (livingRoomApplianceList[k].getPrice() > maxPrice) {
                            maxPosition = k;
                            maxPrice = livingRoomApplianceList[k].getPrice();
                        }
                    }
                    LivingRoomAppliance livingRoomAppliance = livingRoomApplianceList[maxPosition];
                    livingRoomApplianceList[maxPosition] = livingRoomApplianceList[i];
                    livingRoomApplianceList[i] = livingRoomAppliance;
                    maxPosition = i + 1;
                    maxPrice = livingRoomApplianceList[i + 1].getPrice();
                }
            }
            if (generatorList.length > 0) {
                int maxPrice = generatorList[0].getPrice();
                int maxPosition = 0;
                for (int i = 0; i < generatorList.length - 1; i++) {
                    for (int k = i; k < generatorList.length; k++) {
                        if (generatorList[k].getPrice() > maxPrice) {
                            maxPosition = k;
                            maxPrice = generatorList[k].getPrice();
                        }
                    }
                    Generator generator = generatorList[maxPosition];
                    generatorList[maxPosition] = generatorList[i];
                    generatorList[i] = generator;
                    maxPosition = i + 1;
                    maxPrice = generatorList[i + 1].getPrice();
                }
            }
        } else if (Objects.equals(fieldName, "weight")) {
            if (kitchenApplianceList.length > 0) {
                double maxWeight = kitchenApplianceList[0].getWeight();
                int maxPosition = 0;
                for (int i = 0; i < kitchenApplianceList.length - 1; i++) {
                    for (int k = i; k < kitchenApplianceList.length; k++) {
                        if (kitchenApplianceList[k].getWeight() > maxWeight) {
                            maxPosition = k;
                            maxWeight = kitchenApplianceList[k].getWeight();
                        }
                    }
                    KitchenAppliance kitchenAppliance = kitchenApplianceList[maxPosition];
                    kitchenApplianceList[maxPosition] = kitchenApplianceList[i];
                    kitchenApplianceList[i] = kitchenAppliance;
                    maxPosition = i + 1;
                    maxWeight = kitchenApplianceList[i + 1].getWeight();
                }
            }
            if (livingRoomApplianceList.length > 0) {
                double maxWeight = livingRoomApplianceList[0].getWeight();
                int maxPosition = 0;
                for (int i = 0; i < livingRoomApplianceList.length - 1; i++) {
                    for (int k = i; k < livingRoomApplianceList.length; k++) {
                        if (livingRoomApplianceList[k].getWeight() > maxWeight) {
                            maxPosition = k;
                            maxWeight = livingRoomApplianceList[k].getWeight();
                        }
                    }
                    LivingRoomAppliance livingRoomAppliance = livingRoomApplianceList[maxPosition];
                    livingRoomApplianceList[maxPosition] = livingRoomApplianceList[i];
                    livingRoomApplianceList[i] = livingRoomAppliance;
                    maxPosition = i + 1;
                    maxWeight = livingRoomApplianceList[i + 1].getWeight();
                }
            }
            if (generatorList.length > 0) {
                double maxWeight = generatorList[0].getWeight();
                int maxPosition = 0;
                for (int i = 0; i < generatorList.length - 1; i++) {
                    for (int k = i; k < generatorList.length; k++) {
                        if (generatorList[k].getWeight() > maxWeight) {
                            maxPosition = k;
                            maxWeight = generatorList[k].getWeight();
                        }
                    }
                    Generator generator = generatorList[maxPosition];
                    generatorList[maxPosition] = generatorList[i];
                    generatorList[i] = generator;
                    maxPosition = i + 1;
                    maxWeight = generatorList[i + 1].getWeight();
                }
            }
        } else if (Objects.equals(fieldName, "powerСonsumption")) {
            if (kitchenApplianceList.length > 0) {
                int maxPowerConsumption = kitchenApplianceList[0].getPowerConsumption();
                int maxPosition = 0;
                for (int i = 0; i < kitchenApplianceList.length - 1; i++) {
                    for (int k = i; k < kitchenApplianceList.length; k++) {
                        if (kitchenApplianceList[k].getPowerConsumption() > maxPowerConsumption) {
                            maxPosition = k;
                            maxPowerConsumption = kitchenApplianceList[k].getPowerConsumption();
                        }
                    }
                    KitchenAppliance kitchenAppliance = kitchenApplianceList[maxPosition];
                    kitchenApplianceList[maxPosition] = kitchenApplianceList[i];
                    kitchenApplianceList[i] = kitchenAppliance;
                    maxPosition = i + 1;
                    maxPowerConsumption = kitchenApplianceList[i + 1].getPowerConsumption();
                }
            }
            if (livingRoomApplianceList.length > 0) {
                int maxPowerConsumption = livingRoomApplianceList[0].getPowerConsumption();
                int maxPosition = 0;
                for (int i = 0; i < livingRoomApplianceList.length - 1; i++) {
                    for (int k = i; k < livingRoomApplianceList.length; k++) {
                        if (livingRoomApplianceList[k].getPowerConsumption() > maxPowerConsumption) {
                            maxPosition = k;
                            maxPowerConsumption = livingRoomApplianceList[k].getPowerConsumption();
                        }
                    }
                    LivingRoomAppliance livingRoomAppliance = livingRoomApplianceList[maxPosition];
                    livingRoomApplianceList[maxPosition] = livingRoomApplianceList[i];
                    livingRoomApplianceList[i] = livingRoomAppliance;
                    maxPosition = i + 1;
                    maxPowerConsumption = livingRoomApplianceList[i + 1].getPowerConsumption();
                }
            }
        } else if (Objects.equals(fieldName, "generatedPower")) {
            if (generatorList.length > 0) {
                int maxGeneratedPower = generatorList[0].getGeneratedPower();
                int maxPosition = 0;
                for (int i = 0; i < generatorList.length - 1; i++) {
                    for (int k = i; k < generatorList.length; k++) {
                        if (generatorList[k].getGeneratedPower() > maxGeneratedPower) {
                            maxPosition = k;
                            maxGeneratedPower = generatorList[k].getGeneratedPower();
                        }
                    }
                    Generator generator = generatorList[maxPosition];
                    generatorList[maxPosition] = generatorList[i];
                    generatorList[i] = generator;
                    maxPosition = i + 1;
                    maxGeneratedPower = generatorList[i + 1].getGeneratedPower();
                }
            }
        } else {
            System.out.println("Please enter a valid field name. Sorting by fields price, weight, powerConsumption, generatedPower is available\n");
        }
    }

    private boolean isExist(HomeAppliance homeAppliance) {
        if (homeAppliance instanceof KitchenAppliance) {
            for (KitchenAppliance appliances : kitchenApplianceList) {
                if (homeAppliance == appliances) {
                    return true;
                }
            }
        } else if (homeAppliance instanceof LivingRoomAppliance) {
            for (LivingRoomAppliance appliances : livingRoomApplianceList) {
                if (homeAppliance == appliances) {
                    return true;
                }
            }
        } else {
            for (Generator appliances : generatorList) {
                if (homeAppliance == appliances) {
                    return true;
                }
            }
        }
        return false;
    }

    public void searchByParameter(String fieldName, int min, int max) {
        HomeAppliance[] temp;
        HomeAppliance[] homeApplianceSearchResult = new HomeAppliance[0];
        if (Objects.equals(fieldName, "price")) {
            for (KitchenAppliance kitchenAppliance : kitchenApplianceList) {
                if (kitchenAppliance.getPrice() >= min && kitchenAppliance.getPrice() <= max) {
                    temp = new HomeAppliance[homeApplianceSearchResult.length + 1];
                    System.arraycopy(homeApplianceSearchResult, 0, temp, 0, homeApplianceSearchResult.length);
                    temp[temp.length - 1] = kitchenAppliance;
                    homeApplianceSearchResult = new HomeAppliance[temp.length];
                    System.arraycopy(temp, 0, homeApplianceSearchResult, 0, temp.length);
                }
            }
            for (LivingRoomAppliance livingRoomAppliance : livingRoomApplianceList) {
                if (livingRoomAppliance.getPrice() >= min && livingRoomAppliance.getPrice() <= max) {
                    temp = new HomeAppliance[homeApplianceSearchResult.length + 1];
                    System.arraycopy(homeApplianceSearchResult, 0, temp, 0, homeApplianceSearchResult.length);
                    temp[temp.length - 1] = livingRoomAppliance;
                    homeApplianceSearchResult = new HomeAppliance[temp.length];
                    System.arraycopy(temp, 0, homeApplianceSearchResult, 0, temp.length);
                }
            }
            for (Generator generator : generatorList) {
                if (generator.getPrice() >= min && generator.getPrice() <= max) {
                    temp = new HomeAppliance[homeApplianceSearchResult.length + 1];
                    System.arraycopy(homeApplianceSearchResult, 0, temp, 0, homeApplianceSearchResult.length);
                    temp[temp.length - 1] = generator;
                    homeApplianceSearchResult = new HomeAppliance[temp.length];
                    System.arraycopy(temp, 0, homeApplianceSearchResult, 0, temp.length);
                }
            }
        } else if (Objects.equals(fieldName, "weight")) {
            for (KitchenAppliance kitchenAppliance : kitchenApplianceList) {
                if (kitchenAppliance.getWeight() >= min && kitchenAppliance.getWeight() <= max) {
                    temp = new HomeAppliance[homeApplianceSearchResult.length + 1];
                    System.arraycopy(homeApplianceSearchResult, 0, temp, 0, homeApplianceSearchResult.length);
                    temp[temp.length - 1] = kitchenAppliance;
                    homeApplianceSearchResult = new HomeAppliance[temp.length];
                    System.arraycopy(temp, 0, homeApplianceSearchResult, 0, temp.length);
                }
            }
            for (LivingRoomAppliance livingRoomAppliance : livingRoomApplianceList) {
                if (livingRoomAppliance.getWeight() >= min && livingRoomAppliance.getWeight() <= max) {
                    temp = new HomeAppliance[homeApplianceSearchResult.length + 1];
                    System.arraycopy(homeApplianceSearchResult, 0, temp, 0, homeApplianceSearchResult.length);
                    temp[temp.length - 1] = livingRoomAppliance;
                    homeApplianceSearchResult = new HomeAppliance[temp.length];
                    System.arraycopy(temp, 0, homeApplianceSearchResult, 0, temp.length);
                }
            }
            for (Generator generator : generatorList) {
                if (generator.getWeight() >= min && generator.getWeight() <= max) {
                    temp = new HomeAppliance[homeApplianceSearchResult.length + 1];
                    System.arraycopy(homeApplianceSearchResult, 0, temp, 0, homeApplianceSearchResult.length);
                    temp[temp.length - 1] = generator;
                    homeApplianceSearchResult = new HomeAppliance[temp.length];
                    System.arraycopy(temp, 0, homeApplianceSearchResult, 0, temp.length);
                }
            }
        } else if (Objects.equals(fieldName, "powerConsumption")) {
            for (KitchenAppliance kitchenAppliance : kitchenApplianceList) {
                if (kitchenAppliance.getPowerConsumption() >= min && kitchenAppliance.getPowerConsumption() <= max) {
                    temp = new HomeAppliance[homeApplianceSearchResult.length + 1];
                    System.arraycopy(homeApplianceSearchResult, 0, temp, 0, homeApplianceSearchResult.length);
                    temp[temp.length - 1] = kitchenAppliance;
                    homeApplianceSearchResult = new HomeAppliance[temp.length];
                    System.arraycopy(temp, 0, homeApplianceSearchResult, 0, temp.length);
                }
            }
            for (LivingRoomAppliance livingRoomAppliance : livingRoomApplianceList) {
                if (livingRoomAppliance.getPowerConsumption() >= min && livingRoomAppliance.getPowerConsumption() <= max) {
                    temp = new HomeAppliance[homeApplianceSearchResult.length + 1];
                    System.arraycopy(homeApplianceSearchResult, 0, temp, 0, homeApplianceSearchResult.length);
                    temp[temp.length - 1] = livingRoomAppliance;
                    homeApplianceSearchResult = new HomeAppliance[temp.length];
                    System.arraycopy(temp, 0, homeApplianceSearchResult, 0, temp.length);
                }
            }
        } else if (Objects.equals(fieldName, "generatedPower")) {
            for (Generator generator : generatorList) {
                if (generator.getGeneratedPower() >= min && generator.getGeneratedPower() <= max) {
                    temp = new HomeAppliance[homeApplianceSearchResult.length + 1];
                    System.arraycopy(homeApplianceSearchResult, 0, temp, 0, homeApplianceSearchResult.length);
                    temp[temp.length - 1] = generator;
                    homeApplianceSearchResult = new HomeAppliance[temp.length];
                    System.arraycopy(temp, 0, homeApplianceSearchResult, 0, temp.length);
                }
            }
        }
        if (Objects.equals(fieldName, "price") || Objects.equals(fieldName, "weight") || Objects.equals(fieldName, "powerConsumption") || Objects.equals(fieldName, "generatedPower")) {
            System.out.println("Found " + homeApplianceSearchResult.length + " items matching your criteria.");
            for (HomeAppliance i : homeApplianceSearchResult) {
                if (i instanceof KitchenAppliance) {
                    System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), ((KitchenAppliance) i).getPowerConsumption(), i.getWeight(),
                            i.getPrice());
                } else if (i instanceof LivingRoomAppliance) {
                    System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), ((LivingRoomAppliance) i).getPowerConsumption(), i.getWeight(),
                            i.getPrice());
                } else {
                    System.out.printf("Type : %s| Model : %s| Generated power : %dkw|  Weight : %skg|  Price : %d$  \n", i.getType(), i.getModel(), ((Generator) i).getGeneratedPower(), i.getWeight(),
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
        for (KitchenAppliance i : kitchenApplianceList) {
            if (!i.isUsedForCookingFood()) {
                count++;
            }
        }
        System.out.println("You have " + count + " kitchenAppliances, that not helps cooking food");
    }

    public void averageAttractivenessOfLivingRoomAppliances() {
        int count = 0;
        int sum = 0;
        for (LivingRoomAppliance i : livingRoomApplianceList) {
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
        for (Generator generator : generatorList) {
            generator.setConnectedToGrid(false);
        }
        generatorList = new Generator[0];
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



