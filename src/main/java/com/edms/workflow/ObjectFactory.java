//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.17 at 01:46:14 PM IST 
//


package com.edms.workflow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.edms.workflow package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStartWorkflowResponse_QNAME = new QName("http://edms.com/Workflow", "getStartWorkflowResponse");
    private final static QName _GetClaimTaskResponse_QNAME = new QName("http://edms.com/Workflow", "getClaimTaskResponse");
    private final static QName _GetContinueTaskResponse_QNAME = new QName("http://edms.com/Workflow", "getContinueTaskResponse");
    private final static QName _GetAuthorizeUserResponse_QNAME = new QName("http://edms.com/Workflow", "getAuthorizeUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.edms.workflow
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFetchUserTaskRequest }
     * 
     */
    public GetFetchUserTaskRequest createGetFetchUserTaskRequest() {
        return new GetFetchUserTaskRequest();
    }

    /**
     * Create an instance of {@link GetClaimTaskRequest }
     * 
     */
    public GetClaimTaskRequest createGetClaimTaskRequest() {
        return new GetClaimTaskRequest();
    }

    /**
     * Create an instance of {@link GetGenerateProcessImageRequest }
     * 
     */
    public GetGenerateProcessImageRequest createGetGenerateProcessImageRequest() {
        return new GetGenerateProcessImageRequest();
    }

    /**
     * Create an instance of {@link GetTaskFormDataResponse }
     * 
     */
    public GetTaskFormDataResponse createGetTaskFormDataResponse() {
        return new GetTaskFormDataResponse();
    }

    /**
     * Create an instance of {@link TaskFormData }
     * 
     */
    public TaskFormData createTaskFormData() {
        return new TaskFormData();
    }

    /**
     * Create an instance of {@link GetTaskFormDataRequest }
     * 
     */
    public GetTaskFormDataRequest createGetTaskFormDataRequest() {
        return new GetTaskFormDataRequest();
    }

    /**
     * Create an instance of {@link GetFetchGroupTaskRequest }
     * 
     */
    public GetFetchGroupTaskRequest createGetFetchGroupTaskRequest() {
        return new GetFetchGroupTaskRequest();
    }

    /**
     * Create an instance of {@link GetStartFormDataResponse }
     * 
     */
    public GetStartFormDataResponse createGetStartFormDataResponse() {
        return new GetStartFormDataResponse();
    }

    /**
     * Create an instance of {@link StartFormData }
     * 
     */
    public StartFormData createStartFormData() {
        return new StartFormData();
    }

    /**
     * Create an instance of {@link GetGenerateProcessImageResponse }
     * 
     */
    public GetGenerateProcessImageResponse createGetGenerateProcessImageResponse() {
        return new GetGenerateProcessImageResponse();
    }

    /**
     * Create an instance of {@link GetContinueTaskRequest }
     * 
     */
    public GetContinueTaskRequest createGetContinueTaskRequest() {
        return new GetContinueTaskRequest();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link GetStartWorkflowRequest }
     * 
     */
    public GetStartWorkflowRequest createGetStartWorkflowRequest() {
        return new GetStartWorkflowRequest();
    }

    /**
     * Create an instance of {@link GetFetchGroupTaskResponse }
     * 
     */
    public GetFetchGroupTaskResponse createGetFetchGroupTaskResponse() {
        return new GetFetchGroupTaskResponse();
    }

    /**
     * Create an instance of {@link GroupTaskListReturn }
     * 
     */
    public GroupTaskListReturn createGroupTaskListReturn() {
        return new GroupTaskListReturn();
    }

    /**
     * Create an instance of {@link GetAuthorizeUserRequest }
     * 
     */
    public GetAuthorizeUserRequest createGetAuthorizeUserRequest() {
        return new GetAuthorizeUserRequest();
    }

    /**
     * Create an instance of {@link GetStartFormDataRequest }
     * 
     */
    public GetStartFormDataRequest createGetStartFormDataRequest() {
        return new GetStartFormDataRequest();
    }

    /**
     * Create an instance of {@link GetFetchUserTaskResponse }
     * 
     */
    public GetFetchUserTaskResponse createGetFetchUserTaskResponse() {
        return new GetFetchUserTaskResponse();
    }

    /**
     * Create an instance of {@link UserTaskListReturn }
     * 
     */
    public UserTaskListReturn createUserTaskListReturn() {
        return new UserTaskListReturn();
    }

    /**
     * Create an instance of {@link TaskFormProperty }
     * 
     */
    public TaskFormProperty createTaskFormProperty() {
        return new TaskFormProperty();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link StartFormProperty }
     * 
     */
    public StartFormProperty createStartFormProperty() {
        return new StartFormProperty();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://edms.com/Workflow", name = "getStartWorkflowResponse")
    public JAXBElement<Object> createGetStartWorkflowResponse(Object value) {
        return new JAXBElement<Object>(_GetStartWorkflowResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://edms.com/Workflow", name = "getClaimTaskResponse")
    public JAXBElement<Object> createGetClaimTaskResponse(Object value) {
        return new JAXBElement<Object>(_GetClaimTaskResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://edms.com/Workflow", name = "getContinueTaskResponse")
    public JAXBElement<Object> createGetContinueTaskResponse(Object value) {
        return new JAXBElement<Object>(_GetContinueTaskResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://edms.com/Workflow", name = "getAuthorizeUserResponse")
    public JAXBElement<Object> createGetAuthorizeUserResponse(Object value) {
        return new JAXBElement<Object>(_GetAuthorizeUserResponse_QNAME, Object.class, null, value);
    }

}
