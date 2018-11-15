package com.icthh.xm.tmf.ms.account.service;


import com.icthh.xm.commons.lep.LogicExtensionPoint;
import com.icthh.xm.commons.lep.spring.LepService;

import com.icthh.xm.tmf.ms.account.api.PartyAccountApiDelegate;
import com.icthh.xm.tmf.ms.account.model.PartyAccount;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@LepService(group = "test", name = "default")
public class PartyAccountDelegate implements PartyAccountApiDelegate {

    /**
     * Example of overriding logic
     */
    @LogicExtensionPoint("Test")
    public ResponseEntity<List<PartyAccount>> listPartyAccount(String fields,
                                                               Integer offset,
                                                               Integer limit) {
        return null;
    }
}
