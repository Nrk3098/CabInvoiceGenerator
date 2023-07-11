package com.cabinvoice;

import java.util.List;



    public class MultipleRide {

        public static double calculateFare(double distance, double time) {
            double fare = (distance * 10) + (time * 1);
            double totalFare = Math.max(fare, 5); // Use minimum fare if calculated fare is less than 5
            return totalFare;
        }

        public static double calculateAggregateFare(List<com.cabinvoice.Ride> rides) {
            double totalFare = 0;
            for (com.cabinvoice.Ride ride : rides) {
                totalFare += calculateFare(ride.getDistance(), ride.getTime());
            }
            return totalFare;
        }

        public static void main(String[] args) {
            // Example usage with multiple rides
            com.cabinvoice.Ride ride1 = new com.cabinvoice.Ride(10, 30); // Distance: 10 km, Time: 30 minutes
            com.cabinvoice.Ride ride2 = new com.cabinvoice.Ride(5, 15);  // Distance: 5 km, Time: 15 minutes
            com.cabinvoice.Ride ride3 = new com.cabinvoice.Ride(8, 20);  // Distance: 8 km, Time: 20 minutes

            List<com.cabinvoice.Ride> rides = List.of(ride1, ride2, ride3);

            double aggregateFare = calculateAggregateFare(rides);
            System.out.println("Aggregate Total Fare: " + aggregateFare);
        }
    }
    class Ride {
        private double distance;
        private double time;

        public Ride(double distance, double time) {
            this.distance = distance;
            this.time = time;
        }

        public double getDistance() {
            return distance;
        }

        public double getTime() {
            return time;
        }
    }








