package com.coforge.UnMarshaller;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import com.coforge.entity.Bank;




public class BankUnMarshaller {
	public static void main(String[] args) throws JAXBException, SAXException {
		// TODO Auto-generated method stub
		new BankUnMarshaller().runBankUnmarshaller();

	}
	private void runBankUnmarshaller() throws JAXBException, SAXException{
		JAXBContext context = JAXBContext.newInstance(Bank.class);
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = sf.newSchema(new File("C:\\FullStack\\WorkSpace\\JAXBSchemaBank\\src\\com\\coforge\\entity\\Bank1.xsd"));
		Unmarshaller unmarshaller=context.createUnmarshaller();
		unmarshaller.setSchema(schema);
		unmarshaller.setEventHandler(new BankValidationEventHandler());
		Bank b = (Bank) unmarshaller.unmarshal(new File("C:\\FullStack\\Jaxb\\bank.xml"));
		System.out.println(b.getAcc());
		System.out.println(b.getBalance());
		System.out.println(b.getCustomer().getCust_id());
		System.out.println(b.getCustomer().getCust_name());
		System.out.println(b.getCustomer().getPhone());
		System.out.println(b.getCustomer().getAddress());
	}
	class BankValidationEventHandler implements ValidationEventHandler{

		@Override
		public boolean handleEvent(ValidationEvent event) {
			// TODO Auto-generated method stub
			System.out.print("\nEvent");
			System.out.print("SEVERITY: " + event.getSeverity());
			System.out.print("MESSAGE: " + event.getMessage());
			System.out.print("LINKED EXCEPTION: " + event.getLinkedException());
			System.out.print("LOCATOR");
			System.out.print("LINE NUMBER: " + event.getLocator().getLineNumber());
			System.out.print("column NUMBER: " + event.getLocator().getColumnNumber());
			System.out.print("offset: " + event.getLocator().getOffset());
			System.out.print("object: " + event.getLocator().getObject());
			System.out.print("node: " + event.getLocator().getNode());
			System.out.print("url: " + event.getLocator().getURL());
			
			return true;
		}
	}
}