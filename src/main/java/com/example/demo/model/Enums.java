package com.example.demo.model;

public class Enums {

    public enum Category {
        Car(0), Buss(1), Truck(2), Motorcycle(3);

        private final int numCategory;

        private Category(int number) {
            this.numCategory = number;
        }

        public int getNumber() {
            return numCategory;
        }
    }

    public enum Engine  {
        GASOLINE(0), DIESEL(1), ELECTRIC(2), HYBRID(3);

        private final int numEngine;

        private Engine(int number) {
            this.numEngine = number;
        }

        public int getNumber() {
            return numEngine;
        }
    }

    public enum Transmission  {
        MANUAL(0), AUTOMATIC(1);

        private final int numTransmission;

        private Transmission(int number) {
            this.numTransmission = number;
        }

        public int getNumber() {
            return numTransmission;
        }
    }

    public enum Role  {
        User(0), Admin(1);

        private final int numRole;

        private Role(int number) {
            this.numRole = number;
        }

        public int getNumber() {
            return numRole;
        }
    }

}
