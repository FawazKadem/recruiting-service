package me.fawazm.recruitingservice.endpoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RecruitingEndpoint.class)  //manage

//instruct spring to configure spring application context.
public class RecruitingEndpointTest {

    //autowired will intialize object for us. can use to seed intialization in other places
    @Autowired
    private RecruitingEndpoint recruitingEndpoint;

    @Autowired
    private MockMvc mockMvc;

    //DSL == domain specific language
    @Test
    public void recruitingController_withJobs_returnsJobs() throws Exception {
        this.mockMvc.perform(get("/jobs")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("There are no jobs here. Go away.")));
    }


}
