package Homework_7.Task7_1;

public class Home {

    private static int homeBudget;
    static int maxNetworkLoad = 0;
    static int usedNetworkLoad = 0;
    static KitchenAppliances[] kitchenAppliancesCatalog = new KitchenAppliances[0];
    static LivingRoomAppliances[] livingRoomAppliancesCatalog = new LivingRoomAppliances[0];
    static SourcesOfElectricity[] sourcesOfElectricityCatalog = new SourcesOfElectricity[0];

    public Home(int homeBudget) {
        Home.homeBudget = homeBudget;
    }

    public void buyKitchenAppliance(KitchenAppliances kitchenAppliances) {
        if (availabilityCheck(kitchenAppliances)) {
            System.out.println("You can't have 2 things that are the same\n");
        } else {
            if (homeBudget - kitchenAppliances.getPrice() < 0) {
                System.out.println("Sorry, you don't have enough money to buy this\n");
            } else {
                KitchenAppliances[] newKitchenAppliancesCatalog = new KitchenAppliances[Home.kitchenAppliancesCatalog.length + 1];
                if (Home.kitchenAppliancesCatalog.length != 0) {
                    System.arraycopy(Home.kitchenAppliancesCatalog, 0, newKitchenAppliancesCatalog, 0, Home.kitchenAppliancesCatalog.length);
                }
                Home.kitchenAppliancesCatalog = newKitchenAppliancesCatalog;
                Home.kitchenAppliancesCatalog[Home.kitchenAppliancesCatalog.length - 1] = kitchenAppliances;
                homeBudget = homeBudget - kitchenAppliances.getPrice();
                System.out.println("Kitchen appliance " + kitchenAppliances.getType() + " " + kitchenAppliances.getModel() + "was successfully bought. You have $" +
                        homeBudget + " left on your balance\n");
            }
        }
    }

    public void buyLivingRoomAppliance(LivingRoomAppliances livingRoomAppliances) {
        if (availabilityCheck(livingRoomAppliances)) {
            System.out.println("You can't have 2 things that are the same\n");
        } else {
            if (homeBudget - livingRoomAppliances.getPrice() < 0) {
                System.out.println("Sorry, you don't have enough money to buy this\n");
            } else {
                LivingRoomAppliances[] newLivingRoomAppliancesCatalog = new LivingRoomAppliances[Home.livingRoomAppliancesCatalog.length + 1];
                if (Home.livingRoomAppliancesCatalog.length != 0) {
                    System.arraycopy(Home.livingRoomAppliancesCatalog, 0, newLivingRoomAppliancesCatalog, 0, Home.livingRoomAppliancesCatalog.length);
                }
                Home.livingRoomAppliancesCatalog = newLivingRoomAppliancesCatalog;
                Home.livingRoomAppliancesCatalog[Home.livingRoomAppliancesCatalog.length - 1] = livingRoomAppliances;
                homeBudget = homeBudget - livingRoomAppliances.getPrice();
                System.out.println("Living room appliance " + livingRoomAppliances.getType() + " " + livingRoomAppliances.getModel() + "was successfully bought. " +
                        "You have $" + homeBudget + " left on your balance\n");
            }
        }
    }

    public void buySourceOfElectricity(SourcesOfElectricity sourcesOfElectricity) {
        if (availabilityCheck(sourcesOfElectricity)) {
            System.out.println("You can't have 2 things that are the same\n");
        } else {
            if (homeBudget - sourcesOfElectricity.getPrice() < 0) {
                System.out.println("Sorry, you don't have enough money to buy this\n");
            } else {
                SourcesOfElectricity[] newSourcesOfElectricityCatalog = new SourcesOfElectricity[Home.sourcesOfElectricityCatalog.length + 1];
                if (Home.sourcesOfElectricityCatalog.length != 0) {
                    System.arraycopy(Home.sourcesOfElectricityCatalog, 0, newSourcesOfElectricityCatalog, 0, Home.sourcesOfElectricityCatalog.length);
                }
                Home.sourcesOfElectricityCatalog = newSourcesOfElectricityCatalog;
                Home.sourcesOfElectricityCatalog[Home.sourcesOfElectricityCatalog.length - 1] = sourcesOfElectricity;
                homeBudget = homeBudget - sourcesOfElectricity.getPrice();
                System.out.println("Source of electricity " + sourcesOfElectricity.getType() + " " + sourcesOfElectricity.getModel() + "appliance was successfully " +
                        "bought. You have $" + homeBudget + " left on your balance. Don't forget to connect the generator to your power grid.\n");
            }
        }
    }

    public void printKitchenAppliancesCatalog() {
        System.out.println("You have " + kitchenAppliancesCatalog.length + " kitchen appliance items :");
        for (KitchenAppliances i : kitchenAppliancesCatalog) {
            System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n",i.getType(), i.getModel(), i.getPowerConsumption(), i.getWeight(),
                    i.getPrice());
        }
        System.out.println();
    }

    public void printLivingRoomAppliancesCatalog() {
        System.out.println("You have " + livingRoomAppliancesCatalog.length + " living room appliances items :");
        for (LivingRoomAppliances i : livingRoomAppliancesCatalog) {
            System.out.printf("Type : %s| Model : %s| Power Сonsumption : %dkw|  Weight : %skg|  Price : %d$  \n",i.getType(), i.getModel(), i.getPowerConsumption(), i.getWeight(),
                    i.getPrice());
        }
        System.out.println();
    }

    public void printSourcesOfElectricityCatalog() {
        System.out.println("You have " + sourcesOfElectricityCatalog.length + " sources of electricity items :");
        for (SourcesOfElectricity i : sourcesOfElectricityCatalog) {
            System.out.printf("Type : %s| Model : %s| Generated power : %dkw|  Weight : %skg|  Price : %d$  \n",i.getType(), i.getModel(), i.getGeneratedPower(), i.getWeight(),
                    i.getPrice());
        }
        System.out.println();
    }

    public void printAllHomeTechniquesCatalog() {
        int itemsTotal = kitchenAppliancesCatalog.length + livingRoomAppliancesCatalog.length + sourcesOfElectricityCatalog.length;
        System.out.println("You have " + itemsTotal + " home appliances items total:");
        printKitchenAppliancesCatalog();
        printLivingRoomAppliancesCatalog();
        printSourcesOfElectricityCatalog();
    }

    public static boolean availabilityCheck(HomeTechnique homeTechnique) {
        if (homeTechnique instanceof KitchenAppliances) {
            for (KitchenAppliances appliances : kitchenAppliancesCatalog) {
                if (homeTechnique == appliances) {
                    return true;
                }
            }
        } else if (homeTechnique instanceof LivingRoomAppliances) {
            for (LivingRoomAppliances appliances : livingRoomAppliancesCatalog) {
                if (homeTechnique == appliances) {
                    return true;
                }
            }
        } else {
            for (SourcesOfElectricity appliances : sourcesOfElectricityCatalog) {
                if (homeTechnique == appliances) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isConnectedToPowerGridCheck(HomeTechnique homeTechnique) {
        boolean check;
        if (homeTechnique instanceof KitchenAppliances) {
            for (KitchenAppliances appliances : kitchenAppliancesCatalog) {
                if (homeTechnique == appliances) {
                    check = appliances.isConnectedToGrid;
                    return check;
                }
            }
        } else if (homeTechnique instanceof LivingRoomAppliances) {
            for (LivingRoomAppliances appliances : livingRoomAppliancesCatalog) {
                if (homeTechnique == appliances) {
                    check = appliances.isConnectedToGrid;
                    return check;
                }
            }
        } else {
            for (SourcesOfElectricity appliances : sourcesOfElectricityCatalog) {
                if (homeTechnique == appliances) {
                    check = appliances.isConnectedToGrid;
                    return check;
                }
            }
        }
        return false;
    }

    public void printUsedNetworkLoad() {
        System.out.println("Current network load : " + usedNetworkLoad + "kw");
    }

    public void printMaxNetworkLoad() {
        System.out.println("Available network load : " + maxNetworkLoad + "kw");
    }

    public static void energyOverload() {
        for (SourcesOfElectricity sourcesOfElectricity : sourcesOfElectricityCatalog) {
            sourcesOfElectricity.isConnectedToGrid = false;
        }
        Home.sourcesOfElectricityCatalog = new SourcesOfElectricity[0];
        Home.homeBudget = Home.homeBudget - 1000;
        Home.maxNetworkLoad = 0;
        System.out.println("You have caused a network congestion. All your generators have exploded. Damage caused by the explosion amounted to $1,000.\n");
    }

    public static int getMaxNetworkLoad() {
        return maxNetworkLoad;
    }

    public static int getUsedNetworkLoad() {
        return usedNetworkLoad;
    }

    public static void setMaxNetworkLoad(int maxNetworkLoad) {
        Home.maxNetworkLoad = Home.maxNetworkLoad + maxNetworkLoad;
    }

    public static void setUsedNetworkLoad(int usedNetworkLoad) {
        Home.usedNetworkLoad = Home.usedNetworkLoad + usedNetworkLoad;
    }
}



