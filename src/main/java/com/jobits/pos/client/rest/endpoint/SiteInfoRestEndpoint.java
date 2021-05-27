package com.jobits.pos.client.rest.endpoint;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobits.pos.client.rest.assembler.SiteInfoModelAssembler;
import com.jobits.pos.client.rest.domain.SiteInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class SiteInfoRestEndpoint {

	private final SiteInfoModelAssembler assembler;

	public SiteInfoRestEndpoint(SiteInfoModelAssembler assembler) {
		this.assembler = assembler;

	}

	@GetMapping("/info")
	public EntityModel<SiteInfo> info() {
		return assembler.toModel(SiteInfo.INSTANCE);
	}


	@GetMapping("/error")
	public EntityModel<SiteInfo> error() {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"error");
	}
}
