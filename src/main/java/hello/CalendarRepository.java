package hello;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.net.URISyntaxException;
import java.text.ParseException;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.CalendarOutputter;
import net.fortuna.ical4j.data.UnfoldingReader;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Date;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterFactoryImpl;
import net.fortuna.ical4j.model.ParameterFactoryRegistry;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.PropertyFactoryRegistry;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.property.CalScale;
import net.fortuna.ical4j.model.property.Description;
import net.fortuna.ical4j.model.property.DtEnd;
import net.fortuna.ical4j.model.property.DtStart;
import net.fortuna.ical4j.model.property.Location;
import net.fortuna.ical4j.model.property.Name;
import net.fortuna.ical4j.model.property.ProdId;
import net.fortuna.ical4j.model.property.Summary;
import net.fortuna.ical4j.model.property.Uid;

import org.apache.lucene.util.packed.PackedInts.Reader;
import org.hibernate.engine.jdbc.ReaderInputStream;
import org.springframework.stereotype.Component;

@Component
public class CalendarRepository {

	public FileOutputStream fout =null;
	public FileInputStream fin =null;
	public BufferedReader br=null;
	public CalendarOutputter out=new CalendarOutputter();
	public CalendarBuilder builder=new CalendarBuilder();
	
	public String createCalendar(String calid, String calcolor) throws Exception {

		
		System.out.println("creating color property");
		PropertyFactoryImpl co=PropertyFactoryImpl.getInstance();
		Property p=co.createProperty("COLOR");
		p.setValue(calcolor);
		System.out.println("color property created");
		PropertyFactoryImpl name=PropertyFactoryImpl.getInstance();
		Property calname=name.createProperty("X-WR-CALNAME");
		calname.setValue(calid);
		System.out.println("name property created");
			
		
		try  {
		 fout= new FileOutputStream("D:\\calendar.ics");
		}catch(Exception e)
		{
			e.printStackTrace();
			return "failure";
		}
        Calendar c=new Calendar();
        c.getProperties().add(new ProdId());
        c.getProperties().add(net.fortuna.ical4j.model.property.Version.VERSION_2_0);
        c.getProperties().add(CalScale.GREGORIAN);
        c.getProperties().add(calname); 
        c.getProperties().add(p);  
        out.setValidating(false);
        try{
        out.output(c, fout);
        }
        catch (IOException e) 
        {
			e.printStackTrace();
        	return "failure";
        } 
        catch (ValidationException e)
        {
			e.printStackTrace();
        	return "failure";
        }
			return "Success";
	}

	public String createEvent(String summary, String location, String calendar,
			String startdate, String enddate, String description, String allday) 
	{		
		Calendar c=new Calendar();
		try
		{
			
			fin=new FileInputStream("D:\\calendar.ics");
			//FileReader fr=new FileReader("D:\\calendar.ics");			
			//br=new BufferedReader( new InputStreamReader(new FileInputStream(new File("D:\\calendar.ics"))),3000);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			//PushbackReader pr=new UnfoldingReader(new ReaderInputStream(fin, 3000));
			/*reader = new UnfoldingReader(new InputStream(uri.toURL().openStream()), 3000);
			return new CalendarBuilder().build(reader);*/
			//UnfoldingReader reader = new UnfoldingReader(br, 3000);
			//return new CalendarBuilder().build(reader);
			c=builder.build(fin);
			/*System.out.println("start");
			c=builder.build(reader);
			System.out.println("end");*/
		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//fin.close();
		VEvent event=new VEvent();
		event.getProperties().add(new Uid("fdc"));
		event.getProperties().add(new Summary(summary));
		event.getProperties().add(new Location(location));
		try{
	    event.getProperties().add(new DtEnd(enddate));
		event.getProperties().add(new DtStart(startdate));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		event.getProperties().add(new Description(description));
		//c.getComponents().add(event);
		try
		{
		fout=new FileOutputStream("D:\\calendar1.ics");
		out.setValidating(false);
		out.output(c, fout);;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return "success";
	}

	
	
}
