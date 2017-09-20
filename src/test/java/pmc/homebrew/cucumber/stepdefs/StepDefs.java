package pmc.homebrew.cucumber.stepdefs;

import pmc.homebrew.BVendApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = BVendApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
