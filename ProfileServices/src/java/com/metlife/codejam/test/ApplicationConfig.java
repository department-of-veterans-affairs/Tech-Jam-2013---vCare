/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metlife.codejam.test;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author MyWorld
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.metlife.codejam.test.TestServices.class);
        resources.add(com.tcs.medlife.member.services.AllergiesServices.class);
        resources.add(com.tcs.medlife.member.services.DemographicsServices.class);
        resources.add(com.tcs.medlife.member.services.FamilyHealthResource.class);
        resources.add(com.tcs.medlife.member.services.HealthcareProviderResource.class);
        resources.add(com.tcs.medlife.member.services.LabTestResultServices.class);
        resources.add(com.tcs.medlife.member.services.ReminderServicesResource.class);
        resources.add(com.tcs.medlife.member.services.VitalServices.class);
        resources.add(com.tcs.medlife.member.services.VitalStaticServices.class);
    }
    
}
