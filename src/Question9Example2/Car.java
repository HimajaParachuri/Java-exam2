/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9Example2;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is started. Please wear the seat belt!!");
    }

    @Override
    public void move() {
        System.out.println("Car is moving. Please maintain the speed limit!!");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped!!");
    }

    public static void main(String[] args) {
        Vehicle tesla = new Car();
        tesla.start();
        tesla.move();
        tesla.stop();
    }

}

