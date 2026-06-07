package javalab.collections.collectionsinterface;

public class CollectionsPhase {

    public static void main(String[] args) {
        IceCream[] iceCreams = new IceCream[]{
                new IceCream("strawberry"), // 0
                new IceCream("vanilla"), // 1
                new IceCream("chocolate"), // 2
                new IceCream("blackberry"), // 3
                new IceCream("black current"), // 4    // 5 elements
        };

        Popsicle[] popsicles = new  Popsicle[] {
                new Popsicle("blue"),
                new Popsicle("green"),
                new Popsicle("orange")
        };

        var iceCreamFreezerCollection = new FreezerCollection<>(iceCreams);
        var popsicleFreezerCollection = new FreezerCollection<>(popsicles);

        var iterator = iceCreamFreezerCollection.iterator();

        while (iterator.hasNext()) {
            var element = iterator.next();
            System.out.println("Element is " + element.getName());
        }

        // ensure that it contains flavors
        var freezerIsEmpty = iceCreamFreezerCollection.isEmpty();
        System.out.println("freezer empty: " + freezerIsEmpty);
        var amountOfIceCream = iceCreamFreezerCollection.size();
        System.out.println("number of flavors in freeze " + amountOfIceCream);

        var randomFlavor = new IceCream("vanilla");
        var isVanillaInStock = iceCreamFreezerCollection.contains(randomFlavor);

        if (isVanillaInStock) {
            System.out.println(randomFlavor + " is in stock");
        } else {
            System.err.println(randomFlavor + " is out of stock");
        }

        var copyOfFlavors = iceCreamFreezerCollection.toArray();
        System.out.println("copy of flavors");
        for (Object copy : copyOfFlavors) {
            var flavorCopy = (Flavour) copy;
            System.out.println(flavorCopy.getName());
        }
    }
}