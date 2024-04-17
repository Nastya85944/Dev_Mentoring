package org.example.lesson1.zadanie_6;

// Task 6_5
class Vehicle {

    private int maxSpeed;
    private int course;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void increaseCourse(float value){
        this.course += value;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setCourse(15);
        vehicle.setMaxSpeed(120);

        vehicle.increaseCourse(30);
        System.out.println("maxSpeed: " + vehicle.getMaxSpeed() + ", course: " + vehicle.getCourse());


    }
}
