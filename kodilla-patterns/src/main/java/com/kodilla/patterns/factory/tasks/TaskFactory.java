package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping","books", 10);
            case PAINTING:
                return new PaintingTask("Painting", "dark", "eyes");
            case DRIVING:
                return new DrivingTask("Driving", "party", "stray donkey");
            default:
                return null;
        }

    }

}
