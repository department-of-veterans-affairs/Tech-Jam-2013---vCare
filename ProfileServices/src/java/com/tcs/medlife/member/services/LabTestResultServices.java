/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tcs.medlife.member.services;

import com.ml.tj.mongo.MongoUtils;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import org.jboss.logging.Param;

/**
 * REST Web Service
 *
 * @author tech4smartv
 */
@Path("labTests")
public class LabTestResultServices {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LabTestResultServices
     */
    public LabTestResultServices() {
    }

    /**
     * Retrieves representation of an instance of com.tcs.medlife.member.services.LabTestResultServices
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    @Path("{memberId}")
    public String getLabTests(@PathParam("memberId")String Id)         
    {
        try {
            return MongoUtils.get("LABSANDTESTS");
        } catch (UnknownHostException ex) {
            Logger.getLogger(LabTestResultServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }


    /**
     * PUT method for updating or creating an instance of LabTestResultServices
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
