package builder;

/**
 * Person class used as part of too many parameters demonstration.
 */
public class Person
{
    private final FullName name;
    private final Address address;
    private final Gender gender;
    private final EmploymentStatus employment;
    private final HomeownerStatus homeOwnerStatus;

    /**
     * Parameterized constructor can be private because only my internal builder
     * needs to call me to provide an instance to clients.
     *
     * @param newName Name of this person.
     * @param newAddress Address of this person.
     * @param newGender Gender of this person.
     * @param newEmployment Employment status of this person.
     * @param newHomeOwner Home ownership status of this person.
     */
    private Person(
            final FullName newName, final Address newAddress,
            final Gender newGender, final EmploymentStatus newEmployment,
            final HomeownerStatus newHomeOwner)
    {
        this.name = newName;
        this.address = newAddress;
        this.gender = newGender;
        this.employment = newEmployment;
        this.homeOwnerStatus = newHomeOwner;
    }

    public FullName getName()
    {
        return this.name;
    }

    public Address getAddress()
    {
        return this.address;
    }

    public Gender getGender()
    {
        return this.gender;
    }

    public EmploymentStatus getEmployment()
    {
        return this.employment;
    }

    public HomeownerStatus getHomeOwnerStatus()
    {
        return this.homeOwnerStatus;
    }

    /**
     * Implement Builder pattern
     */
    public static class PersonBuilder {
        private FullName nestedName;
        private Address nestedAddr;
        private Gender nestedGender;
        private EmploymentStatus nestedEmploymentStatus;
        private HomeownerStatus nestedHomeOwnerStatus;

        // your code here
    }
}