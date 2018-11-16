package com.icthh.xm.tmf.ms.account.service;

import com.icthh.xm.tmf.ms.account.model.PartyAccount;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Vitaliy Kirichenko (vitaliy.v.kirichenko@gmail.com)
 */
@Getter
@Setter
public class CustomPartyAccount extends PartyAccount {

    private String customField;
}
