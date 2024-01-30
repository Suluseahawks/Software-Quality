package com.ontariotechu.sofe3980U;

/**
 * Unsigned integer Binary variable
 */
public class Binary {
    private String number = "0";  // string containing the binary value '0' or '1'

    // ... (existing code)

    /**
     * Perform bitwise logical OR with another Binary object.
     *
     * @param other Binary object to perform OR with
     * @return Binary object with the result of bitwise OR
     */
    public Binary bitwiseOR(Binary other) {
        int maxLength = Math.max(this.number.length(), other.number.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            char bit1 = (i < this.number.length()) ? this.number.charAt(i) : '0';
            char bit2 = (i < other.number.length()) ? other.number.charAt(i) : '0';

            result.append((bit1 == '1' || bit2 == '1') ? '1' : '0');
        }

        return new Binary(result.toString());
    }

    /**
     * Perform bitwise logical AND with another Binary object.
     *
     * @param other Binary object to perform AND with
     * @return Binary object with the result of bitwise AND
     */
    public Binary bitwiseAND(Binary other) {
        int maxLength = Math.max(this.number.length(), other.number.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            char bit1 = (i < this.number.length()) ? this.number.charAt(i) : '0';
            char bit2 = (i < other.number.length()) ? other.number.charAt(i) : '0';

            result.append((bit1 == '1' && bit2 == '1') ? '1' : '0');
        }

        return new Binary(result.toString());
    }

    /**
     * Multiply with another Binary object using the add function.
     *
     * @param other Binary object to multiply with
     * @return Binary object with the result of multiplication
     */
    public Binary multiply(Binary other) {
        Binary result = new Binary("0");

        for (int i = 0; i < other.number.length(); i++) {
            if (other.number.charAt(i) == '1') {
                String shiftedValue = this.number + "0".repeat(other.number.length() - 1 - i);
                result = add(result, new Binary(shiftedValue));
            }
        }

        return result;
    }

    // ... (rest of the existing code)

    /**
     * Static method to add two Binary objects.
     *
     * @param num1 First Binary object
     * @param num2 Second Binary object
     * @return Binary object with the result of addition
     */
    public static Binary add(Binary num1, Binary num2) {
        // ... (existing add method logic)
    }

    /**
     * Test function for bitwise OR.
     *
     * @param other Binary object to perform OR with
     */
    public void testBitwiseOR(Binary other) {
        Binary result = bitwiseOR(other);
        System.out.println("Bitwise OR Result: " + this.number + " | " + other.number + " = " + result.number);
    }

    /**
     * Test function for bitwise AND.
     *
     * @param other Binary object to perform AND with
     */
    public void testBitwiseAND(Binary other) {
        Binary result = bitwiseAND(other);
        System.out.println("Bitwise AND Result: " + this.number + " & " + other.number + " = " + result.number);
    }

    /**
     * Test function for multiplication.
     *
     * @param other Binary object to multiply with
     */
    public void testMultiplication(Binary other) {
        Binary result = multiply(other);
        System.out.println("Multiplication Result: " + this.number + " * " + other.number + " = " + result.number);
    }
}