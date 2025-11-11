package Assignment8;

public class MealPlanGen {
    interface MealPlan { void showMeal(); }
    class VegetarianMeal implements MealPlan { public void showMeal(){ System.out.println("Vegetarian meal"); } }
    class VeganMeal implements MealPlan { public void showMeal(){ System.out.println("Vegan meal"); } }

    class Meal<T extends MealPlan> {
        private T plan;
        public Meal(T plan){ this.plan = plan; }
        public void generate(){ plan.showMeal(); }
    }

}
