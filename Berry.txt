/*******************************************************************************
 * Kean University- Spring 2024
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos
 * Assignment 3
 *************************************************************************/

import java.time.LocalDate;
import java.util.Objects;

public class Berry {
    private double price;
    private LocalDate expirationDate;

    public Berry(double price, LocalDate expirationDate) {
        this.price = price;
        this.expirationDate = expirationDate;
    }

    // Getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Berry{price=" + price + ", expirationDate=" + expirationDate + '}';
    }

    // hashCode and equals methods
    @Override
    public int hashCode() {
        return Objects.hash(price, expirationDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Berry berry = (Berry) obj;
        return Double.compare(berry.price, price) == 0 &&
                Objects.equals(expirationDate, berry.expirationDate);
    }
}
