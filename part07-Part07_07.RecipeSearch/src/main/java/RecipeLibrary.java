
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeLibrary {

    private ArrayList<Recipe> recipes;
    private ArrayList<String> lines;
    private Scanner scanner;

    public RecipeLibrary(Scanner scanner) {
        this.recipes = new ArrayList<>();
        this.lines = new ArrayList<>();
        this.scanner = scanner;
    }

    public void readFile() {

        while (this.scanner.hasNextLine()) {
            String line = this.scanner.nextLine();

            if (line.trim().isEmpty() || !this.scanner.hasNextLine()) {
                String name = this.lines.get(0);
                int cookingTime = Integer.valueOf(this.lines.get(1));
                ArrayList<String> ingredients = new ArrayList<>();

                for (int i = 2; i < this.lines.size(); i++) {
                    ingredients.add(this.lines.get(i));
                }

                this.recipes.add(new Recipe(name, cookingTime, ingredients));
                this.lines.removeAll(this.lines);
            } else {
                this.lines.add(line);
            }
        }
        this.scanner.close();
    }

    public void findName(String name) {

        if (this.recipes.isEmpty()) {
            System.out.println("No recipes");

        } else {
            System.out.println("Recipes:");

            for (Recipe recipe : this.recipes) {
                if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(recipe.getName()
                            + ", cooking time: "
                            + recipe.getCookingTime());
                }
            }
        }
    }
    
    public void findTime(int time) {

        if (this.recipes.isEmpty()) {
            System.out.println("No recipes");

        } else {
            System.out.println("Recipes:");

            for (Recipe recipe : this.recipes) {
                if (recipe.getCookingTime() <= time) {
                    System.out.println(recipe.getName()
                            + ", cooking time: "
                            + recipe.getCookingTime());
                }
            }
        }
    }
    
    public void findIngredient(String name) {

        if (this.recipes.isEmpty()) {
            System.out.println("No recipes");

        } else {
            System.out.println("Recipes:");

            for (Recipe recipe : this.recipes) {
                
                if (recipe.getIngredients().contains(name.toLowerCase())) {
                    System.out.println(recipe.getName()
                            + ", cooking time: "
                            + recipe.getCookingTime());
                }
            }
        }
    }

    public void print() {
        if (this.recipes.isEmpty()) {
            System.out.println("No recipes");

        } else {
            System.out.println("Recipes:");

            for (Recipe recipe : this.recipes) {
                System.out.println(recipe.getName()
                        + ", cooking time: " + recipe.getCookingTime());
            }
        }
    }

}
