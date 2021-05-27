package com.jobits.pos.client.rest.assembler;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import com.jobits.pos.client.rest.domain.SiteInfo;

import com.jobits.pos.client.rest.endpoint.SiteInfoRestEndpoint;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class SiteInfoModelAssembler implements RepresentationModelAssembler<SiteInfo, EntityModel<SiteInfo>> {

	@Override
	public EntityModel<SiteInfo> toModel(SiteInfo info) {
		return EntityModel.of(info, linkTo(methodOn(SiteInfoRestEndpoint.class).info()).withSelfRel());
	} //TODO: este siteInfo tiene que ser un servicio del componente de spring core
}
