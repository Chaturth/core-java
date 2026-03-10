class Jamoon {

    String[] flavors;
    Ingredient[] ingredients;

    Jamoon(String[] flavors, Ingredient[] ingredients) {
        this.flavors = flavors;
        this.ingredients = ingredients;
    }

    void display() {
        System.out.println("Number of flavors: " + flavors.length);
        for (String flavor : flavors) {
            System.out.println("Flavor: " + flavor);
        }

        System.out.println("Number of ingredients: " + ingredients.length);
        for (Ingredient ing : ingredients) {
            System.out.println("Ingredient: " + ing.name);
        }
    }
}