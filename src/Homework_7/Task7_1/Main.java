package Homework_7.Task7_1;

/**
 * 1)Определить иерархию домашней техники.
 * 2)Включить некоторые в розетку.
 * 3)Рассчитать потребляемую мощность.
 * 4)Провести сортировку приборов в квартире на основе одного из параметров.
 * 5)Найти кухонный прибор в квартире, соответствующий заданному диапазону параметров.
 * ___________________________________________________________________________________
 * Attention! Zombies have taken over the city and the nearby power plant.
 * You survive in a small house in the forest, and for a comfortable life you need to buy generators and home appliances.
 * Home appliances seller has a shortage - you can't buy 2 of the same item
 * Please watch your budget and don't forget to buy generators - you can't run a home tech without power.
 * Please do not overload the network - this may cause damage to generators and fire.
 * _________________________________________________________________________________________________________
 * Available actions and commands for you:
 * Home {name} = new Home(int) - create your house and set budget.
 * KitchenAppliances {name} = new KitchenAppliances(String type, int price, String model, int powerСonsumption, double weight) - create new available Kitchen Appliance
 * LivingRoomAppliances {name} = new LivingRoomAppliances(String type, int price, String model, int powerСonsumption, double weight) - create new available Living RoomAppliance
 * SourcesOfElectricity {name} = new SourcesOfElectricity(String type, int price, String model, int generatedPower, double weight) - create new available Source Of Electricity
 * home.buyKitchenAppliance - buy new Kitchen Appliance for your home
 * home.buyKitchenAppliance - buy new Living RoomAppliance for your home
 * home.buySourceOfElectricity - buy new Source Of Electricity for your home
 * home.printKitchenAppliancesCatalog - prints a list of kitchen appliances
 * home.printLivingRoomAppliancesCatalog - prints a list of Living RoomAppliances
 * home.printSourcesOfElectricityCatalog - prints a list of SourcesOfElectricity
 * home.printAllHomeTechniquesCatalog - prints a list of all home appliances
 * home.getMaxNetworkLoad - returns max network load before overload
 * home.getUsedNetworkLoad - returns current network load
 * HomeTechnique.sortHomeTechniqueDESC(String field) - sorts all your HomeTechnique from largest to smallest according to the entered parameter. Available fields: price, weight, powerConsumption, generatedPower
 * HomeTechnique.searchByParameter(String field, int min, int max) - searches for purchased equipment according to the specified parameters.Searching the following fields is available :price, weight, powerConsumption, generatedPower is available
 * kitchenAppliance.connectToPowerGrid - Plugs the selected device into a socket. Pay attention to the power settings to prevent overload.
 * kitchenAppliance.disconnectFromPowerGrid - Turns the selected appliance off.
 * livingRoomAppliances.connectToPowerGrid - Plugs the selected device into a socket. Pay attention to the power settings to prevent overload.
 * livingRoomAppliances.disconnectFromPowerGrid - Turns the selected appliance off.
 * sourcesOfElectricity.connectToPowerGrid - Plugs the selected device into a socket. Pay attention to the power settings to prevent overload.
 * sourcesOfElectricity.disconnectFromPowerGrid - Turns the selected appliance off. Pay attention to the power settings to prevent overload.
 */
public class Main {

    public static void main(String[] args) {

        KitchenAppliances fridge = new KitchenAppliances("Fridge", 750, "LG GA-B419SQGL", 470, 73);
        KitchenAppliances coffeeMachine = new KitchenAppliances("Coffee machine", 1200, "DeLonghi Dinamica Plus ECAM 370.95.T", 450, 7);
        KitchenAppliances microwave = new KitchenAppliances("Microwave", 400, "Bosch BFL524MB0", 1000, 17);
        KitchenAppliances kettle = new KitchenAppliances("Kettle", 40, "BORK K810", 2000, 4);
        KitchenAppliances oven = new KitchenAppliances("Oven", 350, "GEFEST 622-02 А", 3500, 45);

        LivingRoomAppliances cleaner = new LivingRoomAppliances("Vacuum cleaner", 300, "Xiaomi Vacuum Cleaner G11", 280, 2);
        LivingRoomAppliances tv = new LivingRoomAppliances("TV", 2000, "LG B3 OLED65B3RLA", 55, 25);
        LivingRoomAppliances iron = new LivingRoomAppliances("Iron", 15, "Scarlett SC-SI30K23", 2200, 1);
        LivingRoomAppliances notebook = new LivingRoomAppliances("Notebook", 1900, "Apple Macbook Pro 13 M2 2022 MNEQ3RUA", 80, 3);

        SourcesOfElectricity generator280 = new SourcesOfElectricity("Generator", 400, "Hyundai HHY 4550F", 280, 46);
        SourcesOfElectricity generator10000 = new SourcesOfElectricity("Generator", 2500, "Alteco AGG 15000 TE DUO", 10000, 198);
        SourcesOfElectricity solarPanel600 = new SourcesOfElectricity("Solar panel", 210, "Geofox Solar Panel M6-300", 600, 19);

        //Use case
        Home home = new Home(12000);

        home.buyKitchenAppliance(fridge);
        home.buyKitchenAppliance(microwave);
        home.buyKitchenAppliance(coffeeMachine);
        home.buyKitchenAppliance(coffeeMachine);
        home.buyKitchenAppliance(oven);
        home.buyLivingRoomAppliance(cleaner);
        home.buyLivingRoomAppliance(tv);
        home.buyLivingRoomAppliance(notebook);
        home.buyLivingRoomAppliance(notebook);
        home.buySourceOfElectricity(solarPanel600);
        home.buySourceOfElectricity(solarPanel600);
        home.buySourceOfElectricity(generator280);

        home.printKitchenAppliancesCatalog();
        home.printLivingRoomAppliancesCatalog();
        home.printSourcesOfElectricityCatalog();
        home.printAllHomeTechniquesCatalog();

        home.printMaxNetworkLoad();
        home.printUsedNetworkLoad();

        solarPanel600.connectToPowerGrid();
        generator280.connectToPowerGrid();
        coffeeMachine.connectToPowerGrid();
        kettle.connectToPowerGrid();

        home.printMaxNetworkLoad();
        home.printUsedNetworkLoad();

        fridge.disconnectFromPowerGrid();
        coffeeMachine.disconnectFromPowerGrid();
        kettle.disconnectFromPowerGrid();
        home.printMaxNetworkLoad();
        home.printUsedNetworkLoad();

        oven.connectToPowerGrid();
        home.printMaxNetworkLoad();
        home.printUsedNetworkLoad();
        home.printAllHomeTechniquesCatalog();

        home.buySourceOfElectricity(generator10000);
        home.buySourceOfElectricity(solarPanel600);
        home.printAllHomeTechniquesCatalog();

        home.printAllHomeTechniquesCatalog();
        HomeTechnique.sortHomeTechniqueDESC("gdfgfdgdfgdf");
        HomeTechnique.sortHomeTechniqueDESC("weight");
        home.printAllHomeTechniquesCatalog();
        HomeTechnique.sortHomeTechniqueDESC("powerConsumption");
        home.printAllHomeTechniquesCatalog();
        HomeTechnique.sortHomeTechniqueDESC("price");
        home.printAllHomeTechniquesCatalog();
        HomeTechnique.sortHomeTechniqueDESC("generatedPower");
        home.printAllHomeTechniquesCatalog();

        HomeTechnique.searchByParameter("ggdfgdf", 123, 456);
        HomeTechnique.searchByParameter("powerConsumption", 20, 400);
        HomeTechnique.searchByParameter("price", 10, 399);
        HomeTechnique.searchByParameter("weight", 1, 20);
        HomeTechnique.searchByParameter("generatedPower", 1, 5000);
    }
}
