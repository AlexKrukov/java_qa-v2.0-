package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Alex", "Krukov", "222333444", "222333@gmail.com", "test1"));
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Alex", "Krukov", "222333444", "222333@gmail.com", "test1"));
        app.getContactHelper().updateModifiedContact();
        app.getContactHelper().returnToContactPage();
    }
}
