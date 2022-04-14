package builder;

import java.util.Objects;

/**
 * Created by mhan on 4/6/2017.
 */
public class Client {
    public static void main(String[] args){
        final FullName myName = new FullName.FullNameBuilder(new Name("Sollie"), new Name("Robbie"))
                .middleName(new Name("O"))
                .salutation(Salutation.MR)
                .createFullName();
        final Address cbuAddress = new Address.AddressBuilder(new City("Riverside"), State.CA)
                .streetAddress(new StreetAddress("8432 Magnolia Ave."))
                .createAddress();

        final Person me = new Person.PersonBuilder(myName, cbuAddress)
                .gender(Gender.MALE)
                .employment(EmploymentStatus.EMPLOYED)
                .homeOwner(HomeownerStatus.RENTER)
                .createPerson();
    }

    private void mystery(Objects... foo) {
        Object a = foo[0];
    }

    private void mystery2() {
        mystery("SFaf", 1);
    }
}
