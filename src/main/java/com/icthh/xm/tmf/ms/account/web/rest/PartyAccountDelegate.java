package com.icthh.xm.tmf.ms.account.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.icthh.xm.commons.lep.LogicExtensionPoint;
import com.icthh.xm.commons.lep.spring.LepService;

import com.icthh.xm.tmf.ms.account.api.PartyAccountApiDelegate;
import com.icthh.xm.tmf.ms.account.lep.keyresolver.ProfileKeyResolver;
import com.icthh.xm.tmf.ms.account.model.PartyAccount;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@LepService(group = "service", name = "default")
public class PartyAccountDelegate implements PartyAccountApiDelegate {

    @Timed
    @LogicExtensionPoint(value = "RetrievePartyAccount", resolver = ProfileKeyResolver.class)
    @PreAuthorize("hasPermission({'id': #id}, 'PARTY.ACCOUNT.GET')")
    @Override
    public ResponseEntity<List<PartyAccount>> retrievePartyAccount(String id, String profile) {
        return ResponseEntity.ok(Collections.emptyList());
    }
}
