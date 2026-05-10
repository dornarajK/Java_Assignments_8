package TDD_8_2;

import org.example.TDD_8_2.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    @DisplayName("Add items increases item count correctly")
    void testAddItem() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        assertEquals(2, cart.getItemCount());

        // Adding an item with the same name replaces the price, count remains same
        cart.addItem("Apple", 1.2);
        assertEquals(2, cart.getItemCount());
    }

    @Test
    @DisplayName("Add with invalid arguments throws exception")
    void testAddItemInvalid() {
        assertThrows(IllegalArgumentException.class, () -> cart.addItem(null, 1.0));
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("", 1.0));
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Orange", -0.5));
    }

    @Test
    @DisplayName("Remove existing item decreases count and returns true")
    void testRemoveItem() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        assertTrue(cart.removeItem("Apple"));
        assertEquals(1, cart.getItemCount());
        assertFalse(cart.getItemCount() == 2);
    }

    @Test
    @DisplayName("Remove non‑existing item returns false")
    void testRemoveNonExistingItem() {
        cart.addItem("Apple", 1.0);
        assertFalse(cart.removeItem("Orange"));
        assertEquals(1, cart.getItemCount());
    }

    @Test
    @DisplayName("Calculate total with zero items")
    void testCalculateTotalEmpty() {
        assertEquals(0.0, cart.calculateTotal(), 0.001);
    }

    @Test
    @DisplayName("Calculate total with one item")
    void testCalculateTotalOneItem() {
        cart.addItem("Apple", 1.5);
        assertEquals(1.5, cart.calculateTotal(), 0.001);
    }

    @Test
    @DisplayName("Calculate total with multiple items")
    void testCalculateTotalMultiple() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);
        assertEquals(2.25, cart.calculateTotal(), 0.001);
    }

    @Test
    @DisplayName("Item count after adding and removing")
    void testItemCountAfterRemoval() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");
        assertEquals(1, cart.getItemCount());
        cart.removeItem("Banana");
        assertEquals(0, cart.getItemCount());
    }
}