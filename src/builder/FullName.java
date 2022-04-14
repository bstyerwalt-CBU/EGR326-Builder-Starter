package builder;

/**
 * Full name of a person.
 */
public final class FullName
{
    private final Name lastName;
    private final Name firstName;
    private final Name middleName;
    private final Salutation salutation;
    private final Suffix suffix;

    private FullName(
            final Name newLastName,
            final Name newFirstName,
            final Name newMiddleName,
            final Salutation newSalutation,
            final Suffix newSuffix)
    {
        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.middleName = newMiddleName;
        this.salutation = newSalutation;
        this.suffix = newSuffix;
    }

    public Name getLastName()
    {
        return this.lastName;
    }

    public Name getFirstName()
    {
        return this.firstName;
    }

    public Name getMiddleName()
    {
        return this.middleName;
    }

    public Salutation getSalutation()
    {
        return this.salutation;
    }

    public Suffix getSuffix()
    {
        return this.suffix;
    }

    @Override
    public String toString()
    {
        return  this.salutation + " " + this.firstName + " " + this.middleName
                + this.lastName + ", " + this.suffix;
    }

    //Implement the builder pattern
    public static class FullNameBuilder {
        private final Name nestedLastName;
        private final Name nestedFirstName;
        private Name nestedMiddleName;
        private Salutation nestedSalutation;
        private Suffix nestedSuffix;

        // your code here
    }
}