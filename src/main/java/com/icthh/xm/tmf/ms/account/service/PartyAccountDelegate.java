package com.icthh.xm.tmf.ms.account.service;


import com.icthh.xm.commons.lep.LogicExtensionPoint;
import com.icthh.xm.commons.lep.spring.LepService;

import com.icthh.xm.tmf.ms.account.api.PartyAccountApiDelegate;
import com.icthh.xm.tmf.ms.account.model.PartyAccount;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

@Service
@LepService(group = "service", name = "default")
public class PartyAccountDelegate implements PartyAccountApiDelegate {

    @LogicExtensionPoint("RetrievePartyAccount")
    @PreAuthorize("hasPermission({'id': #id}, 'PARTY.ACCOUNT.GET')")
    @Override
    public ResponseEntity<List<PartyAccount>> retrievePartyAccount(String id) {
        CustomPartyAccount partyAccount = new CustomPartyAccount();

        partyAccount.setBaseType(PartyAccount.class.getSimpleName());
        partyAccount.setType(CustomPartyAccount.class.getSimpleName());
        partyAccount.setSchemaLocation("http://account/schema/CustomPartyAccount.yml");
        partyAccount.setCustomField("Custom value");


        partyAccount.setId("1232");
        partyAccount.setLastModified(OffsetDateTime.now());

        return ResponseEntity.ok(Collections.singletonList(partyAccount));
    }
}
