package me.fawazm.recruitingservice.endpoint;
//endpoint == endpoint

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController tells spring that we want it to manage this class.
//Service, component, controller all work as well.
//Using rest because this is a restful service
@RestController
public class RecruitingEndpoint {

    //give a mapping to the route you want to communicate to
    @RequestMapping(value = "/jobs")
    public String getJobs() {
        return "There are no jobs here. Go away.";

    }
}
