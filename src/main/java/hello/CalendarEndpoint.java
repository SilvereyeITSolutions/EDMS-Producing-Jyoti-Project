package hello;

import com.edms.calendar.CreateCalendarRequest;
import com.edms.calendar.CreateCalendarResponse;
import com.edms.calendar.CreateEventRequest;
import com.edms.calendar.CreateEventResponse;
import com.edms.file.AssignSinglePermissionRequest;
import com.edms.file.AssignSinglePermissionResponse;
import com.edms.file.CreateFileRequest;
import com.edms.file.CreateFileResponse;
import com.edms.file.DeleteFileRequest;
import com.edms.file.DeleteFileResponse;
import com.edms.file.GetFileByPathRequest;
import com.edms.file.GetFileByPathResponse;
import com.edms.file.GetFileRequest;
import com.edms.file.GetFileResponse;
import com.edms.file.GetRecycledDocsRequest;
import com.edms.file.GetRecycledDocsResponse;
import com.edms.file.GetSharedFilesByPathRequest;
import com.edms.file.GetSharedFilesByPathResponse;
import com.edms.file.GetSharedFilesRequest;
import com.edms.file.GetSharedFilesResponse;
import com.edms.file.HasChildRequest;
import com.edms.file.HasChildResponse;
import com.edms.file.RecycleFileRequest;
import com.edms.file.RecycleFileResponse;
import com.edms.file.RenameFileRequest;
import com.edms.file.RenameFileResponse;
import com.edms.file.RestoreFileRequest;
import com.edms.file.RestoreFileResponse;
import com.edms.file.ShareFileByPathRequest;
import com.edms.file.ShareFileByPathResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalendarEndpoint {
	private static final String NAMESPACE_URI = "http://edms.com/calendar";

	private CalendarRepository calendarRepository;

	@Autowired
	public CalendarEndpoint(CalendarRepository calendarRepository) {
		this.calendarRepository = calendarRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createCalendarRequest")
	@ResponsePayload
	public CreateCalendarResponse createCalendarRequest(@RequestPayload CreateCalendarRequest request) 
	{
		CreateCalendarResponse response = new CreateCalendarResponse();
		try{
		response.setResponse(calendarRepository.createCalendar(request.getCalID(),request.getCalColor()));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createEventRequest")
	@ResponsePayload
	public CreateEventResponse createEventRequest(@RequestPayload CreateEventRequest request) 
	{
		CreateEventResponse response = new CreateEventResponse();
		response.setResponse(calendarRepository.createEvent(request.getSummary(),request.getLocation(),request.getCalendar(),request.getStartdate(),request.getEnddate(),request.getDescription(),request.getAllday()));
		return response;
	}
	
}
