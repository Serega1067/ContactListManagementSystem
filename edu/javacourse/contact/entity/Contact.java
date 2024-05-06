import edu.javacourse.contact.entity;

public class Contact
{
    private Long contantId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Contact() 
    {
    };

    public Contact(String firstName, 
                   String lastName, 
                   String phone, 
                   String email
                  )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }
}
