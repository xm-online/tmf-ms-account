package com.icthh.xm.tmf.ms.account.service;

import com.icthh.xm.tmf.ms.account.model.EntitySpecification;
import com.icthh.xm.tmf.ms.account.model.PartyAccount;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class XmPartyAccount extends PartyAccount {

    private EntitySpecification specification;
}
