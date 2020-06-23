package com.shariq;

import com.shariq.model.Account;
import com.shariq.service.AccountService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class AccountResource {

    @Inject
    AccountService accountService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccount() {
        return accountService.getAccount();
    }
}