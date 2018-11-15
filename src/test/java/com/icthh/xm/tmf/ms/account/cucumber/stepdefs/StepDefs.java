package com.icthh.xm.tmf.ms.account.cucumber.stepdefs;

import com.icthh.xm.tmf.ms.account.AccountApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AccountApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
