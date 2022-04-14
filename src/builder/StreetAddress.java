package builder;

/**
 * Street Address representation.
 */
public final class StreetAddress
{
    private final String address;

    public StreetAddress(final String newStreetAddress)
    {
        this.address = newStreetAddress;
    }

    public String getAddress()
    {
        return this.address;
    }

    @Override
    public String toString()
    {
        return this.address;
    }
}