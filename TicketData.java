package src;

import java.util.Objects;


    public class TicketData {

        private int ticketNumber;
        private String firstName;
        private String lastName;
        private String middleName;
        private String gender;
        private String departureTime;
        private String departureCity;
        private String arrivalCity;
        private int tripNumber;


        public int getTicketNumber() {
            return ticketNumber;
        }

        public void setTicketNumber(int ticketNumber) {
            this.ticketNumber = ticketNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getDepartureTime() {
            return departureTime;
        }


        public void setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
        }

        public String getDepartureCity() {
            return departureCity;
        }

        public void setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
        }

        public String getArrivalCity() {
            return arrivalCity;
        }

        public void setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
        }

        public int getTripNumber() {
            return tripNumber;
        }

        public void setTripNumber(int tripNumber) {
            this.tripNumber = tripNumber;
        }

        @Override
        public String toString() {
            return "Tickets{" +
                    "ticketNumber=" + ticketNumber +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", gender='" + gender + '\'' +
                    ", departureTime=" + departureTime +
                    ", departureCity=" + departureCity +
                    ", arrivalCity=" + arrivalCity +
                    ", tripNumber=" + tripNumber +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TicketData tickets = (TicketData) o;
            return ticketNumber == tickets.ticketNumber &&
                    tripNumber == tickets.tripNumber &&
                    Objects.equals(firstName, tickets.firstName) &&
                    Objects.equals(lastName, tickets.lastName) &&
                    Objects.equals(middleName, tickets.middleName) &&
                    Objects.equals(gender, tickets.gender) &&
                    Objects.equals(departureTime, tickets.departureTime) &&
                    Objects.equals(departureCity, tickets.departureCity) &&
                    Objects.equals(arrivalCity, tickets.arrivalCity);
        }

        @Override
        public int hashCode() {
            return Objects.hash(ticketNumber, firstName, lastName, middleName, gender, departureTime, departureCity, arrivalCity, tripNumber);
        }


        public TicketData(int ticketNumber, String firstName, String lastName, String middleName, String gender, String departureTime,
                              String departureCity, String arrivalCity, int tripNumber){
            this.ticketNumber = ticketNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.gender = gender;
            this.departureTime = departureTime;
            this.departureCity = departureCity;
            this.arrivalCity = arrivalCity;
            this.tripNumber = tripNumber;
        }
    }