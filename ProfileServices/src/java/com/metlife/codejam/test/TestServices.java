/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metlife.codejam.test;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.Set;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author MyWorld
 */
@Path("/TestService")
public class TestServices {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TestServices
     */
    public TestServices() {
    }

    /**
     * Retrieves representation of an instance of com.metlife.codejam.test.TestServices
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() throws UnknownHostException {
        
        MongoClient mongoClient = new MongoClient("137.116.81.48", 27017);
        String out ="";
        DB db = mongoClient.getDB( "va" );
        DBCollection coll = db.getCollection("test");
        char [] test = new char[10];
        
        boolean auth = db.authenticate("tesh4smartv", "Hello@01".toCharArray());
        DBObject myDoc = coll.findOne();
       return myDoc.toString();
    }

    /**
     * PUT method for updating or creating an instance of TestServices
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
