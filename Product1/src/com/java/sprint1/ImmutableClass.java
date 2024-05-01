package com.java.sprint1;

// Step 1: Declare the class as final so it cannot be subclassed
public final class ImmutableClass {

    // Step 2: Declare all fields as private final
    private final int intValue;
    private final String stringValue;
    // Add more fields as needed

    // Step 3: Initialize all fields through constructor
    public ImmutableClass(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    // Step 4: Do not provide setter methods
    // Step 5: Do not allow any methods to modify the state of the object

    // Step 6: Provide only getter methods to access the fields
    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    // Step 7: Optionally, override hashCode and equals for proper object comparison

    @Override
    public int hashCode() {
        int result = intValue;
        result = 31 * result + (stringValue != null ? stringValue.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmutableClass that = (ImmutableClass) o;

        if (intValue != that.intValue) return false;
        return stringValue != null ? stringValue.equals(that.stringValue) : that.stringValue == null;
    }

    // Step 8: Optionally, override toString for meaningful string representation
    @Override
    public String toString() {
        return "ImmutableClass{" +
                "intValue=" + intValue +
                ", stringValue='" + stringValue + '\'' +
                '}';
    }
}

