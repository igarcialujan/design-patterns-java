package com.ismael.abstract_factory.implementation;

public class WeightLossFactory implements GoalFactory {
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkout();
    }

    @Override
    public MealPlan createMealPlan() {
        return new WeightLossMealPlan();
    }
}
