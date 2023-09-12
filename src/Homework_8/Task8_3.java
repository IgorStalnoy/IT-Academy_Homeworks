package Homework_8;

/**
 * Введите строку (текст). Найдите наибольшее количество идущих подряд цифр.
 * Поменяйте местами первое самое длинное слово с последним самым коротким
 * Найти в строке все знаки препинания. Подсчитать общее количество их.
 */
public class Task8_3 {
    public static void main(String[] args) {

        String text1 = "The ocean (also known as the sea or the world ocean) is a body of salt water that covers approximately 70.8% of the Earth and contains 97% " +
                "of Earth's water.[9] The term ocean also refers to any of the large bodies of water into which the world ocean is conventionally divided.[10] " +
                "Distinct names are used to identify five different areas of the ocean: Pacific (the largest), Atlantic, Indian, Southern, and Arctic (the smallest)." +
                "[11][12] Seawater covers approximately 361000000 km2 (139000000 sq mi) of the planet. The ocean is the primary component of the Earth's " +
                "hydrosphere, and thus essential to life on Earth. The ocean influences climate and weather patterns, the carbon cycle, and the water cycle by " +
                "acting as a huge heat reservoir.\n" +
                "\n" +
                "Oceanographers split the ocean into vertical and horizontal zones based on physical and biological conditions. The pelagic zone is the open " +
                "ocean's water column from the surface to the ocean floor. The water column is further divided into zones based on depth and the amount of light" +
                " present. The photic zone starts at the surface and is defined to be \"the depth at which light intensity is only 1% of the surface value\"[13]: 36  " +
                "(approximately 200 m in the open ocean). This is the zone where photosynthesis can occur. In this process plants and microscopic algae" +
                " (free floating phytoplankton) use light, water, carbon dioxide, and nutrients to produce organic matter. As a result, the photic zone is the " +
                "most biodiverse and the source of the food supply which sustains most of the ocean ecosystem. Ocean photosynthesis also produces half of the oxygen " +
                "in the earth's atmosphere.[14] Light can only penetrate a few hundred more meters; the rest of the deeper ocean is cold and dark (these zones are " +
                "called mesopelagic and aphotic zones). The continental shelf is where the ocean meets dry land. It is more shallow, with a depth of a few hundred " +
                "meters or less. Human activity often has negative impacts on the ecosystems within the continental shelf.\n" +
                "Ocean temperatures depend on the amount of solar radiation reaching the ocean surface. In the tropics, surface temperatures can rise to over " +
                "30 °C (86 °F). Near the poles where sea ice forms, the temperature in equilibrium is about −2 °C (28 °F). In all parts of the ocean, deep ocean " +
                "temperatures range between −2 °C (28 °F) and 5 °C (41 °F).[15] Constant circulation of water in the ocean creates ocean currents. These directed" +
                " movements of seawater are caused by forces operating on the water, such as temperature variations, atmospheric circulation (wind), the Coriolis " +
                "effect and salinity changes.[16] Tides create tidal currents, while wind and waves cause surface currents. The Gulf Stream, Kuroshio Current, " +
                "Agulhas Current and Antarctic Circumpolar Current are all major ocean currents. Currents transport massive amounts of water and heat around the " +
                "world. By transporting these pollutants from the surface into the deep ocean, this circulation impacts global climate and the uptake and " +
                "redistribution of pollutants such as carbon dioxide.";

        //task 1

        char[] charArray = text1.toCharArray();
        int longestNumber = 0;
        int counterOfDigits = 0;
        for (char i : charArray) {
            if (i >= 48 && i <= 57) {
                counterOfDigits++;
            } else {
                if (longestNumber < counterOfDigits) {
                    longestNumber = counterOfDigits;
                }
                counterOfDigits = 0;
            }
        }
        System.out.println("Greatest number of consecutive digits : " + longestNumber);

        //task 2

        String[] words = text1.split("[\\W\\d+]+");
        String longestWord = words[0];
        String shortestWord = words[0];
        for (String i : words) {
            if (i.length() > longestWord.length()) {
                longestWord = i;
            }
            if (i.length() <= shortestWord.length() && i.length() >= 2) {
                shortestWord = i;
            }
        }
        text1 = text1.replaceFirst(longestWord, shortestWord);
        int shortestWordIndex = text1.lastIndexOf(shortestWord);
        StringBuilder stringBuilder = new StringBuilder(text1);
        stringBuilder.replace(shortestWordIndex, shortestWordIndex + shortestWord.length(), longestWord);
        text1 = stringBuilder.toString();
        System.out.println(text1);

        //task 3

        String[] punctuationMarks = text1.split("\\p{P}");
        System.out.println("There are " + punctuationMarks.length + " punctuation marks in the text");
    }
}
