package builder;

/**
 * Representation of a United States address.
 */
public final class Address
{
    private final StreetAddress streetAddress;
    private final City city;
    private final State state;

    private Address(final StreetAddress newStreetAddress, final City newCity, final State newState)
    {
        this.streetAddress = newStreetAddress;
        this.city = newCity;
        this.state = newState;
    }

    public StreetAddress getStreetAddress()
    {
        return this.streetAddress;
    }

    public City getCity()
    {
        return this.city;
    }

    public State getState()
    {
        return this.state;
    }

    @Override
    public String toString()
    {
        return this.streetAddress + ", " + this.city + ", " + this.state;
    }

    //Implement the builder pattern
    public static class AddressBuilder {
        private StreetAddress nestedStreetAddr;
        private final City nestedCity;
        private final State nestedState;

        // your code here
    }
}