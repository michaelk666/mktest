package com.bmk028.mktest.access.spring;

import impl.AccountManager;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "accountmanagers", formBackingObject = AccountManager.class)
@RequestMapping("/accountmanagers")
@Controller
public class AccountManagerController {
}
