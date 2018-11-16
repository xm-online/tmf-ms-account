package com.icthh.xm.tmf.ms.account.service;


import com.icthh.xm.commons.lep.LogicExtensionPoint;
import com.icthh.xm.commons.lep.spring.LepService;

import com.icthh.xm.tmf.ms.account.api.PartyAccountApiDelegate;
import com.icthh.xm.tmf.ms.account.model.PartyAccount;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@LepService(group = "service", name = "default")
public class PartyAccountDelegate implements PartyAccountApiDelegate {

    @LogicExtensionPoint("RetrievePartyAccount")
    public ResponseEntity<List<PartyAccount>> retrievePartyAccount( String id) {
        return null; // overriden in lep
    }
}
